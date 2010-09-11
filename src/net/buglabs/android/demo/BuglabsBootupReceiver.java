package net.buglabs.android.demo;

import android.app.KeyguardManager;
import android.app.KeyguardManager.OnKeyguardExitResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Contacts.People;
import android.util.Log;

public class BuglabsBootupReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.e("XXXXXXXXXXXXXXXXXXX", "boooooooooooooot completed");
	      Log.d("receiver", "onClick: starting srvice");
	      context.startService(new Intent(context, BuglabsDemoService.class));
	      

	      try {
	    	   Intent intent2 = new Intent(context, net.buglabs.android.demo.BuglabsDemoActivity.class);
	    	   intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//	    	   intent2.setData(Uri.parse("tel:+436641234567"));
	    	   context.startActivity(intent2);
	    	   
	    	} catch (Exception e) {
	    	   Log.e("FAILED", "Failed to invoke call :(", e);
	    	}
	    	
	
	}

}
