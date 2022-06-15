package edu.aku.hassannaqvi.hf_patient.models

import android.database.Cursor
import android.provider.BaseColumns
import org.apache.commons.lang3.StringUtils
import org.json.JSONException
import org.json.JSONObject
import java.util.*

class BLRandom {
    var id: String = StringUtils.EMPTY
    var lUID: String = StringUtils.EMPTY
    var distCode: String = StringUtils.EMPTY
    var clusterCode: String = StringUtils.EMPTY
    var structure: String = StringUtils.EMPTY
    var extension: String = StringUtils.EMPTY
    var hh: String = StringUtils.EMPTY
    var hhhead: String = StringUtils.EMPTY
    var randomDT: String = StringUtils.EMPTY
    var contact: String = StringUtils.EMPTY
    var updateDT: String = StringUtils.EMPTY
    var sno: String = StringUtils.EMPTY
    var tabno: String = StringUtils.EMPTY

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): BLRandom {
        lUID = jsonObject.getString(TableRandom.COLUMN_LUID)
        clusterCode = jsonObject.getString(TableRandom.COLUMN_CLUSTER_CODE)
        distCode = jsonObject.getString(TableRandom.COLUMN_DIST_CODE)
        structure = jsonObject.getString(TableRandom.COLUMN_STRUCTURE_NO)
        structure = String.format("%04d", Integer.valueOf(structure), Locale.ENGLISH)
        extension = jsonObject.getString(TableRandom.COLUMN_FAMILY_EXT_CODE)
        extension = String.format("%03d", Integer.valueOf(extension), Locale.ENGLISH)
        tabno = jsonObject.getString(TableRandom.COLUMN_TAB_NO)
        hh = "$tabno-$structure-$extension"
        randomDT = jsonObject.getString(TableRandom.COLUMN_RANDOMDT)
        hhhead = jsonObject.getString(TableRandom.COLUMN_HH_HEAD)
        contact = jsonObject.getString(TableRandom.COLUMN_CONTACT)
        updateDT = jsonObject.getString(TableRandom.COLUMN_UPDATEDT)
        sno = jsonObject.getString(TableRandom.COLUMN_SNO_HH)
        return this
    }

    fun hydrate(cursor: Cursor): BLRandom {
        id = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_ID))
        lUID = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_LUID))
        clusterCode =
            cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_CLUSTER_CODE))
        distCode = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_DIST_CODE))
        structure = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_STRUCTURE_NO))
        extension =
            cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_FAMILY_EXT_CODE))
        hh = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_HH))
        randomDT = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_RANDOMDT))
        hhhead = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_HH_HEAD))
        contact = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_CONTACT))
        updateDT = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_UPDATEDT))
        sno = cursor.getString(cursor.getColumnIndexOrThrow(TableRandom.COLUMN_SNO_HH))
        return this
    }

    object TableRandom : BaseColumns {
        const val TABLE_NAME = "bl_randomised"
        const val COLUMN_ID = "_id"
        const val COLUMN_RANDOMDT = "randDT"
        const val COLUMN_LUID = "UID"
        const val COLUMN_SNO_HH = "sno"
        const val COLUMN_CLUSTER_CODE = "hh02"
        const val COLUMN_STRUCTURE_NO = "hh03"
        const val COLUMN_FAMILY_EXT_CODE = "hh07"
        const val COLUMN_HH = "hh"
        const val COLUMN_HH_HEAD = "hh08"
        const val COLUMN_CONTACT = "hh09"
        const val COLUMN_DIST_CODE = "dist_id"
        const val COLUMN_UPDATEDT = "updDt"
        const val COLUMN_TAB_NO = "tabNo"
    }

}