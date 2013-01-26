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
	
	private void refreshButtons(Object object) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
