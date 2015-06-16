package com.example.elvis.nigerian_leaders;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.SyncStateContract;
import android.util.Log;

/**
 * Created by elvis on 6/12/2015.
 */
public class DatabaseOperations extends SQLiteOpenHelper {
    public static final int database_version=1;
    public String CREATE_QUERY="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME+"("+ TableData.TableInfo.ARTICLE+" TEXT);";

    public DatabaseOperations(Context context) {
        super(context, TableData.TableInfo.DATABASE_NAME, null, database_version);
        Log.d("Database operation", "Database created");
    }
    public Cursor getInformation(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME, columns, null, null, null, null, null);
        return  CR;
    }

    @Override
    public void onCreate(SQLiteDatabase sdb) {
        sdb.execSQL(CREATE_QUERY);
        Log.d("Database operation", "Table created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }
    public void putInfomation(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME, null, cv);
        Log.d("Database operation", "One row inserted");
    }
}
