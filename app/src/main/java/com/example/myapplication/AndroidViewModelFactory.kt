package com.example.myapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class AndroidViewModelFactory @Inject constructor(
    application: Application,
    val viewmodelClasses : Map<Class<*>, @JvmSuppressWildcards AndroidViewModel>
) : ViewModelProvider.AndroidViewModelFactory(application) {

    override fun <T : ViewModel> create(modelClass: Class<T>) = viewmodelClasses[modelClass] as T

}