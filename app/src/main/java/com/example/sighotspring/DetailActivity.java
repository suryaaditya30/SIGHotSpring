package com.example.sighotspring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    TextView data_nama,data_alamat,data_harga,data_jambuka, data_telepon, data_judul;
    Button btn_call;
    ImageView data_gambar;

    public static String id, nama, tlp, gambar, alamat, harga, jambuka, judul;
    public static  Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        data_judul = findViewById(R.id.tv_judul);
        data_nama = findViewById(R.id.tv_nama);
        data_alamat = findViewById(R.id.tv_alamat);
        data_harga = findViewById(R.id.tv_harga);
        data_jambuka = findViewById(R.id.tv_jambuka);
        data_telepon = findViewById(R.id.tv_telepon);
        btn_call = findViewById(R.id.btn_telepon);
        data_gambar = findViewById(R.id.img_data);

        data_judul.setText(judul);
        data_nama.setText(nama);
        data_alamat.setText(alamat);
        data_harga.setText(harga);
        data_jambuka.setText(jambuka);
        data_telepon.setText(tlp);
        Picasso.get().load(gambar).into(data_gambar);

        btn_call.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent telepon = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+tlp));
        startActivity(telepon);
    }
}
