package com.example.leonardo.leoalvescalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String valor;
    public double n1;
    public double n2;
    public String simbolo;
    public boolean hasResultado;

    public MainActivity() {
        this.valor = "0";
        this.hasResultado = false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void escreverNove(View v){
        if(this.hasResultado) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        mostrar(9);
    }

    public void escreverOito(View v){
        if(this.hasResultado) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        mostrar(8);
    }

    public void escreverSete(View v){
        if(this.hasResultado) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        mostrar(7);
    }

    public void escreverSeis(View v){
        if(this.hasResultado) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        mostrar(6);
    }

    public void escreverCinco(View v){
        if(this.hasResultado) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        mostrar(5);
    }

    public void escreverQuatro(View v){
        if(this.hasResultado) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        mostrar(4);
    }

    public void escreverTres(View v) {
        if(this.hasResultado) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        mostrar(3);
    }

    public void escreverDois(View v){
        if(this.hasResultado) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        mostrar(2);
    }

    public void escreverUm(View v){
        if(this.hasResultado) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        mostrar(1);
    }

    public void escreverZero(View v){
        if(this.hasResultado ) {
            this.hasResultado = !this.hasResultado;
            this.limparTela();
        }
        if(this.valor.charAt(0) != '0')
            mostrar(0);
    }

    public void dividir(View v){
        if( valor.length() > 0) {
            this.n1 = Double.parseDouble(this.valor);
            this.simbolo = "/";
            this.limparTela();
        }
    }

    public void mulplicar(View v){
        if( valor.length() > 0) {
            this.n1 = Double.parseDouble(this.valor);
            this.simbolo = "*";
            this.limparTela();
        }
    }

    public void subtrair(View v){
        if( valor.length() > 0) {
            this.n1 = Double.parseDouble(this.valor);
            this.simbolo = "-";
            this.limparTela();
        }
    }

    public void somar(View v){

        if( valor.length() > 0) {
            this.n1 = Double.parseDouble(this.valor);
            this.simbolo = "+";
            this.limparTela();
        }
    }

    public void limpar(View v) {
        this.limparTela();
    }

    private void mostrar(int numero) {

        TextView input = (TextView) findViewById(R.id.input);
        if(this.valor.equals("0")) this.valor = "";
        this.valor = this.valor + numero;
        input.setText(this.valor);

    }

    public void resultado(View v) {
        if( valor.length() > 0 && this.n1 > 0) {
            this.n2 = Double.parseDouble(this.valor);
            double resultado = this.calcular(this.n1, this.simbolo, this.n2);
            TextView input = (TextView) findViewById(R.id.input);
            //resultado = (int) resultado;
            this.valor = "" + resultado;
            input.setText(this.valor);
            this.hasResultado = true;
        }
    }

    private void limparTela() {
        TextView input = (TextView) findViewById(R.id.input);
        this.valor = "0";
        input.setText(this.valor);
    }

    public double calcular(double n1, String operador, double n2){

        switch(operador) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                return n1 / n2;
            default:
                return 0;
        }
    }
}
