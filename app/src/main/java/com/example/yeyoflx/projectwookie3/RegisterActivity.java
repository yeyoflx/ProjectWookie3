package com.example.yeyoflx.projectwookie3;

import android.content.Intent;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }


    public void createAccountAction(View view){
        EditText username = (EditText) findViewById(R.id.createUsername);
        EditText password = (EditText) findViewById(R.id.createPassword);
        EditText passwordValidate = (EditText) findViewById(R.id.validatePassword);

        Log.i("Hello",username.getText().toString());
        Log.i("Hello",password.getText().toString());
        Log.i("Hello",passwordValidate.getText().toString());

        if(password.getText().toString().equals(passwordValidate.getText().toString())){
            System.out.println("IT WORKED");
        }else{
            AlertDialog.Builder invalidPW = new AlertDialog.Builder(RegisterActivity.this);
            invalidPW.setTitle("Invalid Password");
            invalidPW.setMessage("The passwords you have entered do not match. Please try again.");

            AlertDialog pwAlert = invalidPW.create();
            pwAlert.show();
        }


    }
}
