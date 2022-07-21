package edu.aku.hassannaqvi.hf_patient.base.repository

import edu.aku.hassannaqvi.hf_patient.models.*
import kotlinx.coroutines.flow.Flow

interface GeneralDataSource {

    /*
    * For login Start
    * */
    suspend fun getLoginInformation(username: String, password: String): Users?
    /*
    * For login End
    * */

    /*
    * For MainActivity Start
    * */
    suspend fun getFormsByDate(date: String): Flow<ArrayList<Form>>

    suspend fun getUploadStatus(): Flow<FormIndicatorsModel>

    suspend fun getFormStatus(date: String): Flow<FormIndicatorsModel>

    suspend fun getFacilitiesFromDB(): ArrayList<HealthFacilities>
    /*
    * For MainActivity End
    * */

    /*
    * For Child List
    * */
    suspend fun getChildList(
        cluster: String,
        hhno: String,
        uuid: String
    ): ArrayList<ChildInformation>

    suspend fun updateSpecificChildList(info: ChildInformation, isSelected: String): Int
    /*
    * For Child List End
    * */

    /*
    * For SectionH1 & Identification
    * */
    suspend fun getCampsFromDB(campNo: String, distCode: String): Camps

    suspend fun getUcsByDistrictsFromDB(dCode: String): ArrayList<UCs>

    suspend fun getBLByDistrictsFromDB(distCode: String, cluster: String, hhno: String): BLRandom

    suspend fun getFormByDistrictsFromDB(distCode: String, cluster: String, hhno: String): Form
    /*
    * For SectionH1 & Identification End
    * */

    /*
    * For Section Selected ChildList
    * */
    suspend fun getSelectedChildList(
        cluster: String,
        hhno: String,
        uuid: String
    ): ArrayList<ChildInformation>
    /*
    * For SectionH1 End
    * */

}