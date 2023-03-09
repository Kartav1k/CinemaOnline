package com.example.cinemaonline;

import androidx.appcompat.app.AppCompatActivity;
import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import android.os.Bundle;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CinemaOnline";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.textView);
        textView.setText("Авторизация");
        TextView butOut=(TextView)findViewById(R.id.butOut);
        ImageView imageView=findViewById(R.id.imageLogo);
        imageView.setImageResource(R.drawable.logo1);
        Button button=findViewById(R.id.button);
        button.setText("Войти");
        EditText edit1 =findViewById(R.id.editLogin);
        edit1.setText("Логин");
        EditText edit2 =findViewById(R.id.editPassword);
        edit2.setText("Пароль");
        Context info = getApplicationContext();
        CharSequence message = "Created";
        int duration = Toast.LENGTH_SHORT   ;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butOut.setText("Вы авторизированы!");
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Context info = getApplicationContext();
        CharSequence message = "Start activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Context info = getApplicationContext();
        CharSequence message = "Resume activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Context info = getApplicationContext();
        CharSequence message = "Pause activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Context info = getApplicationContext();
        CharSequence message = "Stop activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Context info = getApplicationContext();
        CharSequence message = "Restart activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Context info = getApplicationContext();
        CharSequence message = "Destroy activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
    }


}