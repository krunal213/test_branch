package com.example.myapplication

import android.app.Application

class MainApplication : Application() {

    lateinit var androidComponent: AndroidComponent

    override fun onCreate() {
        super.onCreate()
        androidComponent = DaggerAppComponent.factory().create(this).androidComponent()
    }
}