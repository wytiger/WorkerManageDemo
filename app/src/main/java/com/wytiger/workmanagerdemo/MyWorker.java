package com.wytiger.workmanagerdemo;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;


/**
 * description ：
 * author : wuyong_cd
 * date : 2020/1/15 0015
 */
public class MyWorker extends Worker {
    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.d("MyWorker", "干活...");
        return Result.success();
    }
}
