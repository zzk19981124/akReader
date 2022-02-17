package com.example.akreader;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * create by ak on 2022/2/16
 * 初始界面——书架
 */
public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.book_list);
        //init(getApplicationContext());
    }

    /**
     *弹窗
     * @param context
     */
    public void init(Context context) {
        try {
            builder = new AlertDialog.Builder(context);
            builder.setTitle("提示：")
                    .setMessage("是否退出阅读器？")
                    .setPositiveButton("是", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("否", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}