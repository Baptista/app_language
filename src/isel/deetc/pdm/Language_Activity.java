package isel.deetc.pdm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Language_Activity extends Activity {

	private static int count=0;
	protected SharedPreferences sharedpreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("DEBUG", "ONCREATE CALLED");
        
        if(Configuration.ORIENTATION_LANDSCAPE == this.getResources().getConfiguration().orientation){
        	setContentView(R.layout.landscape);
        	
        	final Button buttonInc = (Button) findViewById(R.id.button1);
        	buttonInc.setText(count+"");
            buttonInc.setOnClickListener(new View.OnClickListener() {
    			
    			@Override
    			public void onClick(View v) {
    				Log.d("DEBUG", "EVENTO CLICK ON BUTTON");
    				//int newcount = Integer.parseInt(buttonInc.getText().toString());
    				count++;
    				buttonInc.setText(count+"");
    			}
    		});
        	
        }
        	
        else if(Configuration.ORIENTATION_PORTRAIT == this.getResources().getConfiguration().orientation){
        	setContentView(R.layout.activity_language);
        	
        	final Button buttonInc = (Button) findViewById(R.id.button1);
        	buttonInc.setText(count+"");
            buttonInc.setOnClickListener(new View.OnClickListener() {
    			
    			@Override
    			public void onClick(View v) {
    				Log.d("DEBUG", "EVENTO CLICK ON BUTTON");
    				//int newcount = Integer.parseInt(buttonInc.getText().toString());
    				count++;
    				buttonInc.setText(count+"");
    			}
    		});
        }        
    }       
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.d("DUBUG", "ONDESTROY CALLED");
    }
  
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
    	super.onConfigurationChanged(newConfig);
    	Log.d("DEBUG", "onConfigurationChanged called");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater menuinflater = this.getMenuInflater();
    	menuinflater.inflate(R.menu.language_, menu);
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()){
    		case R.id.item1:	
    			count=0;
    			final Button buttonInc = (Button) findViewById(R.id.button1);
    			buttonInc.setText(count+"");
    			return true;
    		case R.id.item3:
    			this.finish();return true;
    		case R.id.item4:
    			Intent intent = new Intent(this, Help.class);
    			startActivity(intent);
    		case R.id.item2:
    			startActivity(new Intent(this , Prefs_Activity.class));
    			return true;
    		default:super.onOptionsItemSelected(item);return true;
    	}
    	
    }
}
