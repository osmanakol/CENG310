package com.group6.stage5_computer_prototype.ui.profile;

import androidx.lifecycle.ViewModelProvider;

import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.group6.stage5_computer_prototype.R;

import java.lang.reflect.Array;

public class ProfileFragment extends Fragment {

    private ProfileViewModel mViewModel;
    private Spinner spinner;
    private ImageView imageView_one;
    private ImageView imageView_two;
    private ImageView imageView_three;
    private ImageView imageView_four;
    private ImageView imageView_five;
    private ImageView imageView_six;
    private ImageView imageView_seven;
    private ImageView imageView_eight;

    public static ProfileFragment newInstance() {
        return new ProfileFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_profile, container, false);
        imageView_one = root.findViewById(R.id.cardview_one_image_one);
        imageView_one.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.resim4));
        imageView_one.setClipToOutline(true);

        imageView_two = root.findViewById(R.id.cardview_one_image_two);
        imageView_two.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.resim3));
        imageView_two.setClipToOutline(true);

        imageView_three = root.findViewById(R.id.cardview_one_image_three);
        imageView_three.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.resim6));
        imageView_three.setClipToOutline(true);

        imageView_four = root.findViewById(R.id.cardview_one_image_four);
        imageView_four.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.resim1));
        imageView_four.setClipToOutline(true);

        imageView_five = root.findViewById(R.id.cardview_one_image_five);
        imageView_five.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.resim8));
        imageView_five.setClipToOutline(true);

        imageView_six = root.findViewById(R.id.cardview_one_image_six);
        imageView_six.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.resim9));
        imageView_six.setClipToOutline(true);

        imageView_seven = root.findViewById(R.id.cardview_one_image_seven);
        imageView_seven.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.resim10));
        imageView_seven.setClipToOutline(true);

        imageView_eight = root.findViewById(R.id.cardview_one_image_eight);
        imageView_eight.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.resim4));
        imageView_eight.setClipToOutline(true);

        spinner = (Spinner) root.findViewById(R.id.spinner);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
        // TODO: Use the ViewModel
    }

}