package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class WeatherActivity extends AppCompatActivity {
    private final static String TAG = "WeatherActivity";
//    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        Log.i(TAG, "on create...");

        PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "on start...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "on resume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "on pause...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "on stop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "on destroy...");
    }

    public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 3;
        //        private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
        public HomeFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public int getCount() {
            return PAGE_COUNT; // number of pages for a ViewPager
        }
        @Override
        public Fragment getItem(int page) {
// returns an instance of Fragment corresponding to the specified page
            switch (page) {
                case 0: return new WeatherAndForecastFragment();
                case 1: return new WeatherAndForecastFragment();
                case 2: return new WeatherAndForecastFragment();
            }
            return new Fragment();
        }
//        @Override
//        public CharSequence getPageTitle(int page) {
//// returns a tab title corresponding to the specified page
//            return titles[page];
//        }
    }
}
