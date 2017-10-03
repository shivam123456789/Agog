package com.gmail.shivamagrawal.agog;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final TextInputLayout username=(TextInputLayout) findViewById(R.id.usernameWrapper);
        final TextInputLayout password =(TextInputLayout) findViewById(R.id.passwordWrapper);
        Button login=(Button) findViewById(R.id.login);
        TextView forgot_pass=(TextView) findViewById(R.id.forget_password);
        TextView signup=(TextView) findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getEditText().getText().toString().trim().length()==0){
                    username.setError("Please enter user name");
                    username.requestFocus();
                }
                if(password.getEditText().getText().toString().length() < 8  ){
                    password.setError("password must be 8 char");
                    password.requestFocus();
                }
                else
                {
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }

            }
        });
    }

}
