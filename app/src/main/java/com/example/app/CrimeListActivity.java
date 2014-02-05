package com.example.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by HDR on 2/3/14.
 */
public class CrimeListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new CrimeListFragment())
                    .commit();
        }
    }
}
