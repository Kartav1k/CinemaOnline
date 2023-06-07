package com.example.cinemaonline.UI;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.example.cinemaonline.Data.DataBase.Entity.User;
import com.example.cinemaonline.R;
import com.example.cinemaonline.UI.state_holder.RegistrationViewModel;

public class RegistrationFrag extends Fragment {

    private RegistrationViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_registration, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(RegistrationViewModel.class);
        EditText passR = view.findViewById(R.id.passReg);
        EditText loginR = view.findViewById(R.id.loginReg);
        EditText phoneR = view.findViewById(R.id.phoneReg);
        EditText emailR = view.findViewById(R.id.emailReg);
        EditText fioR = view.findViewById(R.id.fio);
        EditText dateR = view.findViewById(R.id.dateReg);
        Button regBut = view.findViewById(R.id.regBut);
        regBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.registration(new User(
                        emailR.getText().toString(),
                        loginR.getText().toString(),
                        passR.getText().toString(),
                        fioR.getText().toString(),
                        phoneR.getText().toString(),
                        dateR.getText().toString()
                ));
                Navigation.findNavController(v).navigate(R.id.action_registrationFrag_to_mainLogin);
            }
        });

    }
}