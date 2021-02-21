package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button loginBtn, skipBtn;
    EditText password,username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = this.findViewById(R.id.login);
        skipBtn = this.findViewById(R.id.skip);

        loginBtn.setOnClickListener(v ->LoginFunction());
        skipBtn.setOnClickListener(v ->SkipFunction());

        password = this.findViewById(R.id.password);
        username= this.findViewById(R.id.username);
    }

    public void LoginFunction() {
        String p = password.getText().toString();
        String u = username.getText().toString();

        if (p.equals("admin") && u.equals("Admin")) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
            Toast.makeText(this, "Welcome"+ u, Toast.LENGTH_SHORT).show();

        }else if (p.isEmpty() || u.isEmpty()){
            Toast.makeText(this,"Empty field", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"password and email don't match", Toast.LENGTH_SHORT).show();
        }
    }



    public void SkipFunction(){ finish(); }
}