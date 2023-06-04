package com.example.cinemaonline.UI;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.cinemaonline.Data.models.State;
import com.example.cinemaonline.R;
import com.example.cinemaonline.UI.ResView;
import com.example.cinemaonline.UI.state_holder.MovieInfoViewModel;

public class MovieInfo extends Fragment {
    public MovieInfo() {
        super(R.layout.fragment_movie_info);
    }

    private MovieInfoViewModel viewModel;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this).get(MovieInfoViewModel.class);
        super.onViewCreated(view, savedInstanceState);
        ImageView movieInfoImage = view.findViewById(R.id.pictureMovie);
        TextView movieInfoName = view.findViewById(R.id.infoMovie);
        parseArgs();
        viewModel.movieListItemLd.observe(getViewLifecycleOwner(), new Observer<State>() {
            @Override
            public void onChanged(State states) {
                movieInfoImage.setImageResource(states.getMovieResource());
                movieInfoName.setText(states.getName());
            }
        });

    }

    private void parseArgs() {
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            int pos = bundle.getInt(ResView.TAG);
            viewModel.getListItem(pos);
        }
    }
}