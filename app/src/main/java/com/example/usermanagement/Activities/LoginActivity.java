package com.example.usermanagement.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.usermanagement.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText email,password;
    Button login;
    TextView registerlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.etemail);
        password=findViewById(R.id.etepassword);
        login=findViewById(R.id.btnlogin);
        registerlink=findViewById(R.id.registerlink);

        registerlink.setOnClickListener(this);
        login.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.loginlink:
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));
            break;

            case R.id.registerlink:
                switchOnregister();

                break;
        }


    }

    private void switchOnregister() {

        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);
    }
}