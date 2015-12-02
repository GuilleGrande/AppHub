package com.example.guillermo.apphub;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button btn_toSpotifyStreamerApp, btn_toScoresApp, btn_toLibraryApp, btn_toBuildItBiggerApp, btn_toXYZReaderApp, btn_toCapstoneMyApp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_toSpotifyStreamerApp = (Button) findViewById(R.id.btn_toSpotifyStreamerApp);
        btn_toScoresApp = (Button) findViewById(R.id.btn_toScoresApp);
        btn_toLibraryApp = (Button) findViewById(R.id.btn_toLibraryApp);
        btn_toBuildItBiggerApp = (Button) findViewById(R.id.btn_toBuildItBiggerApp);
        btn_toXYZReaderApp = (Button) findViewById(R.id.btn_toXYZReaderApp);
        btn_toCapstoneMyApp = (Button) findViewById(R.id.btn_toCapstoneMyApp);

        btn_toSpotifyStreamerApp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"This button will take you to the Spotify Streamer App", Toast.LENGTH_SHORT).show();
            }
        });

        btn_toScoresApp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"This button will take you to the Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        btn_toLibraryApp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"This button will take you to the Library App", Toast.LENGTH_SHORT).show();
            }
        });

        btn_toBuildItBiggerApp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"This button will take you to the Build It Bigger App", Toast.LENGTH_SHORT).show();
            }
        });

        btn_toXYZReaderApp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"This button will take you to the XYZ Reader App", Toast.LENGTH_SHORT).show();
            }
        });

        btn_toCapstoneMyApp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(),"This button will take you to the My Own App", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
