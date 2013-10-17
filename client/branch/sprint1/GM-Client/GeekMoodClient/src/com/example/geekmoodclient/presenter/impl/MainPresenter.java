package com.example.geekmoodclient.presenter.impl;

import java.util.List;

import com.example.geekmoodclient.model.Mood;
import com.example.geekmoodclient.presenter.IMainPresenter;
import com.example.geekmoodclient.view.IMainView;

public class MainPresenter implements IMainPresenter {

    private IMainView view;

    public MainPresenter(IMainView view) {
	this.view = view;
    }

    @Override
    public List<Mood> getMoodFeed() {
	// TODO Auto-generated method stub
	return null;
    }

}
