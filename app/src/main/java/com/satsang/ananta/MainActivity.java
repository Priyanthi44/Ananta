package com.satsang.ananta;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.videoview);
       startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.youtube.com/watch?v=Hxy8BZGQ5Jo")));
//        VideoView vv = (VideoView) findViewById(R.id.videoView1);
//        String uri = "http://www.youtube.com/watch?v=pPvyzXaFWJM&list=PL4We4XGulWzBjyRnqq0-j73pxnzQzxbhi";
//        vv.setVideoURI(Uri.parse(uri));
//        vv.start();
//
//        vv.setOnCompletionListener(new OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                   finish();
//          }
//        });
//        GridView gridview = (GridView) findViewById(R.id.gridview);
//        gridview.setAdapter(new CustomGridAdapter(this));
//        gridview.setOnItemClickListener(new OnItemClickListener(){
//
//			@Override
//			public void onItemClick(AdapterView<?> parent, View v, int position,
//					long id) {
//				  Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
//				
//			}});
//        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
