package com.example.usermanagement.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.usermanagement.R;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView loginlink;
    Button register;
    EditText name,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.etname);
        email=findViewById(R.id.etemail);
        password=findViewById(R.id.etepassword);
        register=findViewById(R.id.btnregister);
        loginlink=findViewById(R.id.loginlink);

        loginlink.setOnClickListener(this);
        register.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnregister:
                Toast.makeText(this,"Registered",Toast.LENGTH_LONG).show();
                break;
            case R.id.loginlink:

                switchOncLogin();

                break;
        }
    }

    private void switchOncLogin() {

        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }
}