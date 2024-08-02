package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import javax.inject.Inject

class HomeFragment : Fragment() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_home,container,false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val application = activity?.application as MainApplication
        application.androidComponent.inject(this)
        view.findViewById<Button>(R.id.buttonSave).setOnClickListener {
            mainViewModel.saveUser(User(age = 31, firstName = "krunal", lastName = "kathikar"))
                .subscribe(object : Observer<Long> {
                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onError(e: Throwable) {

                    }

                    override fun onComplete() {

                    }

                    override fun onNext(t: Long) {
                        Snackbar.make(
                            it,
                            "$t records update successfully",
                            Snackbar.LENGTH_SHORT
                        ).show()
                    }

                })
        }
        view.findViewById<Button>(R.id.buttonGetAll).setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment)
        }
    }

}