package com.example.democalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {
    Float fThamso1, fThamso2;
    String sToantu, sXuatkq = "";

    EditText etGiatri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etGiatri = (EditText) findViewById(R.id.etResult);
        int[] idButton = {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,
                R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,R.id.btnPoint,
                R.id.btnAdd,R.id.btnMul,R.id.btnDel,R.id.btnDev, R.id.btnSub, R.id.btnResult};

        for (int id:idButton) {
            View v = (View)findViewById(id);
            v.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAdd:
                sToantu = "+";
                fThamso1 = Float.parseFloat(etGiatri.getText().toString());
                sXuatkq = "0";
                etGiatri.setText("0");
                Log.d("ketqua","" + fThamso1);
                break;
            case R.id.btnDev:
                sToantu = "/";
                break;
            case R.id.btnMul:
                sToantu = "*";
                break;
            case R.id.btnSub:
                sToantu = "-";
                break;
            case R.id.btnResult:
                sToantu = "=";
                fThamso2 = Float.parseFloat(etGiatri.getText().toString());
                break;
            default:
            sXuatkq += ((Button)v).getText().toString();
            etGiatri.setText(sXuatkq);
        }
    }
}