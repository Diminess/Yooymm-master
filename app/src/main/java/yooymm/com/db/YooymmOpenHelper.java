package yooymm.com.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class YooymmOpenHelper extends SQLiteOpenHelper {

	
	/**
	* Province表 建表语句
	*/
	public static final String CREATE_PROVINCE = "create table Province (id integer primary key autoincrement,province_name text,rovince_code text)";
	
	
	
	/**
	* City表 建表语句
	*/
	public static final String CREATE_CITY = "create table City (id integer primary key autoincrement,city_name text,city_code text,province_id integer)";
	
	
	/**
	* County表 建表语句
	*/
	public static final String CREATE_COUNTY = "create table County (id integer primary key autoincrement,county_name text,county_code text ,city_id integer)";

	public YooymmOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	public YooymmOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
		super(context, name, factory, version, errorHandler);
	}

	@Override
	public void onCreate(SQLiteDatabase sqLiteDatabase) {

	}

	@Override
	public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

	}
}