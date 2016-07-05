package com.facci.calculadorajars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.R.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivityJARS extends AppCompatActivity {

    String total="", operadores="";
    Double n1, n2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_jars);
        Toast.makeText(this,"On Create", Toast.LENGTH_LONG).show();
    }
    
    public void onClickAcerca(View v){
        Intent intent = new Intent(MainActivityJARS.this,AcercaActivityJARS.class);
        startActivity(intent);
    }
    public void OnClick (View v){
        Button button = (Button)v;
        String valor=button.getText().toString();
        total+=valor;
        EditText edit =(EditText)findViewById(R.id.et1);
        edit.setText(total);
    }
    public void agregar (View v){
        n1=Double.parseDouble(total);
        total="";
        Button button = (Button)v;
        String valor = button.getText().toString();
        operadores=valor;
        EditText edit =(EditText)findViewById(R.id.et1);
        edit.setText("");
    }
    public void calcular (View v){
        EditText edit =(EditText)findViewById(R.id.et1);
        String valor2=edit.getText().toString();
        n2=Double.parseDouble(valor2);
        double TOTAL=0;
        if (operadores.equals("+")){
            TOTAL=n1+n2;
        }else if (operadores.equals("-")){
            TOTAL=n1-n2;
        }else if (operadores.equals("x")){
            TOTAL=n1*n2;
        }
        edit.setText(TOTAL+" ");
    }


}
