package com.ozellistview;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterSinif extends BaseAdapter {
	LayoutInflater inflater;
	List<Kisi> list;

	public AdapterSinif(final Activity activity, final List<Kisi> kisiler) {
		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		list = kisiler;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Kisi getItem(final int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(final int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(final int position, final View convertView,
			final ViewGroup parent) {
		// TODO Auto-generated method stub
		final View satirView;
		satirView = inflater.inflate(R.layout.satir_layout, null);
		final Kisi kisi = list.get(position);

		final TextView txtName = (TextView) satirView
				.findViewById(R.id.textView1);

		final ImageView imageKisi = (ImageView) satirView
				.findViewById(R.id.imageView1);

		txtName.setText(kisi.getName());

		if (kisi.isKadinMi()) {
			imageKisi.setImageResource(R.drawable.female);
		} else {
			imageKisi.setImageResource(R.drawable.male);
		}
		return satirView;
	}
}
