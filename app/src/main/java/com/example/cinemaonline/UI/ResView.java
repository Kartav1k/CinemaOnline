package com.example.cinemaonline.UI;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;


import com.example.cinemaonline.Data.models.State;
import com.example.cinemaonline.R;
import com.example.cinemaonline.UI.state_holder.ReviewViewModel;
import com.example.cinemaonline.UI.state_holder.StateAdapter;

import java.util.List;

public class ResView extends Fragment {
    public static final String TAG = "MovieName";

    private ReviewViewModel viewModel;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.res_view, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this).get(ReviewViewModel.class);
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.movieList);
        viewModel.movieListLd.observe(getViewLifecycleOwner(), new Observer<List<State>>() {
            @Override
            public void onChanged(List<State> states) {
                StateAdapter.OnStateClickListener stateClickListener = new StateAdapter.OnStateClickListener() {
                    @Override
                    public void onStateClick(State state, int position) {
                        Log.d(TAG, state.getName());
                        Toast.makeText(getContext(), state.getName(), Toast.LENGTH_SHORT).show();
                        Bundle bundle = new Bundle();
                        bundle.putInt(TAG, position);
                        Navigation.findNavController(view)
                                .navigate(R.id.action_resView_to_movieInfo, bundle);
                    }
                };
                StateAdapter adapter = new StateAdapter(getContext(), states, stateClickListener);
                recyclerView.setAdapter(adapter);
            }
        });
    }
}