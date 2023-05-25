package com.example.finalhomework_lienyu.util_classes;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.finalhomework_lienyu.R;

public class MyDialog extends Dialog {
    private ImageView img;
    private TextView tv_title;
    private TextView tv_date;
    private TextView tv_content;

    private final Button yes;

    @SuppressLint("MissingInflatedId")
    public MyDialog(@NonNull Context context, int imgId, String title, String date, String content) {
        super(context);
        setContentView(R.layout.dialog_layout);
        img = findViewById(R.id.imageView_grid_detail);
        tv_title = findViewById(R.id.textView_grid_detail_title);
        tv_date = findViewById(R.id.textView_grid_detail_date);
        tv_content = findViewById(R.id.textView_grid_detail_content);
        yes = findViewById(R.id.dialog_yes);

        img.setImageResource(imgId);
        tv_title.setText(title);
            tv_date.setText(date);
        tv_content.setText(content);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss(); //让对话框消失
            }
        });
    }
}