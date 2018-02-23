package com.example.corsista.eserciziofragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Corsista on 23/02/2018.
 */

public class dettaglioFragment extends Fragment {
    ArrayAdapter <String> itemsAdapter;
    @Override

    public  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        itemsAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, Pizza.pizzaDetails);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.detail_view, container, false);
    }

    @Override
    public  void onViewCreated(View view, Bundle savedInstanceState)
    {
        ListView lvItem = (ListView) view.findViewById(R.id.textview);
        lvItem.setAdapter(itemsAdapter);
    }
}
