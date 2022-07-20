package edu.aku.hassannaqvi.hf_patient.models

import android.database.Cursor
import android.provider.BaseColumns
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject


class Doctor {
    var ucCode: String = StringUtils.EMPTY
    var iddoctor: String = StringUtils.EMPTY
    var staff_name: String = StringUtils.EMPTY

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Doctor {
        ucCode = jsonObject.getString(TableDoctor.COLUMN_UC_CODE)
        iddoctor = jsonObject.getString(TableDoctor.COLUMN_ID_DOCTOR)
        staff_name = jsonObject.getString(TableDoctor.COLUMN_STAFF_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): Doctor {
        ucCode = cursor.getString(cursor.getColumnIndexOrThrow(TableDoctor.COLUMN_UC_CODE))
        iddoctor = cursor.getString(cursor.getColumnIndexOrThrow(TableDoctor.COLUMN_ID_DOCTOR))
        staff_name = cursor.getString(cursor.getColumnIndexOrThrow(TableDoctor.COLUMN_STAFF_NAME))
        return this
    }

    object TableDoctor : BaseColumns {
        const val TABLE_NAME = "doctorlist"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_ID"
        const val COLUMN_UC_CODE = "ucCode"
        const val COLUMN_ID_DOCTOR = "idDoctor"
        const val COLUMN_STAFF_NAME = "staff_name"
    }
}