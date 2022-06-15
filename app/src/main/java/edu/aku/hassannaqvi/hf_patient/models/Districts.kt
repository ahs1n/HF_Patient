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
class Districts {
    var districtCode: String = StringUtils.EMPTY
    var districtName: String = StringUtils.EMPTY

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Districts {
        districtCode = jsonObject.getString(TableDistricts.COLUMN_DISTRICT_CODE)
        districtName = jsonObject.getString(TableDistricts.COLUMN_DISTRICT_NAME)
        return this
    }

    fun hydrate(cursor: Cursor): Districts {
        districtCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_CODE))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(TableDistricts.COLUMN_DISTRICT_NAME))
        return this
    }

    object TableDistricts : BaseColumns {
        const val TABLE_NAME = "districts"
        const val COLUMN_NAME_NULLABLE = "nullColumnHack"
        const val COLUMN_ID = "_ID"
        const val COLUMN_DISTRICT_CODE = "dist_id"
        const val COLUMN_DISTRICT_NAME = "district"
    }
}