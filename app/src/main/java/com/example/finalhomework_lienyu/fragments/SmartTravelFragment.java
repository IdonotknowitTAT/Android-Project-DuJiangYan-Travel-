package com.example.finalhomework_lienyu.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.finalhomework_lienyu.R;
import com.example.finalhomework_lienyu.util_classes.NewPagerAdapter;


public class SmartTravelFragment extends Fragment {
    private ViewPager2 viewPager2_SmartTravel;
    private ListView listView;
    private NewPagerAdapter pagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_smart_travel, container, false);

        viewPager2_SmartTravel = view.findViewById(R.id.viewPager2_SmartTravel);
        pagerAdapter = new NewPagerAdapter(getParentFragmentManager(),getLifecycle());
        //showType表示美食、住宿、游玩等等
        pagerAdapter.addFragment(new SmartTravelCategoryFragment(0));
        pagerAdapter.addFragment(new SmartTravelCategoryFragment(1));
        pagerAdapter.addFragment(new SmartTravelCategoryFragment(2));
        pagerAdapter.addFragment(new SmartTravelCategoryFragment(3));
        pagerAdapter.addFragment(new SmartTravelCategoryFragment(4));
        viewPager2_SmartTravel.setAdapter(pagerAdapter);
        //关闭ViewPager2的滚动，防止和内嵌ScrollView产生冲突
        viewPager2_SmartTravel.setUserInputEnabled(false);


        listView = view.findViewById(R.id.listView_smartTravel);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(),
                R.array.smart_travel_array,android.R.layout.simple_list_item_single_choice);
        listView.setAdapter(adapter);
        listView.setItemChecked(0,true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        viewPager2_SmartTravel.setCurrentItem(0);
                        break;
                    case 1:
                        viewPager2_SmartTravel.setCurrentItem(1);
                        break;
                    case 2:
                        viewPager2_SmartTravel.setCurrentItem(2);
                        break;
                    case 3:
                        viewPager2_SmartTravel.setCurrentItem(3);
                        break;
                    case 4:
                        viewPager2_SmartTravel.setCurrentItem(4);
                        break;
                }
            }
        });
        return view;
    }
}