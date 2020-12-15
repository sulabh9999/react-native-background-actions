// https://stackoverflow.com/a/41313003
package com.asterinet.react.bgactions;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.widget.Toast;
import android.util.Log;

public class NotificationAction extends BroadcastReceiver {

  @Override
  public void onReceive(Context context, Intent intent) {
      // Toast.makeText(context, "recieved", Toast.LENGTH_SHORT).show();
      String action=intent.getStringExtra("action");

      if(action.equals("action1")){
          performAction1(context);
      }
      else if(action.equals("action2")){
          performAction2(context);
      }
      //This is used to close the notification tray
      Intent it = new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
      context.sendBroadcast(it);
  }

  public void performAction1(Context context){
    Toast.makeText(context, "action 1 pressed", Toast.LENGTH_LONG).show();
  }
  
  public void performAction2(Context context){
    Toast.makeText(context, "action 2 pressed", Toast.LENGTH_LONG).show();
  }

}