package edu.aku.hassannaqvi.hf_patient.models

import android.database.Cursor
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class Users {
    var userID: Long = 0
    var userName: String = StringUtils.EMPTY
    var password: String = StringUtils.EMPTY
    var fullname: String = StringUtils.EMPTY
    var dist_id: String = StringUtils.EMPTY
    var enabled: String = StringUtils.EMPTY
    var pwdExpiry: String = StringUtils.EMPTY
    var newUser: String = StringUtils.EMPTY

    constructor() {
        // Default Constructor
    }

    constructor(username: String, fullname: String) {
        userName = username
        this.fullname = fullname
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Users {
        userName = jsonObject.getString(UsersTable.COLUMN_USERNAME)
        password = jsonObject.getString(UsersTable.COLUMN_PASSWORD)
        fullname = jsonObject.getString(UsersTable.COLUMN_FULLNAME)
        dist_id = jsonObject.getString(UsersTable.COLUMN_DIST_ID)
        enabled = jsonObject.getString(UsersTable.COLUMN_ENABLED)
        pwdExpiry = jsonObject.getString(UsersTable.COLUMN_PWD_EXPIRY)
        newUser = jsonObject.getString(UsersTable.COLUMN_ISNEW_USER)
        return this
    }

    fun hydrate(cursor: Cursor): Users {
        userID = cursor.getLong(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_ID))
        userName = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_USERNAME))
        password = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_PASSWORD))
        fullname = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_FULLNAME))
        dist_id = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_DIST_ID))
        enabled = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_ENABLED))
        pwdExpiry = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_PWD_EXPIRY))
        newUser = cursor.getString(cursor.getColumnIndexOrThrow(UsersTable.COLUMN_ISNEW_USER))
        return this
    }

    object UsersTable {
        const val TABLE_NAME = "Users"
        const val COLUMN_ID = "_id"
        const val COLUMN_USERNAME = "username"
        const val COLUMN_PASSWORD = "passwordenc"
        const val COLUMN_FULLNAME = "full_name"
        const val COLUMN_DIST_ID = "dist_id"
        const val COLUMN_ENABLED = "enabled"
        const val COLUMN_ISNEW_USER = "isNewUser"
        const val COLUMN_PWD_EXPIRY = "pwdExpiry"
    }
}