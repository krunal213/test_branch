package com.example.myapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class MainViewModel @Inject constructor(
    application: Application,
    val userRepository: UserRepository
) : AndroidViewModel(application) {

    fun saveUser(user: User) = Observable.create {
        it.onNext(userRepository.saveUser(user))
    }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())


    fun getAllUser() = Observable.create {
        it.onNext(userRepository.getAllUser())
    }.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())

}