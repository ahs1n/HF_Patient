package edu.aku.hassannaqvi.hf_patient.base.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.aku.hassannaqvi.hf_patient.base.repository.GeneralRepository
import edu.aku.hassannaqvi.hf_patient.base.repository.ResponseStatusCallbacks
import edu.aku.hassannaqvi.hf_patient.models.ChildInformation
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ChildListViewModel(internal val repository: GeneralRepository) : ViewModel() {

    private val _childResponse: MutableLiveData<ResponseStatusCallbacks<List<ChildInformation>>> =
        MutableLiveData()

    val childResponse: MutableLiveData<ResponseStatusCallbacks<List<ChildInformation>>>
        get() = _childResponse

    private val _childUpdateResponse: MutableLiveData<ResponseStatusCallbacks<Int>> =
        MutableLiveData()

    val childUpdateResponse: MutableLiveData<ResponseStatusCallbacks<Int>>
        get() = _childUpdateResponse


    fun getChildDataFromDB(cluster: String, hhno: String, uuid: String) {
        _childResponse.value = ResponseStatusCallbacks.loading(null)
        viewModelScope.launch {
            try {
                delay(1000)
                val children = repository.getChildList(cluster, hhno, uuid)
                _childResponse.value = if (children.size > 0) {
//                    val childList = ArrayList<ChildInfo>(children.sortedBy { it.formFlag })
                    ResponseStatusCallbacks.success(data = children, message = "Child list found")
                } else
                    ResponseStatusCallbacks.error(data = null, message = "No child found!")
            } catch (e: Exception) {
                _childResponse.value =
                    ResponseStatusCallbacks.error(data = null, message = e.message.toString())
            }

        }

    }

    fun updateChildrenDataForSelectionDB(selectedItem: ChildInformation, item: String) {
        _childUpdateResponse.value = ResponseStatusCallbacks.loading(null)
        viewModelScope.launch {
            try {
                delay(1000)
                val children = repository.updateSpecificChildList(selectedItem, item)
                _childUpdateResponse.value = if (children > 0) {
                    ResponseStatusCallbacks.success(data = children, message = "Child updated")
                } else
                    ResponseStatusCallbacks.error(data = null, message = "Child not updated!")
            } catch (e: Exception) {
                _childUpdateResponse.value =
                    ResponseStatusCallbacks.error(data = null, message = e.message.toString())
            }

        }
    }
}