package com.arandevs.wallvi.utils;

import static com.arandevs.wallvi.utils.Constant.PAGER_NUMBER;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.arandevs.wallvi.fragments.FragmentCategory;
import com.arandevs.wallvi.fragments.FragmentFavorite;
import com.arandevs.wallvi.fragments.FragmentWallpaper;

@SuppressWarnings("ALL")
public class NavigationAdapter {

    public static class BottomNavigationAdapter extends FragmentPagerAdapter {

        public BottomNavigationAdapter(FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new FragmentWallpaper();
                case 1:
                    return new FragmentCategory();
                case 2:
                    return new FragmentFavorite();
            }
            return null;
        }

        @Override
        public int getCount() {
            return PAGER_NUMBER;
        }

    }

}
