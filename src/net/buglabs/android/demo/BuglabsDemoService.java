package net.buglabs.android.demo;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class BuglabsDemoService extends Service {

	AlarmManager alarmManager = null;
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate()
	{
//		alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
//		Intent intent = new Intent(this, BuglabsDemoBroadcastReceiver.class);
//		
////		PendingIntent pendingIntent = PendingIntent.getBroadcast(context, REQUEST_CODE, intent, 0);
//
//		AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
//		alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (5 * 1000), null);
		Toast.makeText(this, "Alarm set", Toast.LENGTH_LONG).show();
	}

}
