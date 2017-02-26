package com.cfp.muaavin.helper;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/**
 *
 */
public class UrlHelper {



    public static void showUserProfileOnBrowser(String url, Context context)
    {
        try
        {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
        }
        catch (PackageManager.NameNotFoundException e)
        {
            e.printStackTrace();
        }
        Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        context.startActivity(facebookIntent);
    }
}
