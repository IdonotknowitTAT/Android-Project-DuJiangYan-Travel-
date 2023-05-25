package com.example.finalhomework_lienyu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.finalhomework_lienyu.fragments.KnowJiuZhaiItemFragment_1_Geo;
import com.example.finalhomework_lienyu.fragments.KnowJiuZhaiItemFragment_2_River;
import com.example.finalhomework_lienyu.fragments.KnowJiuZhaiItemFragment_3_History;
import com.example.finalhomework_lienyu.fragments.KnowJiuZhaiItemFragment_4_Culture;
import com.example.finalhomework_lienyu.fragments.KnowJiuZhaiItemFragment_5_Custom;
import com.example.finalhomework_lienyu.fragments.KnowJiuZhaiItemFragment_6_Country;
import com.example.finalhomework_lienyu.util_classes.NewPagerAdapter;

public class KnowJiuZhaiActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager2 viewPager2_JiuZhaiItem;
    private ListView listView;
    private NewPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_jiu_zhai);
        initViews();

    }

    private void initViews() {

        viewPager2_JiuZhaiItem = findViewById(R.id.viewPager2_knowJiuZhaiItem);
        pagerAdapter = new NewPagerAdapter(getSupportFragmentManager(),getLifecycle());
        pagerAdapter.addFragment(new KnowJiuZhaiItemFragment_1_Geo());
        pagerAdapter.addFragment(new KnowJiuZhaiItemFragment_2_River());
        pagerAdapter.addFragment(new KnowJiuZhaiItemFragment_3_History());
        pagerAdapter.addFragment(new KnowJiuZhaiItemFragment_4_Culture());
        pagerAdapter.addFragment(new KnowJiuZhaiItemFragment_5_Custom());
        pagerAdapter.addFragment(new KnowJiuZhaiItemFragment_6_Country());
        viewPager2_JiuZhaiItem.setAdapter(pagerAdapter);




        listView = findViewById(R.id.listView_knowJiuZhai);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.know_jiu_zhai_itemlist,android.R.layout.simple_list_item_single_choice);
        listView.setAdapter(adapter);
        listView.setItemChecked(0,true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        viewPager2_JiuZhaiItem.setCurrentItem(0);
                        break;
                    case 1:
                        viewPager2_JiuZhaiItem.setCurrentItem(1);
                        break;
                    case 2:
                        viewPager2_JiuZhaiItem.setCurrentItem(2);
                        break;
                    case 3:
                        viewPager2_JiuZhaiItem.setCurrentItem(3);
                        break;
                    case 4:
                        viewPager2_JiuZhaiItem.setCurrentItem(4);
                        break;
                    case 5:
                        viewPager2_JiuZhaiItem.setCurrentItem(5);
                        break;
                }
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}