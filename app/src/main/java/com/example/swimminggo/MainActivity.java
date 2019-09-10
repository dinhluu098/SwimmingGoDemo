package com.example.swimminggo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.swimminggo.presenter.TeamPresenter;

public class MainActivity extends AppCompatActivity {

    TeamPresenter teamPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
