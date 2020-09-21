package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out=findViewById(R.id.scoreView);
        Button bt1=findViewById(R.id.button);
        Button bt2=findViewById(R.id.button2);
        Button bt3=findViewById(R.id.button3);
        Button bt4=findViewById(R.id.button4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Log.i("main","onClick msg....");
        switch(v.getId()){
            case R.id.button:

                String str=out.getText().toString();
                int t=Integer.parseInt(str);
                t+=3;
                String outstr=String.valueOf(t);
                out.setText(outstr);
                break;

            case R.id.button2:
                str = out.getText().toString();
                t = Integer.parseInt(str);
                t+=2;
                outstr = String.valueOf(t);
                out.setText(outstr);

                break;
            case R.id.button3:

                str = out.getText().toString();
                t = Integer.parseInt(str);
                t+=1;
                outstr = String.valueOf(t);
                out.setText(outstr);

                break;
            case R.id.button4:

                out.setText(R.string.score);

                break;



        }
    }
}