package com.example.androidpractice04;

import com.example.preferenceFragment.PreFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //加载PrefFragment
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        PreFragment prefFragment = new PreFragment();
        transaction.add(R.id.preferenceFragment, prefFragment);
        transaction.commit();
    }
}
