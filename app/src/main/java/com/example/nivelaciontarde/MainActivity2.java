package com.example.nivelaciontarde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button btnReturn;
    private TextView textProductTitle, textDescription;
    private ImageView imgProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnReturn = (Button) findViewById(R.id.btnReturn);
        textDescription = (TextView) findViewById(R.id.textDescription);
        textProductTitle = (TextView) findViewById(R.id.textProductTitle);
        imgProducto = (ImageView) findViewById(R.id.imgProduct);

        Intent intentIn = getIntent();
        textProductTitle.setText(intentIn.getStringExtra("title"));
        textDescription.setText(intentIn.getStringExtra("description"));
        imgProducto.setImageResource(intentIn.getIntExtra("image", 0));

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}