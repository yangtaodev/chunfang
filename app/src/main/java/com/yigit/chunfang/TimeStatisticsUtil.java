package com.yigit.chunfang;

import android.util.Log;

/**
 * Created by yangtao
 * on 2020-12-06
 */
public final class TimeStatisticsUtil {

    public void getTime() {
        long beforeTime = System.nanoTime();
        Log.d("TAG", "getTime: ------>" + (System.nanoTime() - beforeTime));
    }
}
