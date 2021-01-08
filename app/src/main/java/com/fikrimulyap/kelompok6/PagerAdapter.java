package com.fikrimulyap.kelompok6;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);;
        this.numOfTabs = numOfTabs;
    }
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new SongsFragment();
            case 1 :
                return new FavoritesFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
