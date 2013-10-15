package com.example.geekmoodclient.view.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.geekmoodclient.R;
import com.example.geekmoodclient.model.Mood;

public class UserProfileAdapter extends BaseAdapter{
    
    private List<Mood> moods = new ArrayList<Mood>();
    private Context context;
    private LayoutInflater inflater;
    private OnClickListener onClickListener;
    private ViewHolder holder;
    
    public UserProfileAdapter(final List<Mood> moods, final Context context, final OnClickListener onClickListener){
	this.context = context;
	this.moods = moods;
	this.onClickListener = onClickListener;
	this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

	    convertView = inflater.inflate(R.layout.user_moods_item,
		    null);

	    holder.mood = (TextView) convertView
		    .findViewById(R.id.mood_content);
	    holder.deleteMood = (ImageButton) convertView
		    .findViewById(R.id.btn_delete_mood);
	    
	    convertView.setTag(holder);
	} else {
	    holder = (ViewHolder) convertView.getTag();
	}
	
	Mood mood = this.moods.get(position);
	holder.mood.setText(mood.getContent());
	holder.deleteMood.setOnClickListener(onClickListener);
	
	
	return convertView;
    }
    
    static class ViewHolder{
	TextView mood;
	ImageButton deleteMood;
    }

}
