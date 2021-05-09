package com.example.fun_facts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fun_facts.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    var binding: ActivityMainBinding? = null
    var adapter: FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact(){
        adapter = FactAdapter(this,DummyData.funFacts)
        binding?.factListView?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}