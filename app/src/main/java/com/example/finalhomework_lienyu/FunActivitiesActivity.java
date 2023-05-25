package com.example.finalhomework_lienyu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.example.finalhomework_lienyu.util_classes.MyDialog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//精彩活动
public class FunActivitiesActivity extends AppCompatActivity {
    private String[] gridTitles;
    private String[] gridDates;
    private String[] gridContents;
    private final int[] gridImgIds = new int[]{R.drawable.gridpic_1,R.drawable.gridpic_2, R.drawable.gridpic_3,R.drawable.gridpic_4,R.drawable.gridpic_1,R.drawable.gridpic_2, R.drawable.gridpic_3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_activities);
        gridTitles = getResources().getStringArray(R.array.grid_title_array);
        gridDates = getResources().getStringArray(R.array.grid_date_array);
        gridContents = getResources().getStringArray(R.array.grid_content_brief);

        List<Map<String, Object>> gridItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < gridTitles.length; i++) {
            Map<String, Object> griditem = new HashMap<String, Object>();
            griditem.put("pics", gridImgIds[i]);
            griditem.put("titles", gridTitles[i]);
            griditem.put("dates", gridDates[i]);
            griditem.put("contents", gridContents[i]);
            gridItems.add(griditem);
        }

        //创建一个simpleAdapter
        SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(), gridItems, R.layout.grid_view_item, new String[]{"pics","titles","dates","contents"}, new int[]{R.id.imageView_grid_item, R.id.textView_grid_title, R.id.textView_grid_date});
        GridView gridView = findViewById(R.id.fun_grid_view);
        gridView.setAdapter(myAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyDialog myDialog = new MyDialog(FunActivitiesActivity.this,gridImgIds[position],gridTitles[position],gridDates[position],gridContents[position]);
                myDialog.show();
            }
        });
    }
}