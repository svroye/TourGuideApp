package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Steven on 30/01/2017.
 */

public class MyOwnAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MyOwnAdapter(FragmentManager fm, Context c) {
        super(fm);
        mContext = c;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BarsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new PlacesFragment();
        } else return new EventsFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.bar);
            case 1:
                return mContext.getString(R.string.restaurants);

            case 2:
                return mContext.getString(R.string.special_places);

            default:
                return mContext.getString(R.string.events);
        }
    }
}
