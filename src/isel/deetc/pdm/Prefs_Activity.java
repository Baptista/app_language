package isel.deetc.pdm;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.util.Log;

public class Prefs_Activity extends PreferenceActivity implements OnSharedPreferenceChangeListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("DEBUG", "PREFS ACTIVITY CREATE called");
		
		addPreferencesFromResource(R.xml.config);
		
	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
			String key) {
		Log.d("DEBUG", "onSharedPreferenceChanged called");
		Preference pref = findPreference(key);
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
		pref.setSummary(sharedPref.getString("edittextonconfig", ""));
		
	}

}
