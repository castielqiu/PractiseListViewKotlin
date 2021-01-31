package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var colorArray= resources.getStringArray(R.array.Colors)
        var arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,colorArray)
        listView1.adapter=arrayAdapter;
        listView1.setOnItemClickListener { parent, view, position:Int, id:Long ->
            Toast.makeText(this,colorArray[position],Toast.LENGTH_LONG).show()
       }
    }
}