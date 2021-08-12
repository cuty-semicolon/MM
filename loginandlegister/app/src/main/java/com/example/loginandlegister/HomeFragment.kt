package com.example.loginandlegister


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.loginandlegister.databinding.ActivityProfileBinding
import com.example.loginandlegister.databinding.FragmentHomeBinding



class HomeFragment : Fragment() {


        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root

    }

}
