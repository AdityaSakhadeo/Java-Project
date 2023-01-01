package com.example.loginpage;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class loadingScreen {
    public Activity activity;
    public AlertDialog dialog;

    public loadingScreen(Activity myActivity) {
        activity = myActivity;
    }

    void startLoadingScreen()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.loadingscreen,null));
        builder.setCancelable(true);

        dialog = builder.create();
        dialog.show();
    }

    void dismisDialog()
    {
        dialog.dismiss();
    }
}
