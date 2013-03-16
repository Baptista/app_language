package isel.deetc.pdm;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Prefs_Activity extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.config);
	}
	
}
