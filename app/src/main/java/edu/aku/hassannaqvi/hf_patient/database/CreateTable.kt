package edu.aku.hassannaqvi.hf_patient.database

import edu.aku.hassannaqvi.hf_patient.contracts.*
import edu.aku.hassannaqvi.hf_patient.contracts.EntryLog.EntryLogTable
import edu.aku.hassannaqvi.hf_patient.core.MainApp.PROJECT_NAME
import edu.aku.hassannaqvi.hf_patient.models.*

object CreateTable {
    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"

    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsContract.FormsTable.TABLE_NAME + "("
            + FormsContract.FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsContract.FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsContract.FormsTable.COLUMN_UID + " TEXT,"
            + FormsContract.FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsContract.FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsContract.FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsContract.FormsTable.COLUMN_ISTATUS96x + " TEXT,"
            + FormsContract.FormsTable.COLUMN_ENDINGDATETIME + " TEXT,"
            + FormsContract.FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsContract.FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsContract.FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsContract.FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsContract.FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsContract.FormsTable.COLUMN_G5FLAG + " TEXT,"
            + FormsContract.FormsTable.COLUMN_HHFLAG + " TEXT,"
            + FormsContract.FormsTable.COLUMN_DCODE + " TEXT,"
            + FormsContract.FormsTable.COLUMN_UCODE + " TEXT,"
            + FormsContract.FormsTable.COLUMN_CLUSTER + " TEXT,"
            + FormsContract.FormsTable.COLUMN_HHNO + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S01HH + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S05PD + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S06BF + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S07CV + " TEXT,"
            + FormsContract.FormsTable.COLUMN_S08SE + " TEXT"
            + " );")

    const val SQL_CREATE_CHILD_INFO = ("CREATE TABLE "
            + ChildInformationContract.ChildInfoTable.TABLE_NAME + "("
            + ChildInformationContract.ChildInfoTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_UID + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_UUID + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_USERNAME + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_SYSDATE + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_STATUS + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_ISSELECTED + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_DEVICEID + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_DEVICETAGID + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_SYNCED + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_APPVERSION + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_DCODE + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_UCODE + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_CLUSTER + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_HHNO + " TEXT,"
            + ChildInformationContract.ChildInfoTable.COLUMN_SCB + " TEXT"
            + " );")

    const val SQL_CREATE_CHILD = ("CREATE TABLE "
            + ChildContract.ChildTable.TABLE_NAME + "("
            + ChildContract.ChildTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ChildContract.ChildTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ChildContract.ChildTable.COLUMN_UID + " TEXT,"
            + ChildContract.ChildTable.COLUMN_UUID + " TEXT,"
            + ChildContract.ChildTable.COLUMN_FMUID + " TEXT,"
            + ChildContract.ChildTable.COLUMN_USERNAME + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SYSDATE + " TEXT,"
            + ChildContract.ChildTable.COLUMN_STATUS + " TEXT,"
            + ChildContract.ChildTable.COLUMN_DEVICEID + " TEXT,"
            + ChildContract.ChildTable.COLUMN_DEVICETAGID + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SYNCED + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ChildContract.ChildTable.COLUMN_APPVERSION + " TEXT,"
            + ChildContract.ChildTable.COLUMN_DCODE + " TEXT,"
            + ChildContract.ChildTable.COLUMN_UCODE + " TEXT,"
            + ChildContract.ChildTable.COLUMN_CLUSTER + " TEXT,"
            + ChildContract.ChildTable.COLUMN_HHNO + " TEXT,"
            + ChildContract.ChildTable.COLUMN_MOTHER_NAME + " TEXT,"
            + ChildContract.ChildTable.COLUMN_CHILD_NAME + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SERIAL + " TEXT,"
            + ChildContract.ChildTable.COLUMN_SCS + " TEXT"
            + " );")

    const val SQL_CREATE_IMMUNIZATION = ("CREATE TABLE "
            + IMContract.IMTable.TABLE_NAME + "("
            + IMContract.IMTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + IMContract.IMTable.COLUMN_PROJECT_NAME + " TEXT,"
            + IMContract.IMTable.COLUMN_UID + " TEXT,"
            + IMContract.IMTable.COLUMN_UUID + " TEXT,"
            + IMContract.IMTable.COLUMN_FMUID + " TEXT,"
            + IMContract.IMTable.COLUMN_USERNAME + " TEXT,"
            + IMContract.IMTable.COLUMN_SYSDATE + " TEXT,"
            + IMContract.IMTable.COLUMN_STATUS + " TEXT,"
            + IMContract.IMTable.COLUMN_DEVICEID + " TEXT,"
            + IMContract.IMTable.COLUMN_DEVICETAGID + " TEXT,"
            + IMContract.IMTable.COLUMN_SYNCED + " TEXT,"
            + IMContract.IMTable.COLUMN_SYNCED_DATE + " TEXT,"
            + IMContract.IMTable.COLUMN_APPVERSION + " TEXT,"
            + IMContract.IMTable.COLUMN_DCODE + " TEXT,"
            + IMContract.IMTable.COLUMN_UCODE + " TEXT,"
            + IMContract.IMTable.COLUMN_CLUSTER + " TEXT,"
            + IMContract.IMTable.COLUMN_HHNO + " TEXT,"
            + IMContract.IMTable.COLUMN_MOTHER_NAME + " TEXT,"
            + IMContract.IMTable.COLUMN_CHILD_NAME + " TEXT,"
            + IMContract.IMTable.COLUMN_SERIAL + " TEXT,"
            + IMContract.IMTable.COLUMN_SIM + " TEXT"
            + " );")

    const val SQL_CREATE_MOBILE_HEALTH = ("CREATE TABLE "
            + PDContract.MHTable.TABLE_NAME + "("
            + PDContract.MHTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PDContract.MHTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PDContract.MHTable.COLUMN_UID + " TEXT,"
            + PDContract.MHTable.COLUMN_USERNAME + " TEXT,"
            + PDContract.MHTable.COLUMN_SYSDATE + " TEXT,"
            + PDContract.MHTable.COLUMN_STATUS + " TEXT,"
            + PDContract.MHTable.COLUMN_DEVICEID + " TEXT,"
            + PDContract.MHTable.COLUMN_DEVICETAGID + " TEXT,"
            + PDContract.MHTable.COLUMN_SYNCED + " TEXT,"
            + PDContract.MHTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PDContract.MHTable.COLUMN_APPVERSION + " TEXT,"
            + PDContract.MHTable.COLUMN_SERIAL + " TEXT,"
            + PDContract.MHTable.COLUMN_SS101 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS102 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS103 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS104 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS105 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS106 + " TEXT,"
            + PDContract.MHTable.COLUMN_SS107 + " TEXT,"
            + PDContract.MHTable.COLUMN_SA + " TEXT"
            + " );")

    const val SQL_CREATE_USERS = ("CREATE TABLE " + Users.UsersTable.TABLE_NAME + "("
            + Users.UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Users.UsersTable.COLUMN_USERNAME + " TEXT,"
            + Users.UsersTable.COLUMN_PASSWORD + " TEXT,"
            + Users.UsersTable.COLUMN_FULLNAME + " TEXT,"
            + Users.UsersTable.COLUMN_ENABLED + " TEXT,"
            + Users.UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + Users.UsersTable.COLUMN_UC_CODE + " TEXT,"
            + Users.UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + Users.UsersTable.COLUMN_DIST_ID + " TEXT"
            + " );")

    const val SQL_ALTER_USERS_ENABLED = ("Alter TABLE "
            + Users.UsersTable.TABLE_NAME + " ADD "
            + Users.UsersTable.COLUMN_ENABLED + " TEXT"
            + " ;"
            )

    const val SQL_ALTER_USERS_ISNEW_USER = ("Alter TABLE "
            + Users.UsersTable.TABLE_NAME + " ADD "
            + Users.UsersTable.COLUMN_ISNEW_USER + " TEXT"
            + " ;"
            )
    const val SQL_ALTER_USERS_PWD_EXPIRY = ("Alter TABLE "
            + Users.UsersTable.TABLE_NAME + " ADD "
            + Users.UsersTable.COLUMN_PWD_EXPIRY + " TEXT"
            + " ;"
            )

    const val SQL_CREATE_DISTRICTS = ("CREATE TABLE " + Districts.TableDistricts.TABLE_NAME + "("
            + Districts.TableDistricts.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Districts.TableDistricts.COLUMN_DISTRICT_NAME + " TEXT,"
            + Districts.TableDistricts.COLUMN_DISTRICT_CODE + " TEXT"
            + " );")

    const val SQL_CREATE_FACILITIES =
        ("CREATE TABLE " + HealthFacilities.TableHealthFacilities.TABLE_NAME + "("
                + HealthFacilities.TableHealthFacilities.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_UC_CODE + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_UC_NAME + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_DISTRICT_CODE + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_FACILITY_NAME + " TEXT,"
                + HealthFacilities.TableHealthFacilities.COLUMN_FACILITY_CODE + " TEXT"
                + " );")

    const val SQL_CREATE_UCS = ("CREATE TABLE " + UCs.TableUCs.TABLE_NAME + "("
            + UCs.TableUCs.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UCs.TableUCs.COLUMN_UC_NAME + " TEXT,"
            + UCs.TableUCs.COLUMN_UC_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_DISTRICT_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_DISTRICT_NAME + " TEXT,"
            + UCs.TableUCs.COLUMN_PROVINCE_CODE + " TEXT,"
            + UCs.TableUCs.COLUMN_PROVINCE_NAME + " TEXT"
            + " );")

    const val SQL_CREATE_CLUSTERS = ("CREATE TABLE " + Clusters.TableClusters.TABLE_NAME + "("
            + Clusters.TableClusters.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Clusters.TableClusters.COLUMN_DIST_CODE + " TEXT,"
            + Clusters.TableClusters.COLUMN_CLUSTER_NAME + " TEXT,"
            + Clusters.TableClusters.COLUMN_CLUSTER_CODE + " TEXT"
            + " );")

    const val SQL_CREATE_BL_RANDOM = ("CREATE TABLE " + BLRandom.TableRandom.TABLE_NAME + "("
            + BLRandom.TableRandom.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + BLRandom.TableRandom.COLUMN_CLUSTER_CODE + " TEXT,"
            + BLRandom.TableRandom.COLUMN_DIST_CODE + " TEXT,"
            + BLRandom.TableRandom.COLUMN_LUID + " TEXT,"
            + BLRandom.TableRandom.COLUMN_HH + " TEXT,"
            + BLRandom.TableRandom.COLUMN_STRUCTURE_NO + " TEXT,"
            + BLRandom.TableRandom.COLUMN_FAMILY_EXT_CODE + " TEXT,"
            + BLRandom.TableRandom.COLUMN_HH_HEAD + " TEXT,"
            + BLRandom.TableRandom.COLUMN_CONTACT + " TEXT,"
            + BLRandom.TableRandom.COLUMN_UPDATEDT + " TEXT,"
            + BLRandom.TableRandom.COLUMN_RANDOMDT + " TEXT,"
            + BLRandom.TableRandom.COLUMN_SNO_HH + " TEXT );")

    const val SQL_CREATE_VERSIONAPP =
        "CREATE TABLE " + VersionApp.VersionAppTable.TABLE_NAME + " (" +
                VersionApp.VersionAppTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                VersionApp.VersionAppTable.COLUMN_VERSION_CODE + " TEXT, " +
                VersionApp.VersionAppTable.COLUMN_VERSION_NAME + " TEXT, " +
                VersionApp.VersionAppTable.COLUMN_PATH_NAME + " TEXT " +
                ");"

    const val SQL_CREATE_CAMP = ("CREATE TABLE " + Camps.TableCamp.TABLE_NAME + "("
            + Camps.TableCamp.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Camps.TableCamp.COLUMN_ID_CAMP + " TEXT,"
            + Camps.TableCamp.COLUMN_FACILITY_NAME + " TEXT,"
            + Camps.TableCamp.COLUMN_DIST_ID + " TEXT,"
            + Camps.TableCamp.COLUMN_FACILITY_CODE + " TEXT,"
            + Camps.TableCamp.COLUMN_UC_CODE + " TEXT,"
            + Camps.TableCamp.COLUMN_UC_NAME + " TEXT,"
            + Camps.TableCamp.COLUMN_AREA_NAME + " TEXT,"
            + Camps.TableCamp.COLUMN_PLAN_DATE + " TEXT"
            + " );")

    const val SQL_CREATE_DOCTOR = ("CREATE TABLE " + Doctor.TableDoctor.TABLE_NAME + "("
            + Doctor.TableDoctor.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Doctor.TableDoctor.COLUMN_UC_CODE + " TEXT,"
            + Doctor.TableDoctor.COLUMN_ID_DOCTOR + " TEXT,"
            + Doctor.TableDoctor.COLUMN_STAFF_NAME + " TEXT"
            + " );")

    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_PSU_CODE + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )
}