package edu.aku.hassannaqvi.hf_patient

class CONSTANTS {
    companion object {
        //For Login
        const val MY_PERMISSIONS_REQUEST_READ_CONTACTS = 0
        const val MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 2
        const val TWO_MINUTES = 1000 * 60 * 2
        const val MINIMUM_DISTANCE_CHANGE_FOR_UPDATES: Long = 1 // in Meters
        const val MINIMUM_TIME_BETWEEN_UPDATES: Long = 1000 // in Milliseconds

        const val SYNC_LOGIN = "sync_login"
        const val SYNC_CAMPID_LOGIN = "camp_id_login"

        //For I
        const val SECTION_MAIN_CHECK_FOR_END = "section_main_check"

        const val CAMP_DATA = "campDATA"
        const val SELECTED_CAMP_DATA = "selectedCampData"
        const val SELECTED_FACILITY_DATA = "selectedFacilityData"

        const val MINYEAR = 1940
    }
}