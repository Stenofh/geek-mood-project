package com.example.geekmoodclient.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.geekmoodclient.R;

public class CadastroFragment extends Fragment {

	private EditText edtCadNome;
	private EditText edtCadEmail;
	private EditText edtCadApelido;
	private EditText edtCadSenha;
	private Button btnCadastro;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.formulario_cadastro, null);
		edtCadNome = (EditText) view.findViewById(R.id.edt_nome);
		edtCadEmail = (EditText) view.findViewById(R.id.edt_cad_email);
		edtCadApelido = (EditText) view.findViewById(R.id.edt_apelido);
		edtCadSenha = (EditText) view.findViewById(R.id.edt_cad_senha);
		btnCadastro = (Button) view.findViewById(R.id.btn_cadastro);

		return view;
	}
}
