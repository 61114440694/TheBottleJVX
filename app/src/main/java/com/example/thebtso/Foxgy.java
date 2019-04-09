package com.example.thebtso;

import android.provider.BaseColumns;
import android.widget.TextView;

public class Foxgy implements BaseColumns {
    private TextView TV1 ;

    public TextView getTV1() {
        return TV1;
    }

    public void setTV1(TextView TV1) {
        this.TV1 = TV1;
    }
}
