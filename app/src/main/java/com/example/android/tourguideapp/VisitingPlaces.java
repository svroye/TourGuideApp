package com.example.android.tourguideapp;

/**
 * Created by Steven on 30/01/2017.
 */

public class VisitingPlaces {

    //name of the bar,restaurant, event, place,...
    private String mName;

    //address of the bar/restaurant/place
    private String mAddress;

    //resource id for the Image of the events
    private int mImageResourceId;

    //date of the event
    private String mDate;

    /**
     * constructor for the bars, restaurants
     * and places
     *
     * @param name    : name of the bar/restaurant/place
     * @param address : address of the bar/restaurant/place
     */
    public VisitingPlaces(String name, String address) {
        mName = name;
        mAddress = address;
        mImageResourceId = -1;
        mDate = null;
    }

    /**
     * constructor for events
     *
     * @param name    : name of the event
     * @param date    : approximate date of the event
     * @param imageId : id resource of the image of the event
     */
    public VisitingPlaces(String name, String date, int imageId) {
        mName = name;
        mDate = date;
        mImageResourceId = imageId;
        mAddress = null;
    }

    /**
     * @return name of the bar/restaurant/event/place
     */
    public String getName() {
        return mName;
    }

    /**
     * @return address of the bar/restaurant/place
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * @return id of the image of the event
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return date of the event
     */
    public String getDate() {
        return mDate;
    }
}
