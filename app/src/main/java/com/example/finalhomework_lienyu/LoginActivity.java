package com.example.finalhomework_lienyu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalhomework_lienyu.fragments.MineFragment;
import com.example.finalhomework_lienyu.util_classes.User;
import com.example.finalhomework_lienyu.util_classes.UserDBHelper;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    private EditText editText_login_account;
    private EditText editText_login_password;
    private Button button_login;
    private UserDBHelper userDBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editText_login_account.getText().toString().trim()) ||
                        TextUtils.isEmpty(editText_login_account.getText().toString().trim())){
                    Toast.makeText(LoginActivity.this, "用户名或密码为空", Toast.LENGTH_SHORT).show();
                }else{
                    User userLogin = userDBHelper.login(editText_login_account.getText().toString(),editText_login_password.getText().toString());
                    if(userLogin != null){
                        Intent intent= new Intent();

                        ArrayList<String> userinfoString = new ArrayList<>();
                        userinfoString.add(userLogin.getNickNameString());
                        userinfoString.add(userLogin.getAccountString());

                        intent.putExtra("Login",userinfoString);
                        setResult(Activity.RESULT_OK, intent);

                        Toast.makeText(LoginActivity.this, "用户已登入", Toast.LENGTH_SHORT).show();
                        finish();
                    }else{
                        Toast.makeText(LoginActivity.this, "用户名或密码错误!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        userDBHelper = UserDBHelper.getInstance(this);
        userDBHelper.openReadLink();
        userDBHelper.openWriteLink();
    }

    @Override
    protected void onStop() {
        super.onStop();
        userDBHelper.closeLink();
    }

    private void initViews() {
        editText_login_account = findViewById(R.id.editText_login_account);
        editText_login_password = findViewById(R.id.editTextTextPassword_login);
        button_login = findViewById(R.id.subbutton_two_login);
    }
}