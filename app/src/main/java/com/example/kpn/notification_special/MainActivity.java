package com.example.kpn.notification_special;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CharSequence contenttext="Hey i am watching videos on Notification"+"It is amazing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void normal(View view)
    {

        //BUILDING THE NORMAL NOTIFICATION
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this);
        builder.setContentText(contenttext);
        builder.setTicker("This is the ticker!!!!");
        builder.setAutoCancel(true);
        builder.setContentTitle("Special Activity Normal Notification");
        builder.setSmallIcon(R.mipmap.ic_launcher_round);

        //SPECIAL ACTIVITY NOTIFICATION
        Intent i = new Intent(this,Activity_B.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pi=PendingIntent.getActivity(getApplicationContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);

        //ADDED SETTINGS ACTION BUTTON - SPECIAL ACTIVITY
        Intent j=new Intent(this,settings.class);
        j.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pi_settings=PendingIntent.getActivity(this,0,j,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.addAction(R.drawable.settings,"Settings",pi_settings);

        //ADDED ACTION BUTTON HELP - REGULAR ACTIVITY
        Intent k=new Intent(this,help.class);
        TaskStackBuilder stackbuilder=TaskStackBuilder.create(this);
        stackbuilder.addParentStack(help.class);
        stackbuilder.addNextIntent(k);
        PendingIntent pi_help=stackbuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.addAction(R.drawable.help,"Help",pi_help);

        //ISSUE THE NOTIFICATION USING NOTIFICATION MANAGER
        NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(1,builder.build());

    }

    public void bigtext(View view)
    {

        //SET STYLE FOR BIGTEXT
        NotificationCompat.BigTextStyle style=new NotificationCompat.BigTextStyle();
        style.setBigContentTitle("Special Activity BigText Notification");
        style.setSummaryText("Summary Text");
        style.bigText(contenttext);

        //BUILDING THE BIGTEXT NOTIFICATION
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this);
        builder.setContentText(contenttext);
        builder.setTicker("This is the ticker!!!!");
        builder.setAutoCancel(true);
        builder.setContentTitle("Special Activity BigText Notification");
        builder.setSmallIcon(R.mipmap.ic_launcher_round);
        builder.setStyle(style);


        //SPECIAL ACTIVITY NOTIFICATION
        Intent i = new Intent(this,Activity_B.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pi=PendingIntent.getActivity(getApplicationContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);

        //ADDED SETTINGS ACTION BUTTON - SPECIAL ACTIVITY
        Intent j=new Intent(this,settings.class);
        j.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pi_settings=PendingIntent.getActivity(this,0,j,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.addAction(R.drawable.settings,"Settings",pi_settings);

        //ADDED ACTION BUTTON HELP - REGULAR ACTIVITY
        Intent k=new Intent(this,help.class);
        TaskStackBuilder stackbuilder=TaskStackBuilder.create(this);
        stackbuilder.addParentStack(help.class);
        stackbuilder.addNextIntent(k);
        PendingIntent pi_help=stackbuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.addAction(R.drawable.help,"Help",pi_help);

        //ISSUE THE NOTIFICATION USING NOTIFICATION MANAGER
        NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(2,builder.build());


    }

    public void bigpicture(View view)
    {

        //SET STYLE FOR BIGPICTURE
        NotificationCompat.BigPictureStyle style=new NotificationCompat.BigPictureStyle();
        style.setBigContentTitle("Special Activity BigPicture Notification");
        style.setSummaryText("Special Activity BigPicture Notification");
        Bitmap bmp = BitmapFactory.decodeResource(this.getResources(),R.drawable.football);
        style.bigPicture(bmp);

        //BUILDING THE BIGPICTURE NOTIFICATION
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this);
        builder.setContentText(contenttext);
        builder.setTicker("This is the ticker!!!!");
        builder.setAutoCancel(true);
        builder.setContentTitle("Special Activity BigPicture Notification");
        builder.setSmallIcon(R.mipmap.ic_launcher_round);
        builder.setStyle(style);


        //SPECIAL ACTIVITY NOTIFICATION
        Intent i = new Intent(this,Activity_B.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pi=PendingIntent.getActivity(getApplicationContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);

        //ADDED SETTINGS ACTION BUTTON - SPECIAL ACTIVITY
        Intent j=new Intent(this,settings.class);
        j.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pi_settings=PendingIntent.getActivity(this,0,j,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.addAction(R.drawable.settings,"Settings",pi_settings);

        //ADDED ACTION BUTTON HELP - REGULAR ACTIVITY
        Intent k=new Intent(this,help.class);
        TaskStackBuilder stackbuilder=TaskStackBuilder.create(this);
        stackbuilder.addParentStack(help.class);
        stackbuilder.addNextIntent(k);
        PendingIntent pi_help=stackbuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.addAction(R.drawable.help,"Help",pi_help);

        //ISSUE THE NOTIFICATION USING NOTIFICATION MANAGER
        NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(3,builder.build());

    }

    public void inbox(View view)
    {
        //SET STYLE FOR INBOX
        NotificationCompat.InboxStyle style=new NotificationCompat.InboxStyle();
        style.setBigContentTitle("Inbox Special Notification");
        style.setSummaryText("Inbox");
        style.addLine("Line one");
        style.addLine("Line two");

        //BUILDING THE INBOX NOTIFICATION
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this);
        builder.setContentText(contenttext);
        builder.setTicker("This is the ticker!!!!");
        builder.setAutoCancel(true);
        builder.setContentTitle("Special Activity Inbox Notification");
        builder.setSmallIcon(R.mipmap.ic_launcher_round);
        builder.setStyle(style);

        //SPECIAL ACTIVITY NOTIFICATION
        Intent i = new Intent(this,Activity_B.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pi=PendingIntent.getActivity(getApplicationContext(),0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);

        //ADDED SETTINGS ACTION BUTTON - SPECIAL ACTIVITY
        Intent j=new Intent(this,settings.class);
        j.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pi_settings=PendingIntent.getActivity(this,0,j,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.addAction(R.drawable.settings,"Settings",pi_settings);

        //ADDED ACTION BUTTON HELP - REGULAR ACTIVITY
        Intent k=new Intent(this,help.class);
        TaskStackBuilder stackbuilder=TaskStackBuilder.create(this);
        stackbuilder.addParentStack(help.class);
        stackbuilder.addNextIntent(k);
        PendingIntent pi_help=stackbuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.addAction(R.drawable.help,"Help",pi_help);

        //ISSUE THE NOTIFICATION USING NOTIFICATION MANAGER
        NotificationManager nm=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(4,builder.build());
    }


}
