package com.example.geekmoodclient.view.fragment;

import com.example.geekmoodclient.R;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LoginFragment extends Fragment{
	
    private EditText edtLoginSenha;
    private EditText edtLoginEmail;
    private Button btnLogin;

    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
    	
    	View view = inflater.inflate(R.layout.login, null);
    	edtLoginEmail = (EditText) view.findViewById(R.id.edt_email);
    	edtLoginSenha = (EditText) view.findViewById(R.id.edit_senha);
    	btnLogin = (Button) view.findViewById(R.id.btn_login);
    	
    	return view;
    }
}
