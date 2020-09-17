package com.example.datastore_viewmodel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    private Button saveButton, viewButton;
    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saveButton = findViewById(R.id.saveData);
        viewButton = findViewById(R.id.intent);
        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        saveData();
        clickToNewActivity();
    }

    public void saveData() {
        saveButton.setText("Before Data Store " + mainActivityViewModel.count);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivityViewModel.updateScore();
                saveButton.setText("Before Data Store " + mainActivityViewModel.count);
            }
        });
    }

    public void clickToNewActivity() {
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(">>>>> inside onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(">>>>> inside onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println(">>>>> inside onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(">>>>> inside onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println(">>>>> inside onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(">>>>> inside onDestroy");
    }
}