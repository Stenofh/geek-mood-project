package com.example.geekmoodclient.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.geekmoodclient.R;
import com.example.geekmoodclient.view.fragment.CadastroFragment;
import com.example.geekmoodclient.view.fragment.LoginFragment;

public class AuthenticationActivity extends FragmentActivity implements OnClickListener {

	private FragmentTabHost mTabHost;
	private Button btnCadastro;
	private Button btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.authentication);

		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.flt_content_area);

		mTabHost.addTab(
			mTabHost.newTabSpec("login").setIndicator("Login"),
			LoginFragment.class, null);

		mTabHost.addTab(
			mTabHost.newTabSpec("register").setIndicator("Cadastro"),
			CadastroFragment.class, null);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_cadastro:

			break;

		case R.id.btn_login:

			break;
		default:
			break;
		}
	}

}
