package com.example.a115724211.bmi;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText a,b,c,d;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText)findViewById(R.id.a);
        b=(EditText)findViewById(R.id.b);
        c=(EditText)findViewById(R.id.c);
        bt=(Button)findViewById(R.id.bt);
        d=(EditText)findViewById(R.id.stat);



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final DecimalFormat df2 = new DecimalFormat(".##");
                double aa,bb,cc,dd;
                aa=Double.parseDouble(a.getText().toString());
                bb=Double.parseDouble(b.getText().toString());
                dd=bb*bb;
                cc=aa/dd;
                c.setText(""+df2.format(cc));

                if(cc<18.5)
                {
                    d.setText("underweight");
                }
                else if(cc>18.5&&cc<24.9)
                {
                    d.setText("normal weight");
                }
                else if(cc>25&&cc<29.9)
                {
                    d.setText("overweight");
                }
                else if(cc>30&&cc<39.9)
                {
                    d.setText("obesity");
                }
                else if(cc>40)
                {
                    d.setText("severe obesity");
                }
            }


        });
    }



}
