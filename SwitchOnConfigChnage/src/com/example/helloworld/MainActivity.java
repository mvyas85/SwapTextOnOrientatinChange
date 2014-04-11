//MainActivity.java
//GlobalVarClass.java
package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.view.KeyEvent;

public class MainActivity extends Activity {

    GlobalVarClass globalVariables ;
    EditText editor1,editor2;
    String globalVar1,globalVar2;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        globalVariables = (GlobalVarClass) getApplication();
        editor1 = (EditText)findViewById(R.id.editText1);
        editor2 = (EditText)findViewById(R.id.editText2);
     
        editor1.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                    if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER)
                    {
                        String temp1 = editor1.getText().toString();
                        String temp2 = editor2.getText().toString();
                        globalVariables.setGlobalVariable1(temp1);
                        globalVariables.setGlobalVariable2(temp2);
                    }
                return false;
            }
        });        
	}
	
	@Override
    public  void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);

        String temp1 = globalVariables.getGlobalVariable2();
        String temp2 = globalVariables.getGlobalVariable1();
         editor1.setText(temp1);
         editor2.setText(temp2);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
