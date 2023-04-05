package com.example.saper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    public var columns_min: Int = 2
    public var columns_max: Int = 12
    public var rows_min: Int = 2
    public var rows_max: Int = 12
    private val button_open by lazy { findViewById<Button>(R.id.button) }
    public val rows_count by lazy { findViewById<EditText>(R.id.editRows) }
    public val columns_count by lazy { findViewById<EditText>(R.id.editColumns) }
    public val mines_count by lazy { findViewById<EditText>(R.id.editNumber) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rows_count.setText("7")
        columns_count.setText("5")
        mines_count.setText("7")

        button_open.setOnClickListener {
            var textmessege: String = ""
            var res: Int = checker()
            if (res == 1) {
                textmessege =
                    "Невернове количество столбцов или строк. \nДля строк: минимальое значение - $rows_min, максимальное - $rows_max.\nДля столбцов: минимальое значение - $columns_min, максимальное - $columns_max."
                val toast = Toast.makeText(applicationContext, textmessege, Toast.LENGTH_LONG)
                toast.show()
            } else if (res == 2) {
                textmessege = "Число мин не должно превышать половину всех клеток."
                val toast = Toast.makeText(applicationContext, textmessege, Toast.LENGTH_LONG)
                toast.show()  }
              if (res == 0) {
                textmessege = "Поехали!"
                val toast = Toast.makeText(applicationContext, textmessege, Toast.LENGTH_LONG)
                toast.show()
                val intent = Intent(this, newgame::class.java)
                intent.putExtra("columns", columns_count.text.toString())
                    intent.putExtra("rows", rows_count.text.toString())
                   intent.putExtra("mines", mines_count.text.toString())
                startActivity(intent)
            }

        }
    }


    private fun checker()
            : Int {
        var rows_current: Int = Integer.parseInt(rows_count.text.toString())
        var column_current: Int = Integer.parseInt(columns_count.text.toString())

        if (!(rows_current <= rows_max && rows_current >= rows_min && column_current <= columns_max && column_current >= columns_min)) {
            return 1
        }
        if ((rows_current * column_current).toFloat() * 0.5 <= mines_count.text.toString()
                .toFloat()
        ) {
            return 2
        }

        return 0
    }

}
