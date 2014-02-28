package com.lello.orario;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;  
import android.view.View;  
import android.view.View.OnClickListener;  
import android.widget.Button;  
import android.content.Intent;  

public class MainActivity extends Activity {

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 Button btnHome=(Button)findViewById(R.id.button1);  
	        btnHome.setOnClickListener(new View.OnClickListener(){  
	                    @Override  
	                    public void onClick(View arg0) {  
	                    	Intent openPage1 = new Intent(MainActivity.this,Pagina1.class);
	                        startActivity(openPage1);  
	                    }  
	                });  
	    } 

    public class Page1 extends Activity {
    	protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_orario);
    	}
    }
    	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}