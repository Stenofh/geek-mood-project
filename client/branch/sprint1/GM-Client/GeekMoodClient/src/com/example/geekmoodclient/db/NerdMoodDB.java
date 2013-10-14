package com.example.geekmoodclient.db;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class NerdMoodDB extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME = "nerd_mood.db";
    private static final int DATABASE_VERSION = 1;

    public NerdMoodDB(final Context context, final String name,
	    final CursorFactory factory, final int version,
	    final DatabaseErrorHandler errorHandler) {
	super(context, name, factory, version, errorHandler);
    }

    public NerdMoodDB(final Context context) {
	super(context, DATABASE_NAME, null, DATABASE_VERSION);
	this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase dataBase) {
	executeSQLScript(dataBase, DATABASE_NAME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase dataBase, int arg1, int arg2) {
	executeSQLScript(dataBase, DATABASE_NAME);
    }

    private void executeSQLScript(final SQLiteDatabase database,
	    final String dbname) {
	try {
	    final InputStream input = context.getAssets().open("db/" + dbname);
	    final ByteArrayOutputStream output = new ByteArrayOutputStream();

	    int len;
	    final byte[] buf = new byte[1024];

	    while (true) {
		len = input.read(buf);
		if (len == -1) {
		    break;
		}
		output.write(buf, 0, len);
	    }

	    // Close the streams
	    output.flush();
	    input.close();
	    output.close();

	    // Execute SQL script
	    final String[] createScript = output.toString().split(";");
	    for (int i = 0; i < createScript.length; i++) {
		final String sqlStatement = createScript[i].trim();
		if (sqlStatement.length() > 0) {
		    try {
			database.execSQL(sqlStatement + ";");
		    } catch (final SQLException e) {
			// Do nothing
		    }
		}
	    }
	} catch (final IOException e) {
	    // Do nothing
	}
    }

}
