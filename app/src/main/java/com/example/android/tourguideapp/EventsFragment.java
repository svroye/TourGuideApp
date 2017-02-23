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
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.list_file, container, false);

        //create ArrayList for a list of the BARS
        ArrayList<VisitingPlaces> visitingPlaces = new ArrayList<>();

        //set the elements of the ArrayList
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.lichtfestival), getResources().getString(R.string.licht_date), R.drawable.licht));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.gentsefeesten), getResources().getString(R.string.gentsefeesten_date), R.drawable.gentsefeesten));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.kerstmarkt), getResources().getString(R.string.kerstmarkt_date), R.drawable.kerstmarkt));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.halfvastenfoor), getResources().getString(R.string.foor_date), R.drawable.foor));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.patershol), getResources().getString(R.string.patershol_date), R.drawable.pater));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.filmfest), getResources().getString(R.string.filmfest_date), R.drawable.film));

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
