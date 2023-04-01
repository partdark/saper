package com.example.saper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlin.jvm.internal.FunInterfaceConstructorReference

class pole : AppCompatActivity() {
    companion object {
        const val columns_count = "total_count"
        const val rows_count = "total_count"
        const val mines_count = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pole)
       val count_of_columns : String? = intent.getStringExtra(columns_count)
        val count_of_rows : String? = intent.getStringExtra(rows_count)
        val count_of_mines : String? = intent.getStringExtra(mines_count)

        var show : TextView = findViewById(R.id.textView4)
        show.setText(count_of_rows)


    }
}