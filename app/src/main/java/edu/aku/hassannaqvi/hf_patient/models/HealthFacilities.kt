package edu.aku.hassannaqvi.hf_patient.models

import android.database.Cursor
import android.provider.BaseColumns
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 10/31/2016.
 * @update ali.azaz
 */
class HealthFacilities {
    var districtCode: String = StringUtils.EMPTY
    var ucCode: String = StringUtils.EMPTY
    var ucName: String = StringUtils.EMPTY
    var facilityCode: String = StringUtils.EMPTY
    var facilityName: String = StringUtils.EMPTY

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): HealthFacilities {
        districtCode = jsonObject.getString(TableHealthFacilities.COLUMN_DISTRICT_CODE)
        ucCode = jsonObject.getString(TableHealthFacilities.COLUMN_UC_CODE)
        ucName = jsonObject.getString(TableHealthFacilities.COLUMN_UC_NAME)
        facilityCode = jsonObject.getString(TableHealthFacilities.COLUMN_FACILITY_CODE)
        facilityName = jsonObject.getString(TableHealthFacilities.COLUMN_FACILITY_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): HealthFacilities {
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_DISTRICT_CODE))
        ucCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_UC_CODE))
        ucName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_UC_NAME))
        facilityCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_FACILITY_CODE))
        facilityName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableHealthFacilities.COLUMN_FACILITY_NAME))
        return this
    }

    object TableHealthFacilities : BaseColumns {
        const val TABLE_NAME = "hf_list"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_ID"
        const val COLUMN_UC_CODE = "uccode"
        const val COLUMN_UC_NAME = "ucname"
        const val COLUMN_DISTRICT_CODE = "distcode"
        const val COLUMN_FACILITY_NAME = "hf_name"
        const val COLUMN_FACILITY_CODE = "hf_code"
    }
}