package com.codingblocks.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button clear, one, two, three, four, five, six, seven, eight, nine, multiply, divide, plus, minus, equal,zero, dot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textview);
        zero=(Button)findViewById(R.id.zero);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        clear=(Button)findViewById(R.id.clear);
        divide=(Button)findViewById(R.id.divide);
        multiply=(Button)findViewById(R.id.multiply);
        minus=(Button)findViewById(R.id.minus);
        plus=(Button)findViewById(R.id.plus);
        equal=(Button)findViewById(R.id.equal);
        dot=(Button)findViewById(R.id.dot);
    }


    @Override
    public void onClick(View v) {

        int id = v.getId();
        char ch = tv.getText().toString().charAt(tv.getText().length() - 1);
        char firstchar = tv.getText().toString().charAt(0);
        dot.setEnabled(true);

        if (id == R.id.clear) {
            if (tv.getText().length() == 1) {
                tv.setText("0");
                return;
            } else {
                String S = tv.getText().toString();
                tv.setText(S.substring(0, S.length() - 1));
            }
            dot.setEnabled(true);
        }
        else if (id == R.id.plus) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                return;
            } else {
                tv.append("+");
            }
            dot.setEnabled(true);
        } else if (id == R.id.minus) {
            if (ch == '-' || ch == '+' || ch == '*' || ch == '/') {
                return;
            } else {
                tv.append("-");
            }
            dot.setEnabled(true);
        } else if (id == R.id.divide) {
            if (ch == '/' || ch == '-' || ch == '*' || ch == '+') {
                return;
            } else {
                tv.append("/");
            }
            dot.setEnabled(true);
        } else if (id == R.id.multiply) {
            if (ch == '*' || ch == '-' || ch == '+' || ch == '/') {
                return;
            } else {
                tv.append("*");
            }
            dot.setEnabled(true);
        } else if (id == R.id.seven) {
            if (firstchar == '0') {
                tv.setText("7");
            } else {
                tv.append("7");
            }
            dot.setEnabled(true);
        } else if (id == R.id.eight) {
            if (firstchar == '0') {
                tv.setText("8");
            } else {
                tv.append("8");
            }
            dot.setEnabled(true);
        } else if (id == R.id.nine) {
            if (firstchar == '0') {
                tv.setText("9");
            } else {
                tv.append("9");
            }
            dot.setEnabled(true);
        } else if (id == R.id.four) {
            if (firstchar == '0') {
                tv.setText("4");
            } else {
                tv.append("4");
            }
            dot.setEnabled(true);
        } else if (id == R.id.five) {
            if (firstchar == '0') {
                tv.setText("5");
            } else {
                tv.append("5");
            }
            dot.setEnabled(true);
        } else if (id == R.id.six) {
            if (firstchar == '0') {
                tv.setText("6");
            } else {
                tv.append("6");
            }
            dot.setEnabled(true);
        } else if (id == R.id.one) {
            if (firstchar == '0') {
                tv.setText("1");
            } else {
                tv.append("1");
            }
            dot.setEnabled(true);
        } else if (id == R.id.two) {
            if (firstchar == '0') {
                tv.setText("2");
            } else {
                tv.append("2");
            }
            dot.setEnabled(true);
        } else if (id == R.id.three) {
            if (firstchar == '0') {
                tv.setText("3");
            } else {
                tv.append("3");
            }
            dot.setEnabled(true);
        } else if (id == R.id.zero) {
            if (firstchar == '0') {
                tv.setText("0");
            }
            else {
                tv.append("0");
            }
            dot.setEnabled(true);
        } else if (id==R.id.equal) {
            float answer = result(tv.getText().toString());
            tv.setText(answer + "");
        }
        else if(id == R.id.dot) {
            tv.append(".");
            dot.setEnabled(false);
        }
    }


    private float result(String text) {
        return EvaluateString.evaluate(text);
    }

}