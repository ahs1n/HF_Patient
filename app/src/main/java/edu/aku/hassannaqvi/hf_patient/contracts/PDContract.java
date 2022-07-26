package edu.aku.hassannaqvi.hf_patient.contracts;

import android.provider.BaseColumns;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class PDContract {


    public static abstract class MHTable implements BaseColumns {
        public static final String TABLE_NAME = "patientdetails";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_SERIAL = "serial";
        public static final String COLUMN_SA = "sA";
        public static final String COLUMN_SS101 = "ss101";
        public static final String COLUMN_SS102 = "ss102";
        public static final String COLUMN_SS103 = "ss103";
        public static final String COLUMN_SS104 = "ss104";
        public static final String COLUMN_SS105 = "ss105";
        public static final String COLUMN_SS106 = "ss106";
        public static final String COLUMN_SS107 = "ss107";

        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_STATUS = "status";
    }
}
