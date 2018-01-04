package com.example.sarvesh.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button b;
    TextView t;
    Button d;
    Button s;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.button);
        t=findViewById(R.id.textView);
         d=findViewById(R.id.button2);
         s=findViewById(R.id.button3);
    }
    public void counter(View view){

        String s=t.getText().toString();

        int i=Integer.parseInt(s);

        i++;
        Toast.makeText(this, "Counter ="+i, Toast.LENGTH_SHORT).show();
        t.setText(i+"");

    }


    public void restart(View view){

        Toast.makeText(this, "You have Restarted", Toast.LENGTH_SHORT).show();
        t.setText("0");
    }

    public void size(View view){
        var z=

        Toast.makeText(this, "Size Increased", Toast.LENGTH_SHORT).show();

    }

}
