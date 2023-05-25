package com.example.finalhomework_lienyu.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.finalhomework_lienyu.R;
import com.example.finalhomework_lienyu.util_classes.MyDialog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//右侧展示类
public class SmartTravelCategoryFragment extends Fragment {
    private int showType = 0;
    private ListView listView;
    private String[] titles;
    private String[] contents;
    private int[] imgIds;

    public SmartTravelCategoryFragment(int showType) {
        this.showType = showType;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_smart_travel_category, container, false);

        listView = v.findViewById(R.id.listView_smartTravelDetail);
        //设置String和imgId的值
        switch (showType){
            case 0:
                //美食
                titles = getResources().getStringArray(R.array.smart_travel_meishi);
                contents = getResources().getStringArray(R.array.smart_travel_meishi_brief);
                imgIds = new int[]{R.drawable.ms_1_1,R.drawable.ms_1_2,R.drawable.ms_1_3,R.drawable.ms_1_4};
                break;
            case 1:
                //住宿
                titles = getResources().getStringArray(R.array.smart_travel_jiudian);
                contents = getResources().getStringArray(R.array.smart_travel_jiudian_brief);
                imgIds = new int[]{R.drawable.jiudian_2_1,R.drawable.jiudian_2_2,R.drawable.jiudian_2_3,R.drawable.jiudian_2_4};
                break;
            case 2:
                //游玩
                titles = getResources().getStringArray(R.array.smart_travel_travel);
                contents = getResources().getStringArray(R.array.smart_travel_travel_brief);
                imgIds = new int[]{R.drawable.travel_3_1,R.drawable.travel_3_2,R.drawable.travel_3_3,R.drawable.travel_3_4};
                break;
            case 3:
                //娱乐
                titles = getResources().getStringArray(R.array.smart_travel_fun);
                contents = getResources().getStringArray(R.array.smart_travel_fun_brief);
                imgIds = new int[]{R.drawable.entertain_4_1,R.drawable.entertain_4_2,R.drawable.entertain_4_3,R.drawable.entertain_4_4};
                break;
            case 4:
                //购物
                titles = getResources().getStringArray(R.array.smart_travel_shopping);
                contents = getResources().getStringArray(R.array.smart_travel_shopping_brief);
                imgIds = new int[]{R.drawable.shopping_5_1,R.drawable.shopping_5_2,R.drawable.shopping_5_3,R.drawable.shopping_5_4};
                break;
        }

        //导入一个新的List
        List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < titles.length; i++) {
            Map<String, Object> showitem = new HashMap<String, Object>();
            showitem.put("img", imgIds[i]);
            showitem.put("title", titles[i]);
            showitem.put("content", contents[i]);
            listitem.add(showitem);
        }

//        设置Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, titles);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyDialog myDialog = new MyDialog(getContext(),imgIds[position],titles[position],null,contents[position]);
                myDialog.show();
            }
        });

        return v;
    }
}