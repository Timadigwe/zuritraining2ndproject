package com.example.zuritraining2ndproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zuritraining2ndproject.databinding.ActivityViewAcivityBinding

class ViewActivity : AppCompatActivity() {
    var binding: ActivityViewAcivityBinding? = null
    var adapter: FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewAcivityBinding.inflate(layoutInflater)
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
