package com.notations.sem.ormlite.ormwithoutnotations.DAL;

import android.content.Context;

import com.j256.ormlite.dao.Dao;
import com.notations.sem.ormlite.ormwithoutnotations.BO.Pessoa;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by domin on 23/08/2015.
 */
public class PessoaDao {
    private Dao<Pessoa,Integer> pessoaDao = null;
    public PessoaDao(Context context){
        try {
            if(pessoaDao == null) {
                pessoaDao = DatabaseManager.getInstance(context).getHelper().getDao(Pessoa.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Pessoa> getPessoasAll(){
        List<Pessoa> lstPessoas = null;
        try {
            lstPessoas = pessoaDao.queryForAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return lstPessoas;
    }
    public boolean savePessoa(Pessoa pessoa){
        try {
            pessoaDao.createOrUpdate(pessoa);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }

    }

}
