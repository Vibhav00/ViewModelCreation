package com.example.viewmodels

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private lateinit var fragmentFirstBinding: FragmentFirstBinding
    private lateinit var noParamViewModel: NoParamViewModel // view model without param
    private lateinit var paramViewModel: ParamViewModel

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
        val factory = ViewModelProviderFactory("Data from frag 1")

        if (initializeViewModelInActivity) {
            // making activity as the owner of the viewmodel
            noParamViewModel =
                ViewModelProvider(this.requireActivity()).get(NoParamViewModel::class.java)
            // making activity as the owner of the viewmodel
            paramViewModel =
                ViewModelProvider(this.requireActivity(), factory).get(ParamViewModel::class.java)


        } else {
            // making the fragment as the owner of the viewmodel
            noParamViewModel =
                ViewModelProvider(this).get(NoParamViewModel::class.java)


            // making fragment as the owner of the viewmodel
            paramViewModel = ViewModelProvider(this, factory).get(ParamViewModel::class.java)

        }


    }
}