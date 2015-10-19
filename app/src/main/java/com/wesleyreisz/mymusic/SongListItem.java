package com.wesleyreisz.mymusic;

/**
 * Created by Nick on 10/18/2015.
 */
public class SongListItem {


    private String itemTitle;

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public SongListItem(String title) {
        this.itemTitle = title;
    }
}