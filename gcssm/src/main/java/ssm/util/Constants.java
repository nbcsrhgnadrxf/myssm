package ssm.util;



public class Constants { 
   
    /**
     * The name of the ResourceBundle used in this application
     */
    public static final String BUNDLE_KEY = "ApplicationResources";

    /**
     * File separator from System properties
     */
    public static final String FILE_SEP = System.getProperty("file.separator");

    /**
     * User home from System properties
     */
    public static final String USER_HOME = System.getProperty("user.home") + FILE_SEP;

    /**
     * The name of the configuration hashmap stored in application scope.
     */
    public static final String CONFIG = "appConfig";

    /**
     * Session scope attribute that holds the locale set by the user. By setting this key
     * to the same one that Struts uses, we get synchronization in Struts w/o having
     * to do extra work or have two session-level variables.
     */
    public static final String PREFERRED_LOCALE_KEY = "org.apache.struts2.action.LOCALE";

    /**
     * The name of the CSS Theme setting.
     */
    public static final String CSS_THEME = "csstheme";
    
    /**
     * The name of the USER_KEY setting.
     */
    public static final String USER_KEY = "userInfo";
    
    /**
    * The name of the USER_ROLE_FUNC_KEY setting.
    */
    public static final String USER_ROLE_FUNC = "userRoleFunc";
    
    public static final String USER_ROLE_FUNC_OPER = "userRoleFuncOper";
    
    public static final String D_AREA = "area";
    
    public static final String D_BUSINESSTYPE = "businessType";
    
    public static final String D_DIFFICULTYTYPE = "difficultyType";
    
    public static final String D_EDUCATION = "education";
    
    public static final String D_HOUSEHOLD = "household";
    
    public static final String D_INDUSTRY = "industry";
    
    public static final String D_MAINSTAY = "mainstay";
    
    public static final String D_NATIONALITY = "nationality";
    
    public static final String D_PERSONTYPE = "personType";
    
    public static final String D_QUALIFICATION = "qualification";
    
    public static final String D_RETURNREASON = "returnReason";
    
    public static final String D_TRAINTYPE = "trainType";
    
    public static final String D_WORKSTATE = "worksState";
    
    public static final String D_REPORTTITLE = "reporttitle";
    
    public static final String D_PROVICE = "provice";
    
    public static final String D_REGIONALISM = "regionalism";
    
    public static final Integer MAX_NUMBER = 10;
    
    public static final String USER = "admin";
    
    public static final String ORGCOD = "1";
    
    //組織識別区分リストの汎用区分値が2007
    public static final String GENERAL_Flg1 = "2007"; 
    //オーダー作成可否区分の汎用区分値が2006
    public static final String GENERAL_Flg2 = "2006";
    
    //オーダー作成可否区分の汎用区分値が2006
    public static final String gnrprpkbn = "5002";
	
	//イベントコード種別区分
    public static final String HANYO_EVTKBN = "1008";
    
    //アラート有無区分
    public static final String HANYO_ALTKBN = "1006";
    
    //廃止フラグON
    public static final String ABOFLG_ON = "1";
    
    //廃止フラグOFF
    public static final String ABOFLG_OFF = "0";
}
