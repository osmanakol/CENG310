package com.group6.stage5_computer_prototype.ui.product.list;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.group6.stage5_computer_prototype.R;
import com.group6.stage5_computer_prototype.ui.product.information.ProductInformationActivity;

public class ProductListActivity extends AppCompatActivity {

    private ImageView imageView_one;
    private ImageView imageView_two;
    private ImageView imageView_three;
    private ImageView imageView_four;
    private ImageView imageView_five;
    private ImageView imageView_six;
    private ImageView imageView_seven;
    private ImageView imageView_eight;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);
        imageView_one = findViewById(R.id.cardview_one_image_one);
        imageView_one.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.resim10));
        imageView_one.setClipToOutline(true);

        imageView_two = findViewById(R.id.cardview_one_image_two);
        imageView_two.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.resim9));
        imageView_two.setClipToOutline(true);

        imageView_three = findViewById(R.id.cardview_one_image_three);
        imageView_three.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.resim7));
        imageView_three.setClipToOutline(true);

        imageView_four = findViewById(R.id.cardview_one_image_four);
        imageView_four.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.resim8));
        imageView_four.setClipToOutline(true);

        imageView_five = findViewById(R.id.cardview_one_image_five);
        imageView_five.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.resim18));
        imageView_five.setClipToOutline(true);

        imageView_six = findViewById(R.id.cardview_one_image_six);
        imageView_six.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.resim5));
        imageView_six.setClipToOutline(true);

        imageView_seven = findViewById(R.id.cardview_one_image_seven);
        imageView_seven.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.resim4));
        imageView_seven.setClipToOutline(true);

        imageView_eight = findViewById(R.id.cardview_one_image_eight);
        imageView_eight.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.resim12));
        imageView_eight.setClipToOutline(true);
    }

    public void onClick(View view){
        Intent intent = new Intent(ProductListActivity.this, ProductInformationActivity.class);
        switch (view.getId()){
            case R.id.product_cardview_one:
                intent.putExtra("current", R.drawable.resim10);
                break;
            case R.id.product_cardview_two:
                intent.putExtra("current", R.drawable.resim9);
                break;
            case R.id.product_cardview_three:
                intent.putExtra("current", R.drawable.resim7);
                break;
            case R.id.product_cardview_four:
                intent.putExtra("current", R.drawable.resim8);
                break;
            case R.id.product_cardview_five:
                intent.putExtra("current", R.drawable.resim18);
                break;
            case R.id.product_cardview_six:
                intent.putExtra("current", R.drawable.resim5);
                break;
            case R.id.product_cardview_seven:
                intent.putExtra("current", R.drawable.resim4);
                break;
            case R.id.product_cardview_eight:
                intent.putExtra("current", R.drawable.resim12);
                break;
            case R.id.btnBack:
                onBackPressed();
                break;
        }
        if (view.getId() != R.id.btnBack)
            startActivity(intent);
    }
}
