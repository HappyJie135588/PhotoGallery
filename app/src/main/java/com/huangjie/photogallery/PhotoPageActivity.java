package com.huangjie.photogallery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;

/**
 * Created by 黄杰 on 2016/8/31.
 */
public class PhotoPageActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context, Uri photoPageUri){
        Intent i = new Intent(context,PhotoPageActivity.class);
        i.setData(photoPageUri);
        return i;
    }

    @Override
    protected Fragment creatFragment() {
        return PhotoPageFragment.newInstance(getIntent().getData());
    }
}
