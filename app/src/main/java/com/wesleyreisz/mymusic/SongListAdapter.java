package com.wesleyreisz.mymusic;

/**
 * Created by Nick on 10/18/2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.app.Activity;

import com.wesleyreisz.mymusic.model.Song;

import java.util.List;

public class SongListAdapter extends ArrayAdapter {

    private Context context;
    private boolean useList = true;

    public SongListAdapter(Context context, List items) {
        super(context, android.R.layout.simple_list_item_1, items);
        this.context = context;
    }


    private class ViewHolder {
        TextView titleText;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        Song item = (Song) getItem(position);
        View viewToUse = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            if (useList) {
                viewToUse = mInflater.inflate(R.layout.song_list_item, null);
            } else {
                viewToUse = mInflater.inflate(R.layout.song_grid_item, null);
            }

            holder = new ViewHolder();
            holder.titleText = (TextView) viewToUse.findViewById(R.id.songTextView);
            viewToUse.setTag(holder);
        } else {
            viewToUse = convertView;
            holder = (ViewHolder) viewToUse.getTag();
        }

        holder.titleText.setText(item.getSongTitle() +" - " + item.getArtistName() + "\n");
        return viewToUse;
    }
}