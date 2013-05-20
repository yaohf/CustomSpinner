package com.custom;



import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.custom.CustomSinnper.OnItemSeletedListener;

public class MainActivity extends Activity {

	Button btn;
	EditText text;

	CustomSinnper spinner;

	String[] strs = new String[] { "中国", "美国", "法国", "德国", "俄罗斯" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spinner = (CustomSinnper) findViewById(R.id.custom_sinnper);
		spinner.setText("--选择下拉类型--");
//		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
//		
//		spinner.setDrawable(new BitmapDrawable(bitmap));
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.select_dialog_item, strs);
		spinner.setAdapter(adapter);
		spinner.setOnItemSeletedListener(new OnItemSeletedListener() {

			@Override
			public void onItemSeleted(AdapterView<?> parent, View view,
					int position, long id) {
				Object obj = parent.getItemAtPosition(position);
				Log.i("mainActivity onitemseleted", obj + "");

			}
		});
		//

	}

}
