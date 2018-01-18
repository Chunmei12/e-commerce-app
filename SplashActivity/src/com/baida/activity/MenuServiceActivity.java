package com.baida.activity;

import com.baida.adapter.MenuViewAdapter;
import com.baida.swipeback.SwipeBackActivity;
import com.baida.widget.MyGridView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class MenuServiceActivity extends SwipeBackActivity {

	private MyGridView menu_service_gridview;
	private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_service);
		menu_service_gridview = (MyGridView) findViewById(R.id.menu_service_gridview);
		int[] images = new int[] { R.drawable.t5, R.drawable.t6, R.drawable.t7,
				R.drawable.t8
			};
		menu_service_gridview.setAdapter(new MenuViewAdapter(this, images));
		menu_service_gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				switch (arg2) {
				case 0:
					intent = new Intent();
					intent.setClass(MenuServiceActivity.this,
							ProductListActivity.class);
					intent.putExtra("position", arg2 + 60);
					startActivity(intent);
					break;
				case 1:
					intent = new Intent();
					intent.setClass(MenuServiceActivity.this,
							ProductListActivity.class);
					intent.putExtra("position", arg2 + 60);
					startActivity(intent);
					break;
				case 2:
					intent = new Intent();
					intent.setClass(MenuServiceActivity.this,
							ProductListActivity.class);
					intent.putExtra("position", arg2 + 60);
					startActivity(intent);
					break;
				case 3:
					intent = new Intent();
					intent.setClass(MenuServiceActivity.this,
							ProductListActivity.class);
					intent.putExtra("position", arg2 + 60);
					startActivity(intent);
					break;
			
			
				default:
					break;
				}

			}
		});
	}

}
