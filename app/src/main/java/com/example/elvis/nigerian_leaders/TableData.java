package com.example.elvis.nigerian_leaders;

import android.provider.BaseColumns;

/**
 * Created by elvis on 6/12/2015.
 */
public class TableData {
    public TableData()
    {

    }
    public static abstract class TableInfo implements BaseColumns {
        public static final String ARTICLE= "article";
        public  static final String DATABASE_NAME="Nigerian_leaders";
        public static final String TABLE_NAME="leader";
    }
}
