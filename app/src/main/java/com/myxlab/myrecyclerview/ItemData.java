package com.myxlab.myrecyclerview;

/**
 * Created by haslina on 9/23/2016.
 */
public class ItemData {

    String title;
    int imageURL;

    public ItemData() {
    }

    public ItemData(String title, int imageURL) {
        this.title = title;
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageURL() {
        return imageURL;
    }

    public void setImageURL(int imageURL) {
        this.imageURL = imageURL;
    }
}
