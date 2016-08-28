package com.huangjie.photogallery;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhotoCalleryActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context){
        return new Intent(context, PhotoCalleryActivity.class);
    }

    @Override
    protected Fragment creatFragment() {
        return PhotoCalleryFragment.newInstance();
    }
}
