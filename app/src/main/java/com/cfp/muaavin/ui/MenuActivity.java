package com.cfp.muaavin.ui;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import com.cfp.muaavin.R;
import com.cfp.muaavin.BusinessLogic.Admin;
import com.cfp.muaavin.helper.DialogBoxHelper;


public class MenuActivity extends ActionBarActivity {
    //169.254.68.212
    Admin admin = new Admin();
    Context context;
    String[] group = {"A", "B", "C","All"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        context = this;


    }

    public void blockUser(View view)
    {
        admin.blockUser(context);
    }

    public void deletePost(View view)
    {
        DialogBoxHelper.showDialogBox(admin,  context, group);
    }


    public void viewReportedUser(View view) throws Exception
    {
        admin.viewReportedUser(context);
    }



}

