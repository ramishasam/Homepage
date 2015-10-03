package com.ojm.homepage;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
	Button signout;
	TextView message;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		signout=(Button) findViewById(R.id.logoutbutton);
		message=(TextView) findViewById(R.id.welcometextView);
		signout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent1=new Intent(SecondActivity.this,MainActivity.class);
				startActivity(intent1);

			}
		});
		
		Intent intent=getIntent();
		Bundle b1=intent.getExtras();
		
		
	}
	
	

}
