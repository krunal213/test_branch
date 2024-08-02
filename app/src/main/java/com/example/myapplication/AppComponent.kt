package com.example.myapplication

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    DatabaseModule::class
])
interface AppComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance application: Application) : AppComponent
    }

    fun androidComponent() : AndroidComponent

}