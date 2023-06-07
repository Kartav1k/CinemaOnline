package com.example.cinemaonline.UI;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.cinemaonline.Data.DataBase.Entity.State;
import com.example.cinemaonline.R;
import com.example.cinemaonline.UI.state_holder.MovieInfoViewModel;

public class MovieInfo extends Fragment {
    public MovieInfo() {
        super(R.layout.fragment_movie_info);
    }

    private MovieInfoViewModel viewModel;
    VideoView video;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this).get(MovieInfoViewModel.class);
        super.onViewCreated(view, savedInstanceState);
        ImageView movieInfoImage = view.findViewById(R.id.pictureMovie);
        TextView movieName = view.findViewById(R.id.nameMovie);
        TextView movieInfo = view.findViewById(R.id.infoMovie);
        ImageButton backBut = view.findViewById(R.id.backBut);
        video = view.findViewById(R.id.video);
        MediaController mediaController = new MediaController(getContext());
        Uri myVideoUri= Uri.parse( "android.resource://" + requireActivity().getPackageName() + "/" + R.raw.torreto);
        video.setVideoURI(myVideoUri);
        video.setMediaController(mediaController);
        video.requestFocus(0);
        mediaController.setMediaPlayer(video);
        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_movieInfo_to_resView);
            }
        });
        parseArgs();
        viewModel.movieListItemLd.observe(getViewLifecycleOwner(), new Observer<State>() {
            @Override
            public void onChanged(State states) {
                movieInfoImage.setImageResource(states.getMovieResource());
                movieName.setText(states.getName());
                movieInfo.setText(states.getMovieDes());
            }
        });


    }
    public void play(View view){
        video.start();
    }
    public void pause(View view){
        video.pause();
    }
    public void stop(View view){
        video.stopPlayback();
        video.resume();
    }
    private void parseArgs() {
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            int pos = bundle.getInt(ResView.TAG);
            viewModel.getListItem(pos);
        }
    }
}