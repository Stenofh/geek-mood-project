package com.example.geekmoodclient.view.adapter;

import java.util.ArrayList;
import java.util.List;

import com.example.geekmoodclient.model.Mood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class UserProfileAdapter extends BaseAdapter{
    
    private List<Mood> moods = new ArrayList<Mood>();
    private Context context;
    private LayoutInflater inflater;
    
    public UserProfileAdapter(final List<Mood> moods, final Context context){
	this.context = context;
	this.moods = moods;
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
    public View getView(int arg0, View view, ViewGroup arg2) {
	return view;
    }
    
    static class ViewHolder{
	TextView mood;
    }

}
