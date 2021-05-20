package com.group6.stage5_computer_prototype.ui.product.information;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.group6.stage5_computer_prototype.R;
import com.group6.stage5_computer_prototype.adapters.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProductInformationActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productinformation);
        viewPager2 = findViewById(R.id.home_viewpager);
        List<Bitmap> bitmaps = new ArrayList<>();
        bitmaps.add(BitmapFactory.decodeResource(getResources(), getIntent().getIntExtra("current", R.drawable.resim13)));
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.resim11));
        bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.resim12));
        viewPager2.setAdapter(new ViewPagerAdapter(getApplicationContext(), bitmaps, viewPager2));
    }

}
