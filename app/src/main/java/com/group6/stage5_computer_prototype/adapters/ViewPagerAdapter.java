package com.group6.stage5_computer_prototype.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.group6.stage5_computer_prototype.R;

import java.util.List;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewHolder> {
    private List<Bitmap> data;
    private LayoutInflater layoutInflater;
    private ViewPager2 viewPager2;

    public ViewPagerAdapter(Context context, List<Bitmap> data, ViewPager2 viewPager2){
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_viewpager, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Bitmap image = data.get(position);
        holder.imageView.setImageBitmap(image);
        holder.imageView.setClipToOutline(true);
        holder.imageView.setScaleType(ImageView.ScaleType.FIT_XY);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout relativeLayout;
        ImageView imageView;
        ViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.viewpager_imageview);
            relativeLayout = view.findViewById(R.id.viewpager_containter);
        }
    }
}
