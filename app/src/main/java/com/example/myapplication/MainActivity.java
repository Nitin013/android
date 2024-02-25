package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edt_txt;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_txt=findViewById(R.id.edt_txt);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });

    }
    public void add(){
               String s=edt_txt.getText().toString().trim();
               String[] split=s.split("\\+",0);
               int ans=0;
               for(String s1:split){
                   ans=ans+Integer.parseInt(s1);
               }
               String s2=Integer.toString(ans);
               edt_txt.setText(s2);
    }
}