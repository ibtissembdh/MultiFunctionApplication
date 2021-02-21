package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = this.findViewById(R.id.btn1);
        btn2 = this.findViewById(R.id.btn2);
        btn3 = this.findViewById(R.id.btn3);
        btn4 = this.findViewById(R.id.btn4);

        btn1.setOnClickListener(v->SMS_Function());

    }
    public void SMS_Function(){
        Uri uri = Uri.parse("sms:you are the best");
        Intent intent= new Intent(Intent.ACTION_VIEW, uri);
        intent.putExtra("sms_body","message");
        startActivity(intent);
    }
}