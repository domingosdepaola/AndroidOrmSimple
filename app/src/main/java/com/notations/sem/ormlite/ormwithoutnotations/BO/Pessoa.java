package com.notations.sem.ormlite.ormwithoutnotations.BO;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by domin on 23/08/2015.
 */
@DatabaseTable
public class Pessoa {

    @DatabaseField(allowGeneratedIdInsert = true,generatedId = true)
    public int Id;
    @DatabaseField
    public  String Nome;

    @Override
    public String toString(){
        return Nome;
    }
}
