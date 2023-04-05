package com.example.saper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow

class game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val count_of_columns = intent.getStringExtra("columns")
        val count_of_rows = intent.getStringExtra("rows")
        val count_of_mines = intent.getStringExtra("mines")

        val columns : Int = Integer.parseInt(count_of_columns)
        val rows : Int = Integer.parseInt(count_of_rows)
        val mines : Int = Integer.parseInt(count_of_mines)

         val table : TableLayout = findViewById(R.id.thistable)
        val row : TableRow ;


    }
}