package edu.aku.hassannaqvi.hf_patient.base.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.aku.hassannaqvi.hf_patient.base.repository.GeneralRepository
import edu.aku.hassannaqvi.hf_patient.base.repository.ResponseStatusCallbacks
import edu.aku.hassannaqvi.hf_patient.models.ChildInformation
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SelectedChildrenListViewModel(internal val repository: GeneralRepository) : ViewModel() {

    private val _childResponse: MutableLiveData<ResponseStatusCallbacks<List<ChildInformation>>> =
        MutableLiveData()

    val childResponse: MutableLiveData<ResponseStatusCallbacks<List<ChildInformation>>>
        get() = _childResponse


    fun getChildDataFromDB(cluster: String, hhno: String, uuid: String) {
        _childResponse.value = ResponseStatusCallbacks.loading(null)
        viewModelScope.launch {
            try {
                delay(1000)
                val children = repository.getSelectedChildList(cluster, hhno, uuid)
                _childResponse.value = if (children.size > 0) {
                    val childList = ArrayList<ChildInformation>(children.sortedBy { it.cb07 })
                    ResponseStatusCallbacks.success(data = childList, message = "Child list found")
                } else
                    ResponseStatusCallbacks.error(data = null, message = "No child found!")
            } catch (e: Exception) {
                _childResponse.value =
                    ResponseStatusCallbacks.error(data = null, message = e.message.toString())
            }

        }

    }
}