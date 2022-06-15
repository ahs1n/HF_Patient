package edu.aku.hassannaqvi.hf_patient.models;

import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.hf_patient.BR;
import edu.aku.hassannaqvi.hf_patient.contracts.ChildContract;
import edu.aku.hassannaqvi.hf_patient.core.MainApp;

public class Child extends BaseObservable {

    // FIELD VARIABLES
    //Section CS
    private String cs01 = StringUtils.EMPTY;
    private String cs02 = StringUtils.EMPTY;
    private String cs02a = StringUtils.EMPTY;
    private String cs02b = StringUtils.EMPTY;
    private String cs03 = StringUtils.EMPTY;
    private String cs04 = StringUtils.EMPTY;
    private String cs05 = StringUtils.EMPTY;
    private String cs06 = StringUtils.EMPTY;
    private String cs07 = StringUtils.EMPTY;
    private String cs07961x = StringUtils.EMPTY;
    private String cs07962x = StringUtils.EMPTY;
    private String cs08 = StringUtils.EMPTY;
    private String cs0801 = StringUtils.EMPTY;
    private String cs0802 = StringUtils.EMPTY;
    private String cs0803 = StringUtils.EMPTY;
    private String cs0804 = StringUtils.EMPTY;
    private String cs0805 = StringUtils.EMPTY;
    private String cs0806 = StringUtils.EMPTY;
    private String cs0807 = StringUtils.EMPTY;
    private String cs0808 = StringUtils.EMPTY;
    private String cs0809 = StringUtils.EMPTY;
    private String cs0810 = StringUtils.EMPTY;
    private String cs0896 = StringUtils.EMPTY;
    private String cs0896x = StringUtils.EMPTY;
    private String cs08a = StringUtils.EMPTY;
    private String cs08b = StringUtils.EMPTY;
    private String cs09 = StringUtils.EMPTY;
    private String cs0996x = StringUtils.EMPTY;
    private String cs10 = StringUtils.EMPTY;
    private String cs11 = StringUtils.EMPTY;
    private String cs12 = StringUtils.EMPTY;
    private String cs13 = StringUtils.EMPTY;
    private String cs14 = StringUtils.EMPTY;
    private String cs15 = StringUtils.EMPTY;
    private String cs1596x = StringUtils.EMPTY;
    private String cs16 = StringUtils.EMPTY;
    private String cs17 = StringUtils.EMPTY;
    private String cs17961x = StringUtils.EMPTY;
    private String cs17962x = StringUtils.EMPTY;
    private String cs1802 = StringUtils.EMPTY;
    private String cs1803 = StringUtils.EMPTY;
    private String cs1804 = StringUtils.EMPTY;
    private String cs1805 = StringUtils.EMPTY;
    private String cs1806 = StringUtils.EMPTY;
    private String cs1807 = StringUtils.EMPTY;
    private String cs1808 = StringUtils.EMPTY;
    private String cs1896 = StringUtils.EMPTY;
    private String cs1896x = StringUtils.EMPTY;
    private String cs18a = StringUtils.EMPTY;
    private String cs18b = StringUtils.EMPTY;
    private String cs19 = StringUtils.EMPTY;
    private String cs20 = StringUtils.EMPTY;
    private String cs21 = StringUtils.EMPTY;

    private String cs1996x = StringUtils.EMPTY;
    private String csdate = StringUtils.EMPTY;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    private String id;
    private String uid;
    private String fmuid;
    private String uuid;
    private String userName;
    private String sysDate;
    private String dcode;
    private String ucode;
    private String cluster;
    private String hhno;
    private String deviceId;
    private String deviceTag;
    private String appver;
    private String endTime;
    private String synced;
    private String syncDate;
    private String status;
    // SECTION VARIABLES
    private String mothername;
    private String childname;
    private String serial;
    private String scs;

    public Child(String cs01, String cs02, String mothername, String fmuid) {
        this.cs01 = cs01;
        this.cs02 = cs02;
        this.mothername = mothername;
        this.fmuid = fmuid;
    }

    public Child() {

    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }

    @Bindable
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        if (projectName != projectName)
            this.projectName = projectName;

        //TODO: Update field in layout
        // notifyPropertyChanged(BR.layoutFieldName);
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }


    @Bindable
    public String getUid() {
        return uid;
    }

    public Child setUid(String uid) {
        this.uid = uid;
        return this;
    }


    @Bindable
    public String getUuid() {
        return uuid;
    }

    public Child setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public Child setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDcode() {
        return dcode;
    }

    public Child setDcode(String dcode) {
        this.dcode = dcode;
        return this;
    }


    @Bindable
    public String getUcode() {
        return ucode;
    }

    public Child setUcode(String ucode) {
        this.ucode = ucode;
        return this;
    }


    @Bindable
    public String getCluster() {
        return cluster;
    }

    public Child setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }


    @Bindable
    public String getHhno() {
        return hhno;
    }

    public Child setHhno(String hhno) {
        this.hhno = hhno;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Child setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Child setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Child setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Child setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }


    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Child setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    @Bindable
    public String getSynced() {
        return synced;
    }

    public Child setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Child setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    public String getStatus() {
        return status;
    }

    public Child setStatus(String status) {
        this.status = status;
        return this;
    }


    public String getMothername() {
        return mothername;
    }

    public Child setMothername(String mothername) {
        this.mothername = mothername;
        return this;
    }


    public String getChildname() {
        return childname;
    }

    public Child setChildname(String childname) {
        this.childname = childname;
        return this;
    }


    public String getSerial() {
        return serial;
    }

    public Child setSerial(String serial) {
        this.serial = serial;
        return this;
    }


    public String getScs() {
        return scs;
    }

    public Child setScs(String scs) {
        this.scs = scs;
        return this;
    }


    @Bindable
    public String getCs01() {
        return cs01;
    }

    public void setCs01(String cs01) {
        this.cs01 = cs01;
        notifyPropertyChanged(BR.cs01);
    }

    @Bindable
    public String getCs02() {
        return cs02;
    }

    public void setCs02(String cs02) {
        this.cs02 = cs02;
        notifyPropertyChanged(BR.cs02);
    }


    @Bindable
    public String getCs02a() {
        return cs02a;
    }

    public void setCs02a(String cs02a) {
        this.cs02a = cs02a;
        notifyPropertyChanged(BR.cs02a);
    }


    @Bindable
    public String getCs02b() {
        return cs02b;
    }

    public void setCs02b(String cs02b) {
        this.cs02b = cs02b;
        notifyPropertyChanged(BR.cs02b);
    }


    @Bindable
    public String getCs03() {
        return cs03;
    }

    public void setCs03(String cs03) {
        this.cs03 = cs03;
        notifyPropertyChanged(BR.cs03);
    }

    @Bindable
    public String getCs04() {
        return cs04;
    }

    public void setCs04(String cs04) {
        this.cs04 = cs04;
        notifyPropertyChanged(BR.cs04);
    }

    @Bindable
    public String getCs05() {
        return cs05;
    }

    public void setCs05(String cs05) {
        this.cs05 = cs05;
        notifyPropertyChanged(BR.cs05);
    }

    @Bindable
    public String getCs06() {
        return cs06;
    }

    public void setCs06(String cs06) {
        this.cs06 = cs06;
        notifyPropertyChanged(BR.cs06);
    }

    @Bindable
    public String getCs07() {
        return cs07;
    }

    public void setCs07(String cs07) {
        this.cs07 = cs07;
        notifyPropertyChanged(BR.cs07);
    }

    @Bindable
    public String getCs07961x() {
        return cs07961x;
    }

    public void setCs07961x(String cs07961x) {
        this.cs07961x = cs07961x;
        notifyPropertyChanged(BR.cs07961x);
    }

    @Bindable
    public String getCs07962x() {
        return cs07962x;
    }

    public void setCs07962x(String cs07962x) {
        this.cs07962x = cs07962x;
        notifyPropertyChanged(BR.cs07962x);
    }

    @Bindable
    public String getCs08() {
        return cs08;
    }

    public void setCs08(String cs08) {
        this.cs08 = cs08;
        notifyPropertyChanged(BR.cs08);
    }

    @Bindable
    public String getCs0801() {
        return cs0801;
    }

    public void setCs0801(String cs0801) {
        this.cs0801 = cs0801;
        notifyPropertyChanged(BR.cs0801);
    }

    @Bindable
    public String getCs0802() {
        return cs0802;
    }

    public void setCs0802(String cs0802) {
        this.cs0802 = cs0802;
        notifyPropertyChanged(BR.cs0802);
    }

    @Bindable
    public String getCs0803() {
        return cs0803;
    }

    public void setCs0803(String cs0803) {
        this.cs0803 = cs0803;
        notifyPropertyChanged(BR.cs0803);
    }

    @Bindable
    public String getCs0804() {
        return cs0804;
    }

    public void setCs0804(String cs0804) {
        this.cs0804 = cs0804;
        notifyPropertyChanged(BR.cs0804);
    }

    @Bindable
    public String getCs0805() {
        return cs0805;
    }

    public void setCs0805(String cs0805) {
        this.cs0805 = cs0805;
        notifyPropertyChanged(BR.cs0805);
    }

    @Bindable
    public String getCs0806() {
        return cs0806;
    }

    public void setCs0806(String cs0806) {
        this.cs0806 = cs0806;
        notifyPropertyChanged(BR.cs0806);
    }

    @Bindable
    public String getCs0807() {
        return cs0807;
    }

    public void setCs0807(String cs0807) {
        this.cs0807 = cs0807;
        notifyPropertyChanged(BR.cs0807);
    }

    @Bindable
    public String getCs0808() {
        return cs0808;
    }

    public void setCs0808(String cs0808) {
        this.cs0808 = cs0808;
        notifyPropertyChanged(BR.cs0808);
    }

    @Bindable
    public String getCs0809() {
        return cs0809;
    }

    public void setCs0809(String cs0809) {
        this.cs0809 = cs0809;
        notifyPropertyChanged(BR.cs0809);
    }

    @Bindable
    public String getCs0810() {
        return cs0810;
    }

    public void setCs0810(String cs0810) {
        this.cs0810 = cs0810;
        notifyPropertyChanged(BR.cs0810);
    }

    @Bindable
    public String getCs0896() {
        return cs0896;
    }

    public void setCs0896(String cs0896) {
        this.cs0896 = cs0896;
        notifyPropertyChanged(BR.cs0896);
        notifyPropertyChanged(BR.cs0896x);
    }

    @Bindable
    public String getCs0896x() {
        return cs0896x;
    }

    public void setCs0896x(String cs0896x) {
        this.cs0896x = cs0896x;
        notifyPropertyChanged(BR.cs0896x);
    }


    @Bindable
    public String getCs08a() {
        return cs08a;
    }

    public void setCs08a(String cs08a) {
        this.cs08a = cs08a;
        notifyPropertyChanged(BR.cs08a);
    }


    @Bindable
    public String getCs08b() {
        return cs08b;
    }

    public void setCs08b(String cs08b) {
        this.cs08b = cs08b;
        notifyPropertyChanged(BR.cs08b);
    }


    @Bindable
    public String getCs09() {
        return cs09;
    }

    public void setCs09(String cs09) {
        this.cs09 = cs09;
        notifyPropertyChanged(BR.cs09);
    }

    @Bindable
    public String getCs0996x() {
        return cs0996x;
    }

    public void setCs0996x(String cs0996x) {
        this.cs0996x = cs0996x;
        notifyPropertyChanged(BR.cs0996x);
    }

    @Bindable
    public String getCs10() {
        return cs10;
    }

    public void setCs10(String cs10) {
        this.cs10 = cs10;
        notifyPropertyChanged(BR.cs10);
    }

    @Bindable
    public String getCs11() {
        return cs11;
    }

    public void setCs11(String cs11) {
        this.cs11 = cs11;
        notifyPropertyChanged(BR.cs11);
    }

    @Bindable
    public String getCs12() {
        return cs12;
    }

    public void setCs12(String cs12) {
        this.cs12 = cs12;
        notifyPropertyChanged(BR.cs12);
    }

    @Bindable
    public String getCs13() {
        return cs13;
    }

    public void setCs13(String cs13) {
        this.cs13 = cs13;
        notifyPropertyChanged(BR.cs13);
    }

    @Bindable
    public String getCs14() {
        return cs14;
    }

    public void setCs14(String cs14) {
        this.cs14 = cs14;
        notifyPropertyChanged(BR.cs14);
    }

    @Bindable
    public String getCs15() {
        return cs15;
    }

    public void setCs15(String cs15) {
        this.cs15 = cs15;
        notifyPropertyChanged(BR.cs15);
    }

    @Bindable
    public String getCs1596x() {
        return cs1596x;
    }

    public void setCs1596x(String cs1596x) {
        this.cs1596x = cs1596x;
        notifyPropertyChanged(BR.cs1596x);
    }

    @Bindable
    public String getCs16() {
        return cs16;
    }

    public void setCs16(String cs16) {
        this.cs16 = cs16;
        notifyPropertyChanged(BR.cs16);
    }

    @Bindable
    public String getCs17() {
        return cs17;
    }

    public void setCs17(String cs17) {
        this.cs17 = cs17;
        notifyPropertyChanged(BR.cs17);
    }


    @Bindable
    public String getCs17961x() {
        return cs17961x;
    }

    public void setCs17961x(String cs17961x) {
        this.cs17961x = cs17961x;
        notifyPropertyChanged(BR.cs17961x);
    }

    @Bindable
    public String getCs17962x() {
        return cs17962x;
    }

    public void setCs17962x(String cs17962x) {
        this.cs17962x = cs17962x;
        notifyPropertyChanged(BR.cs17962x);
    }


    @Bindable
    public String getCs1802() {
        return cs1802;
    }

    public void setCs1802(String cs1802) {
        this.cs1802 = cs1802;
        notifyPropertyChanged(BR.cs1802);
    }


    @Bindable
    public String getCs1803() {
        return cs1803;
    }

    public void setCs1803(String cs1803) {
        this.cs1803 = cs1803;
        notifyPropertyChanged(BR.cs1803);
    }


    @Bindable
    public String getCs1804() {
        return cs1804;
    }

    public void setCs1804(String cs1804) {
        this.cs1804 = cs1804;
        notifyPropertyChanged(BR.cs1804);
    }


    @Bindable
    public String getCs1805() {
        return cs1805;
    }

    public void setCs1805(String cs1805) {
        this.cs1805 = cs1805;
        notifyPropertyChanged(BR.cs1805);
    }


    @Bindable
    public String getCs1806() {
        return cs1806;
    }

    public void setCs1806(String cs1806) {
        this.cs1806 = cs1806;
        notifyPropertyChanged(BR.cs1806);
    }


    @Bindable
    public String getCs1807() {
        return cs1807;
    }

    public void setCs1807(String cs1807) {
        this.cs1807 = cs1807;
        notifyPropertyChanged(BR.cs1807);
    }


    @Bindable
    public String getCs1808() {
        return cs1808;
    }

    public void setCs1808(String cs1808) {
        this.cs1808 = cs1808;
        notifyPropertyChanged(BR.cs1808);
    }


    @Bindable
    public String getCs1896() {
        return cs1896;
    }

    public void setCs1896(String cs1896) {
        this.cs1896 = cs1896;
        notifyPropertyChanged(BR.cs1896);
    }


    @Bindable
    public String getCs1896x() {
        return cs1896x;
    }

    public void setCs1896x(String cs1896x) {
        this.cs1896x = cs1896x;
        notifyPropertyChanged(BR.cs1896x);
    }


    @Bindable
    public String getCs18a() {
        return cs18a;
    }

    public void setCs18a(String cs18a) {
        this.cs18a = cs18a;
        notifyPropertyChanged(BR.cs18a);
    }


    @Bindable
    public String getCs18b() {
        return cs18b;
    }

    public void setCs18b(String cs18b) {
        this.cs18b = cs18b;
        notifyPropertyChanged(BR.cs18b);
    }


    @Bindable
    public String getCs19() {
        return cs19;
    }

    public void setCs19(String cs19) {
        this.cs19 = cs19;
        notifyPropertyChanged(BR.cs19);
    }

    @Bindable
    public String getCs1996x() {
        return cs1996x;
    }

    public void setCs1996x(String cs1996x) {
        this.cs1996x = cs1996x;
        notifyPropertyChanged(BR.cs1996x);
    }


    @Bindable
    public String getCs20() {
        return cs20;
    }

    public void setCs20(String cs20) {
        this.cs20 = cs20;
        notifyPropertyChanged(BR.cs20);
    }

    @Bindable
    public String getCs21() {
        return cs21;
    }

    public void setCs21(String cs21) {
        this.cs21 = cs21;
        notifyPropertyChanged(BR.cs21);
    }

    @Bindable
    public String getCsdate() {
        return csdate;
    }

    public void setCsdate(String csdate) {
        this.csdate = csdate;
        notifyPropertyChanged(BR.csdate);
    }


    public Child Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(ChildContract.ChildTable.COLUMN_ID);
        this.uid = jsonObject.getString(ChildContract.ChildTable.COLUMN_UID);
        this.uuid = jsonObject.getString(ChildContract.ChildTable.COLUMN_UUID);
        this.fmuid = jsonObject.getString(ChildContract.ChildTable.COLUMN_FMUID);
        this.userName = jsonObject.getString(ChildContract.ChildTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(ChildContract.ChildTable.COLUMN_SYSDATE);
        this.dcode = jsonObject.getString(ChildContract.ChildTable.COLUMN_DCODE);
        this.ucode = jsonObject.getString(ChildContract.ChildTable.COLUMN_UCODE);
        this.cluster = jsonObject.getString(ChildContract.ChildTable.COLUMN_CLUSTER);
        this.hhno = jsonObject.getString(ChildContract.ChildTable.COLUMN_HHNO);
        this.deviceId = jsonObject.getString(ChildContract.ChildTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(ChildContract.ChildTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(ChildContract.ChildTable.COLUMN_APPVERSION);
        this.synced = jsonObject.getString(ChildContract.ChildTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(ChildContract.ChildTable.COLUMN_SYNCED_DATE);
        this.status = jsonObject.getString(ChildContract.ChildTable.COLUMN_STATUS);
        this.mothername = jsonObject.getString(ChildContract.ChildTable.COLUMN_MOTHER_NAME);
        this.childname = jsonObject.getString(ChildContract.ChildTable.COLUMN_CHILD_NAME);
        this.serial = jsonObject.getString(ChildContract.ChildTable.COLUMN_SERIAL);

        this.scs = jsonObject.getString(ChildContract.ChildTable.COLUMN_SCS);

        return this;

    }


    public Child Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_FMUID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_SYSDATE));
        this.dcode = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_DCODE));
        this.ucode = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_UCODE));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_CLUSTER));
        this.hhno = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_HHNO));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_SYNCED_DATE));
        this.status = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_STATUS));
        this.mothername = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_MOTHER_NAME));
        this.childname = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_CHILD_NAME));
        this.serial = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_SERIAL));

        //For childCount
        //this.s01HH = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_S01HH));

        s03CSHydrate(cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_SCS)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Child.class);
    }


    public String s03CStoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("cs01", cs01)
                    .put("cs02", cs02)
                    .put("cs02a", cs02a)
                    .put("cs02b", cs02b)
                    .put("cs03", cs03)
                    .put("cs04", cs04)
                    .put("cs05", cs05)
                    .put("cs06", cs06)
                    .put("cs07", cs07)
                    .put("cs07961x", cs07961x)
                    .put("cs07962x", cs07962x)
                    .put("cs08", cs08)
                    .put("cs0801", cs0801)
                    .put("cs0802", cs0802)
                    .put("cs0803", cs0803)
                    .put("cs0804", cs0804)
                    .put("cs0805", cs0805)
                    .put("cs0806", cs0806)
                    .put("cs0807", cs0807)
                    .put("cs0808", cs0808)
                    .put("cs0809", cs0809)
                    .put("cs0810", cs0810)
                    .put("cs0896", cs0896)
                    .put("cs0896x", cs0896x)
                    .put("cs08a", cs08a)
                    .put("cs08b", cs08b)
                    .put("cs09", cs09)
                    .put("cs0996x", cs0996x)
                    .put("cs10", cs10)
                    .put("cs11", cs11)
                    .put("cs12", cs12)
                    .put("cs13", cs13)
                    .put("cs14", cs14)
                    .put("cs15", cs15)
                    .put("cs1596x", cs1596x)
                    .put("cs16", cs16)
                    .put("cs17", cs17)
                    .put("cs17961x", cs17961x)
                    .put("cs17962x", cs17962x)
                    .put("cs1802", cs1802)
                    .put("cs1803", cs1803)
                    .put("cs1804", cs1804)
                    .put("cs1805", cs1805)
                    .put("cs1806", cs1806)
                    .put("cs1807", cs1807)
                    .put("cs1808", cs1808)
                    .put("cs1896", cs1896)
                    .put("cs1896x", cs1896x)
                    .put("cs18a", cs18a)
                    .put("cs18b", cs18b)
                    .put("cs19", cs19)
                    .put("cs1996x", cs1996x)
                    .put("cs20", cs20)
                    .put("cs21", cs21)
                    .put("csdate", csdate);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(ChildContract.ChildTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(ChildContract.ChildTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(ChildContract.ChildTable.COLUMN_UUID, this.uuid == null ? JSONObject.NULL : this.uuid);
            json.put(ChildContract.ChildTable.COLUMN_FMUID, this.fmuid == null ? JSONObject.NULL : this.fmuid);
            json.put(ChildContract.ChildTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(ChildContract.ChildTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(ChildContract.ChildTable.COLUMN_DCODE, this.dcode == null ? JSONObject.NULL : this.dcode);
            json.put(ChildContract.ChildTable.COLUMN_UCODE, this.ucode == null ? JSONObject.NULL : this.ucode);
            json.put(ChildContract.ChildTable.COLUMN_CLUSTER, this.cluster == null ? JSONObject.NULL : this.cluster);
            json.put(ChildContract.ChildTable.COLUMN_HHNO, this.hhno == null ? JSONObject.NULL : this.hhno);
            json.put(ChildContract.ChildTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(ChildContract.ChildTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);
            json.put(ChildContract.ChildTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(ChildContract.ChildTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(ChildContract.ChildTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);
            json.put(ChildContract.ChildTable.COLUMN_STATUS, this.status == null ? JSONObject.NULL : this.status);
            json.put(ChildContract.ChildTable.COLUMN_MOTHER_NAME, this.mothername == null ? JSONObject.NULL : this.mothername);
            json.put(ChildContract.ChildTable.COLUMN_CHILD_NAME, this.childname == null ? JSONObject.NULL : this.childname);
            json.put(ChildContract.ChildTable.COLUMN_SERIAL, this.serial == null ? JSONObject.NULL : this.serial);

            //For ChildCount
            //json.put(ChildContract.ChildTable.COLUMN_S08SE, this.s08SE == null ? JSONObject.NULL : this.s08SE);

            json.put(ChildContract.ChildTable.COLUMN_SCS, new JSONObject(s03CStoString()));


            if (this.scs != null && !this.scs.equals("")) {
                json.put(ChildContract.ChildTable.COLUMN_SCS, new JSONObject(this.scs));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void s03CSHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.cs01 = json.getString("cs01");
                this.cs02 = json.getString("cs02");
                this.cs02a = json.getString("cs02a");
                this.cs02b = json.getString("cs02b");
                this.cs03 = json.getString("cs03");
                this.cs04 = json.getString("cs04");
                this.cs05 = json.getString("cs05");
                this.cs06 = json.getString("cs06");
                this.cs07 = json.getString("cs07");
                this.cs07961x = json.getString("cs07961x");
                this.cs07962x = json.getString("cs07962x");
                this.cs08 = json.getString("cs08");
                this.cs0801 = json.getString("cs0801");
                this.cs0802 = json.getString("cs0802");
                this.cs0803 = json.getString("cs0803");
                this.cs0804 = json.getString("cs0804");
                this.cs0805 = json.getString("cs0805");
                this.cs0806 = json.getString("cs0806");
                this.cs0807 = json.getString("cs0807");
                this.cs0808 = json.getString("cs0808");
                this.cs0809 = json.getString("cs0809");
                this.cs0810 = json.getString("cs0810");
                this.cs0896 = json.getString("cs0896");
                this.cs0896x = json.getString("cs0896x");
                this.cs08a = json.getString("cs08a");
                this.cs08b = json.getString("cs08b");
                this.cs09 = json.getString("cs09");
                this.cs0996x = json.getString("cs0996x");
                this.cs10 = json.getString("cs10");
                this.cs11 = json.getString("cs11");
                this.cs12 = json.getString("cs12");
                this.cs13 = json.getString("cs13");
                this.cs14 = json.getString("cs14");
                this.cs15 = json.getString("cs15");
                this.cs1596x = json.getString("cs1596x");
                this.cs16 = json.getString("cs16");
                this.cs17 = json.getString("cs17");
                this.cs17961x = json.getString("cs17961x");
                this.cs17962x = json.getString("cs17962x");
                this.cs1802 = json.getString("cs1802");
                this.cs1803 = json.getString("cs1803");
                this.cs1804 = json.getString("cs1804");
                this.cs1805 = json.getString("cs1805");
                this.cs1806 = json.getString("cs1806");
                this.cs1807 = json.getString("cs1807");
                this.cs1808 = json.getString("cs1808");
                this.cs1896 = json.getString("cs1896");
                this.cs1896x = json.getString("cs1896x");
                this.cs18a = json.getString("cs18a");
                this.cs18b = json.getString("cs18b");
                this.cs19 = json.getString("cs19");
                this.cs1996x = json.getString("cs1996x");
                this.cs20 = json.getString("cs20");
                this.cs21 = json.getString("cs21");
                this.csdate = json.getString("csdate");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}
