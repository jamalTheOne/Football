package com.youlearnenglish.footballstickmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TeamMembersActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_team_members);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.team_members, menu);
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

	View chosenItem = null;

	public void editPlayer(View view) {
		chosenItem = view;
		startActivity(new Intent(TeamMembersActivity.this,
				MemberEditorDialog.class));
	}

	public void enter(View view) {

		startActivity(new Intent(TeamMembersActivity.this, MainActivity.class));
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		if (chosenItem != null) {
			chosenItem.setBackgroundDrawable(getResources().getDrawable(
					R.drawable.avatar));
		}
	}
}
