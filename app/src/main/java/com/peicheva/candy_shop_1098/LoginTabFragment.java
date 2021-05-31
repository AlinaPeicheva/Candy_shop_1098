package com.peicheva.candy_shop_1098;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    EditText login;
    EditText password;
    TextView forget_pass;
    Button btn_login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        login = root.findViewById(R.id.login);
        password = root.findViewById(R.id.password);
        forget_pass = root.findViewById(R.id.forget_pass);
        btn_login = root.findViewById(R.id.btn_login);

        btn_login.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), MainActivity.class);
            startActivity(intent);
        });

        return root;

    }

}
