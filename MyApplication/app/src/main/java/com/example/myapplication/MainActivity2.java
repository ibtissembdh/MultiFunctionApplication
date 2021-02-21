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
        btn2.setOnClickListener(v-> call_Function());
        btn3.setOnClickListener(v -> google_Function());
        btn1.setOnClickListener(v->GoBack_Function());

    }
    public void SMS_Function(){
        Uri uri = Uri.parse("sms:you are the best");
        Intent intent= new Intent(Intent.ACTION_VIEW, uri);
        intent.putExtra("sms_body","message");
        startActivity(intent);
    }

    public void call_Function(){
        Uri uri = Uri.parse("tel:0540555555");
        Intent intent= new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }
    public void google_Function(){

        Uri uri = Uri.parse("http://www.google.fr/");
        Intent intent= new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
    public void GoBack_Function(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}