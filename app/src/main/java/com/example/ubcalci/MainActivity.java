package com.example.ubcalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button add,sub;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.Input1);
        et2=(EditText)findViewById(R.id.Input2);
        add=(Button)findViewById(R.id.btnAdd);
        sub=(Button)findViewById(R.id.btnSub);
        tv=(TextView)findViewById(R.id.res);

        int a,b,c;

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int a=Integer.parseInt(et1.getText().toString());
                    int b=Integer.parseInt(et2.getText().toString());
                    int c=a+b;
                    tv.setText("Result is:"+c);
                }catch (Exception e){
                    tv.setText("Please input integers Only!");
                };
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int a=Integer.parseInt(et1.getText().toString());
                    int b=Integer.parseInt(et2.getText().toString());
                    int c=a-b;
                    tv.setText("Result is:"+c);
                }catch (Exception e){
                    tv.setText("Please input integers Only!");
                };
            }
        });
    }
}
