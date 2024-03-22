package com.example.mirea_4.list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.mirea_4.ListItem;
import com.example.mirea_4.databinding.ListViewItemBinding;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<ListItem> {
    private LayoutInflater inflater;
    private List<ListItem> items;

    public ListViewAdapter(Context context, int resource,
                           List<ListItem> items) {
        super(context, resource, items);
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView,
                        ViewGroup parent) {
        ListViewItemBinding binding = ListViewItemBinding.inflate(this.inflater, parent, false);
        binding.image.setImageResource(items.get(position).drawable);
        binding.text.setText(items.get(position).text);
        return binding.getRoot();
    }
}
