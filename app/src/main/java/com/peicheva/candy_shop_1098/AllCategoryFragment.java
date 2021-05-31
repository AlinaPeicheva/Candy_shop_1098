package com.peicheva.candy_shop_1098;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public  class AllCategoryFragment extends Fragment {

    Button view_all_chocolate;
    Button view_all_cake;
    Button view_all_muffin;
    Button view_all_candy;
    Button view_all_cookie;
    Button view_all_lollipop;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_all_category,container,false);

        view_all_chocolate = v.findViewById(R.id.view_all_chocolate);
        view_all_cake = v.findViewById(R.id.view_all_cake);
        view_all_muffin = v.findViewById(R.id.view_all_muffin);
        view_all_candy = v.findViewById(R.id.view_all_candy);
        view_all_cookie = v.findViewById(R.id.view_all_cookie);
        view_all_lollipop = v.findViewById(R.id.view_all_lollipop);

        return v;
    }
}