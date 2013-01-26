package net.lukegjpotter.app.twitterfavouritesearches;

/**
 * TwitterFavouriteSearches.java
 * 
 * @author Luke Potter
 * 
 * GitHub lukegjpotter
 * Twitter @lukegjpotter
 * 
 * This activity stores Twitter search queries
 * and tags for easily opening them in a browser.
 */

import java.util.Arrays;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;


public class TwitterFavouriteSearches extends Activity {

	private SharedPreferences savedSearches; // The Users's favourite searches
	private TableLayout queryTableLayout;    // Shows the search buttons
	private EditText queryEditText;          // Where the user enters queries
	private EditText tagEditText;            // Where the user enters a query's tag
	private Button saveButton;               // Button to save the tag & search value
	private Button clearTagsButton;          // Buttons to clear the saved tags and searches
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_twitter_favourite_searches);
		
		initaliseVariables();
		
		refreshButtons(null);
	}

	/**
	 * A method to initalise all the widget variable
	 */
	private void initaliseVariables() {
		
		// Get the SharedPreferences that contains the user's saved searches
		savedSearches = getSharedPreferences("searches", MODE_PRIVATE);
		
		// Get a reference to the queryTableLayout
		queryTableLayout = (TableLayout) findViewById(R.id.queryTableLayout);
		
		// Get references to the two EditText
		queryEditText = (EditText) findViewById(R.id.queryEditText);
		tagEditText   = (EditText) findViewById(R.id.tagEditText);
		
		// Get references to the Buttons and set up listeners
		saveButton = (Button) findViewById(R.id.saveButton);
		saveButton.setOnClickListener(saveButtonListener);
		
		clearTagsButton = (Button) findViewById(R.id.clearTags);
		clearTagsButton.setOnClickListener(clearTagsButtonListener);
	}
	
	/**
	 * Recreate search tag and edit Buttons for all saved searches.
	 * Pass null to create all the tag and edit Buttons.
	 * 
	 * @param newTag
	 */
	private void refreshButtons(String newTag) {
		
		// Store saved tags in the tags array.
		String[] tags = savedSearches.getAll().keySet().toArray(new String[0]);
		Arrays.sort(tags, String.CASE_INSENSITIVE_ORDER); // Sort by tag
		
		// If a new tag was added, insert in GUI at the appropriate location.
		if (newTag != null) {
			
			makeTagGUI(newTag, Arrays.binarySearch(tags, newTag));
		}
		else { // Display GUI for all tags
			
			// Display all saved searches
			for (int i = 0; i < tags.length; ++i)
				makeTagGUI(tags[i], i);
		}
	}

	/**
	 * Add new search to the save file, then refresh all Buttons
	 * 
	 * @param query
	 * @param tag
	 */
	private void makeTag(String query, String tag) {
		
		// OriginalQuery sill be null if we're modifying an existing search
		String originalQuery = savedSearches.getString(tag, null);
		
		// Get a SharedPreferences.Editor to store new tag/query pair
		SharedPreferences.Editor prefsEditor = savedSearches.edit();
		prefsEditor.putString(tag, query); // Store the current search
		prefsEditor.apply(); // Store the updated preferences
		
		// If this is a new query, add its GUI
		if (originalQuery == null) {
			
			refreshButtons(tag); // Adds a new button for this tag
		}
	}
	
	/**
	 * Add a new Tag Button and corresponding edit Button to the GUI
	 * 
	 * @param tag
	 * @param index
	 */
	private void makeTagGUI(String tag, int index) {
		// TODO Auto-generated method stub
		
	}

	

	// ---------------- OnClickListeners ----------------
	private OnClickListener saveButtonListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
	};
	
	private OnClickListener clearTagsButtonListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
	};
}
