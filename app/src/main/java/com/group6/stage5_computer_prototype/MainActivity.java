package com.group6.stage5_computer_prototype;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.group6.stage5_computer_prototype.ui.login_register.LoginActivity;
import com.group6.stage5_computer_prototype.ui.login_register.RegisterActivity;
import com.group6.stage5_computer_prototype.ui.product.list.ProductListActivity;
import com.group6.stage5_computer_prototype.R;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;;import java.util.zip.Inflater;


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
            intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }

    }

    public void onClick(View view){
        if (view.getId() == R.id.add_product){
            LayoutInflater layoutInflater = this.getLayoutInflater();
            View add_product= layoutInflater.inflate(R.layout.add_product, null);
            Spinner spinner = add_product.findViewById(R.id.spinner);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(),R.array.categories ,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Add Product");
            alertDialog.setView(add_product);
            alertDialog.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            final AlertDialog dialog = alertDialog.create();
            dialog.show();
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int errorCount = 0;
                    final EditText productName = add_product.findViewById(R.id.txtProductName);
                    final EditText stock = add_product.findViewById(R.id.txtStocks);
                    final EditText unitPrice = add_product.findViewById(R.id.txtUnitPrice);
                    if (productName.getText().toString().isEmpty()){
                        errorCount++;

                        productName.setError("can not empty");
                    }
                    if (stock.getText().toString().isEmpty()){
                        errorCount++;

                        stock.setError("can not empty");

                    }
                    if (unitPrice.getText().toString().isEmpty()){
                        errorCount++;

                        unitPrice.setError("can not empty");

                    }

                    if (!stock.getText().toString().isEmpty() ){
                        int s = Integer.parseInt(stock.getText().toString());
                        if (s < 0){
                            errorCount++;
                            stock.setError("should be greater then or equals to zero");
                        }

                    }

                    if (!unitPrice.getText().toString().isEmpty()){
                        int u = Integer.parseInt(unitPrice.getText().toString());
                        if (u<=0){
                            errorCount++;
                            unitPrice.setError("should be greater then zero");
                        }
                    }


                    if (errorCount == 0)
                        dialog.dismiss();
                    else
                        errorCount = 0;
                }
            });
        }
        else {
            Intent intent;
            intent = new Intent(MainActivity.this, ProductListActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}