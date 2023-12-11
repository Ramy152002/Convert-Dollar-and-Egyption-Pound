package com.ramy.convertdollartoeuro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView dollars,puonds;
    Button convert,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dollars=findViewById(R.id.dollarsID);
        puonds=findViewById(R.id.poundsID);
        convert = findViewById(R.id.buttoncon);
        clear=findViewById(R.id.buttonclr);
Money m;
    convert.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double d =0;
            d=Double.parseDouble(dollars.getText().toString());
            double p = 0;
            p=Double.parseDouble(puonds.getText().toString());
            double result;
            String res;
            if (p == 0 && d == 0) {
                Toast.makeText(MainActivity.this, "Invalid data - Try again", Toast.LENGTH_SHORT).show();
            }
            if (d > 0) {
                result = d * 30;

                res = new Double(result).toString();
                puonds.setText(res);
            }
            //   dollars.setText((int) (p/30));
            if (p > 0) {
                result = p / 30;
                res = new Double(result).toString();
                dollars.setText(res);

            }

        }

    }  );


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dollars.setText("0");
                puonds.setText("0");
            //    Toast.makeText(this,"Clear",Toast.LENGTH_SHORT).show();

            }
        });
    }


}