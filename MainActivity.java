package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
    public void btn2(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "2";
        txt.setText(s);


    }

    public void btn3(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "3";
        txt.setText(s);
    }

    public void btn4(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "/";
        txt.setText(s);
    }

    public void btn5(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "0";
        txt.setText(s);
    }

    public void btn6(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += ".";
        txt.setText(s);
    }

    @SuppressLint("SetTextI18n")
    public void btn7(View view) {
        TextView txt =findViewById(R.id.txt);
        TextView t=findViewById(R.id.t);
        String s = txt.getText().toString();
        Expression exp=new Expression(s);
        String res;
        try{
            res=String.valueOf(exp.calculate());
            t.setText(res);
        }
    catch (Exception E)
    {
        t.setText("Error in Expression");
    }
    }

    public void btn8(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "4";
        txt.setText(s);
    }

    public void btn9(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "5";
        txt.setText(s);
    }

    public void btn10(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "6";
        txt.setText(s);
    }

    public void btn11(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "*";
        txt.setText(s);
    }

    public void btn12(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "7";
        txt.setText(s);
    }

    public void btn13(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "8";
        txt.setText(s);
    }

    public void btn14(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "9";
        txt.setText(s);
    }

    public void btn15(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "-";
        txt.setText(s);
    }

    public void btn16(View view) {
        TextView txt =findViewById(R.id.txt);
        TextView t=findViewById(R.id.t);
        String s;
        s = " ";
        txt.setText(s);

        t.setText(s);
    }

    public void btn17(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "%";
        txt.setText(s);
    }

    public void btn18(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "+";
        txt.setText(s);
    }

    public void btn19(View view) {
        TextView txt = findViewById(R.id.txt);
        int n = txt.getText().length();
        if (n != 0)
        {
            StringBuffer erase = new StringBuffer(txt.getText());
            erase.reverse();
            erase.deleteCharAt(0);
            erase.reverse();
            txt.setText(erase);

        }
    }

    @SuppressLint("SetTextI18n")
    public void btn1(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "1";
        txt.setText(s);

    }

    public void btn0(View view) {
        TextView txt =findViewById(R.id.txt);
        String s = txt.getText().toString();
        s += "00";
        txt.setText(s);

    }
}