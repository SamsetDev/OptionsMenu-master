package com.samset.optionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.option_menu_home:
                // TODO Something when menu item selected
                return true;

            case R.id.option_menu_add:
                // TODO Something when menu item selected
                return true;

            case R.id.option_menu_delete:
                // TODO Something when menu item selected
                return true;
            case R.id.option_menu_update:
                // TODO Something when menu item selected
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
