package com.cfp.muaavin.ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.cfp.muaavin.R;
import com.cfp.muaavin.BusinessLogic.User;
import com.cfp.muaavin.BusinessLogic.UserCustomAdapter;

import java.util.ArrayList;

public class UsersListView extends ActionBarActivity {

    ListView UsersListView ;
    ArrayList<User> users;
    String option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users_listview_layout);

        users = (ArrayList<User>) getIntent().getSerializableExtra("users");
        option = getIntent().getStringExtra("option");

        UsersListView=(ListView) findViewById(R.id.UsersListView);
        UserCustomAdapter c = new UserCustomAdapter( UsersListView.this, users , option);
        UsersListView.setAdapter(c);
    }


}
