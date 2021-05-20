package com.group6.stage5_computer_prototype.ui.home;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import com.group6.stage5_computer_prototype.R;
import com.group6.stage5_computer_prototype.adapters.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment{

    private HomeViewModel homeViewModel;
    private ViewPager2 viewPager2;
    private ImageView imageView_one;
    private ImageView imageView_two;
    private ImageView imageView_three;
    private ImageView imageView_four;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager2 = root.findViewById(R.id.home_viewpager);
        imageView_one = root.findViewById(R.id.home_image_one);
        imageView_two = root.findViewById(R.id.home_image_two);
        imageView_three = root.findViewById(R.id.home_image_three);
        imageView_four = root.findViewById(R.id.home_image_four);
        List<Bitmap> bitmaps = new ArrayList<>();
        bitmaps.add(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.resim11));
        bitmaps.add(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.resim17));
        bitmaps.add(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.resim18));
        viewPager2.setAdapter(new ViewPagerAdapter(getContext(), bitmaps, viewPager2));
        imageView_one.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.resim1));
        imageView_one.setClipToOutline(true);
        //imageView_one.setBackground(getActivity().getResources().getDrawable(R.drawable.border_layout, null));
        imageView_two.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.resim2));
        imageView_two.setClipToOutline(true);
        //imageView_two.setBackground(getActivity().getResources().getDrawable(R.drawable.border_layout, null));
        imageView_three.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.resim3));
        imageView_three.setClipToOutline(true);
        //imageView_three.setBackground(getActivity().getResources().getDrawable(R.drawable.border_layout, null));
        imageView_four.setImageBitmap(BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.resim4));
        imageView_four.setClipToOutline(true);
      //  imageView_four.setBackground(getActivity().getResources().getDrawable(R.drawable.border_layout, null));
        homeViewModel.getViewPagerAdapterLiveData().observe(getViewLifecycleOwner(), new Observer<ViewPagerAdapter>() {
            @Override
            public void onChanged(ViewPagerAdapter adapter) {
                viewPager2.setAdapter(adapter);
            }
        });

        homeViewModel.getImageViewMutableLiveData().observe(getViewLifecycleOwner(), new Observer<ImageView>() {
            @Override
            public void onChanged(ImageView imageView) {
                imageView.setBackground(getActivity().getResources().getDrawable(R.drawable.border_layout, null));
            }
        });
        return root;
    }



}