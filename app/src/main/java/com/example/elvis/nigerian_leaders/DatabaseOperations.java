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
    public static final int database_version=13;
    public String CREATE_QUERY="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY1="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME1+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY2="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME2+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY3="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME3+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY4="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME4+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY5="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME5+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY6="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME6+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY7="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME7+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY8="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME8+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY9="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME9+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY10="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME10+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY11="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME11+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY12="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME12+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY13="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME13+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY14="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME14+"("+ TableData.TableInfo.ARTICLE+" TEXT);";
    public String CREATE_QUERY15="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME15+"("+ TableData.TableInfo.ARTICLE+" TEXT);";

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
    public Cursor getInformation1(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation2(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME2, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation3(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME3, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation4(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME4, columns, null, null, null, null, null);
        return  CR;
    }

    public Cursor getInformation5(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME5, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation6(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME6, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation7(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME7, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation8(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME8, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation9(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME9, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation10(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME10, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation11(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME11, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation12(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME12, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation13(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME13, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation14(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME14, columns, null, null, null, null, null);
        return  CR;
    }
    public Cursor getInformation15(DatabaseOperations dop){
        SQLiteDatabase SQ=dop.getReadableDatabase();
        String[] columns={TableData.TableInfo.ARTICLE};
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME15, columns, null, null, null, null, null);
        return  CR;
    }




    @Override
    public void onCreate(SQLiteDatabase sdb) {
        sdb.execSQL(CREATE_QUERY);
        sdb.execSQL(CREATE_QUERY1);
        sdb.execSQL(CREATE_QUERY2);
        sdb.execSQL(CREATE_QUERY3);
        sdb.execSQL(CREATE_QUERY4);
        sdb.execSQL(CREATE_QUERY5);
        sdb.execSQL(CREATE_QUERY6);
        sdb.execSQL(CREATE_QUERY7);
        sdb.execSQL(CREATE_QUERY8);
        sdb.execSQL(CREATE_QUERY9);
        sdb.execSQL(CREATE_QUERY10);
        sdb.execSQL(CREATE_QUERY11);
        sdb.execSQL(CREATE_QUERY12);
        sdb.execSQL(CREATE_QUERY13);
        sdb.execSQL(CREATE_QUERY14);
        sdb.execSQL(CREATE_QUERY15);
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
    public void putInfomation1(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME1, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation2(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME2, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation3(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME3, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation4(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME4, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation5(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME5, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation6(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME6, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation7(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME7, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation8(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME8, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation9(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME9, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation10(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME10, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation11(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME11, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation12(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME12, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation13(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME13, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation14(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME14, null, cv);
        Log.d("Database operation", "One row inserted");
    }
    public void putInfomation15(DatabaseOperations dop, String name){
        SQLiteDatabase SQ=dop.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(TableData.TableInfo.ARTICLE, name);
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME15, null, cv);
        Log.d("Database operation", "One row inserted");
    }

}
