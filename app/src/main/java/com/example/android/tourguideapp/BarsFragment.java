package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BarsFragment extends Fragment {

    public BarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = (View) inflater.inflate(R.layout.list_file, container, false);

        //create ArrayList for a list of the BARS
        ArrayList<VisitingPlaces> visitingPlaces = new ArrayList<>();

        //set the elements of the ArrayList
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.dullegriet), getResources().getString(R.string.dullegriet_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.trollekelder), getResources().getString(R.string.trollekelder_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.dreupelkot), getResources().getString(R.string.dreupelkot_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.charlatan), getResources().getString(R.string.charlatan_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.spijker), getResources().getString(R.string.spijker_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.gruut), getResources().getString(R.string.gruut_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.galgenhuis), getResources().getString(R.string.galgenhuis_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.janvangent), getResources().getString(R.string.janvangent_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.porterhouse), getResources().getString(R.string.porter_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.decadance), getResources().getString(R.string.decadance_address)));

        //create ArrayAdapter
        VisitingPlacesAdapter arrayAdapter = new VisitingPlacesAdapter(getActivity(), R.layout.list_item, visitingPlaces);

        // Find the listview object in the view hierarchy of the Activity
        // id see xml file
        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        // Make the ListView use the ArrayAdapter, so that the ListView will display the list items
        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}
