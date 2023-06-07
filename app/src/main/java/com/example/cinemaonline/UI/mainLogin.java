package com.example.cinemaonline.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.cinemaonline.R;
import com.example.cinemaonline.UI.state_holder.MainLoginViewModel;

public class mainLogin extends Fragment {

    private static final String TAG = "CinemaOnline";
    private static final String KEY_LOGIN = "login";
    private MainLoginViewModel viewModel;

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
        viewModel = new ViewModelProvider(this).get(MainLoginViewModel.class);
        ImageView imageView=view.findViewById(R.id.imageLogo);
        Button button = view.findViewById(R.id.button);
        Button regBut = view.findViewById(R.id.registrationButton);
        TextView textView = view.findViewById(R.id.textView);
        textView.setText("Авторизация");
        EditText pass1 = view.findViewById(R.id.editPassword);
        EditText login1 = view.findViewById(R.id.editLogin);
        imageView.setImageResource(R.drawable.logo1);
        button.setText("Войти");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = login1.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("login", data);
                viewModel.login(
                        login1.getText().toString(),
                        pass1.getText().toString()).observe(
                        getViewLifecycleOwner(),
                        aBoolean -> {
                            if (aBoolean) {
                                Navigation.findNavController(v).navigate(R.id.action_mainLogin_to_dataTestF2, bundle);
                            }
                        });
                }
        });
        regBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_mainLogin_to_registrationFrag);
            }
        });
    }
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }
}