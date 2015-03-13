package com.wanbang.life;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class DisplayResult extends Activity{

	private static final String TAG = "DisplayResult";
	private LayoutInflater inflater;
	private ListView lv;
	private TextView tv_title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.display);
		tv_title = (TextView)findViewById(R.id.tv_title);
		Intent it = this.getIntent();
		String title = it.getStringExtra("title");
		tv_title.setText(title);
		inflater = this.getLayoutInflater();
		lv = (ListView)findViewById(R.id.listView1);
		DisAdapter adapter = new DisAdapter();
		lv.setAdapter(adapter);
		Log.d(TAG,"onCreate");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d(TAG,"onStart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d(TAG,"onResume");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d(TAG,"onPause");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d(TAG,"onStop");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d(TAG,"onDestory");
	}
	
	class DisAdapter extends BaseAdapter
	{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 10;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			ViewHolder holder = null;
			if(convertView == null)
			{
				holder = new ViewHolder();
				convertView = inflater.inflate(R.layout.item_display, parent,false);
				holder.btn_logo = (Button)convertView.findViewById(R.id.btn_logo);
				holder.tv_name = (TextView)convertView.findViewById(R.id.tv_name);
				holder.tv_des = (TextView)convertView.findViewById(R.id.tv_des);
				holder.btn_forward = (Button)convertView.findViewById(R.id.btn_forward);
				
			}
			else
			{
				holder = (ViewHolder) convertView.getTag();
			}
			holder.btn_logo.setBackgroundResource(R.drawable.jiazheng1);
			holder.tv_name.setText("万邦家政");
			
			convertView.setTag(holder);
			
			return convertView;
		}
		
		public class ViewHolder{
			public Button btn_logo;
			public TextView tv_name;
			public TextView tv_des;
			public Button btn_forward;
		}
		
	}
}
