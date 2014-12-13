package com.satsang.ananta;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class CustomGridAdapter extends BaseAdapter {

	private Context context;

	public CustomGridAdapter(Context ctx){
		context =ctx;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		 ImageView picturesView;
//         if (convertView == null) {
             picturesView = new ImageView(context);

//              if(list.get(position).contains(".jpg"))
//             {
//                  bitmap = BitmapFactory.decodeFile(list.get(position)); //Creation of Thumbnail of image
//             }
//             else if(list.get(position).contains(".mp4"))
//             {
//                 bitmap = ThumbnailUtils.createVideoThumbnail(list.get(position), 0); //Creation of Thumbnail of video
//             }
//             picturesView.setScaleType(ImageView.ScaleType.FIT_CENTER);
//             picturesView.setPadding(8, 8, 8, 8);
//             picturesView.setLayoutParams(new GridView.LayoutParams(100, 100));
//         }
//         else 
//         {
//             picturesView = (ImageView)convertView;
//         }
         return picturesView;
//     }
	}
	 private String[] mThumbIds = {
			 "http://www.youtube.com/watch?v=pPvyzXaFWJM&list=PL4We4XGulWzBjyRnqq0-j73pxnzQzxbhi"
	    };

}
