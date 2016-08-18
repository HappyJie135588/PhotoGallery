package com.huangjie.photogallery;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhotoCalleryActivity extends SingleFragmentActivity {
    @Override
    protected Fragment creatFragment() {
        return PhotoCalleryFragment.newInstance();
    }
}
