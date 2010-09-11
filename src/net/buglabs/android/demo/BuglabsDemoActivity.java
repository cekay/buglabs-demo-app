package net.buglabs.android.demo;


import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.app.KeyguardManager.OnKeyguardExitResult;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class BuglabsDemoActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        KeyguardManager manager = (KeyguardManager) this.getSystemService(Context.KEYGUARD_SERVICE);
        KeyguardLock keyguardLock = manager.newKeyguardLock("Keyguard_Lock_Test");
        keyguardLock.disableKeyguard();
	  
        TextView info = (TextView) findViewById(R.id.board);
        info.setText("Board " + Build.BOARD + "\n" +
        		"Brand " + Build.BRAND + "\n" +
        		"CPU ABI " + Build.CPU_ABI + "\n" +
        		"Device " + Build.DEVICE + "\n" +
        		"Display " + Build.DISPLAY + "\n" +
        		"Hardware " + Build.HARDWARE + "\n" +
        		"Build Host " + Build.HOST + "\n" +
        		"Build Id " + Build.ID + "\n"
        		);
    }
}
