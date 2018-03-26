package com.idouble.user_sqlite;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText username;
    private EditText password;
    private Button Login;
    private Button Resgist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        username = (EditText)findViewById (R.id.et_username);
        password = (EditText)findViewById (R.id.et_password);
        Login = (Button)findViewById (R.id.bt_login);
        Resgist = (Button)findViewById (R.id.bt_resgist);
        SetListener();
        Login.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

            }
        });
    }

    class SetListener extends OnClick{
        @Override
        public void onClick(View v) {

        }
    }


}
