package com.example.corsista.eserciziofragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Corsista on 23/02/2018.
 */

public class DettaglioFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.detail_view, container, false);
    }

    @Override
    public  void onViewCreated(View view, Bundle savedInstanceState)
    {
        TextView lvItem = (TextView) view.findViewById(R.id.textview);
        Bundle bundle = this.getArguments();
        int myInt = bundle.getInt("position", 0);
        lvItem.setText(Pizza.pizzaDetails[myInt]);
    }

}
