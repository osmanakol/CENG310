package com.group6.stage5_computer_prototype.ui.home;

import android.widget.ImageView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.group6.stage5_computer_prototype.adapters.ViewPagerAdapter;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<ViewPagerAdapter> adapter;
    private MutableLiveData<ImageView> imageViewMutableLiveData;

    public HomeViewModel() {
        adapter = new MutableLiveData<>();
        imageViewMutableLiveData = new MutableLiveData<>();
    }

    public LiveData<ViewPagerAdapter> getViewPagerAdapterLiveData(){
        return adapter;
    }

    public MutableLiveData<ImageView> getImageViewMutableLiveData() {
        return imageViewMutableLiveData;
    }
}