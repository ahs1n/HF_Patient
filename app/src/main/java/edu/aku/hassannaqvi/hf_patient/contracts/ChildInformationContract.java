package edu.aku.hassannaqvi.hf_patient.contracts;

import android.provider.BaseColumns;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class ChildInformationContract {

    public static abstract class ChildInfoTable implements BaseColumns {
        public static final String TABLE_NAME = "HHChildrens";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectName";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "_uid";
        public static final String COLUMN_UUID = "_uuid";
        public static final String COLUMN_USERNAME = "username";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_DCODE = "districtCode";
        public static final String COLUMN_UCODE = "ucCode";
        public static final String COLUMN_CLUSTER = "clusterno";
        public static final String COLUMN_HHNO = "hhno";
        public static final String COLUMN_ISSELECTED = "isselected";
        public static final String COLUMN_SCB = "scb";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "devicetagid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
        public static final String COLUMN_APPVERSION = "appversion";
        public static final String COLUMN_STATUS = "status";
    }
}
