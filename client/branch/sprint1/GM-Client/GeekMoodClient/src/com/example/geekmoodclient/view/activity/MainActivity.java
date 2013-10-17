package com.example.geekmoodclient.view.activity;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

import com.example.geekmoodclient.R;
import com.example.geekmoodclient.model.Mood;
import com.example.geekmoodclient.presenter.IMainPresenter;
import com.example.geekmoodclient.presenter.impl.MainPresenter;
import com.example.geekmoodclient.view.IMainView;
import com.example.geekmoodclient.view.adapter.MoodFeedAdapter;

public class MainActivity extends Activity implements OnClickListener,
	IMainView {

    private MoodFeedAdapter adapter;
    private ListView moodsFeedList;
    private List<Mood> moods;
    private IMainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

	moodsFeedList = (ListView) findViewById(R.id.lst_moods_feed);

	presenter = new MainPresenter(this);
	moods = presenter.getMoodFeed();

	adapter = new MoodFeedAdapter(moods, getContext(), this);
	moodsFeedList.setAdapter(adapter);
    }

    @Override
    public Context getContext() {
	return this;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }

    @Override
    public void onClick(View arg0) {
	// TODO Auto-generated method stub

    }

}
