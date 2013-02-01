package net.lukegjpotter.app.twitterfavouritesearches;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * @author Luke Potter
 * 31/Jan/2013
 * 
 * This it the splash screen activity for the Twitter Favourite Searches app
 */
public class SplashscreenActivity extends Activity {

	// Dictates how long the splash screen appears for
	protected static final long timeout = 2000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_splash);
		
		Thread timer = new Thread() {
			
			public void run() {
				
				try {
					
					sleep(timeout);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} finally {
					
					Intent openNextActivity = new Intent("net.lukegjpotter.app.twitterfavouritesearches.TWITTERFAVOURITESEARCHES");
					startActivity(openNextActivity);
				}
			} // End run method
		}; // End Thread definition
		
		timer.start();
	} // End onCreate method

	@Override
	protected void onPause() {
		
		super.onPause();
		
		finish();
	} // End onPause method
} // End Splashscreen Activity
