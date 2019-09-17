package fizhu.boiler.plate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import fizhu.boiler.plate.adapters.SlidingTabAdapter;

public class MainActivity extends AppCompatActivity {


    TabLayout tabs;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1 cast view tab dan viewpager
        tabs = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);

        //TODO 2 set adapter sliding tab
        SlidingTabAdapter slidingTabAdapter = new SlidingTabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(slidingTabAdapter);


        //TODO 3 tambahkan seluruh tab yang ingin dibuat
        tabs.addTab(tabs.newTab().setText("ALPHA"));
        tabs.addTab(tabs.newTab().setText("BETA"));
        tabs.addTab(tabs.newTab().setText("CHARLIE"));
        tabs.addTab(tabs.newTab().setText("DELTA"));

        //TODO 4 buat view pager change listener dan tab selected listener
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                //TODO 5 atur agar ketika tab dipilih akan menyesuaikan posisi fragment
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }
}
