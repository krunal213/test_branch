package com.example.myapplication

import dagger.Subcomponent

@PerAndroid
@Subcomponent(
    modules = [
        RepositoryModule::class,
        AndroidViewModelModule::class,
        DataSourceModule::class,
    ]
)
interface AndroidComponent {

    fun inject(homeFragment: HomeFragment)

    fun inject(detailsFragment: DetailsFragment)
}