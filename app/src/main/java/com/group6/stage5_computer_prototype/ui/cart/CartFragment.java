package com.group6.stage5_computer_prototype.ui.cart;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.group6.stage5_computer_prototype.R;

public class CartFragment extends Fragment {

    private CartViewModel cartViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cartViewModel =
                new ViewModelProvider(this).get(CartViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cart, container, false);
        ImageView imageView = root.findViewById(R.id.cart_image);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.resim16));
        imageView.setClipToOutline(true);
        return root;
    }
}