package com.notations.sem.ormlite.ormwithoutnotations;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.notations.sem.ormlite.ormwithoutnotations.BO.Pessoa;
import com.notations.sem.ormlite.ormwithoutnotations.DAL.PessoaDao;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.btnOk);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PessoaDao pessoaDao = new PessoaDao(getApplicationContext());
                EditText txtNome = (EditText)findViewById(R.id.txtNome);
                Pessoa pessoa = new Pessoa();
                pessoa.Nome = txtNome.getText().toString();
                pessoaDao.savePessoa(pessoa);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menuListagem) {
            Intent intent = new Intent(MainActivity.this, ListagemActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
