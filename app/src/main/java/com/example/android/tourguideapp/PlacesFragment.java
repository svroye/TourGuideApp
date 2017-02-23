package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = (View) inflater.inflate(R.layout.list_file, container, false);

        //create ArrayList for a list of the BARS
        ArrayList<VisitingPlaces> visitingPlaces = new ArrayList<>();

        //set the elements of the ArrayList
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.gravensteen), getResources().getString(R.string.gravensteen_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.sintbaafs), getResources().getString(R.string.sintbaafs_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.belfort), getResources().getString(R.string.belfort_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.sintniklaas), getResources().getString(R.string.sintniklaas_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.msk), getResources().getString(R.string.msk_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.sintmichiels), getResources().getString(R.string.sintmichiels_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.graslei), getResources().getString(R.string.graslei_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.citadel), getResources().getString(R.string.citadel_address)));

        //create adapter
        VisitingPlacesAdapter arrayAdapter = new VisitingPlacesAdapter(getActivity(), R.layout.list_item, visitingPlaces);

        // Find the listview object in the view hierarchy of the Activity
        // id see xml file
        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        // Make the ListView use the ArrayAdapter, so that the ListView will display the list items
        listView.setAdapter(arrayAdapter);

        return rootView;
    }

}
