package com.example.cinemaonline;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;


public class dataTestF extends Fragment {
    private static final String TAG = "DataTest";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_data_test, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState ){
        super.onViewCreated(view, savedInstanceState);
        TextView hello=view.findViewById(R.id.hello);
        Button backBut=view.findViewById(R.id.backBut);
        Button placeBut=view.findViewById(R.id.placeBut);
        Button movieBut=view.findViewById(R.id.movieBut);
        getParentFragmentManager().setFragmentResultListener("requestKey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                if (result!=null) {
                    String res = result.getString("name");
                    hello.setText("Здравствуйте, "+res);
                }
                else {
                    Log.d(TAG,"And, it's gone");
                }
            }
        });
        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Кнопка нажата");
                Fragment fragment = new mainLogin();
                getParentFragmentManager()
                        .beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.dataTestF, fragment)
                        .commit();
                Log.d(TAG, "Вернулись в авторизацию");
            }
        });
        placeBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Вы заходите в выбор местоположения");
                Fragment fragment=new choice_cities();
                getParentFragmentManager()
                        .beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.dataTestF, fragment)
                        .commit();
            }
        });
        movieBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Вы заходите в выбор кино");
                Fragment fragment=new choice_movie();
                getParentFragmentManager()
                        .beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.dataTestF, fragment)
                        .commit();
            }
        });

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

}