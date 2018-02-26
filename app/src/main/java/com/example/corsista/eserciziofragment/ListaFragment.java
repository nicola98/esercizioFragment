package com.example.corsista.eserciziofragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Corsista on 22/02/2018.
 */


public class ListaFragment extends Fragment {
   ArrayAdapter <String> itemsAdapter;
    OnHeadlineSelectedListener mCallback;

   @Override
   public  void  onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       itemsAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, Pizza.pizzaMenu);

   }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.article_view, container, false);
    }

    @Override
    public  void onViewCreated(View view, Bundle savedInstanceState)
    {
        ListView lvItem = (ListView) view.findViewById(R.id.listView);
        lvItem.setAdapter(itemsAdapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               mCallback.onArticleSelected(position);
           }
        });
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallback = (OnHeadlineSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener()");
        }
    }

    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(int position);
    }
}
