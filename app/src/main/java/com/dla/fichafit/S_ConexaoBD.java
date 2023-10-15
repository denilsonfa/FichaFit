package com.dla.fichafit;

//	---------------------		Criado por: Denilson Araujo		---------------------	//
//	---------------------		       @Denilson_fa       		---------------------	//

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class S_ConexaoBD extends SQLiteOpenHelper {

    //DATABASE
    private static final String DATABASE_NAME           = S_Dados.getDatabaseName();
    private static final int    DATABASE_VERSION        = S_Dados.getDatabaseVersao();

    //CRIAÇÃO DE TABELAS
    private static final String DATABASE_TABLE_USERS            = S_Dados.getDatabaseTableUsers();
    private static final String DATABASE_TABLE_EXERCICIOS_LISTA = S_Dados.getDatabaseTableExerciciosLista();
    private static final String DATABASE_TABLE_PERIODO          = S_Dados.getDatabaseTablePeriodo();
    private static final String DATABASE_TABLE_MEDIDAS          = S_Dados.getDatabaseTableMedidas();
    private static final String DATABASE_TABLE_EXERC_REGISTRADO = S_Dados.getDatabaseTableExercRegistrado();
    private static final String DATABASE_TABLE_EXERC            = S_Dados.getDatabaseTableExerc();

    //APAGAR TABELAS
    private static final String DATABASE_TABLE_USERS_DROP            = S_Dados.getDatabaseTableUsers_drop();
    private static final String DATABASE_TABLE_EXERCICIOS_LISTA_DROP = S_Dados.getDatabaseTableExerciciosLista_drop();
    private static final String DATABASE_TABLE_PERIODO_DROP          = S_Dados.getDatabaseTablePeriodo_drop();
    private static final String DATABASE_TABLE_MEDIDAS_DROP          = S_Dados.getDatabaseTableMedidas_drop();
    private static final String DATABASE_TABLE_EXERC_REGISTRADO_DROP = S_Dados.getDatabaseTableExercRegistrado_drop();
    private static final String DATABASE_TABLE_EXERC_DROP            = S_Dados.getDatabaseTableExerc_drop();

    public S_ConexaoBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase connectBD) {
        //CRIANDO TABLES
        try {
            connectBD.execSQL(DATABASE_TABLE_USERS);
            connectBD.execSQL(DATABASE_TABLE_EXERCICIOS_LISTA);
            connectBD.execSQL(DATABASE_TABLE_PERIODO);
            connectBD.execSQL(DATABASE_TABLE_MEDIDAS);
            connectBD.execSQL(DATABASE_TABLE_EXERC_REGISTRADO);
            connectBD.execSQL(DATABASE_TABLE_EXERC);
        } catch (Exception ignored) { /* ... */ }
    }

    @Override
    public void onUpgrade(SQLiteDatabase conexBD, int oldVersion, int newVersion) {
        conexBD.execSQL(DATABASE_TABLE_USERS_DROP );
        conexBD.execSQL(DATABASE_TABLE_EXERCICIOS_LISTA_DROP );
        conexBD.execSQL(DATABASE_TABLE_PERIODO_DROP );
        conexBD.execSQL(DATABASE_TABLE_MEDIDAS_DROP );
        conexBD.execSQL(DATABASE_TABLE_EXERC_REGISTRADO_DROP );
        conexBD.execSQL(DATABASE_TABLE_EXERC_DROP );
        onCreate(conexBD);
    }

}
