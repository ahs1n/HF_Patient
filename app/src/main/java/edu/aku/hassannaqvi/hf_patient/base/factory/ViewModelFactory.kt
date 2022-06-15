package edu.aku.hassannaqvi.hf_patient.base.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import edu.aku.hassannaqvi.hf_patient.base.repository.GeneralRepository
import edu.aku.hassannaqvi.hf_patient.base.viewmodel.ChildListViewModel
import edu.aku.hassannaqvi.hf_patient.base.viewmodel.LoginViewModel
import edu.aku.hassannaqvi.hf_patient.base.viewmodel.MainViewModel
import edu.aku.hassannaqvi.hf_patient.base.viewmodel.SelectedChildrenListViewModel

/*
* @author Ali Azaz Alam dt. 01.07.21
* */
@Suppress("UNCHECKED_CAST")
class ViewModelFactory(private val repository: GeneralRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(repository) as T
            modelClass.isAssignableFrom(ChildListViewModel::class.java) -> ChildListViewModel(
                repository
            ) as T
            modelClass.isAssignableFrom(LoginViewModel::class.java) -> LoginViewModel(repository) as T
            modelClass.isAssignableFrom(SelectedChildrenListViewModel::class.java) -> SelectedChildrenListViewModel(
                repository
            ) as T
            else -> throw IllegalArgumentException("Unknown viewModel class $modelClass")
        }
    }

}