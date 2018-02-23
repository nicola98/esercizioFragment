package com.example.corsista.eserciziofragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private static int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(savedInstanceState==null)
        {
            ListaFragment fragment = new ListaFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainer, fragment);
            fragmentTransaction.commit();

            dettaglioFragment fragment2 = new dettaglioFragment();
            FragmentManager fragmentManager2 = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
            fragmentTransaction2.add(R.id.fragmentContainer2, fragment2);
            fragmentTransaction2.commit();
        }


        if(findViewById(R.id.layout_land)!=null)
        {
            if(i!=0)
            {
                FragmentManager manager = this.getSupportFragmentManager();
                manager.beginTransaction().show(manager.findFragmentById(R.id.fragmentContainer2)).show(manager.findFragmentById(R.id.fragmentContainer)).commit();
            }
           i++;
        }

        if(findViewById(R.id.layout_default)!=null)
        {
            if(i!=0)
            {
                FragmentManager manager = this.getSupportFragmentManager();
                manager.beginTransaction().show(manager.findFragmentById(R.id.fragmentContainer)).hide(manager.findFragmentById(R.id.fragmentContainer2)).commit();
            }
            i++;
        }

    }


}