package com.dla.fichafit;

//	---------------------		Criado por: Denilson Araujo		---------------------	//
//	---------------------		       @Denilson_fa       		---------------------	//

import android.icu.util.Calendar;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;

public class S_Dados  implements Serializable {

    //	---------------------	Metodo Construtor	---------------------	//
    public S_Dados() {/* ... */}

    //	---------------------		Atributos - Date		---------------------	//
    protected static final Calendar date = Calendar.getInstance(); 	//Instanciando data do sistema;

    protected static final int 		    dia = date.get(Calendar.DATE);					//coleta o dia atual do sistema
    protected static final int 		    mes = date.get(Calendar.MONTH)+1;				//soma +1 ao mes coletado pelo sistema, pois ele conta de 0 ao 11
    protected static final int 		    ano = date.get(Calendar.YEAR);					//coleta o ano atual do sistema
    protected static final int 		    hora = date.get(Calendar.HOUR_OF_DAY);			//coleta a hora atual do sistema
    protected static final int 		    min = date.get(Calendar.MINUTE);				//coleta o minuto atual do sistema

    protected static final String 	dateSystem = dia+"/"+mes+"/"+ano+" - "+hora+":"+min;
    //log da data da criação da lista de compras
    //exemplo: 01/01/2021 - 12:00

    //GET
    public static String getDateSystem() { return dateSystem; }


    //
    //	---------------------		Atributos - BD USUARIO		---------------------	//
    protected int           idUser;                                                 //id do usuario
    protected String        nomeUser;                                               //nome do usuario
    protected LocalDate     dataDeNascimento;                                       //data de nascimento
    protected boolean[]     objetivoTreino = {false,false,false,false,false};
    //0= Hipertrofia; 1= Saúde; 2= Emagrecimento; 3= Preparação p/ esporte; 4= Condicionamento Físico;
    protected String        atestadoTreino;

    //GET & SET
    public int getIdUser() { return idUser; }
    public void setIdUser(int idUser) { this.idUser = idUser; }

    public String getNomeUser() { return nomeUser; }
    public void setNomeUser(String nomeUser) { this.nomeUser = nomeUser; }

    public LocalDate getDataDeNascimento() { return dataDeNascimento; }
    public void setDataDeNascimento(LocalDate dataDeNascimento) { this.dataDeNascimento = dataDeNascimento; }

    public boolean[] getObjetivoTreino() { return objetivoTreino; }
    public void setObjetivoTreino(boolean[] objetivoTreino) { this.objetivoTreino = objetivoTreino; }

    public String getAtestadoTreino() { return atestadoTreino; }
    public void setAtestadoTreino(String atestadoTreino) { this.atestadoTreino = atestadoTreino; }


    //
    //	---------------------		Atributos - BD ExerciciosLista		---------------------	//
    protected int           idExercicioLista;                                       //id da lista de exercicios
    protected String        nomeExercicioLista;                                     //nome da lsita de exercicios

    //
    //GET & SET
    public int getIdExercicioLista() { return idExercicioLista; }
    public void setIdExercicioLista(int idExercicioLista) { this.idExercicioLista = idExercicioLista; }

    public String getNomeExercicioLista() { return nomeExercicioLista; }
    public void setNomeExercicioLista(String nomeExercicioLista) { this.nomeExercicioLista = nomeExercicioLista; }


    //	---------------------		Atributos - BD PERIODO		---------------------	//
    protected int           idUserPeriodoTreino;                                    //id do Programa de Treino do Usuario
    protected LocalDate     dataEntradaAcademia;                                    //data inicio na academia
    protected LocalDate     dataInicioPeriodoTreino;                                //data inicio do treino
    protected LocalDate     dataFimPeriodoTreino;                                   //data fim do treino
    protected String        nomeTreinador;                                          //nome do treinador
    protected int           nivelTreino;                                            //0= Iniciante; 1= Intermediário; 2= Adaptado; 3= Avançado;

    //
    //GET & SET
    public int getIdUserPeriodoTreino() { return idUserPeriodoTreino; }
    public void setIdUserPeriodoTreino(int idUserPeriodoTreino) { this.idUserPeriodoTreino = idUserPeriodoTreino; }

    public LocalDate getDataEntradaAcademia() { return dataEntradaAcademia; }
    public void setDataEntradaAcademia(LocalDate dataEntradaAcademia) { this.dataEntradaAcademia = dataEntradaAcademia; }

    public LocalDate getDataInicioPeriodoTreino() { return dataInicioPeriodoTreino; }
    public void setDataInicioPeriodoTreino(LocalDate dataInicioPeriodoTreino) { this.dataInicioPeriodoTreino = dataInicioPeriodoTreino; }

    public LocalDate getDataFimPeriodoTreino() { return dataFimPeriodoTreino; }
    public void setDataFimPeriodoTreino(LocalDate dataFimPeriodoTreino) { this.dataFimPeriodoTreino = dataFimPeriodoTreino; }

    public String getNomeTreinador() { return nomeTreinador; }
    public void setNomeTreinador(String nomeTreinador) { this.nomeTreinador = nomeTreinador; }

    public int getNivelTreino() { return nivelTreino; }
    public void setNivelTreino(int nivelTreino) { this.nivelTreino = nivelTreino; }


    //	---------------------		Atributos - BD MEDIDAS		---------------------	//
    protected int           idUserMedidas;                                          //id Grupo de mediadas
    protected double[]      bicepsDireitoContracao      = new double[10];
    protected double[]      bicepsEsquerdoContracao     = new double[10];
    protected double[]      antebracoDireito            = new double[10];
    protected double[]      antebracoEsquerdo           = new double[10];
    protected double[]      ombro                       = new double[10];
    protected double[]      peitoral                    = new double[10];
    protected double[]      cintura                     = new double[10];
    protected double[]      abdomen                     = new double[10];
    protected double[]      quadril                     = new double[10];
    protected double[]      coxaDireita                 = new double[10];
    protected double[]      coxaEsquerda                = new double[10];
    protected double[]      panturrilhaDireita          = new double[10];
    protected double[]      panturrilhaEsquerda         = new double[10];
    protected double[]      pesoCorporal                = new double[10];
    protected double[]      altura                      = new double[10];            //array de até 10 para cada medida

    //
    //GET & SET
    public int getIdUserMedidas() { return idUserMedidas; }
    public void setIdUserMedidas(int idUserMedidas) { this.idUserMedidas = idUserMedidas; }

    public double[] getBicepsDireitoContracao() { return bicepsDireitoContracao; }
    public void setBicepsDireitoContracao(double[] bicepsDireitoContracao) { this.bicepsDireitoContracao = bicepsDireitoContracao; }

    public double[] getBicepsEsquerdoContracao() { return bicepsEsquerdoContracao; }
    public void setBicepsEsquerdoContracao(double[] bicepsEsquerdoContracao) { this.bicepsEsquerdoContracao = bicepsEsquerdoContracao; }

    public double[] getAntebracoDireito() { return antebracoDireito; }
    public void setAntebracoDireito(double[] antebracoDireito) { this.antebracoDireito = antebracoDireito; }

    public double[] getAntebracoEsquerdo() { return antebracoEsquerdo; }
    public void setAntebracoEsquerdo(double[] antebracoEsquerdo) { this.antebracoEsquerdo = antebracoEsquerdo; }

    public double[] getOmbro() { return ombro; }
    public void setOmbro(double[] ombro) { this.ombro = ombro; }

    public double[] getPeitoral() { return peitoral; }
    public void setPeitoral(double[] peitoral) { this.peitoral = peitoral; }

    public double[] getCintura() { return cintura; }
    public void setCintura(double[] cintura) { this.cintura = cintura; }

    public double[] getAbdomen() { return abdomen; }
    public void setAbdomen(double[] abdomen) { this.abdomen = abdomen; }

    public double[] getQuadril() { return quadril; }
    public void setQuadril(double[] quadril) { this.quadril = quadril; }

    public double[] getCoxaDireita() { return coxaDireita; }
    public void setCoxaDireita(double[] coxaDireita) { this.coxaDireita = coxaDireita; }

    public double[] getCoxaEsquerda() { return coxaEsquerda; }
    public void setCoxaEsquerda(double[] coxaEsquerda) { this.coxaEsquerda = coxaEsquerda; }

    public double[] getPanturrilhaDireita() { return panturrilhaDireita; }
    public void setPanturrilhaDireita(double[] panturrilhaDireita) { this.panturrilhaDireita = panturrilhaDireita; }

    public double[] getPanturrilhaEsquerda() { return panturrilhaEsquerda; }
    public void setPanturrilhaEsquerda(double[] panturrilhaEsquerda) { this.panturrilhaEsquerda = panturrilhaEsquerda; }

    public double[] getPesoCorporal() { return pesoCorporal; }
    public void setPesoCorporal(double[] pesoCorporal) { this.pesoCorporal = pesoCorporal; }

    public double[] getAltura() { return altura; }
    public void setAltura(double[] altura) { this.altura = altura; }


    //	---------------------		Atributos - BD EXERC. REGISTRADO		---------------------	//
    protected int           idExercicioRegistrado;                                  //id do exercicio registrado
    protected String        nomeExercicioRegistrado;                                //nome do exercicio registrado
    protected int           numeroSerie;                                            //numero de series que serão feitas
    protected int           numeroRepeticao;                                        //numero de repefições que serão feitas
    protected double        pesoExercicio;                                          //peso em kg que serão usados
    protected Duration      tempoDescanco;                                          //tempo
    protected boolean       concluido;                                              //boolean que define se exercicio foi feito o não

    //
    //GET & SET
    public int getIdExercicioRegistrado() { return idExercicioRegistrado; }
    public void setIdExercicioRegistrado(int idExercicioRegistrado) { this.idExercicioRegistrado = idExercicioRegistrado; }

    public String getNomeExercicioRegistrado() { return nomeExercicioRegistrado; }
    public void setNomeExercicioRegistrado(String nomeExercicioRegistrado) { this.nomeExercicioRegistrado = nomeExercicioRegistrado; }

    public int getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(int numeroSerie) { this.numeroSerie = numeroSerie; }

    public int getNumeroRepeticao() { return numeroRepeticao; }
    public void setNumeroRepeticao(int numeroRepeticao) { this.numeroRepeticao = numeroRepeticao; }

    public double getPesoExercicio() { return pesoExercicio; }
    public void setPesoExercicio(double pesoExercicio) { this.pesoExercicio = pesoExercicio; }

    public Duration getTempoDescanco() { return tempoDescanco; }
    public void setTempoDescanco(Duration tempoDescanco) { this.tempoDescanco = tempoDescanco; }

    public boolean getTempoConcluido() { return concluido; }
    public void setTempoConcluido(boolean concluido) { this.concluido = concluido; }


    //	---------------------		Atributos - BD EXERC.		---------------------	//
    protected int           idExercicio;                                            //id do exercicio registrado
    protected String        nomeExercicio;                                          //nome do exercicio
    protected String        descricaoExercicio;                                     //descição do exericico;
    protected String        urlImagemExercicio;                                     //url da imagem do exericio;
    protected String        urlVideoExericios;                                      //url para abrir playlist de videos sobre o exericico;

    //
    //GET & SET
    public int getIdExercicio() { return idExercicio; }
    public void setIdExercicio(int idExercicio) { this.idExercicio = idExercicio; }

    public String getNomeExercicio() { return nomeExercicio; }
    public void setNomeExercicio(String nomeExercicio) { this.nomeExercicio = nomeExercicio; }

    public String getDescricaoExercicio() { return descricaoExercicio; }
    public void setDescricaoExercicio(String descricaoExercicio) { this.descricaoExercicio = descricaoExercicio; }

    public String getUrlImagemExercicio() { return urlImagemExercicio; }
    public void setUrlImagemExercicio(String urlImagemExercicio) { this.urlImagemExercicio = urlImagemExercicio; }

    public String getUrlVideoExericios() { return urlVideoExericios; }
    public void setUrlVideoExericios(String urlVideoExericios) { this.urlVideoExericios = urlVideoExericios; }


    //
    //
    //	---------------------		Atributos - SQLite.S_ConexaoBD		---------------------	//
    protected static final String       DATABASE_NAME       = "BD_FichaFit";        //Nome Database
    protected static final int          DATABASE_VERSION    = 1;                    //Versão Database

    //
    //GET
    public static String getDatabaseName() { return DATABASE_NAME; }
    public static int getDatabaseVersao() { return DATABASE_VERSION; }

    //	---------------------		Atributos - SQLite.onCreate		---------------------	//
    //TU    = Tabela USUARIO
    //TP    = Tabela PERIODO
    //TEL   = Tabela ExerciciosLista
    //TM    = Tabela MEDIDAS
    //TER   = Tabela EXERC. REGISTRADO
    //TE    = Tabela Exericicios


    //
    //TU    = Tabela USUARIO
    protected static final String   TU_NAME             = "USERS";
    protected static final String   TU_ITEM01           = "idUser";
    protected static final String   TU_ITEM02           = "nomeUser";
    protected static final String   TU_ITEM03           = "dataDeNascimento";
    protected static final String   TU_ITEM04           = "objetivoTreino";
    protected static final String   TU_ITEM05           = "atestadoTreino";

    //CREATE TABLE
    protected static final String DATABASE_TABLE_USERS =
            "CREATE TABLE " + TU_NAME + " (" +
            TU_ITEM01 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TU_ITEM02 + " TEXT NOT NULL, " +
            TU_ITEM03 + " DATE NOT NULL, " +
            TU_ITEM04 + " BOOLEAN, " +
            TU_ITEM05 + " TEXT" +
            ");";

    //DROP TABLE
    protected static final String DATABASE_TABLE_USERS_DROP = "DROP TABLE IF EXISTS " + TU_NAME;

    //GET
    public static String getDatabaseTableUsers() { return DATABASE_TABLE_USERS; }
    public static String getDatabaseTableUsers_drop() { return DATABASE_TABLE_USERS_DROP; }


    //
    //TP    = Tabela PERIODO
    protected static final String   TP_NAME             = "PERIODO";
    protected static final String   TP_ITEM01           = "idUserPeriodoTreino";
    protected static final String   TP_ITEM02           = "dataEntradaAcademia";
    protected static final String   TP_ITEM03           = "dataInicioPeriodoTreino";
    protected static final String   TP_ITEM04           = "dataFimPeriodoTreino";
    protected static final String   TP_ITEM05           = "nomeTreinador";
    protected static final String   TP_ITEM06           = "nivelTreino";
    protected static final String   TP_FK_User          = "tp_FK_idUser";

    //CREATE TABLE
    protected static final String DATABASE_TABLE_PERIODO =
            "CREATE TABLE " + TP_NAME + " (" +
            TP_ITEM01 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TP_ITEM02 + " DATE NOT NULL, " +
            TP_ITEM03 + " DATE NOT NULL, " +
            TP_ITEM04 + " DATE NOT NULL, " +
            TP_ITEM05 + " TEXT NOT NULL, " +
            TP_ITEM06 + " TEXT, " +
            TP_FK_User + " INTEGER, " +
            "FOREIGN KEY (" + TP_FK_User + ") REFERENCES "+ TU_NAME + " (" + TU_ITEM01 + ")" +
            ");";

    //DROP TABLE
    protected static final String DATABASE_TABLE_PERIODO_DROP = "DROP TABLE IF EXISTS " + TP_NAME;

    //GET
    public static String getDatabaseTablePeriodo() { return DATABASE_TABLE_PERIODO; }
    public static String getDatabaseTablePeriodo_drop() { return DATABASE_TABLE_PERIODO_DROP; }


    //
    //TEL   = Tabela ExerciciosLista
    protected static final String   TEL_NAME            = "EXERCICIOS_LISTA";
    protected static final String   TEL_ITEM01          = "idExercicioLista";
    protected static final String   TEL_ITEM02          = "nomeExercicioLista";
    protected static final String   TEL_FK_User         = "tel_FK_idUser";
    protected static final String   TEL_FK_Periodo      = "tel_FK_idUserPeriodoTreino";

    //CREATE TABLE
    protected static final String DATABASE_TABLE_EXERCICIOS_LISTA =
            "CREATE TABLE " + TEL_NAME + " (" +
                    TEL_ITEM01 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    TEL_ITEM02 + " TEXT NOT NULL, " +
                    TEL_FK_User + " INTEGER, " +
                    TEL_FK_Periodo + " INTEGER, " +
                    "FOREIGN KEY (" + TEL_FK_User + ") REFERENCES " + TU_NAME +" (" + TU_ITEM01 + "), " +
                    "FOREIGN KEY (" + TEL_FK_Periodo + ") REFERENCES " + TP_NAME + " (" + TP_ITEM01 + ")" +
                    ");";

    //DROP TABLE
    protected static final String DATABASE_TABLE_EXERCICIOS_LISTA_DROP = "DROP TABLE IF EXISTS " + TEL_NAME;

    //GET
    public static String getDatabaseTableExerciciosLista() { return DATABASE_TABLE_EXERCICIOS_LISTA; }
    public static String getDatabaseTableExerciciosLista_drop() { return DATABASE_TABLE_EXERCICIOS_LISTA_DROP; }


    //
    //TM    = Tabela MEDIDAS
    protected static final String   TM_NAME             = "MEDIDAS";
    protected static final String   TM_ITEM01           = "idUserMedidas";
    protected static final String   TM_ITEM02           = "bicepsDireitoContracao";
    protected static final String   TM_ITEM03           = "bicepsEsquerdoContracao";
    protected static final String   TM_ITEM04           = "antebracoDireito";
    protected static final String   TM_ITEM05           = "antebracoEsquerdo";
    protected static final String   TM_ITEM06           = "ombro";
    protected static final String   TM_ITEM07           = "peitoral";
    protected static final String   TM_ITEM08           = "cintura";
    protected static final String   TM_ITEM09           = "abdomen";
    protected static final String   TM_ITEM10           = "quadril";
    protected static final String   TM_ITEM11           = "coxaDireita";
    protected static final String   TM_ITEM12           = "coxaEsquerda";
    protected static final String   TM_ITEM13           = "panturrilhaDireita";
    protected static final String   TM_ITEM14           = "panturrilhaEsquerda";
    protected static final String   TM_ITEM15           = "pesoCorporal";
    protected static final String   TM_ITEM16           = "altura";
    protected static final String   TM_FK_User          = "tm_FK_idUser";

    //CREATE TABLE
    protected static final String DATABASE_TABLE_MEDIDAS =
            "CREATE TABLE " + TM_NAME + " (" +
            TM_ITEM01 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TM_ITEM02 + " DOUBLE, " +
            TM_ITEM03 + " DOUBLE, " +
            TM_ITEM04 + " DOUBLE, " +
            TM_ITEM05 + " DOUBLE, " +
            TM_ITEM06 + " DOUBLE, " +
            TM_ITEM07 + " DOUBLE, " +
            TM_ITEM08 + " DOUBLE, " +
            TM_ITEM09 + " DOUBLE, " +
            TM_ITEM10 + " DOUBLE, " +
            TM_ITEM11 + " DOUBLE, " +
            TM_ITEM12 + " DOUBLE, " +
            TM_ITEM13 + " DOUBLE, " +
            TM_ITEM14 + " DOUBLE, " +
            TM_ITEM15 + " DOUBLE, " +
            TM_ITEM16 + " DOUBLE, " +
            TM_FK_User + " INTEGER, " +
            "FOREIGN KEY (" + TM_FK_User + ") REFERENCES " + TU_NAME + " (" + TU_ITEM01 + ")" +
            ");";

    //DROP TABLE
    protected static final String DATABASE_TABLE_MEDIDAS_DROP = "DROP TABLE IF EXISTS " + TM_NAME;

    //GET
    public static String getDatabaseTableMedidas() { return DATABASE_TABLE_MEDIDAS; }
    public static String getDatabaseTableMedidas_drop() { return DATABASE_TABLE_MEDIDAS_DROP; }


    //
    //TER   = Tabela EXERC. REGISTRADO
    protected static final String   TER_NAME             = "EXERC_REGISTRADO";
    protected static final String   TER_ITEM01           = "idExercicioRegistrado";
    protected static final String   TER_ITEM02           = "nomeExercicioRegistrado";
    protected static final String   TER_ITEM03           = "numeroSerie";
    protected static final String   TER_ITEM04           = "numeroRepeticao";
    protected static final String   TER_ITEM05           = "pesoExercicio";
    protected static final String   TER_ITEM06           = "tempoDescanco";
    protected static final String   TER_ITEM07           = "concluido";
    protected static final String   TER_FK_User          = "ter_FK_idUser";
    protected static final String   TER_FK_Exer          = "ter_FK_idExercicio";

    //CREATE TABLE
    protected static final String DATABASE_TABLE_EXERC_REGISTRADO = "CREATE TABLE " + TER_NAME + " (" +
            TER_ITEM01 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TER_ITEM02 + " TEXT NOT NULL, " +
            TER_ITEM03 + " INTEGER, " +
            TER_ITEM04 + " INTEGER, " +
            TER_ITEM05 + " DOUBLE, " +
            TER_ITEM06 + " INTEGER, " +
            TER_ITEM07 + " BOOLEAN, " +
            TER_FK_User + " INTEGER, " +
            TER_FK_Exer + " INTEGER, " +
            "FOREIGN KEY (" + TER_FK_User + ") REFERENCES " + TU_NAME + " (" + TU_ITEM01 + "), " +
            "FOREIGN KEY (" + TER_FK_Exer + ") REFERENCES " + TEL_NAME + " (" + TEL_ITEM01 + ")" +
            ");";

    //DROP TABLE
    protected static final String DATABASE_TABLE_EXERC_REGISTRADO_DROP = "DROP TABLE IF EXISTS " + TM_NAME;

    //GET
    public static String getDatabaseTableExercRegistrado() { return DATABASE_TABLE_EXERC_REGISTRADO; }
    public static String getDatabaseTableExercRegistrado_drop() { return DATABASE_TABLE_EXERC_REGISTRADO_DROP; }


    //
    //TE    = Tabela Exericicios
    protected static final String   TE_NAME              = "EXERC";
    protected static final String   TE_ITEM01            = "idExercicio";
    protected static final String   TE_ITEM02            = "nomeExercicio";
    protected static final String   TE_ITEM03            = "descricaoExercicio";
    protected static final String   TE_ITEM04            = "urlImagemExercicio";
    protected static final String   TE_ITEM05            = "urlVideoExericios";

    //CREATE TABLE
    protected static final String DATABASE_TABLE_EXERC =
            "CREATE TABLE " + TE_NAME + " (" +
            TE_ITEM01 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TE_ITEM02 + " TEXT NOT NULL, " +
            TE_ITEM03 + " TEXT, " +
            TE_ITEM04 + " TEXT, " +
            TE_ITEM05 + " TEXT" +
            ");";

    //DROP TABLE
    protected static final String DATABASE_TABLE_EXERC_DROP = "DROP TABLE IF EXISTS " + TE_NAME;

    //GET
    public static String getDatabaseTableExerc() { return DATABASE_TABLE_EXERC; }
    public static String getDatabaseTableExerc_drop() { return DATABASE_TABLE_EXERC_DROP; }

}
