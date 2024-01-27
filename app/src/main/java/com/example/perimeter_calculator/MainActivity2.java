package com.example.perimeter_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button B1,B2;
    EditText Text1,Text2;
    TextView Ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        B1 =findViewById(R.id.btn1);
        B2 =findViewById(R.id.btn2);
        Text1=findViewById(R.id.text1);
        Text2 = findViewById(R.id.text2);
        Ans= findViewById(R.id.ans);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    int text1 = Integer.parseInt(Text1.getText().toString());
                    int text2 = Integer.parseInt(Text2.getText().toString());

                    int ans = 2 * (text1 + text2);
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