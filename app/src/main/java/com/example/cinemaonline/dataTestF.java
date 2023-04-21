package com.example.cinemaonline;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.Navigation;


public class dataTestF extends Fragment {
    private static final String TAG = "DataTest";
    private static final String CHANNEL_ID = "TestChannel";

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
        Button notificationBut=view.findViewById(R.id.notificationBut);
        String loginTextBundle = getArguments().getString("login");
        hello.setText("Здравствуйте, "+ loginTextBundle);
        createNotificationChannel();

        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Кнопка нажата");
                Navigation.findNavController(view).navigate(R.id.action_dataTestF2_to_mainLogin);
                Log.d(TAG, "Вернулись в авторизацию");
            }
        });
        notificationBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"Message");
                Intent intent = new Intent(requireContext(), CinemaService.class);
                requireActivity().startService(intent);
                showNotification();
            }
        });


    }
    private void showNotification() {
        Notification notification = new NotificationCompat.Builder(requireContext(), CHANNEL_ID)
                .setSmallIcon(R.drawable.logo1)
                .setContentText("Успешное уведомление")
                .setContentTitle("Успешно")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .build();

        NotificationManager notificationManager =
                (NotificationManager) requireContext().getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(1, notification);

    }
    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "TestChannel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );

            NotificationManager notificationManager =
                    (NotificationManager) requireContext().getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(channel);
        }
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }


}