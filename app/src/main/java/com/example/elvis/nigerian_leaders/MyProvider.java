package com.example.elvis.nigerian_leaders;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/**
 * Created by elvis on 6/22/2015.
 */
public class MyProvider extends ContentProvider{
    private static UriMatcher matcher;
    String[] projection2;
    Uri uri;
    Cursor cursor2;

    @Override
    public boolean onCreate() {
        matcher = new UriMatcher(5);
        matcher.addURI("content://elvis.prvider",TableData.TableInfo.TABLE_NAME,5);
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings2, String s2) {
        this.projection2 = strings;
        this.uri = uri;
        DatabaseOperations db = new DatabaseOperations(getContext());
        SQLiteDatabase database = db.getReadableDatabase();

        cursor2 = database.query(true,TableData.TableInfo.TABLE_NAME,projection2,null,null,null,null,null,null);
        return cursor2;
    }


    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
