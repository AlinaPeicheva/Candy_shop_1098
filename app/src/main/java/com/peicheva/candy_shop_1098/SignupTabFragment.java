package com.peicheva.candy_shop_1098;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText signup_login;
    EditText signup_mobile;
    EditText signup_password;
    EditText signup_conf_pass;
    Button btn_signup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        signup_login = root.findViewById(R.id.signup_login);
        signup_mobile = root.findViewById(R.id.signup_mobile);
        signup_password = root.findViewById(R.id.signup_password);
        signup_conf_pass = root.findViewById(R.id.signup_conf_pass);
        btn_signup = root.findViewById(R.id.btn_signup);

        btn_signup.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), MainActivity.class);
            startActivity(intent);
        });

        return root;
    }
}
