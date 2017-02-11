package com.cfp.muaavin.helper;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.cfp.muaavin.BusinessLogic.Admin;

/**
 *
 */
public class DialogBoxHelper {

    public static void showDialogBox(final Admin admin,final Context context,final String[] group )
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Select Group");
        builder.setItems(group, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                String GroupName = group[index];
                try {   admin.deletePost(context, GroupName); }
                catch (Exception e) { e.printStackTrace(); }
            }
        });
        builder.show();
    }
}
