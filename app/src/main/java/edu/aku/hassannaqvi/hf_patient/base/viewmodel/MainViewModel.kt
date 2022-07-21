package edu.aku.hassannaqvi.hf_patient.base.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.aku.hassannaqvi.hf_patient.base.repository.GeneralRepository
import edu.aku.hassannaqvi.hf_patient.base.repository.ResponseStatusCallbacks
import edu.aku.hassannaqvi.hf_patient.models.Camps
import edu.aku.hassannaqvi.hf_patient.models.FormIndicatorsModel
import edu.aku.hassannaqvi.hf_patient.models.HealthFacilities
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel(val repository: GeneralRepository) : ViewModel() {

    /*
    * Today's form
    * */
    private var _tf: MutableLiveData<ResponseStatusCallbacks<Int>> = MutableLiveData()
    val todayForms: MutableLiveData<ResponseStatusCallbacks<Int>>
        get() = _tf

    /*
    * Unsynced and Synced Forms as upload forms
    * */
    private var _uf: MutableLiveData<ResponseStatusCallbacks<FormIndicatorsModel>> =
        MutableLiveData()
    val uploadForms: MutableLiveData<ResponseStatusCallbacks<FormIndicatorsModel>>
        get() = _uf

    /*
    * Complete and Incomplete forms as status forms
    * */
    private var _fs: MutableLiveData<ResponseStatusCallbacks<FormIndicatorsModel>> =
        MutableLiveData()
    val formsStatus: MutableLiveData<ResponseStatusCallbacks<FormIndicatorsModel>>
        get() = _fs


    /*
    * Get districts from DB
    * */
    private val _campsResponse: MutableLiveData<ResponseStatusCallbacks<Camps>> = MutableLiveData()
    val campsResponse: MutableLiveData<ResponseStatusCallbacks<Camps>>
        get() = _campsResponse


    /*
    * Get facilities from DB
    * */
    private val _healthFacilities: MutableLiveData<ResponseStatusCallbacks<List<HealthFacilities>>> =
        MutableLiveData()
    val healthFacilitiesResponse: MutableLiveData<ResponseStatusCallbacks<List<HealthFacilities>>>
        get() = _healthFacilities

    fun getFacilitiesFromDB() {
        _healthFacilities.value = ResponseStatusCallbacks.loading(null)
        viewModelScope.launch {
            try {
                /*delay(1000)*/
                val facility = repository.getFacilitiesFromDB()
                _healthFacilities.value = if (facility.size > 0) {
                    ResponseStatusCallbacks.success(
                        data = facility,
                        message = "Health Facility Found"
                    )
                } else
                    ResponseStatusCallbacks.error(
                        data = null,
                        message = "No Health Facility Found!"
                    )
            } catch (e: java.lang.Exception) {
                _healthFacilities.value =
                    ResponseStatusCallbacks.error(data = null, message = e.message.toString())
            }
        }

    }


    fun getFormsStatusUploadStatus(date: String) {
        _uf.value = ResponseStatusCallbacks.loading(null)
        _fs.value = ResponseStatusCallbacks.loading(null)
        _tf.value = ResponseStatusCallbacks.loading(null)
        viewModelScope.launch {
            launch {
                try {
                    repository.getFormsByDate(date).collect { item ->
                        _tf.value = ResponseStatusCallbacks.success(
                            data = item.size,
                            message = "Forms exist"
                        )
                    }
                } catch (e: Exception) {
                    _tf.value = ResponseStatusCallbacks.error(null, e.message.toString())
                }
            }
            launch {
                try {
                    repository.getUploadStatus().collect { item ->
                        _uf.value = ResponseStatusCallbacks.success(
                            data = item,
                            message = "Upload status exist"
                        )
                    }
                } catch (e: Exception) {
                    _fs.value = ResponseStatusCallbacks.error(null, e.message.toString())
                }
            }
            launch {
                try {
                    repository.getFormStatus(date).collect { fstatus ->
                        _fs.value = ResponseStatusCallbacks.success(
                            data = fstatus,
                            message = "Form status exist"
                        )
                    }
                } catch (e: Exception) {
                    _fs.value = ResponseStatusCallbacks.error(null, e.message.toString())
                }
            }
        }
    }

    fun getCampFromDB(campNo: String, distCode: String) {
        _campsResponse.value = ResponseStatusCallbacks.loading(null)
        viewModelScope.launch {
            try {
                delay(1000)
                val camp = repository.getCampsFromDB(campNo, distCode)
                _campsResponse.value = ResponseStatusCallbacks.success(data = camp)
            } catch (e: Exception) {
                _campsResponse.value =
                    ResponseStatusCallbacks.error(data = null, message = e.message.toString())
            }
        }
    }

    init {
        /*getDistrictFromDB()
        getTodayForms(sysdateToday)
        getUploadFormsStatus()
        getFormsStatus(sysdateToday)*/
    }

}