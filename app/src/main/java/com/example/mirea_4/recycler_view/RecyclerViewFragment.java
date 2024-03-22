package com.example.mirea_4.recycler_view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mirea_4.ListItem;
import com.example.mirea_4.R;
import com.example.mirea_4.databinding.FragmentRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {

    private FragmentRecyclerViewBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRecyclerViewBinding.inflate(inflater, container, false);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.recyclerView.setAdapter(new RecyclerViewAdapter(generateList(), requireContext()));

        return binding.getRoot();
    }

    private List<ListItem> generateList() {
        List<ListItem> list = new ArrayList<>();

        for (int i = 1; i < 201; i++) {
            ListItem item = new ListItem();
            item.drawable = R.drawable.wide;
            item.text = String.valueOf(i);
            list.add(item);
        }

        return list;
    }
}