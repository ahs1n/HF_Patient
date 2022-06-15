package edu.aku.hassannaqvi.hf_patient.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.hf_patient.BR;
import edu.aku.hassannaqvi.hf_patient.contracts.MHContract;
import edu.aku.hassannaqvi.hf_patient.core.MainApp;


public class MobileHealth extends BaseObservable {

    private final String patientType = StringUtils.EMPTY;
    private final String chkWeight = StringUtils.EMPTY;
    private final String chkHeight = StringUtils.EMPTY;
    private final String chkMUAC = StringUtils.EMPTY;
    //Section MobileHealth
    public String ss101;
    public String ss101d;
    public String ss101m;
    public String ss101y;
    public String ss102;
    public String ss103;
    public String ss104;
    public String ss105;
    public String ss106;
    public String ss107;
    public String ss107y;
    public String ss107m;
    public String ss107d;
    public String ss108;
    public String ss109;
    public String ss110;
    public String ss111;
    public String ss111a;
    public String ss111b;
    public String ss111c;
    public String ss111d;
    public String ss11199;
    public String pc201;
    public String pc20101;
    public String pc20102;
    public String pc20103;
    public String pc20104;
    public String pc20105;
    public String pc20106;
    public String pc20107;
    public String pc20108;
    public String pc20109;
    public String pc20110;
    public String pc20111;
    public String pc20112;
    public String pc20113;
    public String pc20114;
    public String pc20115;
    public String pc20116;
    public String pc20117;
    public String pc20118;
    public String pc20119;
    public String pc20196;
    public String pc20196x;
    public String pc20199;
    public String di202;
    public String di20201;
    public String di20202;
    public String di20203;
    public String di20204;
    public String di20205;
    public String di20206;
    public String di20207;
    public String di20208;
    public String di20209;
    public String di20210;
    public String di20211;
    public String di20212;
    public String di20213;
    public String di20214;
    public String di20215;
    public String di20216;
    public String di20217;
    public String di20218;
    public String di20219;
    public String di20296;
    public String di20296x;
    public String di20299;
    public String me203;
    public String me20301;
    public String me20302;
    public String me20303;
    public String me20304;
    public String me20305;
    public String me20306;
    public String me20307;
    public String me20308;
    public String me20309;
    public String me20310;
    public String me20311;
    public String me20312;
    public String me20313;
    public String me20314;
    public String me20315;
    public String me20316;
    public String me20317;
    public String me20318;
    public String me20319;
    public String me20320;
    public String me20321;
    public String me20322;
    public String me20323;
    public String me20324;
    public String me20396;
    public String me20396x;
    public String me20399;
    public String vs301;
    public String vs302;
    public String vs303;
    public String vs304;
    public String vs305;
    public String vs306;
    public String vs306a;
    public String vs306b;
    public String vs306c;
    public String vs306d;
    public String vs306e;
    public String vs306f;
    public String vs306g;
    public String vs306i;
    public String vs30699;
    public String vs307;
    public String vs308;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    private String id;
    private String uid;
    private String userName;
    private String sysDate;
    private String deviceId;
    private String deviceTag;
    private String appver;
    private String endTime;
    private String status;
    private String synced;
    private String syncDate;
    // SECTION VARIABLES
    private String serial;
    private String sA;


    public MobileHealth() {

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

    public MobileHealth setUid(String uid) {
        this.uid = uid;
        return this;
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public MobileHealth setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public MobileHealth setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public MobileHealth setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public MobileHealth setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public MobileHealth setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }


    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public MobileHealth setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    @Bindable
    public String getSynced() {
        return synced;
    }

    public MobileHealth setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public MobileHealth setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    public String getSerial() {
        return serial;
    }

    public MobileHealth setSerial(String serial) {
        this.serial = serial;
        return this;
    }


    public String getsA() {
        return sA;
    }

    public MobileHealth setsA(String sA) {
        this.sA = sA;
        return this;
    }

    @Bindable
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyPropertyChanged(BR.status);
    }


    public MobileHealth Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(MHContract.MHTable.COLUMN_ID);
        this.uid = jsonObject.getString(MHContract.MHTable.COLUMN_UID);
        this.userName = jsonObject.getString(MHContract.MHTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(MHContract.MHTable.COLUMN_SYSDATE);
        this.deviceId = jsonObject.getString(MHContract.MHTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(MHContract.MHTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(MHContract.MHTable.COLUMN_APPVERSION);
        this.synced = jsonObject.getString(MHContract.MHTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(MHContract.MHTable.COLUMN_SYNCED_DATE);
        this.status = jsonObject.getString(MHContract.MHTable.COLUMN_STATUS);
        this.serial = jsonObject.getString(MHContract.MHTable.COLUMN_SERIAL);
        this.ss101 = jsonObject.getString(MHContract.MHTable.COLUMN_SS101);
        this.ss102 = jsonObject.getString(MHContract.MHTable.COLUMN_SS102);
        this.ss103 = jsonObject.getString(MHContract.MHTable.COLUMN_SS103);
        this.ss104 = jsonObject.getString(MHContract.MHTable.COLUMN_SS104);
        this.ss105 = jsonObject.getString(MHContract.MHTable.COLUMN_SS105);
        this.ss106 = jsonObject.getString(MHContract.MHTable.COLUMN_SS106);
        this.ss107 = jsonObject.getString(MHContract.MHTable.COLUMN_SS107);

        this.sA = jsonObject.getString(MHContract.MHTable.COLUMN_SA);

        return this;

    }


    public MobileHealth Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SYNCED_DATE));
        this.status = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_STATUS));
        this.serial = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SERIAL));
        this.ss101 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS101));
        this.ss102 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS102));
        this.ss103 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS103));
        this.ss104 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS104));
        this.ss105 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS105));
        this.ss106 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS106));
        this.ss107 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS107));

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SA));

        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SA)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, MobileHealth.class);
    }


    public String sAtoString() {
        JSONObject json = new JSONObject();

        try {
            json
                    /*  .put("ss101d", ss101d)
                      .put("ss101m", ss101m)
                      .put("ss101y", ss101y)
                      .put("ss102", ss102)
                      .put("ss103", ss103)
                      .put("ss104", ss104)
                      .put("ss105", ss105)
                      .put("ss106", ss106)
                      .put("ss107y", ss107y)
                      .put("ss107m", ss107m)
                      .put("ss107d", ss107d)*/
                    .put("ss108", ss108)
                    .put("ss109", ss109)
                    .put("ss110", ss110)
                    .put("ss111a", ss111a)
                    .put("ss111b", ss111b)
                    .put("ss111c", ss111c)
                    .put("ss111d", ss111d)
                    .put("ss11199", ss11199)
                    .put("pc20101", pc20101)
                    .put("pc20102", pc20102)
                    .put("pc20103", pc20103)
                    .put("pc20104", pc20104)
                    .put("pc20105", pc20105)
                    .put("pc20106", pc20106)
                    .put("pc20107", pc20107)
                    .put("pc20108", pc20108)
                    .put("pc20109", pc20109)
                    .put("pc20110", pc20110)
                    .put("pc20111", pc20111)
                    .put("pc20112", pc20112)
                    .put("pc20113", pc20113)
                    .put("pc20114", pc20114)
                    .put("pc20115", pc20115)
                    .put("pc20116", pc20116)
                    .put("pc20117", pc20117)
                    .put("pc20118", pc20118)
                    .put("pc20119", pc20119)
                    .put("pc20196", pc20196)
                    .put("pc20196x", pc20196x)
                    .put("pc20199", pc20199)
                    .put("di20201", di20201)
                    .put("di20202", di20202)
                    .put("di20203", di20203)
                    .put("di20204", di20204)
                    .put("di20205", di20205)
                    .put("di20206", di20206)
                    .put("di20207", di20207)
                    .put("di20208", di20208)
                    .put("di20209", di20209)
                    .put("di20210", di20210)
                    .put("di20211", di20211)
                    .put("di20212", di20212)
                    .put("di20213", di20213)
                    .put("di20214", di20214)
                    .put("di20215", di20215)
                    .put("di20216", di20216)
                    .put("di20217", di20217)
                    .put("di20218", di20218)
                    .put("di20219", di20219)
                    .put("di20296", di20296)
                    .put("di20296x", di20296x)
                    .put("di20299", di20299)
                    .put("me20301", me20301)
                    .put("me20302", me20302)
                    .put("me20303", me20303)
                    .put("me20304", me20304)
                    .put("me20305", me20305)
                    .put("me20306", me20306)
                    .put("me20307", me20307)
                    .put("me20308", me20308)
                    .put("me20309", me20309)
                    .put("me20310", me20310)
                    .put("me20311", me20311)
                    .put("me20312", me20312)
                    .put("me20313", me20313)
                    .put("me20314", me20314)
                    .put("me20315", me20315)
                    .put("me20316", me20316)
                    .put("me20317", me20317)
                    .put("me20318", me20318)
                    .put("me20319", me20319)
                    .put("me20320", me20320)
                    .put("me20321", me20321)
                    .put("me20322", me20322)
                    .put("me20323", me20323)
                    .put("me20324", me20324)
                    .put("me20396", me20396)
                    .put("me20396x", me20396x)
                    .put("me20399", me20399)
                    .put("vs301", vs301)
                    .put("vs302", vs302)
                    .put("vs303", vs303)
                    .put("vs304", vs304)
                    .put("vs305", vs305)
                    .put("vs306a", vs306a)
                    .put("vs306b", vs306b)
                    .put("vs306c", vs306c)
                    .put("vs306d", vs306d)
                    .put("vs306e", vs306e)
                    .put("vs306f", vs306f)
                    .put("vs306g", vs306g)
                    .put("vs306i", vs306i)
                    .put("vs30699", vs30699)
                    .put("vs307", vs307)
                    .put("vs308", vs308);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();


        json.put(MHContract.MHTable.COLUMN_ID, this.id);
        json.put(MHContract.MHTable.COLUMN_UID, this.uid);
        json.put(MHContract.MHTable.COLUMN_USERNAME, this.userName);
        json.put(MHContract.MHTable.COLUMN_SYSDATE, this.sysDate);
        json.put(MHContract.MHTable.COLUMN_DEVICEID, this.deviceId);
        json.put(MHContract.MHTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(MHContract.MHTable.COLUMN_APPVERSION, this.appver);
        json.put(MHContract.MHTable.COLUMN_SYNCED, this.synced);
        json.put(MHContract.MHTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(MHContract.MHTable.COLUMN_STATUS, this.status);
        json.put(MHContract.MHTable.COLUMN_SERIAL, this.serial);
        json.put(MHContract.MHTable.COLUMN_SS101, this.ss101);
        json.put(MHContract.MHTable.COLUMN_SS102, this.ss102);
        json.put(MHContract.MHTable.COLUMN_SS103, this.ss103);
        json.put(MHContract.MHTable.COLUMN_SS104, this.ss104);
        json.put(MHContract.MHTable.COLUMN_SS105, this.ss105);
        json.put(MHContract.MHTable.COLUMN_SS106, this.ss106);
        json.put(MHContract.MHTable.COLUMN_SS107, this.ss107);

        json.put(MHContract.MHTable.COLUMN_SA, new JSONObject(sAtoString()));

        //For ChildCount
        //json.put(MHContract.MHTable.COLUMN_SA, this.sA == null ? JSONObject.NULL : this.sA);


/*
            if (this.sA != null && !this.sA.equals("")) {
                json.put(MHContract.MHTable.COLUMN_SA, new JSONObject(this.sA));
            }*/

        return json;

    }


    public void sAHydrate(String string) throws JSONException {
        Log.d("sAHydrateS", "string: " + string);

        if (string != null) {


            JSONObject json = null;
            json = new JSONObject(string);

/*                this.ss101d = json.getString("ss101d");
                this.ss101m = json.getString("ss101m");
                this.ss101y = json.getString("ss101y");
                this.ss102 = json.getString("ss102");
                this.ss103 = json.getString("ss103");
                this.ss104 = json.getString("ss104");
                this.ss105 = json.getString("ss105");
                this.ss106 = json.getString("ss106");
                this.ss107y = json.getString("ss107y");
                this.ss107m = json.getString("ss107m");
                this.ss107d = json.getString("ss107d");*/
            this.ss108 = json.getString("ss108");
            this.ss109 = json.getString("ss109");
            this.ss110 = json.getString("ss110");
            this.ss111a = json.getString("ss111a");
            this.ss111b = json.getString("ss111b");
            this.ss111c = json.getString("ss111c");
            this.ss111d = json.getString("ss111d");
            this.ss11199 = json.getString("ss11199");
            this.pc20101 = json.getString("pc20101");
            this.pc20102 = json.getString("pc20102");
            this.pc20103 = json.getString("pc20103");
            this.pc20104 = json.getString("pc20104");
            this.pc20105 = json.getString("pc20105");
            this.pc20106 = json.getString("pc20106");
            this.pc20107 = json.getString("pc20107");
            this.pc20108 = json.getString("pc20108");
            this.pc20109 = json.getString("pc20109");
            this.pc20110 = json.getString("pc20110");
            this.pc20111 = json.getString("pc20111");
            this.pc20112 = json.getString("pc20112");
            this.pc20113 = json.getString("pc20113");
            this.pc20114 = json.getString("pc20114");
            this.pc20115 = json.getString("pc20115");
            this.pc20116 = json.getString("pc20116");
            this.pc20117 = json.getString("pc20117");
            this.pc20118 = json.getString("pc20118");
            this.pc20119 = json.getString("pc20119");
            this.pc20196 = json.getString("pc20196");
            this.pc20196x = json.getString("pc20196x");
            this.pc20199 = json.getString("pc20199");
            this.di20201 = json.getString("di20201");
            this.di20202 = json.getString("di20202");
            this.di20203 = json.getString("di20203");
            this.di20204 = json.getString("di20204");
            this.di20205 = json.getString("di20205");
            this.di20206 = json.getString("di20206");
            this.di20207 = json.getString("di20207");
            this.di20208 = json.getString("di20208");
            this.di20209 = json.getString("di20209");
            this.di20210 = json.getString("di20210");
            this.di20211 = json.getString("di20211");
            this.di20212 = json.getString("di20212");
            this.di20213 = json.getString("di20213");
            this.di20214 = json.getString("di20214");
            this.di20215 = json.getString("di20215");
            this.di20216 = json.getString("di20216");
            this.di20217 = json.getString("di20217");
            this.di20218 = json.getString("di20218");
            this.di20219 = json.getString("di20219");
            this.di20296 = json.getString("di20296");
            this.di20296x = json.getString("di20296x");
            this.di20299 = json.getString("di20299");
            this.me20301 = json.getString("me20301");
            this.me20302 = json.getString("me20302");
            this.me20303 = json.getString("me20303");
            this.me20304 = json.getString("me20304");
            this.me20305 = json.getString("me20305");
            this.me20306 = json.getString("me20306");
            this.me20307 = json.getString("me20307");
            this.me20308 = json.getString("me20308");
            this.me20309 = json.getString("me20309");
            this.me20310 = json.getString("me20310");
            this.me20311 = json.getString("me20311");
            this.me20312 = json.getString("me20312");
            this.me20313 = json.getString("me20313");
            this.me20314 = json.getString("me20314");
            this.me20315 = json.getString("me20315");
            this.me20316 = json.getString("me20316");
            this.me20317 = json.getString("me20317");
            this.me20318 = json.getString("me20318");
            this.me20319 = json.getString("me20319");
            this.me20320 = json.getString("me20320");
            this.me20321 = json.getString("me20321");
            this.me20322 = json.getString("me20322");
            this.me20323 = json.getString("me20323");
            this.me20324 = json.getString("me20324");
            this.me20396 = json.getString("me20396");
            this.me20396x = json.getString("me20396x");
            this.me20399 = json.getString("me20399");
            this.vs301 = json.getString("vs301");
            this.vs302 = json.getString("vs302");
            this.vs303 = json.getString("vs303");
            this.vs304 = json.getString("vs304");
            this.vs305 = json.getString("vs305");
            this.vs306a = json.getString("vs306a");
            this.vs306b = json.getString("vs306b");
            this.vs306c = json.getString("vs306c");
            this.vs306d = json.getString("vs306d");
            this.vs306e = json.getString("vs306e");
            this.vs306f = json.getString("vs306f");
            this.vs306g = json.getString("vs306g");
            this.vs306i = json.getString("vs306i");
            this.vs30699 = json.getString("vs30699");
            this.vs307 = json.getString("vs307");
            this.vs308 = json.getString("vs308");


        }
    }

    @Bindable
    public String getSs101d() {
        return ss101d;
    }

    public void setSs101d(String ss101d) {
        this.ss101d = ss101d;
        notifyPropertyChanged(BR.ss101d);
    }

    @Bindable
    public String getSs101m() {
        return ss101m;
    }

    public void setSs101m(String ss101m) {
        this.ss101m = ss101m;
        notifyPropertyChanged(BR.ss101m);
    }

    @Bindable
    public String getSs101y() {
        return ss101y;
    }

    public void setSs101y(String ss101y) {
        this.ss101y = ss101y;
        notifyPropertyChanged(BR.ss101y);
    }

    @Bindable
    public String getSs102() {
        return ss102;
    }

    public void setSs102(String ss102) {
        this.ss102 = ss102;
        notifyPropertyChanged(BR.ss102);
    }

    @Bindable
    public String getSs103() {
        return ss103;
    }

    public void setSs103(String ss103) {
        this.ss103 = ss103;
        notifyPropertyChanged(BR.ss103);
    }

    @Bindable
    public String getSs104() {
        return ss104;
    }

    public void setSs104(String ss104) {
        this.ss104 = ss104;
        notifyPropertyChanged(BR.ss104);
    }

    @Bindable
    public String getSs105() {
        return ss105;
    }

    public void setSs105(String ss105) {
        this.ss105 = ss105;
        notifyPropertyChanged(BR.ss105);
    }

    @Bindable
    public String getSs106() {
        return ss106;
    }

    public void setSs106(String ss106) {
        this.ss106 = ss106;
        notifyPropertyChanged(BR.ss106);
    }

    @Bindable
    public String getSs107y() {
        return ss107y;
    }

    public void setSs107y(String ss107y) {
        this.ss107y = ss107y;
        notifyPropertyChanged(BR.ss107y);
    }

    @Bindable
    public String getSs107m() {
        return ss107m;
    }

    public void setSs107m(String ss107m) {
        this.ss107m = ss107m;
        notifyPropertyChanged(BR.ss107m);
    }

    @Bindable
    public String getSs107d() {
        return ss107d;
    }

    public void setSs107d(String ss107d) {
        this.ss107d = ss107d;
        notifyPropertyChanged(BR.ss107d);
    }

    @Bindable
    public String getSs108() {
        return ss108;
    }

    public void setSs108(String ss108) {
        this.ss108 = ss108;
        notifyPropertyChanged(BR.ss108);
    }

    @Bindable
    public String getSs109() {
        return ss109;
    }

    public void setSs109(String ss109) {
        this.ss109 = ss109;
        notifyPropertyChanged(BR.ss109);
    }

    @Bindable
    public String getSs110() {
        return ss110;
    }

    public void setSs110(String ss110) {
        this.ss110 = ss110;
        notifyPropertyChanged(BR.ss110);
    }

    @Bindable
    public String getSs111() {
        return ss111;
    }

    public void setSs111(String ss111) {
        this.ss111 = ss111;
        notifyPropertyChanged(BR.ss111);
    }

    @Bindable
    public String getSs111a() {
        return ss111a;
    }

    public void setSs111a(String ss111a) {
        this.ss111a = ss111a;
        notifyPropertyChanged(BR.ss111a);
    }

    @Bindable
    public String getSs111b() {
        return ss111b;
    }

    public void setSs111b(String ss111b) {
        this.ss111b = ss111b;
        notifyPropertyChanged(BR.ss111b);
    }

    @Bindable
    public String getSs111c() {
        return ss111c;
    }

    public void setSs111c(String ss111c) {
        this.ss111c = ss111c;
        notifyPropertyChanged(BR.ss111c);
    }

    @Bindable
    public String getSs111d() {
        return ss111d;
    }

    public void setSs111d(String ss111d) {
        this.ss111d = ss111d;
        notifyPropertyChanged(BR.ss111d);
    }

    @Bindable
    public String getSs11199() {
        return ss11199;
    }

    public void setSs11199(String ss11199) {
        this.ss11199 = ss11199;
        notifyPropertyChanged(BR.ss11199);
    }


    @Bindable
    public String getPc201() {
        return pc201;
    }

    public void setPc201(String pc201) {
        this.pc201 = pc201;
        notifyPropertyChanged(BR.pc201);
    }

    @Bindable
    public String getPc20101() {
        return pc20101;
    }

    public void setPc20101(String pc20101) {
        this.pc20101 = pc20101;
        notifyPropertyChanged(BR.pc20101);
    }

    @Bindable
    public String getPc20102() {
        return pc20102;
    }

    public void setPc20102(String pc20102) {
        this.pc20102 = pc20102;
        notifyPropertyChanged(BR.pc20102);
    }

    @Bindable
    public String getPc20103() {
        return pc20103;
    }

    public void setPc20103(String pc20103) {
        this.pc20103 = pc20103;
        notifyPropertyChanged(BR.pc20103);
    }

    @Bindable
    public String getPc20104() {
        return pc20104;
    }

    public void setPc20104(String pc20104) {
        this.pc20104 = pc20104;
        notifyPropertyChanged(BR.pc20104);
    }

    @Bindable
    public String getPc20105() {
        return pc20105;
    }

    public void setPc20105(String pc20105) {
        this.pc20105 = pc20105;
        notifyPropertyChanged(BR.pc20105);
    }

    @Bindable
    public String getPc20106() {
        return pc20106;
    }

    public void setPc20106(String pc20106) {
        this.pc20106 = pc20106;
        notifyPropertyChanged(BR.pc20106);
    }

    @Bindable
    public String getPc20107() {
        return pc20107;
    }

    public void setPc20107(String pc20107) {
        this.pc20107 = pc20107;
        notifyPropertyChanged(BR.pc20107);
    }

    @Bindable
    public String getPc20108() {
        return pc20108;
    }

    public void setPc20108(String pc20108) {
        this.pc20108 = pc20108;
        notifyPropertyChanged(BR.pc20108);
    }

    @Bindable
    public String getPc20109() {
        return pc20109;
    }

    public void setPc20109(String pc20109) {
        this.pc20109 = pc20109;
        notifyPropertyChanged(BR.pc20109);
    }

    @Bindable
    public String getPc20110() {
        return pc20110;
    }

    public void setPc20110(String pc20110) {
        this.pc20110 = pc20110;
        notifyPropertyChanged(BR.pc20110);
    }

    @Bindable
    public String getPc20111() {
        return pc20111;
    }

    public void setPc20111(String pc20111) {
        this.pc20111 = pc20111;
        notifyPropertyChanged(BR.pc20111);
    }

    @Bindable
    public String getPc20112() {
        return pc20112;
    }

    public void setPc20112(String pc20112) {
        this.pc20112 = pc20112;
        notifyPropertyChanged(BR.pc20112);
    }

    @Bindable
    public String getPc20113() {
        return pc20113;
    }

    public void setPc20113(String pc20113) {
        this.pc20113 = pc20113;
        notifyPropertyChanged(BR.pc20113);
    }

    @Bindable
    public String getPc20114() {
        return pc20114;
    }

    public void setPc20114(String pc20114) {
        this.pc20114 = pc20114;
        notifyPropertyChanged(BR.pc20114);
    }

    @Bindable
    public String getPc20115() {
        return pc20115;
    }

    public void setPc20115(String pc20115) {
        this.pc20115 = pc20115;
        notifyPropertyChanged(BR.pc20115);
    }

    @Bindable
    public String getPc20116() {
        return pc20116;
    }

    public void setPc20116(String pc20116) {
        this.pc20116 = pc20116;
        notifyPropertyChanged(BR.pc20116);
    }

    @Bindable
    public String getPc20117() {
        return pc20117;
    }

    public void setPc20117(String pc20117) {
        this.pc20117 = pc20117;
        notifyPropertyChanged(BR.pc20117);
    }

    @Bindable
    public String getPc20118() {
        return pc20118;
    }

    public void setPc20118(String pc20118) {
        this.pc20118 = pc20118;
        notifyPropertyChanged(BR.pc20118);
    }

    @Bindable
    public String getPc20119() {
        return pc20119;
    }

    public void setPc20119(String pc20119) {
        this.pc20119 = pc20119;
        notifyPropertyChanged(BR.pc20119);
    }

    @Bindable
    public String getPc20196() {
        return pc20196;
    }

    public void setPc20196(String pc20196) {
        this.pc20196 = pc20196;
        notifyPropertyChanged(BR.pc20196);
    }

    @Bindable
    public String getPc20196x() {
        return pc20196x;
    }

    public void setPc20196x(String pc20196x) {
        this.pc20196x = pc20196x;
        notifyPropertyChanged(BR.pc20196x);
    }

    @Bindable
    public String getPc20199() {
        return pc20199;
    }

    public void setPc20199(String pc20199) {
        this.pc20199 = pc20199;
        notifyPropertyChanged(BR.pc20199);
    }


    @Bindable
    public String getDi202() {
        return di202;
    }

    public void setDi202(String di202) {
        this.di202 = di202;
        notifyPropertyChanged(BR.di202);
    }

    @Bindable
    public String getDi20201() {
        return di20201;
    }

    public void setDi20201(String di20201) {
        this.di20201 = di20201;
        notifyPropertyChanged(BR.di20201);
    }

    @Bindable
    public String getDi20202() {
        return di20202;
    }

    public void setDi20202(String di20202) {
        this.di20202 = di20202;
        notifyPropertyChanged(BR.di20202);
    }

    @Bindable
    public String getDi20203() {
        return di20203;
    }

    public void setDi20203(String di20203) {
        this.di20203 = di20203;
        notifyPropertyChanged(BR.di20203);
    }

    @Bindable
    public String getDi20204() {
        return di20204;
    }

    public void setDi20204(String di20204) {
        this.di20204 = di20204;
        notifyPropertyChanged(BR.di20204);
    }

    @Bindable
    public String getDi20205() {
        return di20205;
    }

    public void setDi20205(String di20205) {
        this.di20205 = di20205;
        notifyPropertyChanged(BR.di20205);
    }

    @Bindable
    public String getDi20206() {
        return di20206;
    }

    public void setDi20206(String di20206) {
        this.di20206 = di20206;
        notifyPropertyChanged(BR.di20206);
    }

    @Bindable
    public String getDi20207() {
        return di20207;
    }

    public void setDi20207(String di20207) {
        this.di20207 = di20207;
        notifyPropertyChanged(BR.di20207);
    }

    @Bindable
    public String getDi20208() {
        return di20208;
    }

    public void setDi20208(String di20208) {
        this.di20208 = di20208;
        notifyPropertyChanged(BR.di20208);
    }

    @Bindable
    public String getDi20209() {
        return di20209;
    }

    public void setDi20209(String di20209) {
        this.di20209 = di20209;
        notifyPropertyChanged(BR.di20209);
    }

    @Bindable
    public String getDi20210() {
        return di20210;
    }

    public void setDi20210(String di20210) {
        this.di20210 = di20210;
        notifyPropertyChanged(BR.di20210);
    }

    @Bindable
    public String getDi20211() {
        return di20211;
    }

    public void setDi20211(String di20211) {
        this.di20211 = di20211;
        notifyPropertyChanged(BR.di20211);
    }

    @Bindable
    public String getDi20212() {
        return di20212;
    }

    public void setDi20212(String di20212) {
        this.di20212 = di20212;
        notifyPropertyChanged(BR.di20212);
    }

    @Bindable
    public String getDi20213() {
        return di20213;
    }

    public void setDi20213(String di20213) {
        this.di20213 = di20213;
        notifyPropertyChanged(BR.di20213);
    }

    @Bindable
    public String getDi20214() {
        return di20214;
    }

    public void setDi20214(String di20214) {
        this.di20214 = di20214;
        notifyPropertyChanged(BR.di20214);
    }

    @Bindable
    public String getDi20215() {
        return di20215;
    }

    public void setDi20215(String di20215) {
        this.di20215 = di20215;
        notifyPropertyChanged(BR.di20215);
    }

    @Bindable
    public String getDi20216() {
        return di20216;
    }

    public void setDi20216(String di20216) {
        this.di20216 = di20216;
        notifyPropertyChanged(BR.di20216);
    }

    @Bindable
    public String getDi20217() {
        return di20217;
    }

    public void setDi20217(String di20217) {
        this.di20217 = di20217;
        notifyPropertyChanged(BR.di20217);
    }

    @Bindable
    public String getDi20218() {
        return di20218;
    }

    public void setDi20218(String di20218) {
        this.di20218 = di20218;
        notifyPropertyChanged(BR.di20218);
    }

    @Bindable
    public String getDi20219() {
        return di20219;
    }

    public void setDi20219(String di20219) {
        this.di20219 = di20219;
        notifyPropertyChanged(BR.di20219);
    }

    @Bindable
    public String getDi20296() {
        return di20296;
    }

    public void setDi20296(String di20296) {
        this.di20296 = di20296;
        notifyPropertyChanged(BR.di20296);
    }

    @Bindable
    public String getDi20296x() {
        return di20296x;
    }

    public void setDi20296x(String di20296x) {
        this.di20296x = di20296x;
        notifyPropertyChanged(BR.di20296x);
    }

    @Bindable
    public String getDi20299() {
        return di20299;
    }

    public void setDi20299(String di20299) {
        this.di20299 = di20299;
        notifyPropertyChanged(BR.di20299);
    }

    @Bindable
    public String getMe203() {
        return me203;
    }

    public void setMe203(String me203) {
        this.me203 = me203;
        notifyPropertyChanged(BR.me203);
    }

    @Bindable
    public String getMe20301() {
        return me20301;
    }

    public void setMe20301(String me20301) {
        this.me20301 = me20301;
        notifyPropertyChanged(BR.me20301);
    }

    @Bindable
    public String getMe20302() {
        return me20302;
    }

    public void setMe20302(String me20302) {
        this.me20302 = me20302;
        notifyPropertyChanged(BR.me20302);
    }

    @Bindable
    public String getMe20303() {
        return me20303;
    }

    public void setMe20303(String me20303) {
        this.me20303 = me20303;
        notifyPropertyChanged(BR.me20303);
    }

    @Bindable
    public String getMe20304() {
        return me20304;
    }

    public void setMe20304(String me20304) {
        this.me20304 = me20304;
        notifyPropertyChanged(BR.me20304);
    }

    @Bindable
    public String getMe20305() {
        return me20305;
    }

    public void setMe20305(String me20305) {
        this.me20305 = me20305;
        notifyPropertyChanged(BR.me20305);
    }

    @Bindable
    public String getMe20306() {
        return me20306;
    }

    public void setMe20306(String me20306) {
        this.me20306 = me20306;
        notifyPropertyChanged(BR.me20306);
    }

    @Bindable
    public String getMe20307() {
        return me20307;
    }

    public void setMe20307(String me20307) {
        this.me20307 = me20307;
        notifyPropertyChanged(BR.me20307);
    }

    @Bindable
    public String getMe20308() {
        return me20308;
    }

    public void setMe20308(String me20308) {
        this.me20308 = me20308;
        notifyPropertyChanged(BR.me20308);
    }

    @Bindable
    public String getMe20309() {
        return me20309;
    }

    public void setMe20309(String me20309) {
        this.me20309 = me20309;
        notifyPropertyChanged(BR.me20309);
    }

    @Bindable
    public String getMe20310() {
        return me20310;
    }

    public void setMe20310(String me20310) {
        this.me20310 = me20310;
        notifyPropertyChanged(BR.me20310);
    }

    @Bindable
    public String getMe20311() {
        return me20311;
    }

    public void setMe20311(String me20311) {
        this.me20311 = me20311;
        notifyPropertyChanged(BR.me20311);
    }

    @Bindable
    public String getMe20312() {
        return me20312;
    }

    public void setMe20312(String me20312) {
        this.me20312 = me20312;
        notifyPropertyChanged(BR.me20312);
    }

    @Bindable
    public String getMe20313() {
        return me20313;
    }

    public void setMe20313(String me20313) {
        this.me20313 = me20313;
        notifyPropertyChanged(BR.me20313);
    }

    @Bindable
    public String getMe20314() {
        return me20314;
    }

    public void setMe20314(String me20314) {
        this.me20314 = me20314;
        notifyPropertyChanged(BR.me20314);
    }

    @Bindable
    public String getMe20315() {
        return me20315;
    }

    public void setMe20315(String me20315) {
        this.me20315 = me20315;
        notifyPropertyChanged(BR.me20315);
    }

    @Bindable
    public String getMe20316() {
        return me20316;
    }

    public void setMe20316(String me20316) {
        this.me20316 = me20316;
        notifyPropertyChanged(BR.me20316);
    }

    @Bindable
    public String getMe20317() {
        return me20317;
    }

    public void setMe20317(String me20317) {
        this.me20317 = me20317;
        notifyPropertyChanged(BR.me20317);
    }

    @Bindable
    public String getMe20318() {
        return me20318;
    }

    public void setMe20318(String me20318) {
        this.me20318 = me20318;
        notifyPropertyChanged(BR.me20318);
    }

    @Bindable
    public String getMe20319() {
        return me20319;
    }

    public void setMe20319(String me20319) {
        this.me20319 = me20319;
        notifyPropertyChanged(BR.me20319);
    }

    @Bindable
    public String getMe20320() {
        return me20320;
    }

    public void setMe20320(String me20320) {
        this.me20320 = me20320;
        notifyPropertyChanged(BR.me20320);
    }

    @Bindable
    public String getMe20321() {
        return me20321;
    }

    public void setMe20321(String me20321) {
        this.me20321 = me20321;
        notifyPropertyChanged(BR.me20321);
    }

    @Bindable
    public String getMe20322() {
        return me20322;
    }

    public void setMe20322(String me20322) {
        this.me20322 = me20322;
        notifyPropertyChanged(BR.me20322);
    }

    @Bindable
    public String getMe20323() {
        return me20323;
    }

    public void setMe20323(String me20323) {
        this.me20323 = me20323;
        notifyPropertyChanged(BR.me20323);
    }

    @Bindable
    public String getMe20324() {
        return me20324;
    }

    public void setMe20324(String me20324) {
        this.me20324 = me20324;
        notifyPropertyChanged(BR.me20324);
    }

    @Bindable
    public String getMe20396() {
        return me20396;
    }

    public void setMe20396(String me20396) {
        this.me20396 = me20396;
        notifyPropertyChanged(BR.me20396);
    }

    @Bindable
    public String getMe20396x() {
        return me20396x;
    }

    public void setMe20396x(String me20396x) {
        this.me20396x = me20396x;
        notifyPropertyChanged(BR.me20396x);
    }

    @Bindable
    public String getMe20399() {
        return me20399;
    }

    public void setMe20399(String me20399) {
        this.me20399 = me20399;
        notifyPropertyChanged(BR.me20399);
    }


    @Bindable
    public String getVs301() {
        return vs301;
    }

    public void setVs301(String vs301) {
        this.vs301 = vs301;
        notifyPropertyChanged(BR.vs301);
    }

    @Bindable
    public String getVs302() {
        return vs302;
    }

    public void setVs302(String vs302) {
        this.vs302 = vs302;
        notifyPropertyChanged(BR.vs302);
    }

    @Bindable
    public String getVs303() {
        return vs303;
    }

    public void setVs303(String vs303) {
        this.vs303 = vs303;
        notifyPropertyChanged(BR.vs303);
    }

    @Bindable
    public String getVs304() {
        return vs304;
    }

    public void setVs304(String vs304) {
        this.vs304 = vs304;
        notifyPropertyChanged(BR.vs304);
    }

    @Bindable
    public String getVs305() {
        return vs305;
    }

    public void setVs305(String vs305) {
        this.vs305 = vs305;
        notifyPropertyChanged(BR.vs305);
    }

    @Bindable
    public String getVs306() {
        return vs306;
    }

    public void setVs306(String vs306) {
        this.vs306 = vs306;
        notifyPropertyChanged(BR.vs306);
    }

    @Bindable
    public String getVs306a() {
        return vs306a;
    }

    public void setVs306a(String vs306a) {
        this.vs306a = vs306a;
        notifyPropertyChanged(BR.vs306a);
    }

    @Bindable
    public String getVs306b() {
        return vs306b;
    }

    public void setVs306b(String vs306b) {
        this.vs306b = vs306b;
        notifyPropertyChanged(BR.vs306b);
    }

    @Bindable
    public String getVs306c() {
        return vs306c;
    }

    public void setVs306c(String vs306c) {
        this.vs306c = vs306c;
        notifyPropertyChanged(BR.vs306c);
    }

    @Bindable
    public String getVs306d() {
        return vs306d;
    }

    public void setVs306d(String vs306d) {
        this.vs306d = vs306d;
        notifyPropertyChanged(BR.vs306d);
    }

    @Bindable
    public String getVs306e() {
        return vs306e;
    }

    public void setVs306e(String vs306e) {
        this.vs306e = vs306e;
        notifyPropertyChanged(BR.vs306e);
    }

    @Bindable
    public String getVs306f() {
        return vs306f;
    }

    public void setVs306f(String vs306f) {
        this.vs306f = vs306f;
        notifyPropertyChanged(BR.vs306f);
    }

    @Bindable
    public String getVs306g() {
        return vs306g;
    }

    public void setVs306g(String vs306g) {
        this.vs306g = vs306g;
        notifyPropertyChanged(BR.vs306g);
    }

    @Bindable
    public String getVs306i() {
        return vs306i;
    }

    public void setVs306i(String vs306i) {
        this.vs306i = vs306i;
        notifyPropertyChanged(BR.vs306i);
    }

    @Bindable
    public String getVs30699() {
        return vs30699;
    }

    public void setVs30699(String vs30699) {
        this.vs30699 = vs30699;
        notifyPropertyChanged(BR.vs30699);
    }

    @Bindable
    public String getVs307() {
        return vs307;
    }

    public void setVs307(String vs307) {
        this.vs307 = vs307;
        notifyPropertyChanged(BR.vs307);
    }

    @Bindable
    public String getVs308() {
        return vs308;
    }

    public void setVs308(String vs308) {
        this.vs308 = vs308;
        notifyPropertyChanged(BR.vs308);
    }


    @Bindable
    public String getSs101() {
        return ss101;
    }

    public void setSs101(String ss101) {
        this.ss101 = ss101;
        notifyPropertyChanged(BR.ss101);
    }

    @Bindable
    public String getSs107() {
        return ss107;
    }

    public void setSs107(String ss107) {
        this.ss107 = ss107;
        notifyPropertyChanged(BR.ss107);
    }
}
