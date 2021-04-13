package com.example.julianobasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd, btnSub, btnDiv, btnMul, btnMod;


        btnAdd=findViewById(R.id.btnAddition);
        btnSub=findViewById(R.id.btnSubtract);
        btnDiv=findViewById(R.id.btnDivide);
        btnMul=findViewById(R.id.btnMultiply);
        btnMod=findViewById(R.id.btnModulo);



        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        EditText operand1txt, operand2txt;
        TextView txtanswer;

        operand1txt=findViewById(R.id.operand1txt);
        operand2txt=findViewById(R.id.operand2txt);


        txtanswer=findViewById(R.id.answertxt);

        Double op1=0.0;
        Double op2=0.0;
        Double answer=0.0;

        op1=Double.parseDouble(operand1txt.getText().toString());
        op2=Double.parseDouble(operand2txt.getText().toString());

        switch(v.getId()) {
            case R.id.btnAddition:
                answer=op1+op2;
                txtanswer.setText(Double.toString(answer));


                break;
            case R.id.btnSubtract:
                answer=op1-op2;
                txtanswer.setText(Double.toString(answer));

                break;
            case R.id.btnMultiply:
                answer=op1*op2;
                txtanswer.setText(Double.toString(answer));

                break;
            case R.id.btnDivide:
                answer=op1/op2;
                txtanswer.setText(Double.toString(answer));

                break;
            case R.id.btnModulo:
                answer=op1%op2;
                txtanswer.setText(Double.toString(answer));

                break;}
    }
}