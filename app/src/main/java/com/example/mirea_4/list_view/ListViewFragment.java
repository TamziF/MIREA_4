package com.example.mirea_4.list_view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mirea_4.R;
import com.example.mirea_4.databinding.FragmentListViewBinding;
import com.example.mirea_4.ListItem;

import java.util.ArrayList;
import java.util.List;

public class ListViewFragment extends Fragment {

    private FragmentListViewBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentListViewBinding.inflate(inflater, container, false);

        ListViewAdapter adapter = new ListViewAdapter(requireContext(), R.layout.list_view_item, generateList());

        binding.listView.setAdapter(adapter);

        binding.listView.setOnItemClickListener((parent, view, position, id) -> {
            Log.i("LIST_VIEW", "Item " + (position + 1) + " clicked");
            Toast.makeText(requireContext(), "Item " + (position + 1) + " clicked", Toast.LENGTH_SHORT).show();
        });

        return binding.getRoot();
    }

    private List<ListItem> generateList() {
        List<ListItem> list = new ArrayList<>();

        for (int i = 1; i < 201; i++) {
            ListItem item = new ListItem();
            item.drawable = R.drawable.nyan_cat;
            item.text = String.valueOf(i);
            list.add(item);
        }

        return list;
    }
}