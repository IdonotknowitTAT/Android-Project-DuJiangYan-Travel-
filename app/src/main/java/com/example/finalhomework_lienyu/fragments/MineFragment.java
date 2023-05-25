package com.example.finalhomework_lienyu.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.finalhomework_lienyu.LoginActivity;
import com.example.finalhomework_lienyu.R;
import com.example.finalhomework_lienyu.RegistryActivity;
import com.example.finalhomework_lienyu.util_classes.RoundImageView;
import com.example.finalhomework_lienyu.util_classes.User;

import java.util.ArrayList;

public class MineFragment extends Fragment {
    private ListView mine_listView;
    private String userName_now = "";
    private String userAccount_now = "";
    private int userImgId_now = R.mipmap.ic_launcher;
    private TextView textView_userName;
    private TextView textView_userAccount;
    private RoundImageView avatar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_mine, container, false);
        textView_userName = view.findViewById(R.id.textView_mine_username);
        textView_userAccount = view.findViewById(R.id.textView_mine_userId);
        avatar = view.findViewById(R.id.roundImageView_mine);
        mine_listView = view.findViewById(R.id.listView_mine_list);
        mine_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position){
                    case 0:
                        //信息修改
                        break;
                    case 1:
                        //购票记录
                        break;
                    case 2:
                        //注册
                        intent = new Intent(getContext(), RegistryActivity.class);
                        startActivityForResult(intent,1);
                        break;
                    case 3:
                        //登录
                        intent = new Intent(getContext(), LoginActivity.class);
                        startActivityForResult(intent,0);
                        break;
                    case 4:
                        //退出登录
                        LogOut();
                        break;
                }
            }
        });
        return view;
    }

    private void LogOut() {
        if(!userAccount_now.equals("用户账号") || !userName_now.equals("未登录") || userImgId_now != R.mipmap.ic_launcher){
            userAccount_now = "用户账号";
            userName_now = "未登录";
            userImgId_now = R.mipmap.ic_launcher;
            updateView();
            Toast.makeText(getContext(), "用户已登出", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getContext(), "请先登入", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null){
            return;
        }
        if(requestCode == 0  && resultCode == Activity.RESULT_OK){//登录之后获取

            ArrayList<String> userStringInfo = data.getStringArrayListExtra("Login");
            //修改编辑框的内容
            userName_now = userStringInfo.get(0);
            userAccount_now = userStringInfo.get(1);
            userImgId_now = R.drawable.pic_jiuzhai_overall;
            updateView();
        }else if(requestCode==1 && resultCode == Activity.RESULT_OK){//注册之后获取

            ArrayList<String> userStringInfo = data.getStringArrayListExtra("Registry");
            //修改编辑框的内容
            userName_now = userStringInfo.get(0);
            userAccount_now = userStringInfo.get(1);
            userImgId_now = R.drawable.pic_jiuzhai_overall;
            updateView();
        }
    }

    private void updateView() {
        textView_userAccount.setText(userAccount_now);
        textView_userName.setText(userName_now);
        avatar.setImageResource(userImgId_now);
    }
}