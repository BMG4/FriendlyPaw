package com.example.friendlypaw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText LoginMail,LoginPassword;


String loginMail;
String loginPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tanımla();
    }
public void tanımla(){
        LoginMail=findViewById(R.id.Login_mail);
        LoginPassword=findViewById(R.id.sngupPassword);

}
    public void ClickSingup(View view) {
        MainActivity.redirectActivity(this,Signup.class);
    }
    public void ClickLogin(View view) {
        loginMail=LoginMail.getText().toString();
        loginPassword=LoginPassword.getText().toString();
        MainActivity.redirectActivity(this,MainActivity.class);
    }
}