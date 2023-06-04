package com.example.cinemaonline.UI;

import static android.content.ContentValues.TAG;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
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

import com.example.cinemaonline.R;
import com.example.cinemaonline.UI.state_holder.MainLoginViewModel;

public class mainLogin extends Fragment {

    private static final String TAG = "CinemaOnline";
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
                Bundle bundle= new Bundle();
                String loginT=editText2.getText().toString();
                bundle.putString("login", loginT);
                if (viewModel.login(editText2.getText().toString())){
                    Navigation.findNavController(v).navigate(R.id.action_mainLogin_to_dataTestF2,bundle);
                }
            }
        });
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

}