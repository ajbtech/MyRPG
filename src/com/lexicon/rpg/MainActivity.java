package com.lexicon.rpg;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
//
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Initialize all of the buttons on the main screen.
		final Button CombatButton = (Button) findViewById(R.id.buttonCombat);
		final Button InventoryButton = (Button) findViewById(R.id.buttonInventory);
		final Button MerchantButton = (Button) findViewById(R.id.buttonMerchant);
		
		//Set the CombatButton to bring you to the combat screen.
		 CombatButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
	            	startActivity(new Intent(MainActivity.this, CombatActivity.class));
				}
			});
		 
		 //Set the InventoryButton to bring you to the inventory screen.
		 InventoryButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
	            	startActivity(new Intent(MainActivity.this, InventoryActivity.class));
				}
			});
		 
		 //Set the Merchant button to bring you to the merchant screen.
		 MerchantButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
	            	startActivity(new Intent(MainActivity.this, MerchantActivity.class));
				}
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
