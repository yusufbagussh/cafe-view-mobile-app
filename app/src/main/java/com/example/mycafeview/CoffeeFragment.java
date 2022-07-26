package com.example.mycafeview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;



public class CoffeeFragment extends Fragment {
    private RecyclerView rvCoffee;
    private ArrayList<Coffee> list = new ArrayList<>();

    public CoffeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_coffee, container, false);
        rvCoffee = view.findViewById(R.id.coffeeFragment);
        rvCoffee.setHasFixedSize(true);

        list.addAll(CoffeeData.getListCoffee());
        showRecyclerList();

        return view;
    }

    private void showRecyclerList(){
        rvCoffee.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ListCoffeeAdapter listCoffeeAdapter  = new ListCoffeeAdapter(list, requireContext());
        listCoffeeAdapter.setListCoffee(list);
        rvCoffee.setAdapter(listCoffeeAdapter);
    }
}