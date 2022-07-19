package edu.aku.hassannaqvi.hf_patient.models

import android.database.Cursor
import android.provider.BaseColumns
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 10/31/2016.
 * @update ali.azaz
 * @update muhammad.hussain
 */
class UCs {
    var ucCode: String = StringUtils.EMPTY
    var ucName: String = StringUtils.EMPTY
    var distCode: String = StringUtils.EMPTY
    var distName: String = StringUtils.EMPTY
    var provCode: String = StringUtils.EMPTY
    var provName: String = StringUtils.EMPTY

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): UCs {
        ucCode = jsonObject.getString(TableUCs.COLUMN_UC_CODE)
        ucName = jsonObject.getString(TableUCs.COLUMN_UC_NAME)
        distCode = jsonObject.getString(TableUCs.COLUMN_DISTRICT_CODE)
        distName = jsonObject.getString(TableUCs.COLUMN_DISTRICT_NAME)
        provCode = jsonObject.getString(TableUCs.COLUMN_PROVINCE_CODE)
        provName = jsonObject.getString(TableUCs.COLUMN_PROVINCE_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): UCs {
        ucCode = cursor.getString(cursor.getColumnIndexOrThrow(TableUCs.COLUMN_UC_CODE))
        ucName = cursor.getString(cursor.getColumnIndexOrThrow(TableUCs.COLUMN_UC_NAME))
        distCode = cursor.getString(cursor.getColumnIndexOrThrow(TableUCs.COLUMN_DISTRICT_CODE))
        distName = cursor.getString(cursor.getColumnIndexOrThrow(TableUCs.COLUMN_DISTRICT_NAME))
        provCode = cursor.getString(cursor.getColumnIndexOrThrow(TableUCs.COLUMN_PROVINCE_CODE))
        provName = cursor.getString(cursor.getColumnIndexOrThrow(TableUCs.COLUMN_PROVINCE_NAME))
        return this
    }

    object TableUCs : BaseColumns {
        const val TABLE_NAME = "uclist"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_ID"
        const val COLUMN_UC_CODE = "uccode"
        const val COLUMN_UC_NAME = "ucname"
        const val COLUMN_DISTRICT_CODE = "distcode"
        const val COLUMN_DISTRICT_NAME = "distname"
        const val COLUMN_PROVINCE_CODE = "provcode"
        const val COLUMN_PROVINCE_NAME = "provname"
    }
}