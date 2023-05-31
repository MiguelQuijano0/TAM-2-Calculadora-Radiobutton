package com.example.tam_2_calculadora_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1;
    private RadioButton r1,r2,r3,r4,r5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView) findViewById(R.id.tv1);
        r1 =(RadioButton)findViewById(R.id.r1);
        r2 =(RadioButton)findViewById(R.id.r2);
        r3 =(RadioButton)findViewById(R.id.r3);
        r4 =(RadioButton)findViewById(R.id.r4);
        r5 =(RadioButton)findViewById(R.id.r5);
    }
    public void operar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);

        if (r1.isChecked()==true) {
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            tv1.setText(resu);
        } else
            if (r2.isChecked()==true) {
                int resta=nro1-nro2;
                String resu=String.valueOf(resta);
                tv1.setText(resu);
            } else
                if (r3.isChecked()==true) {
                    int multiplicar=nro1*nro2;
                    String resu=String.valueOf(multiplicar);
                    tv1.setText(resu);
                } else
                    if (r4.isChecked()==true) {
                        String error= "ingrese un numero mayor de 0";
                        if (nro2>0){
                            int dividir=nro1/nro2;
                            String resu=String.valueOf(dividir);
                            tv1.setText(resu);
                        }else
                            if (nro2==0){
                                tv1.setText(error);
                            }
                    }else
                        if (r5.isChecked()==true){
                            if (nro2>=0){
                                int exponente = nro2;
                                int potencia = 1;
                                while(0<exponente){
                                    potencia = potencia*nro1;
                                    exponente--;
                                }
                                String resu=String.valueOf(potencia);
                                tv1.setText(resu);
                            }

                        }
    }
}