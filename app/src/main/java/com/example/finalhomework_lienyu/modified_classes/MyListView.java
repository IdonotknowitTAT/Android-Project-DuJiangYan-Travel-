package com.example.finalhomework_lienyu.modified_classes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

//自定义ListView，避免嵌套在ScrollView中只显示一行的问题
public class MyListView extends ListView {


    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredHeight = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);//只写了这一句就搞定了
        super.onMeasure(widthMeasureSpec, measuredHeight);//这里需要将第二个参数改为我们测量好的measureHeight
    }

}
