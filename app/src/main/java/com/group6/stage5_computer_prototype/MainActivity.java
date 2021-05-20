package com.group6.stage5_computer_prototype;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.group6.stage5_computer_prototype.ui.login_register.RegisterActivity;
import com.group6.stage5_computer_prototype.ui.product.list.ProductListActivity;
import com.group6.stage5_computer_prototype.R;

import androidx.appcompat.app.AlertDialog;
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
        if (view.getId() == R.id.add_product){
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Add Product");
            alertDialog.setView(R.layout.add_product);
            alertDialog.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    dialog.dismiss();
                }
            });
            alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            alertDialog.show();
        } else {
            Intent intent;
            intent = new Intent(MainActivity.this, ProductListActivity.class);
            startActivity(intent);
        }


    }

}