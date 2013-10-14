package com.example.geekmoodclient.view;

import java.util.List;

import com.example.geekmoodclient.R;
import com.example.geekmoodclient.model.Mood;
import com.example.geekmoodclient.view.adapter.UserProfileAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class UserProfileActivity extends Activity{
    
    private UserProfileAdapter adapter;
    private ListView moodsList;
    private List<Mood> moods;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        
        moodsList = (ListView)findViewById(R.id.my_moods);
        
        adapter = new UserProfileAdapter(moods, this);
        
        
    }

}
