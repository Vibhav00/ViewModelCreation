package com.example.viewmodels

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.databinding.ActivityMainBinding
import javax.crypto.Cipher


 /**
  *  this is The activity to show the creation of view model
  *  by manually instantiating
  *
  * **/
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var  noParamViewModel:NoParamViewModel // view model without param
    private lateinit var paramViewModel: ParamViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // creating the instance of viewModel without any param
        noParamViewModel = ViewModelProvider(this).get(NoParamViewModel::class.java)




         /**
          *  to create the instance of param view model
          *  first i have to create the instance of the
          *  viewmodel provider factory
          *
          * **/

        // instance of the factory
        val factory = ViewModelProviderFactory("Data from Ac 1")

        // instance of the view mode
        paramViewModel = ViewModelProvider(this,factory).get(ParamViewModel::class.java)


        // click listener
        binding.secondActivity.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        supportFragmentManager.beginTransaction().add(R.id.myFrag,FirstFragment()).commit()

    }
}



