package com.ozellistview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	List<Kisi> kisi = new ArrayList<Kisi>();
	ListView listView;
	AdapterSinif adapter;

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.listView);
		adapter = new AdapterSinif(this, kisi);
		kisiYukle();

		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(final AdapterView<?> adapterView,
					final View view, final int position, final long id) {
				// TODO Auto-generated method stub
				final Kisi newKisi = kisi.get(position);
				kisi.remove(position);
				kisi.add(0, newKisi);
				adapter.notifyDataSetChanged();
				Toast.makeText(getApplicationContext(),
						kisi.get(position).getInformation(), Toast.LENGTH_SHORT)
						.show();
			}
		});

	}

	private void kisiYukle() {
		kisi.add(new Kisi("Boy1", false));// erkek
		kisi.add(new Kisi("Boy2", false));
		kisi.add(new Kisi("Girl1", true));// bayan
		kisi.add(2, new Kisi("Girl2", true));
		kisi.add(3, new Kisi("Boy3", false));
		kisi.add(new Kisi("Girl3", true));
		kisi.add(new Kisi("Boy4", false));
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
