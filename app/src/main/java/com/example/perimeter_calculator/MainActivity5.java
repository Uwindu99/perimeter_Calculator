package com.example.perimeter_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    Button B1,B2;
    TextView Text1,Text2,Text3,Text4,Ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        B1 =findViewById(R.id.btnTr);
        B2 =findViewById(R.id.btnTr2);
        Text1=findViewById(R.id.text1);
        Text2 = findViewById(R.id.text2);
        Text3 = findViewById(R.id.text3);
        Text4 = findViewById(R.id.text4);
        Ans= findViewById(R.id.ans);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    int text1 = Integer.parseInt(Text1.getText().toString());
                    int text2 = Integer.parseInt(Text2.getText().toString());
                    int text3 = Integer.parseInt(Text3.getText().toString());
                    int text4 = Integer.parseInt(Text4.getText().toString());

                    int ans = (text1 + text2 + text3 + text4);
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

