package com.example.ex3tm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnCalcular;
    EditText txtValor, txtCodigo;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        txtValor = (EditText)findViewById(R.id.txtValor);
        txtCodigo = (EditText)findViewById(R.id.txtCod);
        txtResultado = (TextView)findViewById(R.id.txtResultado);
    }

    public void Calcular(View view){
        double d, v;
        int cod;
        v = Double.parseDouble(txtValor.getText().toString());
        cod = Integer.parseInt(txtCodigo.getText().toString());
        switch (cod) {
            case 1:
                //5%
                d = v-(0.05*v);
                txtResultado.setText("O valor com desconto é: " + d);
                break;
            case 2:
                //10%
                d = v-(v/10);
                txtResultado.setText("O valor com desconto é: " + d);
                break;
            case 3:
                //20%
                d = v-(0.2*v);
                txtResultado.setText("O valor com desconto é: " + d);
                break;
            case 4:
                //50%
                d = v-(v/2);
                txtResultado.setText("O valor com desconto é: " + d);
                break;
            default:
                txtResultado.setText("Não existe esse código de desconto");
                break;
        }
    }
}
