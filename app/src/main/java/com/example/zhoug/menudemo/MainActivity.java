package com.example.zhoug.menudemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"搜索").setIntent(new Intent(MainActivity.this,NewActivity.class)).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        //子菜单设图标无效
        SubMenu subMenu =  menu.addSubMenu(0,1,0,"更多");
        subMenu.add(0,1,2,"设置").setIntent(new Intent(MainActivity.this,NewActivity.class));
        subMenu.add(0,2,1,"意见反馈").setIcon(R.drawable.ic_action_more);
        subMenu.getItem()
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return super.onCreateOptionsMenu(menu);
    }
}
