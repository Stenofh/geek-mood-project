package com.example.geekmoodclient.view.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.geekmoodclient.R;
import com.example.geekmoodclient.model.Mood;

public class MoodFeedAdapter extends BaseAdapter {

    private List<Mood> moods = new ArrayList<Mood>();
    private Context context;
    private LayoutInflater inflater;
    private OnClickListener onClickListener;
    private ViewHolder holder;

    public MoodFeedAdapter(final List<Mood> moods, final Context context,
	    final OnClickListener onClickListener) {
	this.context = context;
	this.moods = moods;
	this.onClickListener = onClickListener;
	this.inflater = (LayoutInflater) context
		.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
	return moods.size();
    }

    @Override
    public Object getItem(int location) {
	return moods.get(location);
    }

    @Override
    public long getItemId(int arg0) {
	return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

	View convertView = view;
	if (convertView == null) {
	    holder = new ViewHolder();

	    convertView = inflater.inflate(R.layout.moods_feed_items, null);

	    holder.userImage = (ImageView) convertView
		    .findViewById(R.id.imv_friend_photo);
	    holder.userName = (TextView) convertView
		    .findViewById(R.id.txv_friend_name);

	    holder.userMoodContent = (TextView) convertView
		    .findViewById(R.id.txv_friend_post_content);

	    holder.userMoodImage = (ImageButton) convertView
		    .findViewById(R.id.imv_friend_post_mood);

	    holder.buttonShow = (Button) convertView
		    .findViewById(R.id.btn_show_mood);

	    holder.buttonTeleze = (Button) convertView
		    .findViewById(R.id.btn_leso_mood);

	    holder.buttonComents = (Button) convertView
		    .findViewById(R.id.btn_comments_mood);

	    convertView.setTag(holder);
	} else {
	    holder = (ViewHolder) convertView.getTag();
	}

	Mood mood = this.moods.get(position);
	
	holder.buttonShow.setOnClickListener(onClickListener);
	holder.buttonTeleze.setOnClickListener(onClickListener);
	holder.buttonComents.setOnClickListener(onClickListener);

	return convertView;
    }

    static class ViewHolder {
	ImageView userImage;
	TextView userName;
	TextView userMoodContent;
	ImageView userMoodImage;
	Button buttonShow;
	Button buttonTeleze;
	Button buttonComents;
    }

}
