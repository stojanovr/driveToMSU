package com.example.driveToMSU;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Open Google maps */
    public void startImplicitIntent(View view) {

        /* Sets route to MSU after the button is clicked */
        Intent newIntent = new Intent(Intent.ACTION_VIEW);
        newIntent.setData(Uri.parse("geo:0,0?q=Montclair+State+University\n" + "+New Jersey+USA"));
        startActivity(newIntent);
    }
}