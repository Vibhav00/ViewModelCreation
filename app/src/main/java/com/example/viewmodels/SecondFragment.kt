package com.example.viewmodels

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.databinding.FragmentFirstBinding

class SecondFragment : Fragment() {
    private lateinit var fragmentFirstBinding: FragmentFirstBinding
//    val noParamViewModel: NoParamViewModel by viewModels()
    val noParamViewModel: NoParamViewModel by activityViewModels()

//    private val paramViewModel: ParamViewModel by viewModels {
//        ViewModelProviderFactory("Data from frag 2")
//    }

    private  val paramViewModel: ParamViewModel  by activityViewModels {
        ViewModelProviderFactory("Data from frag 1")
    }


    // change this to change the owner
    private var initializeViewModelInActivity = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentFirstBinding = FragmentFirstBinding.inflate(layoutInflater)
        return fragmentFirstBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // instance of the factory
        noParamViewModel
        paramViewModel

    }
}