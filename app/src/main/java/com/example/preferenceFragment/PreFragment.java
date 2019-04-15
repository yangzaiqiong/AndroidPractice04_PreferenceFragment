package com.example.preferenceFragment;


import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.widget.TextView;

import com.example.androidpractice04.R;

public class PreFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        //从xml文件加载选项
        addPreferencesFromResource(R.xml.preferences);
        //修改运行后生成的文件名
        getPreferenceManager().setSharedPreferencesName("mysetting");
    }


}
