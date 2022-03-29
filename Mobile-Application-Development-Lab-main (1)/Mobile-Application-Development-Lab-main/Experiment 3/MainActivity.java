package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    EditText num1, num2;
    TextView t1;
    float n1,n2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        num1 = findViewById(R.id.editTextNumber);
        num2 = findViewById(R.id.editTextNumber3);
        t1 = findViewById(R.id.textView6);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
        
                 n1 = Integer.parseInt(num1.getText().toString());
                 n2 = Integer.parseInt(num2.getText().toString());
                 res = n1 + n2;
                t1.setText(String.valueOf(res));
                break;
            case R.id.button:

                 n1 = Integer.parseInt(num1.getText().toString());
                 n2 = Integer.parseInt(num2.getText().toString());
                 res = n1 - n2;
                t1.setText(String.valueOf(res));
                break;
            case R.id.button3:

                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                res = n1 * n2;
                t1.setText(String.valueOf(res));
                break;
            case R.id.button4:

                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                res = n1 / n2;
                t1.setText(String.valueOf(res));
                break;

        }
    }
}