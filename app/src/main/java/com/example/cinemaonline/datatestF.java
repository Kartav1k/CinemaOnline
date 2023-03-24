package com.example.cinemaonline;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class datatestF extends Fragment {
    private final static String TAG = "Fragment_login";

    public datatestF(){
        Log.d(TAG, "Constructor");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button backBut=getView().findViewById(R.id.backBut);
        TextView hello=getView().findViewById(R.id.hello);
        getParentFragmentManager().setFragmentResultListener("toSecond", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                hello.setText("Здравствуйте"+result.getString("name"));
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_data_test, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //Bundle arguments = getIntent().getExtras();
        //login = arguments.get("editLogin").toString();

        /*backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle res=new Bundle();
                res.putString("bundleKey", "result");
                getParentFragmentManager().setFragmentResult("requestKey",res);
                backBut.setText("Назад");
            }
        });*/
    }
}