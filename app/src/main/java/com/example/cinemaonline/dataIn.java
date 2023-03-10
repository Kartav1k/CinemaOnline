package com.example.cinemaonline;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

public class dataIn extends AppCompatActivity {
    String login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_in);
        Button backBut=findViewById(R.id.backBut);
        TextView hello=findViewById(R.id.hello);
        Bundle arguments = getIntent().getExtras();
        login = arguments.get("editLogin").toString();
        hello.setText("Здравствуйте, "+ login);
    }

    public void back(View view){
        Intent data = new Intent();
        data.putExtra(MainActivity.message,"Вы вышли из аккаунта");
        setResult(RESULT_OK, data);
        finish();
    }
}
