package com.peicheva.candy_shop_1098;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AboutUsFragment extends Fragment {

    RatingBar ratingBar;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_about_us,container,false);
        ratingBar = v.findViewById(R.id.ratingBar);
        button = v.findViewById(R.id.button);

        button.setOnClickListener(v1 -> {
            String rating = "Your rate is " + ratingBar.getRating() + " Thank you!";
            Toast.makeText(requireActivity().getApplicationContext(), rating, Toast.LENGTH_LONG).show();
        });
        return v;
    }
}