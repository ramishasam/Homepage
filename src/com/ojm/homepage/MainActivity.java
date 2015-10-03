package com.ojm.homepage;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button loginbutton,signup;
	String setusername="user";
	String setpassword="123";
	String entusername;
	String entpassword;
	EditText password;
	EditText username;
	
	  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       
    	username = (EditText) findViewById(R.id.usernameeditText);
		password = (EditText) findViewById(R.id.passwordeditText);
		loginbutton=(Button) findViewById(R.id.loginbutton);
		signup=(Button) findViewById(R.id.signupbutton);
		signup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				username.setText("");
				password.setText("");
			}
		});
		
		loginbutton.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View arg0) {
				
				entusername=username.getText().toString();
				entpassword=password.getText().toString();
				
				
				if(username.length()==0 && password.length()==0)
				{
					Toast.makeText(MainActivity.this,"Please Enter Username and Password",Toast.LENGTH_SHORT).show();
				}
				else if(username.length()>0 && password.length()==0)
				{
					Toast.makeText(MainActivity.this,"Please Enter Password",Toast.LENGTH_SHORT).show();
				}

				else if(username.length()==0 && password.length()>0)
				{
					Toast.makeText(MainActivity.this,"Please Enter Username",Toast.LENGTH_SHORT).show();
				}
				else if(entusername.equals(setusername)&& entpassword.equals(setpassword))
				{
					Toast.makeText(MainActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
					Intent intent=new Intent(MainActivity.this,SecondActivity.class);
					startActivity(intent);

				}
				else
				{
					Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();

				}
				
			}

			Intent intent1=getIntent();
			Bundle b=intent1.getExtras();
			
			
		});

     

        
    }


    
}
