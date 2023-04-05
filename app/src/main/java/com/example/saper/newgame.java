package com.example.saper;

import static android.widget.ImageView.ScaleType.CENTER_CROP;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Matrix;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

public class newgame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newgame);
        Bundle extras = getIntent().getExtras();

        int  count_of_columns =Integer.parseInt( extras.getString("columns"));
        int  count_of_rows =Integer.parseInt( extras.getString("rows"));
        int  count_of_mines =Integer.parseInt( extras.getString("mines"));


        TableLayout table  =(TableLayout) findViewById(R.id.thistable);

        for (int i = 0; i < count_of_rows; i++) {

            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableRow.LayoutParams(-1,-1));


            for (int j = 0; j < count_of_columns; j++) {
                ImageView imageView = new ImageView(this);

                imageView.setImageResource(R.drawable.wad);
imageView.setScaleY(1.2F);
imageView.setScaleX(1.2F);
                tableRow.addView(imageView, j);
            }
            tableRow.setLayoutParams(new TableRow.LayoutParams(-2,-2));
            table.addView(tableRow, i);

        }
        table.setLayoutParams(new TableLayout.LayoutParams(-2,-2));

    }
}