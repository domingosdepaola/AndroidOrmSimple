package com.notations.sem.ormlite.ormwithoutnotations.DAL;

import android.content.Context;

import com.j256.ormlite.dao.Dao;
import com.notations.sem.ormlite.ormwithoutnotations.BO.Pessoa;

/**
 * Created by domin on 23/08/2015.
 */
public class DatabaseManager {
    private static DatabaseManager instance;
    private DatabaseHelper helper;

    public static void init(Context ctx) {
        if (null == instance) {
            instance = new DatabaseManager(ctx);
        }
    }

    public static DatabaseManager getInstance(Context ctx) {
        if (null == instance) {
            instance = new DatabaseManager(ctx);
        }
        return instance;
    }
    private DatabaseManager(Context ctx) {
        helper = new DatabaseHelper(ctx);
    }
    public DatabaseHelper getHelper() {
        return helper;
    }

}
