package com.example.myapplication

import androidx.lifecycle.AndroidViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class AndroidViewModelModule {

    @Binds
    @IntoMap
    @ClassKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel) : AndroidViewModel

}