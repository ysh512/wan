package com.wanbang.life;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MainpageFragment extends Fragment implements OnClickListener{

	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.activity_main, container,false);
		btn1 = (Button)v.findViewById(R.id.btn_1);
		btn2 = (Button)v.findViewById(R.id.btn_2);
		btn3 = (Button)v.findViewById(R.id.btn_3);
		btn4 = (Button)v.findViewById(R.id.btn_4);
		btn5 = (Button)v.findViewById(R.id.btn_5);
		btn6 = (Button)v.findViewById(R.id.btn_6);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		
		return v;
	}
	
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.btn_1:
//			Intent it = new Intent();
//			it.setClass(MainpageFragment.this.getActivity(), DisplayResult.class);
//			startActivity(it);
			((Container)MainpageFragment.this.getActivity()).showResult("保姆");
			break;
		case R.id.btn_2:
			((Container)MainpageFragment.this.getActivity()).showResult("保洁");
			break;
		case R.id.btn_3:
			((Container)MainpageFragment.this.getActivity()).showResult("月嫂");
			break;
		case R.id.btn_4:
			((Container)MainpageFragment.this.getActivity()).showResult("钟点工");
			break;
		case R.id.btn_5:
			((Container)MainpageFragment.this.getActivity()).showResult("搬家");
			break;
		case R.id.btn_6:
			((Container)MainpageFragment.this.getActivity()).showResult("管道疏通");
			break;
		}
	}

	
}
