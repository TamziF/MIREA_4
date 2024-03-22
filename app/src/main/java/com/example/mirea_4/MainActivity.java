package com.example.mirea_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.mirea_4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        HomeFragment fragment = new HomeFragment();
        transaction.replace(R.id.fragment_container_view, fragment);
        transaction.addToBackStack(null); // Добавляет транзакцию в стек возврата, если необходимо
        transaction.commit();
    }
}