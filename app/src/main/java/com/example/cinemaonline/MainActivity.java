package com.example.cinemaonline;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
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
    TextView butOut;
    static final String message ="Exit";

    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            butOut = findViewById(R.id.butOut);
            Intent intent = result.getData();
            if (intent!=null) {
                butOut.setText(intent.getStringExtra(message));
            }
        }

    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        textView.setText("Авторизация");
        TextView butOut = findViewById(R.id.butOut);
        ImageView imageView = findViewById(R.id.imageLogo);
        imageView.setImageResource(R.drawable.logo1);
        Button button = findViewById(R.id.button);
        button.setText("Войти");
        EditText edit1 = findViewById(R.id.editLogin);
        edit1.setText("");
        EditText edit2 = findViewById(R.id.editPassword);
        edit2.setText("");
        Context info = getApplicationContext();
        CharSequence message = "Created";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Bundle arguments = getIntent().getExtras();
        if (arguments!=null){
            String login = arguments.get("backLogin").toString();
            edit1.setText(login);
        }
    }

    public void authorization(View view) {
        Log.d(TAG,"Сработало нажатие");
        EditText edit1 = findViewById(R.id.editLogin);
        String login = edit1.getText().toString();
        Intent intent = new Intent(this, dataIn.class);
        intent.putExtra("editLogin", login);
        mStartForResult.launch(intent);
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