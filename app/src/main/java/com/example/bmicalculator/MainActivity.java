package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button calculate;
    private EditText hieght;
    private EditText wieght;
    private TextView bmi;
    private TextView descrption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate=findViewById(R.id.btnClaculate);
        hieght=findViewById(R.id.etHieght);
        wieght=findViewById(R.id.etWieght);
        bmi=findViewById(R.id.tcBMI);
        descrption=findViewById(R.id.tvDescrption);
    }


    public void calculate_onClick(View view) {
        float w= Float.parseFloat(wieght.getText().toString());
        float h= Float.parseFloat(hieght.getText().toString());
        float result= w/(h*h);
        bmi.setText(Float.toString(result));
        if(result< 18.5)
            descrption.setText("underweight");
       else if(result<=24.9 && result >=18.5)
            descrption.setText("normal weight");
       else if(result<=29.9 && result >=25)
            descrption.setText("overweight");
       else if(result<=39.9 && result >=30)
            descrption.setText("obesity");
       else if(result >=40)
            descrption.setText("morbid obesity");
    }
}