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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_file, container, false);

        //create ArrayList to store the restaurants
        ArrayList<VisitingPlaces> visitingPlaces = new ArrayList<>();

        //Add the elements to the ArrayList
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.witteleeuw), getResources().getString(R.string.witteleeuw_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.chezalbert), getResources().getString(R.string.albert_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.alcastello), getResources().getString(R.string.castello_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.kastart), getResources().getString(R.string.kastart_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.bluesette), getResources().getString(R.string.bluesette_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.goudensate), getResources().getString(R.string.goudensate_address)));

        //create arrayAdapter
        VisitingPlacesAdapter arrayAdapter = new VisitingPlacesAdapter(getActivity(), R.layout.list_item, visitingPlaces);

        // Find the listview object in the view hierarchy of the Activity
        // id see xml file
        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        // Make the ListView use the ArrayAdapter, so that the ListView will display the list items
        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}

