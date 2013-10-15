package com.example.geekmoodclient.view.activity;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

import com.example.geekmoodclient.R;
import com.example.geekmoodclient.model.Mood;
import com.example.geekmoodclient.presenter.IUserProfilePresenter;
import com.example.geekmoodclient.presenter.impl.UserProfilePresenter;
import com.example.geekmoodclient.view.IUserProfileView;
import com.example.geekmoodclient.view.adapter.UserProfileAdapter;

public class UserProfileActivity extends Activity implements OnClickListener, IUserProfileView{
    
    private UserProfileAdapter adapter;
    private ListView moodsList;
    private List<Mood> moods;
    private IUserProfilePresenter presenter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        
        moodsList = (ListView)findViewById(R.id.my_moods);
        
        presenter = new UserProfilePresenter(this);
        moods = presenter.getUserMoods();
        
        adapter = new UserProfileAdapter(moods, getContext(), this);
        moodsList.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
	// Do nothing
    }

    @Override
    public Context getContext() {
	return this;
    }

}
