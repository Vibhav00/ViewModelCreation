package com.example.viewmodels

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewmodels.databinding.ActivityMain2Binding
import com.example.viewmodels.databinding.ActivityMainBinding


 /**
  *  this is to show  how can i create the instance of viewmodel
  *  by using "by  viewmodels"
  *
  * **/
class MainActivity2 : AppCompatActivity() {
    lateinit var  binding :ActivityMain2Binding


    //  Passing ViewModel provider factory inside the
    //  lambda  . and the last line  is returning the instance of
    //  the ViewModelProviderFactory ...
    private val paramViewModel: ParamViewModel by viewModels{
        ViewModelProviderFactory("Data from Ac 2 ")
    }

    // creating the instance
    private val noParamViewModel:NoParamViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

         /**
          *  in order to initialize the param as well as
          *  non param view model in this case we have to
          *  access them since they are lazy initialized
          *
          * **/
        paramViewModel
        noParamViewModel
        supportFragmentManager.beginTransaction().add(R.id.myFrag2,SecondFragment()).commit()
    }
}