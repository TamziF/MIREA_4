package com.example.mirea_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mirea_4.databinding.FragmentHomeBinding;
import com.example.mirea_4.list_view.ListViewFragment;
import com.example.mirea_4.recycler_view.RecyclerViewFragment;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        binding.redButton.setOnClickListener(v -> {
            ListViewFragment listViewFragment = new ListViewFragment();
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container_view, listViewFragment)
                    .addToBackStack(null)
                    .commit();
        });

        binding.blueButton.setOnClickListener(v -> {
            RecyclerViewFragment recyclerViewFragment = new RecyclerViewFragment();
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container_view, recyclerViewFragment)
                    .addToBackStack(null)
                    .commit();
        });

        return binding.getRoot();
    }
}