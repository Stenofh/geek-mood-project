package com.example.geekmoodclient.presenter.impl;

import java.util.List;

import com.example.geekmoodclient.model.Mood;
import com.example.geekmoodclient.presenter.IUserProfilePresenter;
import com.example.geekmoodclient.view.IUserProfileView;

public class UserProfilePresenter implements IUserProfilePresenter{

    private IUserProfileView view;

    public UserProfilePresenter(IUserProfileView view){
	this.view = view;
    }
    
    @Override
    public List<Mood> getUserMoods() {
	return null;
    }

}
