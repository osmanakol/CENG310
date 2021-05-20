package com.group6.stage5_computer_prototype;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.group6.stage5_computer_prototype.ui.login_register.RegisterActivity;
import com.group6.stage5_computer_prototype.ui.product.list.ProductListActivity;
import com.group6.stage5_computer_prototype.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;;


public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        /*AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();*/
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
        sharedPreferences = getSharedPreferences("check", MODE_PRIVATE);
        int check = sharedPreferences.getInt("isRegister", 0);
        if (check == 0){
            intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        }

    }

    public void onClick(View view){
        Intent intent;
        intent = new Intent(MainActivity.this, ProductListActivity.class);
        startActivity(intent);

    }

}