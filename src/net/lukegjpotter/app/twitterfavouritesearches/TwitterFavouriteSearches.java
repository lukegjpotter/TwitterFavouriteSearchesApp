package net.lukegjpotter.app.twitterfavouritesearches;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TwitterFavouriteSearches extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_twitter_favourite_searches);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_twitter_favourite_searches,
				menu);
		return true;
	}

}