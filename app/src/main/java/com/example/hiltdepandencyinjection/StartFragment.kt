package com.example.hiltdepandencyinjection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hiltdepandencyinjection.annotation.Firebase
import com.example.hiltdepandencyinjection.annotation.SQL
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class StartFragment : Fragment() {

    @Inject
    @SQL
    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        userRepository.saveUser("Bibekananda892@gmail.com","11111111")
        return inflater.inflate(R.layout.fragment_start, container, false)
    }


}