package com.example.geekmoodclient.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ProgressBar;

import com.example.geekmoodclient.R;

public class SplashActivity extends Activity {

    private ProgressBar progressBar;
    private ProgressTask task = new ProgressTask();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	setContentView(R.layout.splash);

	progressBar = (ProgressBar) findViewById(R.id.progressBar);
	task.execute(0);
    }

    private class ProgressTask extends AsyncTask<Integer, Integer, Void> {

	protected void onPreExecute() {
	    super.onPreExecute();
	    progressBar.setMax(100);

	}

	protected void onCancelled() {
	    progressBar.setMax(0);
	    Log.v("Progress", "Cancelled");
	}

	protected Void doInBackground(Integer... params) {
	    int start = params[0];
	    for (int i = start; i <= 100; i += 20) {
		try {
		    progressBar.setProgress(i);
		    SystemClock.sleep(500);
		} catch (Exception e) {
		    Log.e("Error", e.toString());
		}
	    }
	    return null;
	}

	protected void onProgressUpdate(Integer... values) {
	    progressBar.setProgress(5);
	}

	protected void onPostExecute(Void result) {
	    startActivity(new Intent(SplashActivity.this,
		    AuthenticationActivity.class));
	    finish();
	}

    }

}
