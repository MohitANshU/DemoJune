package com.mohitverma.demojune;

/**
 * Created by android pc on 6/18/2016.
 */
public class NavDrawerCountry {
    private String title;
    private int icon;
    private String counter = "0";

    public NavDrawerCountry() {}

    public NavDrawerCountry(String title ,int icon,String counter){
        this.title=title;
        this.icon=icon;
        this.counter=counter;

    }

    public String getTitle(){
        return this.title;
    }
    public int getIcon(){
        return this.icon;
    }
    public String getCounter(){
        return this.counter;
    }


}


