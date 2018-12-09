package com.zhora.exampleapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView txt;
    EditText edt1;

    class Listener1 implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (edt1.getText().toString().length() > 6) {
                txt.setText(edt1.getText().toString().substring(0, 6));
            }
            else {
                txt.setText(edt1.getText().toString());
            }
            btn1.setOnClickListener(new Listener3());
        }
    }

    class Listener3 implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            txt.setText(edt1.getText().toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        txt = findViewById(R.id.txt1);
        edt1 = findViewById(R.id.edt1);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setOnClickListener(new Listener1());
            }
        });
        //btn1.setOnClickListener(new Listener3());
    }
}
