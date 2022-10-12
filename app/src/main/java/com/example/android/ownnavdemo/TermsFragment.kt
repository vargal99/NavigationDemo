package com.example.android.ownnavdemo

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.Toast
import com.example.android.ownnavdemo.databinding.FragmentNameBinding
import com.example.android.ownnavdemo.databinding.FragmentTermsBinding


class TermsFragment : Fragment() {
    private lateinit var binding: FragmentTermsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTermsBinding.inflate(inflater, container, false)


        return binding.root
    }



}


