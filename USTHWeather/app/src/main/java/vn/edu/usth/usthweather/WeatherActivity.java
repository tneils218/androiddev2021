package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "on pause...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "");
    }
    @Override
    protected void onStop () {
        super.onStop();
        Log.i(TAG, "");
    }
    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.i(TAG, "");
    }
}