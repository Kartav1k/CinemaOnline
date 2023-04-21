package com.example.cinemaonline;

import static android.content.ContentValues.TAG;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class mainLogin extends Fragment {

    private static final String TAG = "CinemaOnline";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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
            public void onClick(View v) {
                Log.d(TAG, "Кнопка нажата");
                Bundle bundle= new Bundle();
                String loginT=editText2.getText().toString();
                bundle.putString("login", loginT);
                Navigation.findNavController(v).navigate(R.id.action_mainLogin_to_dataTestF2,bundle);
                Log.d(TAG,"Отправлено");
            }
        });
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {super.onDestroyView();}

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}