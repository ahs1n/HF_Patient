package edu.aku.hassannaqvi.hf_patient.models

import android.database.Cursor
import android.provider.BaseColumns
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

class VersionApp {
    var versioncode: String = StringUtils.EMPTY
    var versionname: String = StringUtils.EMPTY
    var pathname: String = StringUtils.EMPTY

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): VersionApp {
        versioncode = jsonObject.getString(VersionAppTable.COLUMN_VERSION_CODE)
        pathname = jsonObject.getString(VersionAppTable.COLUMN_PATH_NAME)
        versionname = jsonObject.getString(VersionAppTable.COLUMN_VERSION_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): VersionApp {
        versioncode =
            cursor.getString(cursor.getColumnIndexOrThrow(VersionAppTable.COLUMN_VERSION_CODE))
        pathname = cursor.getString(cursor.getColumnIndexOrThrow(VersionAppTable.COLUMN_PATH_NAME))
        versionname =
            cursor.getString(cursor.getColumnIndexOrThrow(VersionAppTable.COLUMN_VERSION_NAME))
        return this
    }

    object VersionAppTable : BaseColumns {
        const val TABLE_NAME = "VersionApp"
        const val COLUMN_ID = "id"
        const val COLUMN_VERSION_PATH = "elements"
        const val COLUMN_VERSION_CODE = "versionCode"
        const val COLUMN_VERSION_NAME = "versionName"
        const val COLUMN_PATH_NAME = "outputFile"
        const val SERVER_URI = "output-metadata.json"
    }
}