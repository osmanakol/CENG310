package com.group6.stage5_computer_prototype.ui.profile;

import android.widget.Button;
import android.widget.ImageView;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {
    private MutableLiveData<ImageView> imageViewMutableLiveData;
    private MutableLiveData<Button> buttonMutableLiveData;

    public ProfileViewModel(){
        imageViewMutableLiveData = new MutableLiveData<>();
        buttonMutableLiveData = new MutableLiveData<>();
    }

    public MutableLiveData<ImageView> getImageViewMutableLiveData() {
        return imageViewMutableLiveData;
    }
}