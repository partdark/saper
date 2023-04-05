package com.example.saper

import MainAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.AdapterView.OnItemClickListener;


class pole : AppCompatActivity() {
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pole)
        val bundle = intent.extras
        val count_of_columns = intent.getStringExtra("columns")
        val count_of_rows = intent.getStringExtra("rows")
        val count_of_mines = intent.getStringExtra("mines")

        val pole: GridView = findViewById(R.id.pole_s_minami)
        pole.numColumns = count_of_columns.toString().toInt()

        val mainAdapter =  MainAdapter(this@pole,Integer.parseInt(count_of_columns) * Integer.parseInt(count_of_rows))
        pole.adapter = mainAdapter
        pole.onItemClickListener = OnItemClickListener { _, _, position, _ ->
            Toast.makeText(applicationContext, "You CLicked ",
                Toast.LENGTH_SHORT).show()

        }
           pole.columnWidth=  1200/ Integer.parseInt(count_of_columns)
    }
}