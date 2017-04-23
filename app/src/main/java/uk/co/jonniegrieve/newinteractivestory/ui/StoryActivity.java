package uk.co.jonniegrieve.newinteractivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import uk.co.jonniegrieve.newinteractivestory.R;

public class StoryActivity extends AppCompatActivity {

    //add a tag
    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if (name == null || name.isEmpty()) {
            name = "Friend";
        }

        Log.d(TAG, name);
    }


}
