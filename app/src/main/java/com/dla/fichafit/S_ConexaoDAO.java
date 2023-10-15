package com.dla.fichafit;

//	---------------------		Criado por: Denilson Araujo		---------------------	//
//	---------------------		       @Denilson_fa       		---------------------	//

import android.content.ContextWrapper;

import java.io.File;

public class S_ConexaoDAO {
    S_Dados dados = new S_Dados();

    // -------------------------    S_ConexaoBD     ------------------------- //
    private final S_ConexaoBD conexaoBD;
    public S_ConexaoDAO(S_ConexaoBD conexaoBD) { this.conexaoBD = conexaoBD; }

    // -------------------------    S_DADOS          ------------------------- //
    //DATABASE NAME
    protected static final String               DATABASE_NAME               = S_Dados.DATABASE_NAME;
    protected static final int                  DATABASE_VERSION            = S_Dados.DATABASE_VERSION;

    //TU    = Tabela USUARIO
    //TP    = Tabela PERIODO
    //TEL   = Tabela ExerciciosLista
    //TM    = Tabela MEDIDAS
    //TER   = Tabela EXERC. REGISTRADO
    //TE    = Tabela Exericicios


    //ITENS DA TABELA => TU    = Tabela USUARIO
    protected static final String               TU_NAME                     = S_Dados.TU_NAME;
    protected static final String               TU_ITEM01                   = S_Dados.TU_ITEM01;
    protected static final String               TU_ITEM02                   = S_Dados.TU_ITEM02;
    protected static final String               TU_ITEM03                   = S_Dados.TU_ITEM03;
    protected static final String               TU_ITEM04                   = S_Dados.TU_ITEM04;
    protected static final String               TU_ITEM05                   = S_Dados.TU_ITEM05;


    //ITENS DA TABELA => TP    = Tabela PERIODO
    protected static final String               TP_NAME                     = S_Dados.TP_NAME;
    protected static final String               TP_ITEM01                   = S_Dados.TP_ITEM01;
    protected static final String               TP_ITEM02                   = S_Dados.TP_ITEM02;
    protected static final String               TP_ITEM03                   = S_Dados.TP_ITEM03;
    protected static final String               TP_ITEM04                   = S_Dados.TP_ITEM04;
    protected static final String               TP_ITEM05                   = S_Dados.TP_ITEM05;
    protected static final String               TP_ITEM06                   = S_Dados.TP_ITEM06;
    protected static final String               TP_FK_User                  = S_Dados.TP_FK_User;


    //ITENS DA TABELA => TEL   = Tabela ExerciciosLista
    protected static final String               TEL_NAME                     = S_Dados.TEL_NAME;
    protected static final String               TEL_ITEM01                   = S_Dados.TEL_ITEM01;
    protected static final String               TEL_ITEM02                   = S_Dados.TEL_ITEM02;
    protected static final String               TEL_FK_User                  = S_Dados.TEL_FK_User;
    protected static final String               TEL_FK_Periodo               = S_Dados.TEL_FK_Periodo;


    //ITENS DA TABELA => TM    = Tabela MEDIDAS
    protected static final String               TM_NAME                     = S_Dados.TM_NAME;
    protected static final String               TM_ITEM01                   = S_Dados.TM_ITEM01;
    protected static final String               TM_ITEM02                   = S_Dados.TM_ITEM02;
    protected static final String               TM_ITEM03                   = S_Dados.TM_ITEM03;
    protected static final String               TM_ITEM04                   = S_Dados.TM_ITEM04;
    protected static final String               TM_ITEM05                   = S_Dados.TM_ITEM05;
    protected static final String               TM_ITEM06                   = S_Dados.TM_ITEM06;
    protected static final String               TM_ITEM07                   = S_Dados.TM_ITEM07;
    protected static final String               TM_ITEM08                   = S_Dados.TM_ITEM08;
    protected static final String               TM_ITEM09                   = S_Dados.TM_ITEM09;
    protected static final String               TM_ITEM10                   = S_Dados.TM_ITEM10;
    protected static final String               TM_ITEM11                   = S_Dados.TM_ITEM11;
    protected static final String               TM_ITEM12                   = S_Dados.TM_ITEM12;
    protected static final String               TM_ITEM13                   = S_Dados.TM_ITEM13;
    protected static final String               TM_ITEM14                   = S_Dados.TM_ITEM14;
    protected static final String               TM_ITEM15                   = S_Dados.TM_ITEM15;
    protected static final String               TM_ITEM16                   = S_Dados.TM_ITEM16;
    protected static final String               TM_FK_User                  = S_Dados.TM_FK_User;


    //ITENS DA TABELA =>  TER   = Tabela EXERC. REGISTRADO
    protected static final String               TER_NAME                     = S_Dados.TER_NAME;
    protected static final String               TER_ITEM01                   = S_Dados.TER_ITEM01;
    protected static final String               TER_ITEM02                   = S_Dados.TER_ITEM02;
    protected static final String               TER_ITEM03                   = S_Dados.TER_ITEM03;
    protected static final String               TER_ITEM04                   = S_Dados.TER_ITEM04;
    protected static final String               TER_ITEM05                   = S_Dados.TER_ITEM05;
    protected static final String               TER_ITEM06                   = S_Dados.TER_ITEM06;
    protected static final String               TER_ITEM07                   = S_Dados.TER_ITEM07;
    protected static final String               TER_FK_User                   = S_Dados.TER_FK_User;
    protected static final String               TER_FK_Exer                   = S_Dados.TER_FK_Exer;


    //ITENS DA TABELA => TM    = Tabela MEDIDAS
    protected static final String               TE_NAME                     = S_Dados.TM_NAME;
    protected static final String               TE_ITEM01                   = S_Dados.TE_ITEM01;
    protected static final String               TE_ITEM02                   = S_Dados.TE_ITEM02;
    protected static final String               TE_ITEM03                   = S_Dados.TE_ITEM03;
    protected static final String               TE_ITEM04                   = S_Dados.TE_ITEM04;
    protected static final String               TE_ITEM05                   = S_Dados.TE_ITEM05;

    //	-----***-----	Read DATABASE - table lista	-----***-----	//
    public static boolean doesDatabaseExist(ContextWrapper context) {
        File dbFile = context.getDatabasePath(DATABASE_NAME);
        return dbFile.exists();
    }

}
