package com.example.onboardingintroscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class introActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        //fill list screen

        List<screenItem> mList = new ArrayList<>();
        mList.add(new screenItem("Fresh Food","ini enak banget lohhhh ",R.drawable.img1));
        mList.add(new screenItem("Fast Delivery","ini enak banget lohhhh",R.drawable.img2));
        mList.add(new screenItem("Easy Payment","ini enak banget lohhhh",R.drawable.img3));



        //setup ViewPager

        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);
    }
}
