package com.example.finalhomework_lienyu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalhomework_lienyu.util_classes.RoundImageView;
import com.example.finalhomework_lienyu.util_classes.User;
import com.example.finalhomework_lienyu.util_classes.UserDBHelper;

import java.util.ArrayList;

public class RegistryActivity extends AppCompatActivity{
    private RoundImageView roundImageView;
    private EditText editText_register_nickname;
    private EditText editText_register_account;
    private EditText editText_register_password;
    private Button button_register;
    private UserDBHelper userDBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);
        initViews();
    }

    @Override
    protected void onStart() {
        super.onStart();
        userDBHelper = UserDBHelper.getInstance(this);

        userDBHelper.openWriteLink();
        userDBHelper.openReadLink();
    }

    @Override
    protected void onStop() {
        super.onStop();
        userDBHelper.closeLink();
    }

    private void initViews() {
        roundImageView = findViewById(R.id.roundImageView_mine);
        editText_register_account = findViewById(R.id.editText_register_account);
        editText_register_nickname = findViewById(R.id.editText_register_nickname);
        editText_register_password = findViewById(R.id.editTextTextPassword_register);
        button_register = findViewById(R.id.subbutton_two_register);


        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //检查是否输入完整
                if (TextUtils.isEmpty((editText_register_nickname.getText().toString().trim())) ||
                        TextUtils.isEmpty(editText_register_password.getText().toString().trim()) ||
                        TextUtils.isEmpty(editText_register_account.getText().toString().trim())
                ){
                    Toast.makeText(RegistryActivity.this, "请输入完整！", Toast.LENGTH_SHORT).show();
                }else{
                    //开始注册
                    User u = new User();
                    u.setNickNameString(editText_register_nickname.getText().toString());
                    u.setAccountString(editText_register_account.getText().toString());
                    u.setPasswordString(editText_register_password.getText().toString());

                    userDBHelper.register(u);

                    Intent intent= new Intent();

                    ArrayList<String> userinfoString = new ArrayList<>();
                    userinfoString.add(u.getNickNameString());
                    userinfoString.add(u.getAccountString());

                    intent.putExtra("Registry",userinfoString);
                    setResult(Activity.RESULT_OK, intent);
                    Toast.makeText(RegistryActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

}