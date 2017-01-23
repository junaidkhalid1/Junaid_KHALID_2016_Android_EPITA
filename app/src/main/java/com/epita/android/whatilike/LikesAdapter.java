package com.epita.android.whatilike;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Junaid KHALID on 10/20/2016.
 */

public class LikesAdapter extends BaseAdapter {

    private List<MyLikes> data;
    private Context context;

    public LikesAdapter(List<MyLikes> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public MyLikes getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        ViewHolder viewHolder;

        if (convertView == null) {
            rowView = LayoutInflater.from(context).inflate(R.layout.list_likes, parent, false);
            viewHolder = new ViewHolder(rowView);
            rowView.setTag(viewHolder);
        } else {
            rowView = convertView;
            viewHolder = (ViewHolder) rowView.getTag();
        }

        MyLikes currentLike = getItem(position);

        viewHolder.movieTextView.setText(currentLike.getsMovie());

        viewHolder.alignmentImageView.setImageResource(
                currentLike.isbIsGoodGuy() ?
                        R.drawable.up :
                        R.drawable.down);

        return rowView;
    }

    class ViewHolder {

        TextView movieTextView;
        ImageView alignmentImageView;

        public ViewHolder(View rowView) {

            movieTextView = (TextView) rowView.findViewById(R.id.list_item_text_movie);
            alignmentImageView = (ImageView) rowView.findViewById(R.id.list_item_img_alignment);

        }

    }

}
