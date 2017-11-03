package com.example.giovanne.calculadoraqualidade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.FloatMath;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button btnSoma;
    Button btnSubtracao;
    Button btnMult;
    Button btnDivisao;
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.edt_num1);
        num2 = (EditText)findViewById(R.id.edt_num2);
        btnSoma = (Button)findViewById(R.id.btn_soma);
        btnSubtracao = (Button)findViewById(R.id.btn_subtracao);
        btnMult = (Button)findViewById(R.id.btn_multi);
        btnDivisao = (Button)findViewById(R.id.btn_divisao);
        txtResultado = (TextView) findViewById(R.id.txt_resultado);



    }


    public void realizaSoma(View view){
        int numero1 = Integer.parseInt(num1.getText().toString());
        int numero2 = Integer.parseInt(num2.getText().toString());

        int resultado = Calculos.soma(numero1,numero2);

        txtResultado.setText(Integer.toString(resultado));

    }

    public void realizaSubtracao(View view){
        int numero1 = Integer.parseInt(num1.getText().toString());
        int numero2 = Integer.parseInt(num2.getText().toString());

        int resultado = Calculos.subtracao(numero1, numero2);

        txtResultado.setText(Integer.toString(resultado));
    }

    public void realizaMulti(View view){
        int numero1 = Integer.parseInt(num1.getText().toString());
        int numero2 = Integer.parseInt(num2.getText().toString());

        int resultado = Calculos.multi(numero1,numero2);

        txtResultado.setText(Integer.toString(resultado));
    }

    public void realizaDivisao(View view){
        int numero1 = Integer.parseInt(num1.getText().toString());
        int numero2 = Integer.parseInt(num2.getText().toString());

        float resultado = Calculos.divisao(numero1, numero2);

        txtResultado.setText(Float.toString(resultado));
    }
}
