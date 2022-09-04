package com.example.fibonachi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private TextView text_res_fibo,text_res_fact;
    private EditText num_ingresado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_res_fibo=findViewById(R.id.text_res_fibo);
        text_res_fact=findViewById(R.id.text_res_fact);
        num_ingresado=findViewById(R.id.entrada);
    }

    public void factorial(View view){
        int numero = Integer.parseInt (num_ingresado.getText().toString());
        int factorial = 1;
        for(int i=1; i <= numero ; i++)
        {
            factorial= factorial*i;
        }
        text_res_fact.setText(factorial+"");

    }

    public void fibonicci (View view)
    {
        int numero = Integer.parseInt(num_ingresado.getText().toString());
        int fibonicci = 1;
        int num1=0;
        int num2=1;

        for (int i = 1; i <= numero; i++)
        {
            fibonicci= num1 + num2;
            num1 = num2;
            num2= fibonicci;
        }
        text_res_fibo.setText(fibonicci+ " ");
    }
}