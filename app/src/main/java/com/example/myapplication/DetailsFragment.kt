package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import javax.inject.Inject

class DetailsFragment : Fragment() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_details,container,false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val application = activity?.application as MainApplication
        application.androidComponent.inject(this)
        mainViewModel
            .getAllUser()
            .subscribe(object : Observer<List<User>> {
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {

                }

                override fun onComplete() {

                }

                override fun onNext(t: List<User>) {
                    view.findViewById<TextView>(R.id.textViewDisplay).text = "$t"
                }
            })
    }

}