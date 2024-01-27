package com.example.perimeter_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    Button B1,B2;
    TextView Text1,Ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        B1 =findViewById(R.id.btnSr);
        B2 =findViewById(R.id.btnSr2);
        Text1=findViewById(R.id.text1);

        Ans= findViewById(R.id.ans);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    float text1 = Integer.parseInt(Text1.getText().toString());


                    float ans = (float) (2 * 3.14 * (text1));
                    Ans.setText(String.valueOf(ans));

                } catch (NumberFormatException e) {
                    Ans.setText("Invalid Input");
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });
    }
}