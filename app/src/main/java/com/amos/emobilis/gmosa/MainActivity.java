package com.amos.emobilis.gmosa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText input1=(EditText) findViewById(R.id.input1);
        EditText input2=(EditText) findViewById(R.id.input2);
        TextView output=(TextView) findViewById(R.id.output);
        String a=input1.getText().toString();
        String b=input2.getText().toString();
        if(a.isEmpty()|| b.isEmpty())
            return;
        double x=Double.parseDouble(a);
        double y=Double.parseDouble(b);
        double result=x+y;
        
        output.setText("sum is" + result);

    }
}
