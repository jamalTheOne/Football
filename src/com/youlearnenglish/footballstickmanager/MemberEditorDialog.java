package com.youlearnenglish.footballstickmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MemberEditorDialog extends Activity {
	private SeekBar sbMemberPower;
	private TextView tvMemberPower, tvMemberCoins;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_member_editor_dialog);
		initViews();
		initListeners();

	}

	private void initListeners() {
		sbMemberPower.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				tvMemberPower.setText(" " + progress + " ");
				tvMemberCoins.setText(" " + (100 - progress) + " ");
			}
		});
	}

	private void initViews() {
		sbMemberPower = (SeekBar) findViewById(R.id.sbMemberPower);
		tvMemberPower = (TextView) findViewById(R.id.tvMemberPower);
		tvMemberCoins = (TextView) findViewById(R.id.tvMemberCoins);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.member_editor_dialog, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void cancel(View view) {
		finish();
	}

	public void save(View view) {
		finish();
	}
}
