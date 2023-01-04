package com.example.inclassactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        sharedPreferences= getSharedPreferences("myprefs", Context.MODE_PRIVATE);

    }

    public void bclick(View view){
        EditText txtuser=(EditText) findViewById(R.id.editTextTextPersonName);
        SharedPreferences.Editor myedit=sharedPreferences.edit();
        myedit.putString("data", txtuser.getText().toString());

        myedit.commit();

    }
    public void bshow(View view){
        EditText txtuser=(EditText) findViewById(R.id.editTextTextPersonName2);
        txtuser.setText(sharedPreferences.getString("data", "empty"));
    }
}