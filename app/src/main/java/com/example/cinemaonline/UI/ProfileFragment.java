package com.example.cinemaonline.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.cinemaonline.R;


public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView nameUser = view.findViewById(R.id.userName);
        if (getArguments() != null) {
            nameUser.setText(getArguments().getString("login"));
        }
        ImageButton backBut = view.findViewById(R.id.backButFromProfileToMenu);
        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_profileFragment_to_dataTestF);
            }
        });
        TextView score = view.findViewById(R.id.score);
        TextView favourites = view.findViewById(R.id.favourites);
        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_profileFragment_to_favouritesFragment);
            }
        });
        TextView payInfo = view.findViewById(R.id.infSubscription);
        payInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_profileFragment_to_subscriptionInfo);
            }
        });
        TextView supportChat = view.findViewById(R.id.support);
        TextView infoApp = view.findViewById(R.id.infoAPP);
        infoApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_profileFragment_to_infoAPP2);
            }
        });
        TextView exit = view.findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_profileFragment_to_mainLogin);
            }
        });

    }
}