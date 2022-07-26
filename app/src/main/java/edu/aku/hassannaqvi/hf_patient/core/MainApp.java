package edu.aku.hassannaqvi.hf_patient.core;

import static edu.aku.hassannaqvi.hf_patient.database.DatabaseHelper.DATABASE_NAME;
import static edu.aku.hassannaqvi.hf_patient.database.DatabaseHelper.DATABASE_PASSWORD;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import com.jakewharton.threetenabp.AndroidThreeTen;

import net.sqlcipher.database.SQLiteDatabase;

import org.json.JSONArray;

import java.io.File;
import java.util.List;

import edu.aku.hassannaqvi.hf_patient.models.Child;
import edu.aku.hassannaqvi.hf_patient.models.ChildInformation;
import edu.aku.hassannaqvi.hf_patient.models.Form;
import edu.aku.hassannaqvi.hf_patient.models.Immunization;
import edu.aku.hassannaqvi.hf_patient.models.PatientDetails;
import edu.aku.hassannaqvi.hf_patient.models.Users;

public class MainApp extends Application {

    public static final String PROJECT_NAME = "HF Patient";
    public static final String DIST_ID = null;
    public static final String SYNC_LOGIN = "sync_login";
    public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    //    public static final String _IP = "https://cls-pae-fp51764";// .TEST server
    //public static final String _IP = "http://43.245.131.159:8080";// .TEST server
    public static final String _HOST_URL = MainApp._IP + "/hfp/api/";// .TEST server;
    public static final String _SERVER_URL = "syncGCM.php";
    public static final String _SERVER_GET_URL = "getDataGCM.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _APP_FOLDER = "../app/";
    public static final String _UPDATE_URL = MainApp._IP + "/app/";
    public static final String _USER_URL = "resetpassword.php";
    private static final String TAG = "MainApp";
    public static File sdDir;
    public static String[] downloadData;
    public static Form form;
    public static Child child;
    public static Immunization immunization;
    public static PatientDetails patientDetails;
    public static ChildInformation childInformation;
    public static String DeviceURL = "devices.php";
    public static AppInfo appInfo;
    public static Users user;
    public static Boolean admin = false;
    public static List<JSONArray> uploadData;
    public static String deviceid;
    public static SharedPreferences.Editor editor;
    public static SharedPreferences sharedPref;
    public static String IBAHC = "";
    public static int TRATS = 8;
    public static String selectedDoctorCode;
    public static String selectedDoctorName;

    public static boolean permissionCheck = false;

    public static void hideSystemUI(View decorView) {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    @Override
    public void onCreate() {
        super.onCreate();

                /*
        RootBeer rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }*/

        //Initiate DateTime
        AndroidThreeTen.init(this);
        //Initializ App info
        appInfo = new AppInfo(this);
        sharedPref = getSharedPreferences(PROJECT_NAME, MODE_PRIVATE);
        editor = sharedPref.edit();
        deviceid = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        initSecure();

    }

    private void initSecure() {
        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);
        File databaseFile = getDatabasePath(DATABASE_NAME);
       /* databaseFile.mkdirs();
        databaseFile.delete();*/
        SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(databaseFile, DATABASE_PASSWORD, null);
        // Prepare encryption KEY
        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            TRATS = bundle.getInt("YEK_TRATS");
            //IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            IBAHC = bundle.getString("YEK_REVRES");
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
