package com.wanbang.life;



import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Container extends FragmentActivity {

	private AccountFragment accountFragment;
	private MainpageFragment mainpageFragment;
	private Button btn_main;
	private Button btn_indi;
	private Button btn_more;
	
	
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
//		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.setContentView(R.layout.container);
		btn_main = (Button)findViewById(R.id.btn_main);
		btn_indi = (Button)findViewById(R.id.btn_indi);
		btn_more = (Button)findViewById(R.id.btn_more);
		
		btn_main.setOnClickListener(fragmentClick);
		btn_indi.setOnClickListener(fragmentClick);
		btn_more.setOnClickListener(fragmentClick);
		
		mainpageFragment = new MainpageFragment();
		FragmentManager fm = this.getSupportFragmentManager();
		FragmentTransaction ft= fm.beginTransaction();
		ft.add(R.id.fragment,mainpageFragment,"MainPage");
		ft.commit();
		
	}

	private View.OnClickListener fragmentClick = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			FragmentManager fm = Container.this.getSupportFragmentManager();
//			FragmentManager fm = getFragmentManager();
			// ¿ªÆôÊÂÎñ
			FragmentTransaction ft = fm.beginTransaction();
			
			switch(v.getId())
			{
			case R.id.btn_indi:
				if(accountFragment==null)
				{
					accountFragment = new AccountFragment();
				}
				ft.replace(R.id.fragment, accountFragment);
				ft.addToBackStack(null);
				ft.commit();
				break;
			case R.id.btn_main:
				ft.replace(R.id.fragment, mainpageFragment);
				ft.commit();
			}
		}
	};
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	
	
}
