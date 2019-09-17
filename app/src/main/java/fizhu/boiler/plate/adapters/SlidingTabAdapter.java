package fizhu.boiler.plate.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import fizhu.boiler.plate.fragments.AlphaFragment;
import fizhu.boiler.plate.fragments.BetaFragment;
import fizhu.boiler.plate.fragments.CharlieFragment;
import fizhu.boiler.plate.fragments.DeltaFragment;

/**
 * Created by fizhu on 12,September,2019
 */
public class SlidingTabAdapter extends FragmentPagerAdapter {
    public SlidingTabAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //TODO 1 atur sesuai masing masing posisi fragment , dimulai dari 0

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new AlphaFragment();
        }if(position==1){
            return new BetaFragment();
        }if(position==2){
            return new CharlieFragment();
        }else{
            return new DeltaFragment();
        }
    }

    //TODO 2 atur sesuai banyak nya fragment yang digunakan dalam sliding tab

    @Override
    public int getCount() {
        return 4;
    }
}
