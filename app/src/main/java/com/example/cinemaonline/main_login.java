package com.example.cinemaonline;

import android.content.Context;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;


public class main_login extends Fragment {

    private final static String TAG = "Fragmant_login";

    public main_login(){
        Log.d(TAG, "Constructor");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        Toast.makeText(getContext(),"onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        Toast.makeText(getContext(),"onCreateView",Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_main_login, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated");
        Toast.makeText(getContext(),"onViewCreated",Toast.LENGTH_SHORT).show();
        ImageView imageView=view.findViewById(R.id.imageLogo);
        Button button = view.findViewById(R.id.button);
        TextView textView = view.findViewById(R.id.textView);
        textView.setText("Авторизация");
        EditText editText1 = view.findViewById(R.id.editPassword);
        EditText editText2 = view.findViewById(R.id.editLogin);
        imageView.setImageResource(R.drawable.logo1);
        button.setText("Войти");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                result.putString("name", editText2.getText().toString());
                Log.d(TAG, "Кнопка нажата");
                getParentFragmentManager().setFragmentResult("toSecond", result);

            }
        });
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(TAG, "onViewStateRestored");
        Toast.makeText(getContext(),"onViewStateRestored",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(getContext(),"onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(getContext(),"onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(getContext(),"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(getContext(),"onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView");
        Toast.makeText(getContext(),"onDestroyView",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(getContext(),"onDestroy",Toast.LENGTH_SHORT).show();
    }

}