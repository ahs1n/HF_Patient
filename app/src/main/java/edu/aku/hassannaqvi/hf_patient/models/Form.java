package edu.aku.hassannaqvi.hf_patient.models;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.threeten.bp.LocalDate;

import edu.aku.hassannaqvi.hf_patient.BR;
import edu.aku.hassannaqvi.hf_patient.contracts.FormsContract;
import edu.aku.hassannaqvi.hf_patient.core.MainApp;

public class Form extends BaseObservable {

    private final String TAG = "Form";
    private final String entryType = StringUtils.EMPTY;
    // public String se20 = StringUtils.EMPTY;
    public String se2001 = StringUtils.EMPTY;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // FIELD VARIABLES
    private String hh01 = StringUtils.EMPTY;
    private String hh0201 = StringUtils.EMPTY;
    private String hh0202 = StringUtils.EMPTY;
    private String hh03 = StringUtils.EMPTY;
    private String hh04 = StringUtils.EMPTY;
    private String hh05 = StringUtils.EMPTY;
    private String hh06 = StringUtils.EMPTY;
    private String hh07 = StringUtils.EMPTY;
    private String hh08 = StringUtils.EMPTY;
    private String hh09 = StringUtils.EMPTY;
    private String hh10 = StringUtils.EMPTY;
    private String hh11 = StringUtils.EMPTY;
    private String hh12 = StringUtils.EMPTY;
    private String hh13 = StringUtils.EMPTY;
    private String hh14 = StringUtils.EMPTY;
    private String hh15 = StringUtils.EMPTY;
    private String hh16 = StringUtils.EMPTY;
    private String hh17 = StringUtils.EMPTY;
    private String hh1796x = StringUtils.EMPTY;
    private String hh18 = StringUtils.EMPTY;
    private String hh19 = StringUtils.EMPTY;
    private String hh20 = StringUtils.EMPTY;
    private String hh2096x = StringUtils.EMPTY;
    private String hh21 = StringUtils.EMPTY;
    private String hh22 = StringUtils.EMPTY;
    private String hh23 = StringUtils.EMPTY;
    private String hh24 = StringUtils.EMPTY;
    private String hh25 = StringUtils.EMPTY;
    private String hh25a = StringUtils.EMPTY;
    private String hh26 = StringUtils.EMPTY;
    private String hh2696x = StringUtils.EMPTY;
    //Section PD
    private String pd01 = StringUtils.EMPTY;
    private String pd02 = StringUtils.EMPTY;
    private String pd03 = StringUtils.EMPTY;
    private String pd04 = StringUtils.EMPTY;
    private String pd05 = StringUtils.EMPTY;
    private String pd0596x = StringUtils.EMPTY;
    private String pd06 = StringUtils.EMPTY;
    private String pd06961x = StringUtils.EMPTY;
    private String pd06962x = StringUtils.EMPTY;
    private String pd07 = StringUtils.EMPTY;
    private String pd0701x = StringUtils.EMPTY;
    private String pd08 = StringUtils.EMPTY;
    private String pd08a01 = StringUtils.EMPTY;
    private String pd08a02 = StringUtils.EMPTY;
    private String pd08a03 = StringUtils.EMPTY;
    private String pd08a04 = StringUtils.EMPTY;
    private String pd08a05 = StringUtils.EMPTY;
    private String pd08a06 = StringUtils.EMPTY;
    private String pd08a07 = StringUtils.EMPTY;
    private String pd08a08 = StringUtils.EMPTY;
    private String pd08a09 = StringUtils.EMPTY;
    private String pd08a96 = StringUtils.EMPTY;
    private String pd08a96x = StringUtils.EMPTY;
    private String pd08b = StringUtils.EMPTY;
    private String pd08c = StringUtils.EMPTY;
    private String pd09 = StringUtils.EMPTY;
    private String pd10 = StringUtils.EMPTY;
    private String pd1101 = StringUtils.EMPTY;
    private String pd1102 = StringUtils.EMPTY;
    private String pd12 = StringUtils.EMPTY;
    private String pd1296x = StringUtils.EMPTY;
    private String pd13 = StringUtils.EMPTY;
    private String pd13961x = StringUtils.EMPTY;
    private String pd13962x = StringUtils.EMPTY;
    private String pd14 = StringUtils.EMPTY;
    private String pd1496x = StringUtils.EMPTY;
    private String pd15 = StringUtils.EMPTY;
    private String pd16 = StringUtils.EMPTY;
    private String pd1601 = StringUtils.EMPTY;
    private String pd1602 = StringUtils.EMPTY;
    private String pd1603 = StringUtils.EMPTY;
    private String pd1604 = StringUtils.EMPTY;
    private String pd1605 = StringUtils.EMPTY;
    private String pd1606 = StringUtils.EMPTY;
    private String pd1607 = StringUtils.EMPTY;
    private String pd1696 = StringUtils.EMPTY;
    private String pd1696x = StringUtils.EMPTY;
    private String pd17 = StringUtils.EMPTY;
    private String pd1701x = StringUtils.EMPTY;
    private String pd1702x = StringUtils.EMPTY;
    private String pd1703x = StringUtils.EMPTY;
    private String pd18 = StringUtils.EMPTY;
    private String pd19 = StringUtils.EMPTY;
    private String pd20 = StringUtils.EMPTY;
    private String pd2001 = StringUtils.EMPTY;
    private String pd2002 = StringUtils.EMPTY;
    private String pd2003 = StringUtils.EMPTY;
    private String pd2004 = StringUtils.EMPTY;
    private String pd2005 = StringUtils.EMPTY;
    private String pd2006 = StringUtils.EMPTY;
    private String pd2007 = StringUtils.EMPTY;
    private String pd2096 = StringUtils.EMPTY;
    private String pd2096x = StringUtils.EMPTY;
    private String pd21 = StringUtils.EMPTY;
    private String pd2101x = StringUtils.EMPTY;
    private String pd2102x = StringUtils.EMPTY;
    private String pd2103x = StringUtils.EMPTY;
    private String pd22 = StringUtils.EMPTY;
    private String pd23 = StringUtils.EMPTY;
    private String pd2401 = StringUtils.EMPTY;
    private String pd2402 = StringUtils.EMPTY;
    private String pd2403 = StringUtils.EMPTY;
    private String pd2404 = StringUtils.EMPTY;
    private String pd2405 = StringUtils.EMPTY;
    private String pd2406 = StringUtils.EMPTY;
    private String pd2496 = StringUtils.EMPTY;
    private String pd2496x = StringUtils.EMPTY;
    private String pd2498 = StringUtils.EMPTY;
    private String pddate = StringUtils.EMPTY;
    //Section PF
    private String bf01 = StringUtils.EMPTY;
    private String bf02 = StringUtils.EMPTY;
    private String bf03 = StringUtils.EMPTY;
    private String bf3y = StringUtils.EMPTY;
    private String bf03m = StringUtils.EMPTY;
    private String bf3d = StringUtils.EMPTY;
    private String bf03a01 = StringUtils.EMPTY;
    private String bf03a02 = StringUtils.EMPTY;
    private String bf04 = StringUtils.EMPTY;
    private String bf05 = StringUtils.EMPTY;
    private String bf0502x = StringUtils.EMPTY;
    private String bf0503x = StringUtils.EMPTY;
    private String bf06 = StringUtils.EMPTY;
    private String bf07 = StringUtils.EMPTY;
    private String bf0796x = StringUtils.EMPTY;
    private String bf08 = StringUtils.EMPTY;
    private String bf0901 = StringUtils.EMPTY;
    private String bf0902 = StringUtils.EMPTY;
    private String bf0903 = StringUtils.EMPTY;
    private String bf0904 = StringUtils.EMPTY;
    private String bf0905 = StringUtils.EMPTY;
    private String bf0906 = StringUtils.EMPTY;
    private String bf0907 = StringUtils.EMPTY;
    private String bf0908 = StringUtils.EMPTY;
    private String bf0909 = StringUtils.EMPTY;
    private String bf0910 = StringUtils.EMPTY;
    private String bf0999 = StringUtils.EMPTY;
    private String bf0996 = StringUtils.EMPTY;
    private String bf0996x = StringUtils.EMPTY;
    private String bf10 = StringUtils.EMPTY;
    private String bf11 = StringUtils.EMPTY;
    private String bf12 = StringUtils.EMPTY;
    private String bf13 = StringUtils.EMPTY;
    private String bf14a = StringUtils.EMPTY;
    private String bf14b = StringUtils.EMPTY;
    private String bf14b01x = StringUtils.EMPTY;
    private String bf14c = StringUtils.EMPTY;
    private String bf14c01x = StringUtils.EMPTY;
    private String bf14d = StringUtils.EMPTY;
    private String bf14e = StringUtils.EMPTY;
    private String bf14e01x = StringUtils.EMPTY;
    private String bf14f = StringUtils.EMPTY;
    private String bf14f01x = StringUtils.EMPTY;
    private String bf14g = StringUtils.EMPTY;
    private String bf14h = StringUtils.EMPTY;
    private String bf14i = StringUtils.EMPTY;
    private String bf15a = StringUtils.EMPTY;
    private String bf15b = StringUtils.EMPTY;
    private String bf15c = StringUtils.EMPTY;
    private String bf15d = StringUtils.EMPTY;
    private String bf15e = StringUtils.EMPTY;
    private String bf15f = StringUtils.EMPTY;
    private String bf15g = StringUtils.EMPTY;
    private String bf15h = StringUtils.EMPTY;
    private String bf15i = StringUtils.EMPTY;
    private String bf15j = StringUtils.EMPTY;
    private String bf15k = StringUtils.EMPTY;
    private String bf15l = StringUtils.EMPTY;
    private String bf15m = StringUtils.EMPTY;
    private String bf15n = StringUtils.EMPTY;
    private String bf15o = StringUtils.EMPTY;
    // private String bf15p = StringUtils.EMPTY;
    private String bf15q = StringUtils.EMPTY;
    private String bf16 = StringUtils.EMPTY;
    private String bf17 = StringUtils.EMPTY;
    private String bf1701x = StringUtils.EMPTY;
    private String bf18 = StringUtils.EMPTY;
    private String bf19 = StringUtils.EMPTY;
    private String bf1996x = StringUtils.EMPTY;
    private String bf20 = StringUtils.EMPTY;
    private String bfdate = StringUtils.EMPTY;
    //Section CV
    private String cv01 = StringUtils.EMPTY;
    private String cv02 = StringUtils.EMPTY;
    private String cv03 = StringUtils.EMPTY;
    private String cv04 = StringUtils.EMPTY;
    private String cv0501 = StringUtils.EMPTY;
    private String cv0502 = StringUtils.EMPTY;
    private String cv0503 = StringUtils.EMPTY;
    private String cv0504 = StringUtils.EMPTY;
    private String cv0505 = StringUtils.EMPTY;
    private String cv0506 = StringUtils.EMPTY;
    private String cv0507 = StringUtils.EMPTY;
    private String cv0596 = StringUtils.EMPTY;
    private String cv0596x = StringUtils.EMPTY;
    private String cv0601 = StringUtils.EMPTY;
    private String cv0602 = StringUtils.EMPTY;
    private String cv0603 = StringUtils.EMPTY;
    private String cv0604 = StringUtils.EMPTY;
    private String cv0605 = StringUtils.EMPTY;
    private String cv0606 = StringUtils.EMPTY;
    private String cv0607 = StringUtils.EMPTY;
    private String cv0608 = StringUtils.EMPTY;
    private String cv0609 = StringUtils.EMPTY;
    private String cv0610 = StringUtils.EMPTY;
    private String cv0611 = StringUtils.EMPTY;
    private String cv0696 = StringUtils.EMPTY;
    private String cv0696x = StringUtils.EMPTY;
    private String cv07 = StringUtils.EMPTY;
    private String cv0801 = StringUtils.EMPTY;
    private String cv0802 = StringUtils.EMPTY;
    private String cv0803 = StringUtils.EMPTY;
    private String cv0804 = StringUtils.EMPTY;
    private String cv0805 = StringUtils.EMPTY;
    private String cv0806 = StringUtils.EMPTY;
    private String cv0807 = StringUtils.EMPTY;
    private String cv0896 = StringUtils.EMPTY;
    private String cv0898 = StringUtils.EMPTY;
    private String cv0896x = StringUtils.EMPTY;
    private String cv0901 = StringUtils.EMPTY;
    private String cv0902 = StringUtils.EMPTY;
    private String cv0903 = StringUtils.EMPTY;
    private String cv0904 = StringUtils.EMPTY;
    private String cv0905 = StringUtils.EMPTY;
    private String cv0906 = StringUtils.EMPTY;
    private String cv0907 = StringUtils.EMPTY;
    private String cv0996 = StringUtils.EMPTY;
    private String cv0998 = StringUtils.EMPTY;
    private String cv0996x = StringUtils.EMPTY;
    private String cv1001 = StringUtils.EMPTY;
    private String cv1002 = StringUtils.EMPTY;
    private String cv1003 = StringUtils.EMPTY;
    private String cv1004 = StringUtils.EMPTY;
    private String cv1005 = StringUtils.EMPTY;
    private String cv1006 = StringUtils.EMPTY;
    private String cv1007 = StringUtils.EMPTY;
    private String cv1008 = StringUtils.EMPTY;
    private String cv1096 = StringUtils.EMPTY;
    private String cv1098 = StringUtils.EMPTY;
    private String cv1096x = StringUtils.EMPTY;
    private String cv11 = StringUtils.EMPTY;
    private String cv12 = StringUtils.EMPTY;
    private String cv1296x = StringUtils.EMPTY;
    private String cv13 = StringUtils.EMPTY;
    private String cv14 = StringUtils.EMPTY;
    private String cv15 = StringUtils.EMPTY;
    private String cv16 = StringUtils.EMPTY;
    private String cv1696x = StringUtils.EMPTY;
    private String cv17 = StringUtils.EMPTY;
    private String cv18 = StringUtils.EMPTY;
    private String cv1896x = StringUtils.EMPTY;
    private String cv19 = StringUtils.EMPTY;
    private String cv1996x = StringUtils.EMPTY;
    private String cvdate = StringUtils.EMPTY;
    //Section SE
    private String se01 = StringUtils.EMPTY;
    private String se0196x = StringUtils.EMPTY;
    private String se02 = StringUtils.EMPTY;
    private String se0296x = StringUtils.EMPTY;
    private String se03 = StringUtils.EMPTY;
    private String se0396x = StringUtils.EMPTY;
    private String se04 = StringUtils.EMPTY;
    private String se0496x = StringUtils.EMPTY;
    private String se05 = StringUtils.EMPTY;
    private String se0596x = StringUtils.EMPTY;
    private String se06a = StringUtils.EMPTY;
    private String se07a = StringUtils.EMPTY;
    private String se08 = StringUtils.EMPTY;
    private String se0896x = StringUtils.EMPTY;
    private String se09 = StringUtils.EMPTY;
    private String se10 = StringUtils.EMPTY;
    private String se1099x = StringUtils.EMPTY;
    private String se11 = StringUtils.EMPTY;
    private String se1196x = StringUtils.EMPTY;
    private String se12 = StringUtils.EMPTY;
    private String se1296x = StringUtils.EMPTY;
    private String se13 = StringUtils.EMPTY;
    private String se14 = StringUtils.EMPTY;
    private String se15 = StringUtils.EMPTY;
    private String se16 = StringUtils.EMPTY;
    private String se17 = StringUtils.EMPTY;
    private String se1701 = StringUtils.EMPTY;
    private String se1702 = StringUtils.EMPTY;
    private String se1703 = StringUtils.EMPTY;
    private String se1704 = StringUtils.EMPTY;
    private String se1705 = StringUtils.EMPTY;
    private String se1801 = StringUtils.EMPTY;
    private String se1802 = StringUtils.EMPTY;
    private String se1803 = StringUtils.EMPTY;
    private String se1804 = StringUtils.EMPTY;
    private String se1805 = StringUtils.EMPTY;
    private String se1896 = StringUtils.EMPTY;
    private String se189601x = StringUtils.EMPTY;
    private String se19 = StringUtils.EMPTY;
    private String se1996x = StringUtils.EMPTY;
    private String se2002 = StringUtils.EMPTY;
    private String se2003 = StringUtils.EMPTY;
    private String se2004 = StringUtils.EMPTY;
    private String se2005 = StringUtils.EMPTY;
    private String se2006 = StringUtils.EMPTY;
    private String se2096 = StringUtils.EMPTY;
    private String se2096x = StringUtils.EMPTY;
    private String se21 = StringUtils.EMPTY;
    private String se2101 = StringUtils.EMPTY;
    private String se2102 = StringUtils.EMPTY;
    private String se2103 = StringUtils.EMPTY;
    private String se2104 = StringUtils.EMPTY;
    private String se2105 = StringUtils.EMPTY;
    private String se2196 = StringUtils.EMPTY;
    private String se2196x = StringUtils.EMPTY;
    private String se2201 = StringUtils.EMPTY;
    private String se2202 = StringUtils.EMPTY;
    private String se2203 = StringUtils.EMPTY;
    private String se2204 = StringUtils.EMPTY;
    private String se2205 = StringUtils.EMPTY;
    private String se2206 = StringUtils.EMPTY;
    private String se2207 = StringUtils.EMPTY;
    private String se2208 = StringUtils.EMPTY;
    private String se2209 = StringUtils.EMPTY;
    private String se2210 = StringUtils.EMPTY;
    private String se2211 = StringUtils.EMPTY;
    private String se2212 = StringUtils.EMPTY;
    private String se2213 = StringUtils.EMPTY;
    private String se2214 = StringUtils.EMPTY;
    private String se2215 = StringUtils.EMPTY;
    private String se2216 = StringUtils.EMPTY;
    private String se2217 = StringUtils.EMPTY;
    private String se2218 = StringUtils.EMPTY;
    private String se23 = StringUtils.EMPTY;
    private String se24 = StringUtils.EMPTY;
    private String se25 = StringUtils.EMPTY;
    private String se26 = StringUtils.EMPTY;
    private String se27 = StringUtils.EMPTY;
    private String se2701 = StringUtils.EMPTY;
    private String se2702 = StringUtils.EMPTY;
    private String se2703 = StringUtils.EMPTY;
    private String se2704 = StringUtils.EMPTY;
    private String se28 = StringUtils.EMPTY;
    private String se2801 = StringUtils.EMPTY;
    private String se2802 = StringUtils.EMPTY;
    private String se2803 = StringUtils.EMPTY;
    private String se29 = StringUtils.EMPTY;
    private String se30 = StringUtils.EMPTY;
    private String se3001 = StringUtils.EMPTY;
    private String se3002 = StringUtils.EMPTY;
    private String se3003 = StringUtils.EMPTY;
    private String se3096 = StringUtils.EMPTY;
    private String se3096x = StringUtils.EMPTY;
    private String se31 = StringUtils.EMPTY;
    private String se3196x = StringUtils.EMPTY;
    private String se32 = StringUtils.EMPTY;
    private String se3302 = StringUtils.EMPTY;
    private String se3301 = StringUtils.EMPTY;
    private String se3401 = StringUtils.EMPTY;
    private String se3402 = StringUtils.EMPTY;
    private String se35 = StringUtils.EMPTY;
    private String se36 = StringUtils.EMPTY;
    private String se37 = StringUtils.EMPTY;
    private String se3701 = StringUtils.EMPTY;
    private String se3702 = StringUtils.EMPTY;
    private String se3703 = StringUtils.EMPTY;
    private String se3704 = StringUtils.EMPTY;
    private String se3705 = StringUtils.EMPTY;
    private String se3706 = StringUtils.EMPTY;
    private String se3707 = StringUtils.EMPTY;
    private String se3708 = StringUtils.EMPTY;
    private String se3709 = StringUtils.EMPTY;
    private String se3710 = StringUtils.EMPTY;
    private String se3796 = StringUtils.EMPTY;
    private String se3796x = StringUtils.EMPTY;
    private String se38 = StringUtils.EMPTY;
    private String se39 = StringUtils.EMPTY;
    private String se40 = StringUtils.EMPTY;
    private String sedate = StringUtils.EMPTY;
    // APP VARIABLES
    private String id = StringUtils.EMPTY;
    private String uid = StringUtils.EMPTY;
    private String userName = StringUtils.EMPTY;
    private String sysDate = StringUtils.EMPTY;
    private String dcode = StringUtils.EMPTY;
    private String ucode = StringUtils.EMPTY;
    private String cluster = StringUtils.EMPTY;
    private String hhno = StringUtils.EMPTY;
    private String deviceId = StringUtils.EMPTY;
    private String deviceTag = StringUtils.EMPTY;
    private String appver = StringUtils.EMPTY;
    private String endTime = StringUtils.EMPTY;
    private String iStatus = StringUtils.EMPTY;
    private String iStatus96x = StringUtils.EMPTY;
    private String synced = StringUtils.EMPTY;
    private String syncDate = StringUtils.EMPTY;
    private String g5Flag = "-1";
    private String hhflag = "-1";
    // SECTION VARIABLES
    private String s01HH = StringUtils.EMPTY;
    private String s05PD = StringUtils.EMPTY;
    private String s06BF = StringUtils.EMPTY;
    private String s07CV = StringUtils.EMPTY;
    private String s08SE = StringUtils.EMPTY;

    //Not saving in DB
    private LocalDate localDate = null;
    private boolean exist = false;

    public Form() {

    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setForm(String userName, String sysDate, String dcode, String ucode, String cluster, String hhno, String deviceId, String deviceTag, String appver) {
        this.userName = userName;
        this.sysDate = sysDate;
        this.dcode = dcode;
        this.ucode = ucode;
        this.cluster = cluster;
        this.hhno = hhno;
        this.deviceId = deviceId;
        this.deviceTag = deviceTag;
        this.appver = appver;
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

    public Form setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public Form setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDcode() {
        return dcode;
    }

    public Form setDcode(String dcode) {
        this.dcode = dcode;
        return this;
    }


    @Bindable
    public String getUcode() {
        return ucode;
    }

    public Form setUcode(String ucode) {
        this.ucode = ucode;
        return this;
    }


    @Bindable
    public String getCluster() {
        return cluster;
    }

    public Form setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }


    @Bindable
    public String getHhno() {
        return hhno;
    }

    public Form setHhno(String hhno) {
        this.hhno = hhno;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Form setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Form setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Form setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Form setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Form setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    @Bindable
    public String getSynced() {
        return synced;
    }

    public Form setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Form setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    public String getG5Flag() {
        return g5Flag;
    }

    public void setG5Flag(String g5Flag) {
        this.g5Flag = g5Flag;
    }


    public String getHhflag() {
        return hhflag;
    }

    public Form setHhflag(String hhflag) {
        this.hhflag = hhflag;
        return this;
    }


    public String getS01HH() {
        return s01HH;
    }

    public Form setS01HH(String s01HH) {
        this.s01HH = s01HH;
        return this;
    }

    public String getS05PD() {
        return s05PD;
    }

    public Form setS05PD(String s05PD) {
        this.s05PD = s05PD;
        return this;
    }

    public String getS06BF() {
        return s06BF;
    }

    public Form setS06BF(String s06BF) {
        this.s06BF = s06BF;
        return this;
    }

    public String getS07CV() {
        return s07CV;
    }

    public Form setS07CV(String s07CV) {
        this.s07CV = s07CV;
        return this;
    }

    public String getS08SE() {
        return s08SE;
    }

    public Form setS08SE(String s08SE) {
        this.s08SE = s08SE;
        return this;
    }


    @Bindable
    public String getHh01() {
        return hh01;
    }

    public void setHh01(String hh01) {
        this.hh01 = hh01;
        notifyPropertyChanged(BR.hh01);
    }

    @Bindable
    public String getHh0201() {
        return hh0201;
    }

    public void setHh0201(String hh0201) {
        this.hh0201 = hh0201;
        notifyPropertyChanged(BR.hh0201);
    }

    @Bindable
    public String getHh0202() {
        return hh0202;
    }

    public void setHh0202(String hh0202) {
        this.hh0202 = hh0202;
        notifyPropertyChanged(BR.hh0202);
    }

    @Bindable
    public String getHh03() {
        return hh03;
    }

    public void setHh03(String hh03) {
        this.hh03 = hh03;
        notifyPropertyChanged(BR.hh03);
    }

    @Bindable
    public String getHh04() {
        return hh04;
    }

    public void setHh04(String hh04) {
        this.hh04 = hh04;
        notifyPropertyChanged(BR.hh04);
    }

    @Bindable
    public String getHh05() {
        return hh05;
    }

    public void setHh05(String hh05) {
        this.hh05 = hh05;
        notifyPropertyChanged(BR.hh05);
    }

    @Bindable
    public String getHh06() {
        return hh06;
    }

    public void setHh06(String hh06) {
        this.hh06 = hh06;
        notifyPropertyChanged(BR.hh06);
    }

    @Bindable
    public String getHh07() {
        return hh07;
    }

    public void setHh07(String hh07) {
        this.hh07 = hh07;
        notifyPropertyChanged(BR.hh07);
    }

    @Bindable
    public String getHh08() {
        return hh08;
    }

    public void setHh08(String hh08) {
        this.hh08 = hh08;
        notifyPropertyChanged(BR.hh08);
    }

    @Bindable
    public String getHh09() {
        return hh09;
    }

    public void setHh09(String hh09) {
        this.hh09 = hh09;
        notifyPropertyChanged(BR.hh09);
    }

    @Bindable
    public String getHh10() {
        return hh10;
    }

    public void setHh10(String hh10) {
        this.hh10 = hh10;
        notifyPropertyChanged(BR.hh10);
    }

    @Bindable
    public String getHh11() {
        return hh11;
    }

    public void setHh11(String hh11) {
        this.hh11 = hh11;
        notifyPropertyChanged(BR.hh11);
    }

    @Bindable
    public String getHh12() {
        return hh12;
    }

    public void setHh12(String hh12) {
        this.hh12 = hh12;
        notifyPropertyChanged(BR.hh12);
    }

    @Bindable
    public String getHh13() {
        return hh13;
    }

    public void setHh13(String hh13) {
        this.hh13 = hh13;
        notifyPropertyChanged(BR.hh13);
    }

    @Bindable
    public String getHh14() {
        return hh14;
    }

    public void setHh14(String hh14) {
        this.hh14 = hh14;
        notifyPropertyChanged(BR.hh14);
    }

    @Bindable
    public String getHh15() {
        return hh15;
    }

    public void setHh15(String hh15) {
        this.hh15 = hh15;
        notifyPropertyChanged(BR.hh15);
    }

    @Bindable
    public String getHh16() {
        return hh16;
    }

    public void setHh16(String hh16) {
        this.hh16 = hh16;
        notifyPropertyChanged(BR.hh16);
    }

    @Bindable
    public String getHh17() {
        return hh17;
    }

    public void setHh17(String hh17) {
        this.hh17 = hh17;
        notifyPropertyChanged(BR.hh17);
    }

    @Bindable
    public String getHh1796x() {
        return hh1796x;
    }

    public void setHh1796x(String hh1796x) {
        this.hh1796x = hh1796x;
        notifyPropertyChanged(BR.hh1796x);
    }

    @Bindable
    public String getHh18() {
        return hh18;
    }

    public void setHh18(String hh18) {
        this.hh18 = hh18;
        notifyPropertyChanged(BR.hh18);
    }

    @Bindable
    public String getHh19() {
        return hh19;
    }

    public void setHh19(String hh19) {
        this.hh19 = hh19;
        notifyPropertyChanged(BR.hh19);
    }

    @Bindable
    public String getHh20() {
        return hh20;
    }

    public void setHh20(String hh20) {
        this.hh20 = hh20;
        notifyPropertyChanged(BR.hh20);
    }

    @Bindable
    public String getHh2096x() {
        return hh2096x;
    }

    public void setHh2096x(String hh2096x) {
        this.hh2096x = hh2096x;
        notifyPropertyChanged(BR.hh2096x);
    }

    @Bindable
    public String getHh21() {
        return hh21;
    }

    public void setHh21(String hh21) {
        this.hh21 = hh21;
        notifyPropertyChanged(BR.hh21);
    }

    @Bindable
    public String getHh22() {
        return hh22;
    }

    public void setHh22(String hh22) {
        this.hh22 = hh22;
        notifyPropertyChanged(BR.hh22);
    }

    @Bindable
    public String getHh23() {
        return hh23;
    }

    public void setHh23(String hh23) {
        this.hh23 = hh23;
        notifyPropertyChanged(BR.hh23);
    }

    @Bindable
    public String getHh24() {
        return hh24;
    }

    public void setHh24(String hh24) {
        this.hh24 = hh24;
        notifyPropertyChanged(BR.hh24);
    }

    @Bindable
    public String getHh25() {
        return hh25;
    }

    public void setHh25(String hh25) {
        this.hh25 = hh25;
        notifyPropertyChanged(BR.hh25);
    }

    public String getHh25a() {
        return hh25a;
    }

    public void setHh25a(String hh25a) {
        this.hh25a = hh25a;
    }

    @Bindable
    public String getHh26() {
        return hh26;
    }

    public void setHh26(String hh26) {
        this.hh26 = hh26;
        notifyPropertyChanged(BR.hh26);
    }


    @Bindable
    public String getHh2696x() {
        return hh2696x;
    }

    public void setHh2696x(String hh2696x) {
        this.hh2696x = hh2696x;
        notifyPropertyChanged(BR.hh2696x);
    }


    @Bindable
    public String getPd01() {
        return pd01;
    }

    public void setPd01(String pd01) {
        this.pd01 = pd01;
        notifyPropertyChanged(BR.pd01);
    }

    @Bindable
    public String getPd02() {
        return pd02;
    }

    public void setPd02(String pd02) {
        this.pd02 = pd02;
        notifyPropertyChanged(BR.pd02);
    }

    @Bindable
    public String getPd03() {
        return pd03;
    }

    public void setPd03(String pd03) {
        this.pd03 = pd03;
        notifyPropertyChanged(BR.pd03);
    }

    @Bindable
    public String getPd04() {
        return pd04;
    }

    public void setPd04(String pd04) {
        this.pd04 = pd04;
        notifyPropertyChanged(BR.pd04);
    }

    @Bindable
    public String getPd05() {
        return pd05;
    }

    public void setPd05(String pd05) {
        this.pd05 = pd05;
        notifyPropertyChanged(BR.pd05);
    }

    @Bindable
    public String getPd0596x() {
        return pd0596x;
    }

    public void setPd0596x(String pd0596x) {
        this.pd0596x = pd0596x;
        notifyPropertyChanged(BR.pd0596x);
    }

    @Bindable
    public String getPd06() {
        return pd06;
    }

    public void setPd06(String pd06) {
        this.pd06 = pd06;
        notifyPropertyChanged(BR.pd06);
    }

    @Bindable
    public String getPd06961x() {
        return pd06961x;
    }

    public void setPd06961x(String pd06961x) {
        this.pd06961x = pd06961x;
        notifyPropertyChanged(BR.pd06961x);
    }

    @Bindable
    public String getPd06962x() {
        return pd06962x;
    }

    public void setPd06962x(String pd06962x) {
        this.pd06962x = pd06962x;
        notifyPropertyChanged(BR.pd06962x);
    }

    @Bindable
    public String getPd07() {
        return pd07;
    }

    public void setPd07(String pd07) {
        this.pd07 = pd07;
        notifyPropertyChanged(BR.pd07);
    }

    @Bindable
    public String getPd0701x() {
        return pd0701x;
    }

    public void setPd0701x(String pd0701x) {
        this.pd0701x = pd0701x;
        notifyPropertyChanged(BR.pd0701x);
    }

    @Bindable
    public String getPd08() {
        return pd08;
    }

    public void setPd08(String pd08) {
        this.pd08 = pd08;
        notifyPropertyChanged(BR.pd08);
    }

    @Bindable
    public String getPd08a01() {
        return pd08a01;
    }

    public void setPd08a01(String pd08a01) {
        this.pd08a01 = pd08a01;
        notifyPropertyChanged(BR.pd08a01);
    }

    @Bindable
    public String getPd08a02() {
        return pd08a02;
    }

    public void setPd08a02(String pd08a02) {
        this.pd08a02 = pd08a02;
        notifyPropertyChanged(BR.pd08a02);
    }

    @Bindable
    public String getPd08a03() {
        return pd08a03;
    }

    public void setPd08a03(String pd08a03) {
        this.pd08a03 = pd08a03;
        notifyPropertyChanged(BR.pd08a03);
    }

    @Bindable
    public String getPd08a04() {
        return pd08a04;
    }

    public void setPd08a04(String pd08a04) {
        this.pd08a04 = pd08a04;
        notifyPropertyChanged(BR.pd08a04);
    }

    @Bindable
    public String getPd08a05() {
        return pd08a05;
    }

    public void setPd08a05(String pd08a05) {
        this.pd08a05 = pd08a05;
        notifyPropertyChanged(BR.pd08a05);
    }

    @Bindable
    public String getPd08a06() {
        return pd08a06;
    }

    public void setPd08a06(String pd08a06) {
        this.pd08a06 = pd08a06;
        notifyPropertyChanged(BR.pd08a06);
    }

    @Bindable
    public String getPd08a07() {
        return pd08a07;
    }

    public void setPd08a07(String pd08a07) {
        this.pd08a07 = pd08a07;
        notifyPropertyChanged(BR.pd08a07);
    }

    @Bindable
    public String getPd08a08() {
        return pd08a08;
    }

    public void setPd08a08(String pd08a08) {
        this.pd08a08 = pd08a08;
        notifyPropertyChanged(BR.pd08a08);
    }

    @Bindable
    public String getPd08a09() {
        return pd08a09;
    }

    public void setPd08a09(String pd08a09) {
        this.pd08a09 = pd08a09;
        notifyPropertyChanged(BR.pd08a09);
    }

    @Bindable
    public String getPd08a96() {
        return pd08a96;
    }

    public void setPd08a96(String pd08a96) {
        this.pd08a96 = pd08a96;
        notifyPropertyChanged(BR.pd08a96);
    }

    @Bindable
    public String getPd08a96x() {
        return pd08a96x;
    }

    public void setPd08a96x(String pd08a96x) {
        this.pd08a96x = pd08a96x;
        notifyPropertyChanged(BR.pd08a96x);
    }

    @Bindable
    public String getPd08b() {
        return pd08b;
    }

    public void setPd08b(String pd08b) {
        this.pd08b = pd08b;
    }


    @Bindable
    public String getPd08c() {
        return pd08c;
    }

    public void setPd08c(String pd08c) {
        this.pd08c = pd08c;
    }


    @Bindable
    public String getPd09() {
        return pd09;
    }

    public void setPd09(String pd09) {
        this.pd09 = pd09;
        notifyPropertyChanged(BR.pd09);
    }

    @Bindable
    public String getPd10() {
        return pd10;
    }

    public void setPd10(String pd10) {
        this.pd10 = pd10;
        notifyPropertyChanged(BR.pd10);
    }

    @Bindable
    public String getPd1101() {
        return pd1101;
    }

    public void setPd1101(String pd1101) {
        this.pd1101 = pd1101;
        notifyPropertyChanged(BR.pd1101);
    }

    @Bindable
    public String getPd1102() {
        return pd1102;
    }

    public void setPd1102(String pd1102) {
        this.pd1102 = pd1102;
        notifyPropertyChanged(BR.pd1102);
    }

    @Bindable
    public String getPd12() {
        return pd12;
    }

    public void setPd12(String pd12) {
        this.pd12 = pd12;
        notifyPropertyChanged(BR.pd12);
    }

    @Bindable
    public String getPd1296x() {
        return pd1296x;
    }

    public void setPd1296x(String pd1296x) {
        this.pd1296x = pd1296x;
        notifyPropertyChanged(BR.pd1296x);
    }

    @Bindable
    public String getPd13() {
        return pd13;
    }

    public void setPd13(String pd13) {
        this.pd13 = pd13;
        notifyPropertyChanged(BR.pd13);
    }

    @Bindable
    public String getPd13961x() {
        return pd13961x;
    }

    public void setPd13961x(String pd13961x) {
        this.pd13961x = pd13961x;
        notifyPropertyChanged(BR.pd13961x);
    }

    @Bindable
    public String getPd13962x() {
        return pd13962x;
    }

    public void setPd13962x(String pd13962x) {
        this.pd13962x = pd13962x;
        notifyPropertyChanged(BR.pd13962x);
    }

    @Bindable
    public String getPd14() {
        return pd14;
    }

    public void setPd14(String pd14) {
        this.pd14 = pd14;
        notifyPropertyChanged(BR.pd14);
    }

    @Bindable
    public String getPd1496x() {
        return pd1496x;
    }

    public void setPd1496x(String pd1496x) {
        this.pd1496x = pd1496x;
        notifyPropertyChanged(BR.pd1496x);
    }

    @Bindable
    public String getPd15() {
        return pd15;
    }

    public void setPd15(String pd15) {
        this.pd15 = pd15;
        notifyPropertyChanged(BR.pd15);
    }

    @Bindable
    public String getPd16() {
        return pd16;
    }

    public void setPd16(String pd16) {
        this.pd16 = pd16;
        notifyPropertyChanged(BR.pd16);
    }

    @Bindable
    public String getPd1601() {
        return pd1601;
    }

    public void setPd1601(String pd1601) {
        this.pd1601 = pd1601;
        notifyPropertyChanged(BR.pd1601);
    }

    @Bindable
    public String getPd1602() {
        return pd1602;
    }

    public void setPd1602(String pd1602) {
        this.pd1602 = pd1602;
        notifyPropertyChanged(BR.pd1602);
    }

    @Bindable
    public String getPd1603() {
        return pd1603;
    }

    public void setPd1603(String pd1603) {
        this.pd1603 = pd1603;
        notifyPropertyChanged(BR.pd1603);
    }

    @Bindable
    public String getPd1604() {
        return pd1604;
    }

    public void setPd1604(String pd1604) {
        this.pd1604 = pd1604;
        notifyPropertyChanged(BR.pd1604);
    }

    @Bindable
    public String getPd1605() {
        return pd1605;
    }

    public void setPd1605(String pd1605) {
        this.pd1605 = pd1605;
        notifyPropertyChanged(BR.pd1605);
    }

    @Bindable
    public String getPd1606() {
        return pd1606;
    }

    public void setPd1606(String pd1606) {
        this.pd1606 = pd1606;
        notifyPropertyChanged(BR.pd1606);
    }

    @Bindable
    public String getPd1607() {
        return pd1607;
    }

    public void setPd1607(String pd1607) {
        this.pd1607 = pd1607;
        notifyPropertyChanged(BR.pd1607);
    }

    @Bindable
    public String getPd1696() {
        return pd1696;
    }

    public void setPd1696(String pd1696) {
        this.pd1696 = pd1696;
        notifyPropertyChanged(BR.pd1696);
    }

    @Bindable
    public String getPd1696x() {
        return pd1696x;
    }

    public void setPd1696x(String pd1696x) {
        this.pd1696x = pd1696x;
        notifyPropertyChanged(BR.pd1696x);
    }

    @Bindable
    public String getPd17() {
        return pd17;
    }

    public void setPd17(String pd17) {
        this.pd17 = pd17;
        notifyPropertyChanged(BR.pd17);
    }

    @Bindable
    public String getPd1701x() {
        return pd1701x;
    }

    public void setPd1701x(String pd1701x) {
        this.pd1701x = pd1701x;
        notifyPropertyChanged(BR.pd1701x);
    }

    @Bindable
    public String getPd1702x() {
        return pd1702x;
    }

    public void setPd1702x(String pd1702x) {
        this.pd1702x = pd1702x;
        notifyPropertyChanged(BR.pd1702x);
    }

    @Bindable
    public String getPd1703x() {
        return pd1703x;
    }

    public void setPd1703x(String pd1703x) {
        this.pd1703x = pd1703x;
        notifyPropertyChanged(BR.pd1703x);
    }

    @Bindable
    public String getPd18() {
        return pd18;
    }

    public void setPd18(String pd18) {
        this.pd18 = pd18;
        notifyPropertyChanged(BR.pd18);
    }

    @Bindable
    public String getPd19() {
        return pd19;
    }

    public void setPd19(String pd19) {
        this.pd19 = pd19;
        notifyPropertyChanged(BR.pd19);
    }

    @Bindable
    public String getPd20() {
        return pd20;
    }

    public void setPd20(String pd20) {
        this.pd20 = pd20;
        notifyPropertyChanged(BR.pd20);
    }

    @Bindable
    public String getPd2001() {
        return pd2001;
    }

    public void setPd2001(String pd2001) {
        this.pd2001 = pd2001;
        notifyPropertyChanged(BR.pd2001);
    }


    @Bindable
    public String getPd2002() {
        return pd2002;
    }

    public void setPd2002(String pd2002) {
        this.pd2002 = pd2002;
        notifyPropertyChanged(BR.pd2002);
    }

    @Bindable
    public String getPd2003() {
        return pd2003;
    }

    public void setPd2003(String pd2003) {
        this.pd2003 = pd2003;
        notifyPropertyChanged(BR.pd2003);
    }

    @Bindable
    public String getPd2004() {
        return pd2004;
    }

    public void setPd2004(String pd2004) {
        this.pd2004 = pd2004;
        notifyPropertyChanged(BR.pd2004);
    }

    @Bindable
    public String getPd2005() {
        return pd2005;
    }

    public void setPd2005(String pd2005) {
        this.pd2005 = pd2005;
        notifyPropertyChanged(BR.pd2005);
    }

    @Bindable
    public String getPd2006() {
        return pd2006;
    }

    public void setPd2006(String pd2006) {
        this.pd2006 = pd2006;
        notifyPropertyChanged(BR.pd2006);
    }

    @Bindable
    public String getPd2007() {
        return pd2007;
    }

    public void setPd2007(String pd2007) {
        this.pd2007 = pd2007;
        notifyPropertyChanged(BR.pd2007);
    }

    @Bindable
    public String getPd2096() {
        return pd2096;
    }

    public void setPd2096(String pd2096) {
        this.pd2096 = pd2096;
        notifyPropertyChanged(BR.pd2096);
    }

    @Bindable
    public String getPd2096x() {
        return pd2096x;
    }

    public void setPd2096x(String pd2096x) {
        this.pd2096x = pd2096x;
        notifyPropertyChanged(BR.pd2096x);
    }

    @Bindable
    public String getPd21() {
        return pd21;
    }

    public void setPd21(String pd21) {
        this.pd21 = pd21;
        notifyPropertyChanged(BR.pd21);
    }

    @Bindable
    public String getPd2101x() {
        return pd2101x;
    }

    public void setPd2101x(String pd2101x) {
        this.pd2101x = pd2101x;
        notifyPropertyChanged(BR.pd2101x);
    }

    @Bindable
    public String getPd2102x() {
        return pd2102x;
    }

    public void setPd2102x(String pd2102x) {
        this.pd2102x = pd2102x;
        notifyPropertyChanged(BR.pd2102x);
    }

    @Bindable
    public String getPd2103x() {
        return pd2103x;
    }

    public void setPd2103x(String pd2103x) {
        this.pd2103x = pd2103x;
        notifyPropertyChanged(BR.pd2103x);
    }

    @Bindable
    public String getPd22() {
        return pd22;
    }

    public void setPd22(String pd22) {
        this.pd22 = pd22;
        notifyPropertyChanged(BR.pd22);
    }

    @Bindable
    public String getPd23() {
        return pd23;
    }

    public void setPd23(String pd23) {
        this.pd23 = pd23;
    }

    @Bindable
    public String getPd2401() {
        return pd2401;
    }

    public void setPd2401(String pd2401) {
        this.pd2401 = pd2401;
    }

    @Bindable
    public String getPd2402() {
        return pd2402;
    }

    public void setPd2402(String pd2402) {
        this.pd2402 = pd2402;
    }

    @Bindable
    public String getPd2403() {
        return pd2403;
    }

    public void setPd2403(String pd2403) {
        this.pd2403 = pd2403;
    }

    @Bindable
    public String getPd2404() {
        return pd2404;
    }

    public void setPd2404(String pd2404) {
        this.pd2404 = pd2404;
    }

    @Bindable
    public String getPd2405() {
        return pd2405;
    }

    public void setPd2405(String pd2405) {
        this.pd2405 = pd2405;
    }

    @Bindable
    public String getPd2406() {
        return pd2406;
    }

    public void setPd2406(String pd2406) {
        this.pd2406 = pd2406;
    }

    @Bindable
    public String getPd2496() {
        return pd2496;
    }

    public void setPd2496(String pd2496) {
        this.pd2496 = pd2496;
    }

    @Bindable
    public String getPd2496x() {
        return pd2496x;
    }

    public void setPd2496x(String pd2496x) {
        this.pd2496x = pd2496x;
    }

    @Bindable
    public String getPd2498() {
        return pd2498;
    }

    public void setPd2498(String pd2498) {
        this.pd2498 = pd2498;
    }

    @Bindable
    public String getBf01() {
        return bf01;
    }

    public void setBf01(String bf01) {
        this.bf01 = bf01;
        notifyPropertyChanged(BR.bf01);
    }

    @Bindable
    public String getBf02() {
        return bf02;
    }

    public void setBf02(String bf02) {
        this.bf02 = bf02;
        notifyPropertyChanged(BR.bf02);
    }

    @Bindable
    public String getBf03() {
        return bf03;
    }

    public void setBf03(String bf03) {
        this.bf03 = bf03;
        notifyPropertyChanged(BR.bf03);
    }

    @Bindable
    public String getBf3y() {
        return bf3y;
    }

    public void setBf3y(String bf3y) {
        this.bf3y = bf3y;
        notifyPropertyChanged(BR.bf3y);
    }

    @Bindable
    public String getBf03m() {
        return bf03m;
    }

    public void setBf03m(String bf03m) {
        this.bf03m = bf03m;
        notifyPropertyChanged(BR.bf03m);
    }

    @Bindable
    public String getBf3d() {
        return bf3d;
    }

    public void setBf3d(String bf3d) {
        this.bf3d = bf3d;
        notifyPropertyChanged(BR.bf3d);
    }


    @Bindable
    public String getBf03a01() {
        return bf03a01;
    }

    public void setBf03a01(String bf03a01) {
        this.bf03a01 = bf03a01;
        notifyPropertyChanged(BR.bf03a01);
    }


    @Bindable
    public String getBf03a02() {
        return bf03a02;
    }

    public void setBf03a02(String bf03a02) {
        this.bf03a02 = bf03a02;
        notifyPropertyChanged(BR.bf03a02);
    }


    @Bindable
    public String getBf04() {
        return bf04;
    }

    public void setBf04(String bf04) {
        this.bf04 = bf04;
        notifyPropertyChanged(BR.bf04);
    }

    @Bindable
    public String getBf05() {
        return bf05;
    }

    public void setBf05(String bf05) {
        this.bf05 = bf05;
        notifyPropertyChanged(BR.bf05);
    }

    @Bindable
    public String getBf0502x() {
        return bf0502x;
    }

    public void setBf0502x(String bf0502x) {
        this.bf0502x = bf0502x;
        notifyPropertyChanged(BR.bf0502x);
    }

    @Bindable
    public String getBf0503x() {
        return bf0503x;
    }

    public void setBf0503x(String bf0503x) {
        this.bf0503x = bf0503x;
        notifyPropertyChanged(BR.bf0503x);
    }

    @Bindable
    public String getBf06() {
        return bf06;
    }

    public void setBf06(String bf06) {
        this.bf06 = bf06;
        notifyPropertyChanged(BR.bf06);
    }

    @Bindable
    public String getBf07() {
        return bf07;
    }

    public void setBf07(String bf07) {
        this.bf07 = bf07;
        notifyPropertyChanged(BR.bf07);
    }

    @Bindable
    public String getBf0796x() {
        return bf0796x;
    }

    public void setBf0796x(String bf0796x) {
        this.bf0796x = bf0796x;
        notifyPropertyChanged(BR.bf0796x);
    }

    @Bindable
    public String getBf08() {
        return bf08;
    }

    public void setBf08(String bf08) {
        this.bf08 = bf08;
        notifyPropertyChanged(BR.bf08);
    }


    @Bindable
    public String getBf0901() {
        return bf0901;
    }

    public void setBf0901(String bf0901) {
        this.bf0901 = bf0901;
        notifyPropertyChanged(BR.bf0901);
    }


    @Bindable
    public String getBf0902() {
        return bf0902;
    }

    public void setBf0902(String bf0902) {
        this.bf0902 = bf0902;
        notifyPropertyChanged(BR.bf0902);
    }


    @Bindable
    public String getBf0903() {
        return bf0903;
    }

    public void setBf0903(String bf0903) {
        this.bf0903 = bf0903;
        notifyPropertyChanged(BR.bf0903);
    }


    @Bindable
    public String getBf0904() {
        return bf0904;
    }

    public void setBf0904(String bf0904) {
        this.bf0904 = bf0904;
        notifyPropertyChanged(BR.bf0904);
    }


    @Bindable
    public String getBf0905() {
        return bf0905;
    }

    public void setBf0905(String bf0905) {
        this.bf0905 = bf0905;
        notifyPropertyChanged(BR.bf0905);
    }


    @Bindable
    public String getBf0906() {
        return bf0906;
    }

    public void setBf0906(String bf0906) {
        this.bf0906 = bf0906;
        notifyPropertyChanged(BR.bf0906);
    }


    @Bindable
    public String getBf0907() {
        return bf0907;
    }

    public void setBf0907(String bf0907) {
        this.bf0907 = bf0907;
        notifyPropertyChanged(BR.bf0907);
    }


    @Bindable
    public String getBf0908() {
        return bf0908;
    }

    public void setBf0908(String bf0908) {
        this.bf0908 = bf0908;
        notifyPropertyChanged(BR.bf0908);
    }


    @Bindable
    public String getBf0909() {
        return bf0909;
    }

    public void setBf0909(String bf0909) {
        this.bf0909 = bf0909;
        notifyPropertyChanged(BR.bf0909);
    }


    @Bindable
    public String getBf0910() {
        return bf0910;
    }

    public void setBf0910(String bf0910) {
        this.bf0910 = bf0910;
        notifyPropertyChanged(BR.bf0910);
    }


    @Bindable
    public String getBf0999() {
        return bf0999;
    }

    public void setBf0999(String bf0999) {
        this.bf0999 = bf0999;
        notifyPropertyChanged(BR.bf0999);
    }


    @Bindable
    public String getBf0996() {
        return bf0996;
    }

    public void setBf0996(String bf0996) {
        this.bf0996 = bf0996;
        notifyPropertyChanged(BR.bf0996);
    }


    @Bindable
    public String getBf0996x() {
        return bf0996x;
    }

    public void setBf0996x(String bf0996x) {
        this.bf0996x = bf0996x;
        notifyPropertyChanged(BR.bf0996x);
    }


    @Bindable
    public String getBf10() {
        return bf10;
    }

    public void setBf10(String bf10) {
        this.bf10 = bf10;
        notifyPropertyChanged(BR.bf10);
    }

    @Bindable
    public String getBf11() {
        return bf11;
    }

    public void setBf11(String bf11) {
        this.bf11 = bf11;
        notifyPropertyChanged(BR.bf11);
    }

    @Bindable
    public String getBf12() {
        return bf12;
    }

    public void setBf12(String bf12) {
        this.bf12 = bf12;
        notifyPropertyChanged(BR.bf12);
    }

    @Bindable
    public String getBf13() {
        return bf13;
    }

    public void setBf13(String bf13) {
        this.bf13 = bf13;
        notifyPropertyChanged(BR.bf13);
    }


    @Bindable
    public String getBf14a() {
        return bf14a;
    }

    public void setBf14a(String bf14a) {
        this.bf14a = bf14a;
        notifyPropertyChanged(BR.bf14a);
    }


    @Bindable
    public String getBf14b() {
        return bf14b;
    }

    public void setBf14b(String bf14b) {
        this.bf14b = bf14b;
        notifyPropertyChanged(BR.bf14a);
    }


    @Bindable
    public String getBf14b01x() {
        return bf14b01x;
    }

    public void setBf14b01x(String bf14b01x) {
        this.bf14b01x = bf14b01x;
        notifyPropertyChanged(BR.bf14b01x);
    }


    @Bindable
    public String getBf14c() {
        return bf14c;
    }

    public void setBf14c(String bf14c) {
        this.bf14c = bf14c;
        notifyPropertyChanged(BR.bf14c);
    }


    @Bindable
    public String getBf14c01x() {
        return bf14c01x;
    }

    public void setBf14c01x(String bf14c01x) {
        this.bf14c01x = bf14c01x;
        notifyPropertyChanged(BR.bf14c01x);
    }


    @Bindable
    public String getBf14d() {
        return bf14d;
    }

    public void setBf14d(String bf14d) {
        this.bf14d = bf14d;
        notifyPropertyChanged(BR.bf14d);
    }


    @Bindable
    public String getBf14e() {
        return bf14e;
    }

    public void setBf14e(String bf14e) {
        this.bf14e = bf14e;
        notifyPropertyChanged(BR.bf14e);
    }


    @Bindable
    public String getBf14e01x() {
        return bf14e01x;
    }

    public void setBf14e01x(String bf14e01x) {
        this.bf14e01x = bf14e01x;
        notifyPropertyChanged(BR.bf14e01x);
    }


    @Bindable
    public String getBf14f() {
        return bf14f;
    }

    public void setBf14f(String bf14f) {
        this.bf14f = bf14f;
        notifyPropertyChanged(BR.bf14f);
    }


    @Bindable
    public String getBf14f01x() {
        return bf14f01x;
    }

    public void setBf14f01x(String bf14f01x) {
        this.bf14f01x = bf14f01x;
        notifyPropertyChanged(BR.bf14f01x);
    }


    @Bindable
    public String getBf14g() {
        return bf14g;
    }

    public void setBf14g(String bf14g) {
        this.bf14g = bf14g;
        notifyPropertyChanged(BR.bf14g);
    }


    @Bindable
    public String getBf14h() {
        return bf14h;
    }

    public void setBf14h(String bf14h) {
        this.bf14h = bf14h;
        notifyPropertyChanged(BR.bf14h);
    }


    @Bindable
    public String getBf14i() {
        return bf14i;
    }

    public void setBf14i(String bf14i) {
        this.bf14i = bf14i;
        notifyPropertyChanged(BR.bf14i);
    }


    @Bindable
    public String getBf15a() {
        return bf15a;
    }

    public void setBf15a(String bf15a) {
        this.bf15a = bf15a;
        notifyPropertyChanged(BR.bf15a);
    }


    @Bindable
    public String getBf15b() {
        return bf15b;
    }

    public void setBf15b(String bf15b) {
        this.bf15b = bf15b;
        notifyPropertyChanged(BR.bf15b);
    }


    @Bindable
    public String getBf15c() {
        return bf15c;
    }

    public void setBf15c(String bf15c) {
        this.bf15c = bf15c;
        notifyPropertyChanged(BR.bf15c);
    }


    @Bindable
    public String getBf15d() {
        return bf15d;
    }

    public void setBf15d(String bf15d) {
        this.bf15d = bf15d;
        notifyPropertyChanged(BR.bf15d);
    }


    @Bindable
    public String getBf15e() {
        return bf15e;
    }

    public void setBf15e(String bf15e) {
        this.bf15e = bf15e;
        notifyPropertyChanged(BR.bf15e);
    }


    @Bindable
    public String getBf15f() {
        return bf15f;
    }

    public void setBf15f(String bf15f) {
        this.bf15f = bf15f;
        notifyPropertyChanged(BR.bf15f);
    }


    @Bindable
    public String getBf15g() {
        return bf15g;
    }

    public void setBf15g(String bf15g) {
        this.bf15g = bf15g;
        notifyPropertyChanged(BR.bf15g);
    }


    @Bindable
    public String getBf15h() {
        return bf15h;
    }

    public void setBf15h(String bf15h) {
        this.bf15h = bf15h;
        notifyPropertyChanged(BR.bf15h);
    }


    @Bindable
    public String getBf15i() {
        return bf15i;
    }

    public void setBf15i(String bf15i) {
        this.bf15i = bf15i;
        notifyPropertyChanged(BR.bf15i);
    }


    @Bindable
    public String getBf15j() {
        return bf15j;
    }

    public void setBf15j(String bf15j) {
        this.bf15j = bf15j;
        notifyPropertyChanged(BR.bf15j);
    }


    @Bindable
    public String getBf15k() {
        return bf15k;
    }

    public void setBf15k(String bf15k) {
        this.bf15k = bf15k;
        notifyPropertyChanged(BR.bf15k);
    }


    @Bindable
    public String getBf15l() {
        return bf15l;
    }

    public void setBf15l(String bf15l) {
        this.bf15l = bf15l;
        notifyPropertyChanged(BR.bf15l);
    }


    @Bindable
    public String getBf15m() {
        return bf15m;
    }

    public void setBf15m(String bf15m) {
        this.bf15m = bf15m;
        notifyPropertyChanged(BR.bf15m);
    }


    @Bindable
    public String getBf15n() {
        return bf15n;
    }

    public void setBf15n(String bf15n) {
        this.bf15n = bf15n;
        notifyPropertyChanged(BR.bf15n);
    }


    @Bindable
    public String getBf15o() {
        return bf15o;
    }

    public void setBf15o(String bf15o) {
        this.bf15o = bf15o;
        notifyPropertyChanged(BR.bf15o);
    }

/*
    @Bindable
    public String getBf15p() {
        return bf15p;
    }

    public void setBf15p(String bf15p) {
        this.bf15p = bf15p;
        notifyPropertyChanged(BR.bf15p);
    }*/


    @Bindable
    public String getBf15q() {
        return bf15q;
    }

    public void setBf15q(String bf15q) {
        this.bf15q = bf15q;
        notifyPropertyChanged(BR.bf15q);
    }


    @Bindable
    public String getBf16() {
        return bf16;
    }

    public void setBf16(String bf16) {
        this.bf16 = bf16;
        notifyPropertyChanged(BR.bf16);
    }


    @Bindable
    public String getBf17() {
        return bf17;
    }

    public void setBf17(String bf17) {
        this.bf17 = bf17;
        notifyPropertyChanged(BR.bf17);
    }


    @Bindable
    public String getBf1701x() {
        return bf1701x;
    }

    public void setBf1701x(String bf1701x) {
        this.bf1701x = bf1701x;
        notifyPropertyChanged(BR.bf1701x);
    }


    @Bindable
    public String getBf18() {
        return bf18;
    }

    public void setBf18(String bf18) {
        this.bf18 = bf18;
        notifyPropertyChanged(BR.bf18);
    }


    @Bindable
    public String getBf19() {
        return bf19;
    }

    public void setBf19(String bf19) {
        this.bf19 = bf19;
        notifyPropertyChanged(BR.bf19);
    }


    @Bindable
    public String getBf1996x() {
        return bf1996x;
    }

    public void setBf1996x(String bf1996x) {
        this.bf1996x = bf1996x;
        notifyPropertyChanged(BR.bf1996x);
    }


    @Bindable
    public String getBf20() {
        return bf20;
    }

    public void setBf20(String bf20) {
        this.bf20 = bf20;
        notifyPropertyChanged(BR.bf20);
    }


    @Bindable
    public String getCv01() {
        return cv01;
    }

    public void setCv01(String cv01) {
        this.cv01 = cv01;
        notifyPropertyChanged(BR.cv01);
    }

    @Bindable
    public String getCv02() {
        return cv02;
    }

    public void setCv02(String cv02) {
        this.cv02 = cv02;
        notifyPropertyChanged(BR.cv02);
    }

    @Bindable
    public String getCv03() {
        return cv03;
    }

    public void setCv03(String cv03) {
        this.cv03 = cv03;
        notifyPropertyChanged(BR.cv03);
    }

    @Bindable
    public String getCv04() {
        return cv04;
    }

    public void setCv04(String cv04) {
        this.cv04 = cv04;
        notifyPropertyChanged(BR.cv04);
    }


    @Bindable
    public String getCv0501() {
        return cv0501;
    }

    public void setCv0501(String cv0501) {
        this.cv0501 = cv0501;
        notifyPropertyChanged(BR.cv0501);
    }


    @Bindable
    public String getCv0502() {
        return cv0502;
    }

    public void setCv0502(String cv0502) {
        this.cv0502 = cv0502;
        notifyPropertyChanged(BR.cv0502);
    }


    @Bindable
    public String getCv0503() {
        return cv0503;
    }

    public void setCv0503(String cv0503) {
        this.cv0503 = cv0503;
        notifyPropertyChanged(BR.cv0503);
    }


    @Bindable
    public String getCv0504() {
        return cv0504;
    }

    public void setCv0504(String cv0504) {
        this.cv0504 = cv0504;
        notifyPropertyChanged(BR.cv0504);
    }


    @Bindable
    public String getCv0505() {
        return cv0505;
    }

    public void setCv0505(String cv0505) {
        this.cv0505 = cv0505;
        notifyPropertyChanged(BR.cv0505);
    }


    @Bindable
    public String getCv0506() {
        return cv0506;
    }

    public void setCv0506(String cv0506) {
        this.cv0506 = cv0506;
        notifyPropertyChanged(BR.cv0506);
    }


    @Bindable
    public String getCv0507() {
        return cv0507;
    }

    public void setCv0507(String cv0507) {
        this.cv0507 = cv0507;
        notifyPropertyChanged(BR.cv0507);
    }


    @Bindable
    public String getCv0596() {
        return cv0596;
    }

    public void setCv0596(String cv0596) {
        this.cv0596 = cv0596;
        notifyPropertyChanged(BR.cv0596);
    }


    @Bindable
    public String getCv0596x() {
        return cv0596x;
    }

    public void setCv0596x(String cv0596x) {
        this.cv0596x = cv0596x;
        notifyPropertyChanged(BR.cv0596x);
    }


    @Bindable
    public String getCv0601() {
        return cv0601;
    }

    public void setCv0601(String cv0601) {
        this.cv0601 = cv0601;
        notifyPropertyChanged(BR.cv0601);
    }


    @Bindable
    public String getCv0602() {
        return cv0602;
    }

    public void setCv0602(String cv0602) {
        this.cv0602 = cv0602;
        notifyPropertyChanged(BR.cv0602);
    }


    @Bindable
    public String getCv0603() {
        return cv0603;
    }

    public void setCv0603(String cv0603) {
        this.cv0603 = cv0603;
        notifyPropertyChanged(BR.cv0603);
    }


    @Bindable
    public String getCv0604() {
        return cv0604;
    }

    public void setCv0604(String cv0604) {
        this.cv0604 = cv0604;
        notifyPropertyChanged(BR.cv0604);
    }


    @Bindable
    public String getCv0605() {
        return cv0605;
    }

    public void setCv0605(String cv0605) {
        this.cv0605 = cv0605;
        notifyPropertyChanged(BR.cv0605);
    }


    @Bindable
    public String getCv0606() {
        return cv0606;
    }

    public void setCv0606(String cv0606) {
        this.cv0606 = cv0606;
        notifyPropertyChanged(BR.cv0606);
    }


    @Bindable
    public String getCv0607() {
        return cv0607;
    }

    public void setCv0607(String cv0607) {
        this.cv0607 = cv0607;
        notifyPropertyChanged(BR.cv0607);
    }


    @Bindable
    public String getCv0608() {
        return cv0608;
    }

    public void setCv0608(String cv0608) {
        this.cv0608 = cv0608;
        notifyPropertyChanged(BR.cv0608);
    }


    @Bindable
    public String getCv0609() {
        return cv0609;
    }

    public void setCv0609(String cv0609) {
        this.cv0609 = cv0609;
        notifyPropertyChanged(BR.cv0609);
    }


    @Bindable
    public String getCv0610() {
        return cv0610;
    }

    public void setCv0610(String cv0610) {
        this.cv0610 = cv0610;
        notifyPropertyChanged(BR.cv0610);
    }


    @Bindable
    public String getCv0611() {
        return cv0611;
    }

    public void setCv0611(String cv0611) {
        this.cv0611 = cv0611;
        notifyPropertyChanged(BR.cv0611);
    }


    @Bindable
    public String getCv0696() {
        return cv0696;
    }

    public void setCv0696(String cv0696) {
        this.cv0696 = cv0696;
        notifyPropertyChanged(BR.cv0696);
    }


    @Bindable
    public String getCv0696x() {
        return cv0696x;
    }

    public void setCv0696x(String cv0696x) {
        this.cv0696x = cv0696x;
        notifyPropertyChanged(BR.cv0696x);
    }


    @Bindable
    public String getCv07() {
        return cv07;
    }

    public void setCv07(String cv07) {
        this.cv07 = cv07;
        notifyPropertyChanged(BR.cv07);
    }


    @Bindable
    public String getCv0801() {
        return cv0801;
    }

    public void setCv0801(String cv0801) {
        this.cv0801 = cv0801;
        notifyPropertyChanged(BR.cv0801);
    }


    @Bindable
    public String getCv0802() {
        return cv0802;
    }

    public void setCv0802(String cv0802) {
        this.cv0802 = cv0802;
        notifyPropertyChanged(BR.cv0802);
    }


    @Bindable
    public String getCv0803() {
        return cv0803;
    }

    public void setCv0803(String cv0803) {
        this.cv0803 = cv0803;
        notifyPropertyChanged(BR.cv0803);
    }


    @Bindable
    public String getCv0804() {
        return cv0804;
    }

    public void setCv0804(String cv0804) {
        this.cv0804 = cv0804;
        notifyPropertyChanged(BR.cv0804);
    }


    @Bindable
    public String getCv0805() {
        return cv0805;
    }

    public void setCv0805(String cv0805) {
        this.cv0805 = cv0805;
        notifyPropertyChanged(BR.cv0805);
    }


    @Bindable
    public String getCv0806() {
        return cv0806;
    }

    public void setCv0806(String cv0806) {
        this.cv0806 = cv0806;
        notifyPropertyChanged(BR.cv0806);
    }


    @Bindable
    public String getCv0807() {
        return cv0807;
    }

    public void setCv0807(String cv0807) {
        this.cv0807 = cv0807;
        notifyPropertyChanged(BR.cv0807);
    }


    @Bindable
    public String getCv0896() {
        return cv0896;
    }

    public void setCv0896(String cv0896) {
        this.cv0896 = cv0896;
        notifyPropertyChanged(BR.cv0896);
    }


    @Bindable
    public String getCv0898() {
        return cv0898;
    }

    public void setCv0898(String cv0898) {
        this.cv0898 = cv0898;
        notifyPropertyChanged(BR.cv0898);
    }


    @Bindable
    public String getCv0896x() {
        return cv0896x;
    }

    public void setCv0896x(String cv0896x) {
        this.cv0896x = cv0896x;
        notifyPropertyChanged(BR.cv0896x);
    }


    @Bindable
    public String getCv0901() {
        return cv0901;
    }

    public void setCv0901(String cv0901) {
        this.cv0901 = cv0901;
        notifyPropertyChanged(BR.cv0901);
    }


    @Bindable
    public String getCv0902() {
        return cv0902;
    }

    public void setCv0902(String cv0902) {
        this.cv0902 = cv0902;
        notifyPropertyChanged(BR.cv0902);
    }


    @Bindable
    public String getCv0903() {
        return cv0903;
    }

    public void setCv0903(String cv0903) {
        this.cv0903 = cv0903;
        notifyPropertyChanged(BR.cv0903);
    }


    @Bindable
    public String getCv0904() {
        return cv0904;
    }

    public void setCv0904(String cv0904) {
        this.cv0904 = cv0904;
        notifyPropertyChanged(BR.cv0904);
    }


    @Bindable
    public String getCv0905() {
        return cv0905;
    }

    public void setCv0905(String cv0905) {
        this.cv0905 = cv0905;
        notifyPropertyChanged(BR.cv0905);
    }


    @Bindable
    public String getCv0906() {
        return cv0906;
    }

    public void setCv0906(String cv0906) {
        this.cv0906 = cv0906;
        notifyPropertyChanged(BR.cv0906);
    }


    @Bindable
    public String getCv0907() {
        return cv0907;
    }

    public void setCv0907(String cv0907) {
        this.cv0907 = cv0907;
        notifyPropertyChanged(BR.cv0907);
    }


    @Bindable
    public String getCv0996() {
        return cv0996;
    }

    public void setCv0996(String cv0996) {
        this.cv0996 = cv0996;
        notifyPropertyChanged(BR.cv0996);
    }


    @Bindable
    public String getCv0998() {
        return cv0998;
    }

    public void setCv0998(String cv0998) {
        this.cv0998 = cv0998;
        notifyPropertyChanged(BR.cv0998);
    }


    @Bindable
    public String getCv0996x() {
        return cv0996x;
    }

    public void setCv0996x(String cv0996x) {
        this.cv0996x = cv0996x;
        notifyPropertyChanged(BR.cv0996x);
    }


    @Bindable
    public String getCv1001() {
        return cv1001;
    }

    public void setCv1001(String cv1001) {
        this.cv1001 = cv1001;
        notifyPropertyChanged(BR.cv1001);
    }


    @Bindable
    public String getCv1002() {
        return cv1002;
    }

    public void setCv1002(String cv1002) {
        this.cv1002 = cv1002;
        notifyPropertyChanged(BR.cv1002);
    }


    @Bindable
    public String getCv1003() {
        return cv1003;
    }

    public void setCv1003(String cv1003) {
        this.cv1003 = cv1003;
        notifyPropertyChanged(BR.cv1003);
    }


    @Bindable
    public String getCv1004() {
        return cv1004;
    }

    public void setCv1004(String cv1004) {
        this.cv1004 = cv1004;
        notifyPropertyChanged(BR.cv1004);
    }


    @Bindable
    public String getCv1005() {
        return cv1005;
    }

    public void setCv1005(String cv1005) {
        this.cv1005 = cv1005;
        notifyPropertyChanged(BR.cv1005);
    }


    @Bindable
    public String getCv1006() {
        return cv1006;
    }

    public void setCv1006(String cv1006) {
        this.cv1006 = cv1006;
        notifyPropertyChanged(BR.cv1006);
    }


    @Bindable
    public String getCv1007() {
        return cv1007;
    }

    public void setCv1007(String cv1007) {
        this.cv1007 = cv1007;
        notifyPropertyChanged(BR.cv1007);
    }


    @Bindable
    public String getCv1008() {
        return cv1008;
    }

    public void setCv1008(String cv1008) {
        this.cv1008 = cv1008;
        notifyPropertyChanged(BR.cv1008);
    }


    @Bindable
    public String getCv1096() {
        return cv1096;
    }

    public void setCv1096(String cv1096) {
        this.cv1096 = cv1096;
        notifyPropertyChanged(BR.cv1096);
    }


    @Bindable
    public String getCv1098() {
        return cv1098;
    }

    public void setCv1098(String cv1098) {
        this.cv1098 = cv1098;
        notifyPropertyChanged(BR.cv1098);
    }


    @Bindable
    public String getCv1096x() {
        return cv1096x;
    }

    public void setCv1096x(String cv1096x) {
        this.cv1096x = cv1096x;
        notifyPropertyChanged(BR.cv1096x);
    }


    @Bindable
    public String getCv11() {
        return cv11;
    }

    public void setCv11(String cv11) {
        this.cv11 = cv11;
        notifyPropertyChanged(BR.cv11);
    }

    @Bindable
    public String getCv12() {
        return cv12;
    }

    public void setCv12(String cv12) {
        this.cv12 = cv12;
        notifyPropertyChanged(BR.cv12);
    }

    @Bindable
    public String getCv1296x() {
        return cv1296x;
    }

    public void setCv1296x(String cv1296x) {
        this.cv1296x = cv1296x;
        notifyPropertyChanged(BR.cv1296x);
    }

    @Bindable
    public String getCv13() {
        return cv13;
    }

    public void setCv13(String cv13) {
        this.cv13 = cv13;
        notifyPropertyChanged(BR.cv13);
    }

    @Bindable
    public String getCv14() {
        return cv14;
    }

    public void setCv14(String cv14) {
        this.cv14 = cv14;
        notifyPropertyChanged(BR.cv14);
    }

    @Bindable
    public String getCv15() {
        return cv15;
    }

    public void setCv15(String cv15) {
        this.cv15 = cv15;
        notifyPropertyChanged(BR.cv15);
    }

    @Bindable
    public String getCv16() {
        return cv16;
    }

    public void setCv16(String cv16) {
        this.cv16 = cv16;
        notifyPropertyChanged(BR.cv16);
    }

    @Bindable
    public String getCv1696x() {
        return cv1696x;
    }

    public void setCv1696x(String cv1696x) {
        this.cv1696x = cv1696x;
        notifyPropertyChanged(BR.cv1696x);
    }

    @Bindable
    public String getCv17() {
        return cv17;
    }

    public void setCv17(String cv17) {
        this.cv17 = cv17;
        notifyPropertyChanged(BR.cv17);
    }

    @Bindable
    public String getCv18() {
        return cv18;
    }

    public void setCv18(String cv18) {
        this.cv18 = cv18;
        notifyPropertyChanged(BR.cv18);
    }

    @Bindable
    public String getCv1896x() {
        return cv1896x;
    }

    public void setCv1896x(String cv1896x) {
        this.cv1896x = cv1896x;
        notifyPropertyChanged(BR.cv1896x);
    }

    @Bindable
    public String getCv19() {
        return cv19;
    }

    public void setCv19(String cv19) {
        this.cv19 = cv19;
        notifyPropertyChanged(BR.cv19);
    }

    @Bindable
    public String getCv1996x() {
        return cv1996x;
    }

    public void setCv1996x(String cv1996x) {
        this.cv1996x = cv1996x;
        notifyPropertyChanged(BR.cv1996x);
    }


    @Bindable
    public String getSe01() {
        return se01;
    }

    public void setSe01(String se01) {
        this.se01 = se01;
        notifyPropertyChanged(BR.se01);
    }

    @Bindable
    public String getSe0196x() {
        return se0196x;
    }

    public void setSe0196x(String se0196x) {
        this.se0196x = se0196x;
        notifyPropertyChanged(BR.se0196x);
    }

    @Bindable
    public String getSe02() {
        return se02;
    }

    public void setSe02(String se02) {
        this.se02 = se02;
        notifyPropertyChanged(BR.se02);
    }

    @Bindable
    public String getSe0296x() {
        return se0296x;
    }

    public void setSe0296x(String se0296x) {
        this.se0296x = se0296x;
        notifyPropertyChanged(BR.se0296x);
    }

    @Bindable
    public String getSe03() {
        return se03;
    }

    public void setSe03(String se03) {
        this.se03 = se03;
        notifyPropertyChanged(BR.se03);
    }

    @Bindable
    public String getSe0396x() {
        return se0396x;
    }

    public void setSe0396x(String se0396x) {
        this.se0396x = se0396x;
        notifyPropertyChanged(BR.se0396x);
    }

    @Bindable
    public String getSe04() {
        return se04;
    }

    public void setSe04(String se04) {
        this.se04 = se04;
        notifyPropertyChanged(BR.se04);
    }

    @Bindable
    public String getSe0496x() {
        return se0496x;
    }

    public void setSe0496x(String se0496x) {
        this.se0496x = se0496x;
        notifyPropertyChanged(BR.se0496x);
    }

    @Bindable
    public String getSe05() {
        return se05;
    }

    public void setSe05(String se05) {
        this.se05 = se05;
        notifyPropertyChanged(BR.se05);
    }

    @Bindable
    public String getSe0596x() {
        return se0596x;
    }

    public void setSe0596x(String se0596x) {
        this.se0596x = se0596x;
        notifyPropertyChanged(BR.se0596x);
    }

    @Bindable
    public String getSe06a() {
        return se06a;
    }

    public void setSe06a(String se06a) {
        this.se06a = se06a;
        notifyPropertyChanged(BR.se06a);
    }

    @Bindable
    public String getSe07a() {
        return se07a;
    }

    public void setSe07a(String se07a) {
        this.se07a = se07a;
        notifyPropertyChanged(BR.se07a);
    }

    @Bindable
    public String getSe08() {
        return se08;
    }

    public void setSe08(String se08) {
        this.se08 = se08;
        notifyPropertyChanged(BR.se08);
    }

    @Bindable
    public String getSe0896x() {
        return se0896x;
    }

    public void setSe0896x(String se0896x) {
        this.se0896x = se0896x;
        notifyPropertyChanged(BR.se0896x);
    }

    @Bindable
    public String getSe09() {
        return se09;
    }

    public void setSe09(String se09) {
        this.se09 = se09;
        notifyPropertyChanged(BR.se09);
    }

    @Bindable
    public String getSe10() {
        return se10;
    }

    public void setSe10(String se10) {
        this.se10 = se10;
        notifyPropertyChanged(BR.se10);
    }

    @Bindable
    public String getSe1099x() {
        return se1099x;
    }

    public void setSe1099x(String se1099x) {
        this.se1099x = se1099x;
        notifyPropertyChanged(BR.se1099x);
    }

    @Bindable
    public String getSe11() {
        return se11;
    }

    public void setSe11(String se11) {
        this.se11 = se11;
        notifyPropertyChanged(BR.se11);
    }

    @Bindable
    public String getSe1196x() {
        return se1196x;
    }

    public void setSe1196x(String se1196x) {
        this.se1196x = se1196x;
        notifyPropertyChanged(BR.se1196x);
    }

    @Bindable
    public String getSe12() {
        return se12;
    }

    public void setSe12(String se12) {
        this.se12 = se12;
        notifyPropertyChanged(BR.se12);
    }

    @Bindable
    public String getSe1296x() {
        return se1296x;
    }

    public void setSe1296x(String se1296x) {
        this.se1296x = se1296x;
        notifyPropertyChanged(BR.se1296x);
    }

    @Bindable
    public String getSe13() {
        return se13;
    }

    public void setSe13(String se13) {
        this.se13 = se13;
        notifyPropertyChanged(BR.se13);
    }

    @Bindable
    public String getSe14() {
        return se14;
    }

    public void setSe14(String se14) {
        this.se14 = se14;
        notifyPropertyChanged(BR.se14);
    }

    @Bindable
    public String getSe15() {
        return se15;
    }

    public void setSe15(String se15) {
        this.se15 = se15;
        notifyPropertyChanged(BR.se15);
    }

    @Bindable
    public String getSe16() {
        return se16;
    }

    public void setSe16(String se16) {
        this.se16 = se16;
        notifyPropertyChanged(BR.se16);
    }

    @Bindable
    public String getSe17() {
        return se17;
    }

    public void setSe17(String se17) {
        this.se17 = se17;
        notifyPropertyChanged(BR.se17);
    }

    @Bindable
    public String getSe1701() {
        return se1701;
    }

    public void setSe1701(String se1701) {
        this.se1701 = se1701;
        notifyPropertyChanged(BR.se1701);
    }

    @Bindable
    public String getSe1702() {
        return se1702;
    }

    public void setSe1702(String se1702) {
        this.se1702 = se1702;
        notifyPropertyChanged(BR.se1702);
    }

    @Bindable
    public String getSe1703() {
        return se1703;
    }

    public void setSe1703(String se1703) {
        this.se1703 = se1703;
        notifyPropertyChanged(BR.se1703);
    }

    @Bindable
    public String getSe1704() {
        return se1704;
    }

    public void setSe1704(String se1704) {
        this.se1704 = se1704;
        notifyPropertyChanged(BR.se1704);
    }

    @Bindable
    public String getSe1705() {
        return se1705;
    }

    public void setSe1705(String se1705) {
        this.se1705 = se1705;
        notifyPropertyChanged(BR.se1705);
    }

    @Bindable
    public String getSe1801() {
        return se1801;
    }

    public void setSe1801(String se1801) {
        this.se1801 = se1801;
        notifyPropertyChanged(BR.se1801);
    }

    @Bindable
    public String getSe1802() {
        return se1802;
    }

    public void setSe1802(String se1802) {
        this.se1802 = se1802;
        notifyPropertyChanged(BR.se1802);
    }

    @Bindable
    public String getSe1803() {
        return se1803;
    }

    public void setSe1803(String se1803) {
        this.se1803 = se1803;
        notifyPropertyChanged(BR.se1803);
    }

    @Bindable
    public String getSe1804() {
        return se1804;
    }

    public void setSe1804(String se1804) {
        this.se1804 = se1804;
        notifyPropertyChanged(BR.se1804);
    }

    @Bindable
    public String getSe1805() {
        return se1805;
    }

    public void setSe1805(String se1805) {
        this.se1805 = se1805;
        notifyPropertyChanged(BR.se1805);
    }

    @Bindable
    public String getSe1896() {
        return se1896;
    }

    public void setSe1896(String se1896) {
        this.se1896 = se1896;
        notifyPropertyChanged(BR.se1896);
    }

    @Bindable
    public String getSe189601x() {
        return se189601x;
    }

    public void setSe189601x(String se189601x) {
        this.se189601x = se189601x;
        notifyPropertyChanged(BR.se189601x);
    }

    @Bindable
    public String getSe19() {
        return se19;
    }

    public void setSe19(String se19) {
        this.se19 = se19;
        notifyPropertyChanged(BR.se19);
    }

    @Bindable
    public String getSe1996x() {
        return se1996x;
    }

    public void setSe1996x(String se1996x) {
        this.se1996x = se1996x;
        notifyPropertyChanged(BR.se1996x);
    }

    @Bindable
    public String getSe2001() {
        return se2001;
    }

    public void setSe2001(String se2001) {
        this.se2001 = se2001;
        notifyPropertyChanged(BR.se2001);
    }

    @Bindable
    public String getSe2002() {
        return se2002;
    }

    public void setSe2002(String se2002) {
        this.se2002 = se2002;
        notifyPropertyChanged(BR.se2002);
    }

    @Bindable
    public String getSe2003() {
        return se2003;
    }

    public void setSe2003(String se2003) {
        this.se2003 = se2003;
        notifyPropertyChanged(BR.se2003);
    }

    @Bindable
    public String getSe2004() {
        return se2004;
    }

    public void setSe2004(String se2004) {
        this.se2004 = se2004;
        notifyPropertyChanged(BR.se2004);
    }


    @Bindable
    public String getSe2005() {
        return se2005;
    }

    public void setSe2005(String se2005) {
        this.se2005 = se2005;
        notifyPropertyChanged(BR.se2005);
    }


    @Bindable
    public String getSe2006() {
        return se2006;
    }

    public void setSe2006(String se2006) {
        this.se2006 = se2006;
        notifyPropertyChanged(BR.se2006);
    }


    @Bindable
    public String getSe2096() {
        Log.d(TAG, "getSe2096: " + this.se2096);
        return se2096;
    }

    public void setSe2096(String se2096) {
        if (this.se2096 != se2096) {
            this.se2096 = se2096;
            Log.d(TAG, "setSe2096: " + this.se2096);
            notifyPropertyChanged(BR.se2096);
        }
    }
    
  /*  if (this.a303 != a303) {
        this.a303 = a303;
        notifyPropertyChanged(BR.a303);
        Log.d(TAG, "setA303: " + this.a303);
    }*/

    @Bindable
    public String getSe2096x() {
        return se2096x;
    }

    public void setSe2096x(String se2096x) {
        this.se2096x = se2096x;
        notifyPropertyChanged(BR.se2096x);
    }

    @Bindable
    public String getSe21() {
        return se21;
    }

    public void setSe21(String se21) {
        this.se21 = se21;
        notifyPropertyChanged(BR.se21);
    }

    @Bindable
    public String getSe2101() {
        return se2101;
    }

    public void setSe2101(String se2101) {
        this.se2101 = se2101;
        notifyPropertyChanged(BR.se2101);
    }

    @Bindable
    public String getSe2102() {
        return se2102;
    }

    public void setSe2102(String se2102) {
        this.se2102 = se2102;
        notifyPropertyChanged(BR.se2102);
    }

    @Bindable
    public String getSe2103() {
        return se2103;
    }

    public void setSe2103(String se2103) {
        this.se2103 = se2103;
        notifyPropertyChanged(BR.se2103);
    }

    @Bindable
    public String getSe2104() {
        return se2104;
    }

    public void setSe2104(String se2104) {
        this.se2104 = se2104;
        notifyPropertyChanged(BR.se2104);
    }

    @Bindable
    public String getSe2105() {
        return se2105;
    }

    public void setSe2105(String se2105) {
        this.se2105 = se2105;
        notifyPropertyChanged(BR.se2105);
    }

    @Bindable
    public String getSe2196() {
        return se2196;
    }

    public void setSe2196(String se2196) {
        this.se2196 = se2196;
        notifyPropertyChanged(BR.se2196);
    }

    @Bindable
    public String getSe2196x() {
        return se2196x;
    }

    public void setSe2196x(String se2196x) {
        this.se2196x = se2196x;
        notifyPropertyChanged(BR.se2196x);
    }

    @Bindable
    public String getSe2201() {
        return se2201;
    }

    public void setSe2201(String se2201) {
        this.se2201 = se2201;
        notifyPropertyChanged(BR.se2201);
    }

    @Bindable
    public String getSe2202() {
        return se2202;
    }

    public void setSe2202(String se2202) {
        this.se2202 = se2202;
        notifyPropertyChanged(BR.se2202);
    }

    @Bindable
    public String getSe2203() {
        return se2203;
    }

    public void setSe2203(String se2203) {
        this.se2203 = se2203;
        notifyPropertyChanged(BR.se2203);
    }

    @Bindable
    public String getSe2204() {
        return se2204;
    }

    public void setSe2204(String se2204) {
        this.se2204 = se2204;
        notifyPropertyChanged(BR.se2204);
    }

    @Bindable
    public String getSe2205() {
        return se2205;
    }

    public void setSe2205(String se2205) {
        this.se2205 = se2205;
        notifyPropertyChanged(BR.se2205);
    }

    @Bindable
    public String getSe2206() {
        return se2206;
    }

    public void setSe2206(String se2206) {
        this.se2206 = se2206;
        notifyPropertyChanged(BR.se2206);
    }

    @Bindable
    public String getSe2207() {
        return se2207;
    }

    public void setSe2207(String se2207) {
        this.se2207 = se2207;
        notifyPropertyChanged(BR.se2207);
    }

    @Bindable
    public String getSe2208() {
        return se2208;
    }

    public void setSe2208(String se2208) {
        this.se2208 = se2208;
        notifyPropertyChanged(BR.se2208);
    }

    @Bindable
    public String getSe2209() {
        return se2209;
    }

    public void setSe2209(String se2209) {
        this.se2209 = se2209;
        notifyPropertyChanged(BR.se2209);
    }

    @Bindable
    public String getSe2210() {
        return se2210;
    }

    public void setSe2210(String se2210) {
        this.se2210 = se2210;
        notifyPropertyChanged(BR.se2210);
    }

    @Bindable
    public String getSe2211() {
        return se2211;
    }

    public void setSe2211(String se2211) {
        this.se2211 = se2211;
        notifyPropertyChanged(BR.se2211);
    }

    @Bindable
    public String getSe2212() {
        return se2212;
    }

    public void setSe2212(String se2212) {
        this.se2212 = se2212;
        notifyPropertyChanged(BR.se2212);
    }

    @Bindable
    public String getSe2213() {
        return se2213;
    }

    public void setSe2213(String se2213) {
        this.se2213 = se2213;
        notifyPropertyChanged(BR.se2213);
    }

    @Bindable
    public String getSe2214() {
        return se2214;
    }

    public void setSe2214(String se2214) {
        this.se2214 = se2214;
        notifyPropertyChanged(BR.se2214);
    }

    @Bindable
    public String getSe2215() {
        return se2215;
    }

    public void setSe2215(String se2215) {
        this.se2215 = se2215;
        notifyPropertyChanged(BR.se2215);
    }

    @Bindable
    public String getSe2216() {
        return se2216;
    }

    public void setSe2216(String se2216) {
        this.se2216 = se2216;
        notifyPropertyChanged(BR.se2216);
    }

    @Bindable
    public String getSe2217() {
        return se2217;
    }

    public void setSe2217(String se2217) {
        this.se2217 = se2217;
        notifyPropertyChanged(BR.se2217);
    }

    @Bindable
    public String getSe2218() {
        return se2218;
    }

    public void setSe2218(String se2218) {
        this.se2218 = se2218;
        notifyPropertyChanged(BR.se2218);
    }

    @Bindable
    public String getSe23() {
        return se23;
    }

    public void setSe23(String se23) {
        this.se23 = se23;
        notifyPropertyChanged(BR.se23);
    }

    @Bindable
    public String getSe24() {
        return se24;
    }

    public void setSe24(String se24) {
        this.se24 = se24;
        notifyPropertyChanged(BR.se24);
    }

    @Bindable
    public String getSe25() {
        return se25;
    }

    public void setSe25(String se25) {
        this.se25 = se25;
        notifyPropertyChanged(BR.se25);
    }

    @Bindable
    public String getSe26() {
        return se26;
    }

    public void setSe26(String se26) {
        this.se26 = se26;
        notifyPropertyChanged(BR.se26);
    }

    @Bindable
    public String getSe27() {
        return se27;
    }

    public void setSe27(String se27) {
        this.se27 = se27;
        notifyPropertyChanged(BR.se27);
    }

    @Bindable
    public String getSe2701() {
        return se2701;
    }

    public void setSe2701(String se2701) {
        this.se2701 = se2701;
        notifyPropertyChanged(BR.se2701);
    }

    @Bindable
    public String getSe2702() {
        return se2702;
    }

    public void setSe2702(String se2702) {
        this.se2702 = se2702;
        notifyPropertyChanged(BR.se2702);
    }

    @Bindable
    public String getSe2703() {
        return se2703;
    }

    public void setSe2703(String se2703) {
        this.se2703 = se2703;
        notifyPropertyChanged(BR.se2703);
    }

    @Bindable
    public String getSe2704() {
        return se2704;
    }

    public void setSe2704(String se2704) {
        this.se2704 = se2704;
        notifyPropertyChanged(BR.se2704);
    }

    @Bindable
    public String getSe28() {
        return se28;
    }

    public void setSe28(String se28) {
        this.se28 = se28;
        notifyPropertyChanged(BR.se28);
    }

    @Bindable
    public String getSe2801() {
        return se2801;
    }

    public void setSe2801(String se2801) {
        this.se2801 = se2801;
        notifyPropertyChanged(BR.se2801);
    }

    @Bindable
    public String getSe2802() {
        return se2802;
    }

    public void setSe2802(String se2802) {
        this.se2802 = se2802;
        notifyPropertyChanged(BR.se2802);
    }

    @Bindable
    public String getSe2803() {
        return se2803;
    }

    public void setSe2803(String se2803) {
        this.se2803 = se2803;
        notifyPropertyChanged(BR.se2803);
    }

    @Bindable
    public String getSe29() {
        return se29;
    }

    public void setSe29(String se29) {
        this.se29 = se29;
        notifyPropertyChanged(BR.se29);
    }

    @Bindable
    public String getSe30() {
        return se30;
    }

    public void setSe30(String se30) {
        this.se30 = se30;
        notifyPropertyChanged(BR.se30);
    }

    @Bindable
    public String getSe3001() {
        return se3001;
    }

    public void setSe3001(String se3001) {
        this.se3001 = se3001;
        notifyPropertyChanged(BR.se3001);
    }

    @Bindable
    public String getSe3002() {
        return se3002;
    }

    public void setSe3002(String se3002) {
        this.se3002 = se3002;
        notifyPropertyChanged(BR.se3002);
    }

    @Bindable
    public String getSe3003() {
        return se3003;
    }

    public void setSe3003(String se3003) {
        this.se3003 = se3003;
        notifyPropertyChanged(BR.se3003);
    }

    @Bindable
    public String getSe3096() {
        return se3096;
    }

    public void setSe3096(String se3096) {
        this.se3096 = se3096;
        notifyPropertyChanged(BR.se3096);
    }

    @Bindable
    public String getSe3096x() {
        return se3096x;
    }

    public void setSe3096x(String se3096x) {
        this.se3096x = se3096x;
        notifyPropertyChanged(BR.se3096x);
    }

    @Bindable
    public String getSe31() {
        return se31;
    }

    public void setSe31(String se31) {
        this.se31 = se31;
        notifyPropertyChanged(BR.se31);
    }

    @Bindable
    public String getSe3196x() {
        return se3196x;
    }

    public void setSe3196x(String se3196x) {
        this.se3196x = se3196x;
        notifyPropertyChanged(BR.se3196x);
    }

    @Bindable
    public String getSe32() {
        return se32;
    }

    public void setSe32(String se32) {
        this.se32 = se32;
        notifyPropertyChanged(BR.se32);
    }

    @Bindable
    public String getSe3302() {
        return se3302;
    }

    public void setSe3302(String se3302) {
        this.se3302 = se3302;
        notifyPropertyChanged(BR.se3302);
    }

    @Bindable
    public String getSe3301() {
        return se3301;
    }

    public void setSe3301(String se3301) {
        this.se3301 = se3301;
        notifyPropertyChanged(BR.se3301);
    }

    @Bindable
    public String getSe3401() {
        return se3401;
    }

    public void setSe3401(String se3401) {
        this.se3401 = se3401;
        notifyPropertyChanged(BR.se3401);
    }

    @Bindable
    public String getSe3402() {
        return se3402;
    }

    public void setSe3402(String se3402) {
        this.se3402 = se3402;
        notifyPropertyChanged(BR.se3402);
    }

    @Bindable
    public String getSe35() {
        return se35;
    }

    public void setSe35(String se35) {
        this.se35 = se35;
        notifyPropertyChanged(BR.se35);
    }

    @Bindable
    public String getSe36() {
        return se36;
    }

    public void setSe36(String se36) {
        this.se36 = se36;
        notifyPropertyChanged(BR.se36);
    }

    @Bindable
    public String getSe37() {
        return se37;
    }

    public void setSe37(String se37) {
        this.se37 = se37;
        notifyPropertyChanged(BR.se37);
    }

    @Bindable
    public String getSe3701() {
        return se3701;
    }

    public void setSe3701(String se3701) {
        this.se3701 = se3701;
        notifyPropertyChanged(BR.se3701);
    }

    @Bindable
    public String getSe3702() {
        return se3702;
    }

    public void setSe3702(String se3702) {
        this.se3702 = se3702;
        notifyPropertyChanged(BR.se3702);
    }

    @Bindable
    public String getSe3703() {
        return se3703;
    }

    public void setSe3703(String se3703) {
        this.se3703 = se3703;
        notifyPropertyChanged(BR.se3703);
    }

    @Bindable
    public String getSe3704() {
        return se3704;
    }

    public void setSe3704(String se3704) {
        this.se3704 = se3704;
        notifyPropertyChanged(BR.se3704);
    }

    @Bindable
    public String getSe3705() {
        return se3705;
    }

    public void setSe3705(String se3705) {
        this.se3705 = se3705;
        notifyPropertyChanged(BR.se3705);
    }

    @Bindable
    public String getSe3706() {
        return se3706;
    }

    public void setSe3706(String se3706) {
        this.se3706 = se3706;
        notifyPropertyChanged(BR.se3706);
    }

    @Bindable
    public String getSe3707() {
        return se3707;
    }

    public void setSe3707(String se3707) {
        this.se3707 = se3707;
        notifyPropertyChanged(BR.se3707);
    }

    @Bindable
    public String getSe3708() {
        return se3708;
    }

    public void setSe3708(String se3708) {
        this.se3708 = se3708;
        notifyPropertyChanged(BR.se3708);
    }


    @Bindable
    public String getSe3709() {
        return se3709;
    }

    public void setSe3709(String se3709) {
        this.se3709 = se3709;
        notifyPropertyChanged(BR.se3709);
    }


    @Bindable
    public String getSe3710() {
        return se3710;
    }

    public void setSe3710(String se3710) {
        this.se3710 = se3710;
        notifyPropertyChanged(BR.se3710);
    }


    @Bindable
    public String getSe3796() {
        return se3796;
    }

    public void setSe3796(String se3796) {
        this.se3796 = se3796;
        notifyPropertyChanged(BR.se3796);
    }

    @Bindable
    public String getSe3796x() {
        return se3796x;
    }

    public void setSe3796x(String se3796x) {
        this.se3796x = se3796x;
        notifyPropertyChanged(BR.se3796x);
    }

    @Bindable
    public String getSe38() {
        return se38;
    }

    public void setSe38(String se38) {
        this.se38 = se38;
        notifyPropertyChanged(BR.se38);
    }

    @Bindable
    public String getSe39() {
        return se39;
    }

    public void setSe39(String se39) {
        this.se39 = se39;
        notifyPropertyChanged(BR.se39);
    }

    @Bindable
    public String getSe40() {
        return se40;
    }

    public void setSe40(String se40) {
        this.se40 = se40;
        notifyPropertyChanged(BR.se40);
    }


    @Bindable
    public String getPddate() {
        return pddate;
    }

    public void setPddate(String pddate) {
        this.pddate = pddate;
        notifyPropertyChanged(BR.pddate);
    }


    @Bindable
    public String getBfdate() {
        return bfdate;
    }

    public void setBfdate(String bfdate) {
        this.bfdate = bfdate;
        notifyPropertyChanged(BR.bfdate);
    }


    @Bindable
    public String getCvdate() {
        return cvdate;
    }

    public void setCvdate(String cvdate) {
        this.cvdate = cvdate;
        notifyPropertyChanged(BR.cvdate);
    }


    @Bindable
    public String getSedate() {
        return sedate;
    }

    public void setSedate(String sedate) {
        this.sedate = sedate;
        notifyPropertyChanged(BR.sedate);
    }


    @Bindable
    public String getIStatus() {
        return iStatus;
    }

    public void setIStatus(String iStatus) {
        this.iStatus = iStatus;
        notifyPropertyChanged(BR.iStatus);
    }

    @Bindable
    public String getIStatus96x() {
        return iStatus96x;
    }

    public void setIStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
        notifyPropertyChanged(BR.iStatus96x);
    }


    public Form Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(FormsContract.FormsTable.COLUMN_ID);
        this.uid = jsonObject.getString(FormsContract.FormsTable.COLUMN_UID);
        this.userName = jsonObject.getString(FormsContract.FormsTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(FormsContract.FormsTable.COLUMN_SYSDATE);
        this.dcode = jsonObject.getString(FormsContract.FormsTable.COLUMN_DCODE);
        this.ucode = jsonObject.getString(FormsContract.FormsTable.COLUMN_UCODE);
        this.cluster = jsonObject.getString(FormsContract.FormsTable.COLUMN_CLUSTER);
        this.hhno = jsonObject.getString(FormsContract.FormsTable.COLUMN_HHNO);
        this.deviceId = jsonObject.getString(FormsContract.FormsTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(FormsContract.FormsTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(FormsContract.FormsTable.COLUMN_APPVERSION);
        this.endTime = jsonObject.getString(FormsContract.FormsTable.COLUMN_ENDINGDATETIME);
        this.iStatus = jsonObject.getString(FormsContract.FormsTable.COLUMN_ISTATUS);
        this.iStatus96x = jsonObject.getString(FormsContract.FormsTable.COLUMN_ISTATUS96x);
        this.iStatus96x = jsonObject.getString(FormsContract.FormsTable.COLUMN_ISTATUS96x);
        this.synced = jsonObject.getString(FormsContract.FormsTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(FormsContract.FormsTable.COLUMN_SYNCED_DATE);
        this.g5Flag = jsonObject.getString(FormsContract.FormsTable.COLUMN_G5FLAG);
        this.hhflag = jsonObject.getString(FormsContract.FormsTable.COLUMN_HHFLAG);

        this.s01HH = jsonObject.getString(FormsContract.FormsTable.COLUMN_S01HH);
        this.s05PD = jsonObject.getString(FormsContract.FormsTable.COLUMN_S05PD);
        this.s06BF = jsonObject.getString(FormsContract.FormsTable.COLUMN_S06BF);
        this.s07CV = jsonObject.getString(FormsContract.FormsTable.COLUMN_S07CV);
        this.s08SE = jsonObject.getString(FormsContract.FormsTable.COLUMN_S08SE);

        return this;

    }


    public Form Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_UID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_SYSDATE));
        this.dcode = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_DCODE));
        this.ucode = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_UCODE));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_CLUSTER));
        this.hhno = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_HHNO));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_APPVERSION));
        this.endTime = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_ENDINGDATETIME));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_ISTATUS));
        this.iStatus96x = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_ISTATUS96x));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_SYNCED_DATE));
        this.g5Flag = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_G5FLAG));
        this.hhflag = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_HHFLAG));

        //For childCount
        //this.s01HH = cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_S01HH));

        s01HHHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_S01HH)));
        s05PDHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_S05PD)));
        s06BFHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_S06BF)));
        s07CVHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_S07CV)));
        s08SEHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsContract.FormsTable.COLUMN_S08SE)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form.class);
    }


    public String s01HHtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("hh01", hh01)
                    .put("hh01", hh01)
                    .put("hh0201", hh0201)
                    .put("hh0202", hh0202)
                    .put("hh03", hh03)
                    .put("hh04", hh04)
                    .put("hh05", hh05)
                    .put("hh06", hh06)
                    .put("hh07", hh07)
                    .put("hh08", hh08)
                    .put("hh09", hh09)
                    .put("hh10", hh10)
                    .put("hh11", hh11)
                    .put("hh12", hh12)
                    .put("hh13", hh13)
                    .put("hh14", hh14)
                    .put("hh15", hh15)
                    .put("hh16", hh16)
                    .put("hh17", hh17)
                    .put("hh1796x", hh1796x)
                    .put("hh18", hh18)
                    .put("hh19", hh19)
                    .put("hh20", hh20)
                    .put("hh2096x", hh2096x)
                    .put("hh21", hh21)
                    .put("hh22", hh22)
                    .put("hh23", hh23)
                    .put("hh24", hh24)
                    .put("hh25", hh25)
                    .put("hh25a", hh25a)
                    .put("hh26", hh26)
                    .put("hh2696x", hh2696x);
        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public String s05PDtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("pd01", pd01)
                    .put("pd02", pd02)
                    .put("pd03", pd03)
                    .put("pd04", pd04)
                    .put("pd05", pd05)
                    .put("pd0596x", pd0596x)
                    .put("pd06", pd06)
                    .put("pd06961x", pd06961x)
                    .put("pd06962x", pd06962x)
                    .put("pd07", pd07)
                    .put("pd0701x", pd0701x)
                    .put("pd08", pd08)
                    .put("pd08b", pd08b)
                    .put("pd08c", pd08c)
                    .put("pd08a01", pd08a01)
                    .put("pd08a02", pd08a02)
                    .put("pd08a03", pd08a03)
                    .put("pd08a04", pd08a04)
                    .put("pd08a05", pd08a05)
                    .put("pd08a06", pd08a06)
                    .put("pd08a07", pd08a07)
                    .put("pd08a08", pd08a08)
                    .put("pd08a09", pd08a09)
                    .put("pd08a96", pd08a96)
                    .put("pd08a96x", pd08a96x)
                    .put("pd09", pd09)
                    .put("pd10", pd10)
                    .put("pd1101", pd1101)
                    .put("pd1102", pd1102)
                    .put("pd12", pd12)
                    .put("pd1296x", pd1296x)
                    .put("pd13", pd13)
                    .put("pd13961x", pd13961x)
                    .put("pd13962x", pd13962x)
                    .put("pd14", pd14)
                    .put("pd1496x", pd1496x)
                    .put("pd15", pd15)
                    .put("pd16", pd16)
                    .put("pd1601", pd1601)
                    .put("pd1602", pd1602)
                    .put("pd1603", pd1603)
                    .put("pd1604", pd1604)
                    .put("pd1605", pd1605)
                    .put("pd1606", pd1606)
                    .put("pd1607", pd1607)
                    .put("pd1696", pd1696)
                    .put("pd1696x", pd1696x)
                    .put("pd17", pd17)
                    .put("pd1701x", pd1701x)
                    .put("pd1702x", pd1702x)
                    .put("pd1703x", pd1703x)
                    .put("pd18", pd18)
                    .put("pd19", pd19)
                    .put("pd20", pd20)
                    .put("pd2001", pd2001)
                    .put("pd2002", pd2002)
                    .put("pd2003", pd2003)
                    .put("pd2004", pd2004)
                    .put("pd2005", pd2005)
                    .put("pd2006", pd2006)
                    .put("pd2007", pd2007)
                    .put("pd2096", pd2096)
                    .put("pd2096x", pd2096x)
                    .put("pd21", pd21)
                    .put("pd2101x", pd2101x)
                    .put("pd2102x", pd2102x)
                    .put("pd2103x", pd2103x)
                    .put("pd22", pd22)

                    .put("pd23", pd23)
                    .put("pd2401", pd2401)

                    .put("pd2402", pd2402)

                    .put("pd2403", pd2403)

                    .put("pd2404", pd2404)

                    .put("pd2405", pd2405)

                    .put("pd2406", pd2406)

                    .put("pd2496", pd2496)

                    .put("pd2496x", pd2496x)
                    .put("pd2498", pd2498)
                    .put("pddate", pddate);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public String s06BFtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("bf01", bf01)
                    .put("bf02", bf02)
                    .put("bf03", bf03)
                    .put("bf3y", bf3y)
                    .put("bf03m", bf03m)
                    .put("bf3d", bf3d)
                    .put("bf03a01", bf03a01)
                    .put("bf03a02", bf03a02)
                    .put("bf04", bf04)
                    .put("bf05", bf05)
                    .put("bf0502x", bf0502x)
                    .put("bf0503x", bf0503x)
                    .put("bf06", bf06)
                    .put("bf07", bf07)
                    .put("bf0796x", bf0796x)
                    .put("bf08", bf08)
                    .put("bf0901", bf0901)
                    .put("bf0902", bf0902)
                    .put("bf0903", bf0903)
                    .put("bf0904", bf0904)
                    .put("bf0905", bf0905)
                    .put("bf0906", bf0906)
                    .put("bf0907", bf0907)
                    .put("bf0908", bf0908)
                    .put("bf0909", bf0909)
                    .put("bf0910", bf0910)
                    .put("bf0999", bf0999)
                    .put("bf0996", bf0996)
                    .put("bf0996x", bf0996x)
                    .put("bf10", bf10)
                    .put("bf11", bf11)
                    .put("bf12", bf12)
                    .put("bf13", bf13)
                    .put("bf14a", bf14a)
                    .put("bf14b", bf14b)
                    .put("bf14b01x", bf14b01x)
                    .put("bf14c", bf14c)
                    .put("bf14c01x", bf14c01x)
                    .put("bf14d", bf14d)
                    .put("bf14e", bf14e)
                    .put("bf14e01x", bf14e01x)
                    .put("bf14f", bf14f)
                    .put("bf14f01x", bf14f01x)
                    .put("bf14g", bf14g)
                    .put("bf14h", bf14h)
                    .put("bf14i", bf14i)
                    .put("bf15a", bf15a)
                    .put("bf15b", bf15b)
                    .put("bf15c", bf15c)
                    .put("bf15d", bf15d)
                    .put("bf15e", bf15e)
                    .put("bf15f", bf15f)
                    .put("bf15g", bf15g)
                    .put("bf15h", bf15h)
                    .put("bf15i", bf15i)
                    .put("bf15j", bf15j)
                    .put("bf15k", bf15k)
                    .put("bf15l", bf15l)
                    .put("bf15m", bf15m)
                    .put("bf15n", bf15n)
                    .put("bf15o", bf15o)
                    //    .put("bf15p", bf15p)
                    .put("bf15q", bf15q)
                    .put("bf16", bf16)
                    .put("bf17", bf17)
                    .put("bf1701x", bf1701x)
                    .put("bf18", bf18)
                    .put("bf19", bf19)
                    .put("bf1996x", bf1996x)
                    .put("bf20", bf20)
                    .put("bfdate", bfdate);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public String s07CVtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("cv01", cv01)
                    .put("cv02", cv02)
                    .put("cv03", cv03)
                    .put("cv04", cv04)
                    .put("cv0501", cv0501)
                    .put("cv0502", cv0502)
                    .put("cv0503", cv0503)
                    .put("cv0504", cv0504)
                    .put("cv0505", cv0505)
                    .put("cv0506", cv0506)
                    .put("cv0507", cv0507)
                    .put("cv0596", cv0596)
                    .put("cv0596x", cv0596x)
                    .put("cv0601", cv0601)
                    .put("cv0602", cv0602)
                    .put("cv0603", cv0603)
                    .put("cv0604", cv0604)
                    .put("cv0605", cv0605)
                    .put("cv0606", cv0606)
                    .put("cv0607", cv0607)
                    .put("cv0608", cv0608)
                    .put("cv0609", cv0609)
                    .put("cv0610", cv0610)
                    .put("cv0611", cv0611)
                    .put("cv0696", cv0696)
                    .put("cv0696x", cv0696x)
                    .put("cv07", cv07)
                    .put("cv0801", cv0801)
                    .put("cv0802", cv0802)
                    .put("cv0803", cv0803)
                    .put("cv0804", cv0804)
                    .put("cv0805", cv0805)
                    .put("cv0806", cv0806)
                    .put("cv0807", cv0807)
                    .put("cv0898", cv0898)
                    .put("cv0896", cv0896)
                    .put("cv0896x", cv0896x)
                    .put("cv0901", cv0901)
                    .put("cv0902", cv0902)
                    .put("cv0903", cv0903)
                    .put("cv0904", cv0904)
                    .put("cv0905", cv0905)
                    .put("cv0906", cv0906)
                    .put("cv0907", cv0907)
                    .put("cv0998", cv0998)
                    .put("cv0996", cv0996)
                    .put("cv0996x", cv0996x)
                    .put("cv1001", cv1001)
                    .put("cv1002", cv1002)
                    .put("cv1003", cv1003)
                    .put("cv1004", cv1004)
                    .put("cv1005", cv1005)
                    .put("cv1006", cv1006)
                    .put("cv1007", cv1007)
                    .put("cv1008", cv1008)
                    .put("cv1098", cv1098)
                    .put("cv1096", cv1096)
                    .put("cv1096x", cv1096x)
                    .put("cv11", cv11)
                    .put("cv12", cv12)
                    .put("cv1296x", cv1296x)
                    .put("cv13", cv13)
                    .put("cv14", cv14)
                    .put("cv15", cv15)
                    .put("cv16", cv16)
                    .put("cv1696x", cv1696x)
                    .put("cv17", cv17)
                    .put("cv18", cv18)
                    .put("cv1896x", cv1896x)
                    .put("cv19", cv19)
                    .put("cv1996x", cv1996x)
                    .put("cvdate", cvdate);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public String s08SEtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("se01", se01)
                    .put("se0196x", se0196x)
                    .put("se02", se02)
                    .put("se0296x", se0296x)
                    .put("se03", se03)
                    .put("se0396x", se0396x)
                    .put("se04", se04)
                    .put("se0496x", se0496x)
                    .put("se05", se05)
                    .put("se0596x", se0596x)
                    .put("se06a", se06a)
                    .put("se07a", se07a)
                    .put("se08", se08)
                    .put("se0896x", se0896x)
                    .put("se09", se09)
                    .put("se10", se10)
                    .put("se1099x", se1099x)
                    .put("se11", se11)
                    .put("se1196x", se1196x)
                    .put("se12", se12)
                    .put("se1296x", se1296x)
                    .put("se13", se13)
                    .put("se14", se14)
                    .put("se15", se15)
                    .put("se16", se16)
                    .put("se17", se17)
                    .put("se1701", se1701)
                    .put("se1702", se1702)
                    .put("se1703", se1703)
                    .put("se1704", se1704)
                    .put("se1705", se1705)
                    .put("se1801", se1801)
                    .put("se1802", se1802)
                    .put("se1803", se1803)
                    .put("se1804", se1804)
                    .put("se1805", se1805)
                    .put("se1896", se1896)
                    .put("se189601x", se189601x)
                    .put("se19", se19)
                    .put("se1996x", se1996x)
                    .put("se2001", se2001)
                    .put("se2002", se2002)
                    .put("se2003", se2003)
                    .put("se2004", se2004)
                    .put("se2005", se2005)
                    .put("se2006", se2006)
                    .put("se2096", se2096)
                    .put("se2096x", se2096x)
                    .put("se2101", se2101)
                    .put("se2102", se2102)
                    .put("se2103", se2103)
                    .put("se2104", se2104)
                    .put("se2105", se2105)
                    .put("se2196", se2196)
                    .put("se2196x", se2196x)
                    .put("se2201", se2201)
                    .put("se2202", se2202)
                    .put("se2203", se2203)
                    .put("se2204", se2204)
                    .put("se2205", se2205)
                    .put("se2206", se2206)
                    .put("se2207", se2207)
                    .put("se2208", se2208)
                    .put("se2209", se2209)
                    .put("se2210", se2210)
                    .put("se2211", se2211)
                    .put("se2212", se2212)
                    .put("se2213", se2213)
                    .put("se2214", se2214)
                    .put("se2215", se2215)
                    .put("se2216", se2216)
                    .put("se2217", se2217)
                    .put("se2218", se2218)
                    .put("se23", se23)
                    .put("se24", se24)
                    .put("se25", se25)
                    .put("se26", se26)
                    .put("se27", se27)
                    .put("se2701", se2701)
                    .put("se2702", se2702)
                    .put("se2703", se2703)
                    .put("se2704", se2704)
                    .put("se28", se28)
                    .put("se2801", se2801)
                    .put("se2802", se2802)
                    .put("se2803", se2803)
                    .put("se29", se29)
                    .put("se30", se30)
                    .put("se3001", se3001)
                    .put("se3002", se3002)
                    .put("se3003", se3003)
                    .put("se3096", se3096)
                    .put("se3096x", se3096x)
                    .put("se31", se31)
                    .put("se3196x", se3196x)
                    .put("se32", se32)
                    .put("se3302", se3302)
                    .put("se3301", se3301)
                    .put("se3401", se3401)
                    .put("se3402", se3402)
                    .put("se35", se35)
                    .put("se36", se36)
                    .put("se37", se37)
                    .put("se3701", se3701)
                    .put("se3702", se3702)
                    .put("se3703", se3703)
                    .put("se3704", se3704)
                    .put("se3705", se3705)
                    .put("se3706", se3706)
                    .put("se3707", se3707)
                    .put("se3708", se3708)
                    .put("se3709", se3709)
                    .put("se3710", se3710)
                    .put("se3796", se3796)
                    .put("se3796x", se3796x)
                    .put("se38", se38)
                    .put("se39", se39)
                    .put("se40", se40)
                    .put("sedate", sedate);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FormsContract.FormsTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(FormsContract.FormsTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(FormsContract.FormsTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(FormsContract.FormsTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(FormsContract.FormsTable.COLUMN_DCODE, this.dcode == null ? JSONObject.NULL : this.dcode);
            json.put(FormsContract.FormsTable.COLUMN_UCODE, this.ucode == null ? JSONObject.NULL : this.ucode);
            json.put(FormsContract.FormsTable.COLUMN_CLUSTER, this.cluster == null ? JSONObject.NULL : this.cluster);
            json.put(FormsContract.FormsTable.COLUMN_HHNO, this.hhno == null ? JSONObject.NULL : this.hhno);
            json.put(FormsContract.FormsTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(FormsContract.FormsTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);
            json.put(FormsContract.FormsTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(FormsContract.FormsTable.COLUMN_ENDINGDATETIME, this.endTime == null ? JSONObject.NULL : this.endTime);
            json.put(FormsContract.FormsTable.COLUMN_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
            json.put(FormsContract.FormsTable.COLUMN_ISTATUS96x, this.iStatus96x == null ? JSONObject.NULL : this.iStatus96x);
            json.put(FormsContract.FormsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(FormsContract.FormsTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);
            json.put(FormsContract.FormsTable.COLUMN_G5FLAG, this.g5Flag == null ? JSONObject.NULL : this.g5Flag);
            json.put(FormsContract.FormsTable.COLUMN_HHFLAG, this.hhflag == null ? JSONObject.NULL : this.hhflag);

            json.put(FormsContract.FormsTable.COLUMN_S01HH, new JSONObject(s01HHtoString()));
            json.put(FormsContract.FormsTable.COLUMN_S05PD, new JSONObject(s05PDtoString()));
            json.put(FormsContract.FormsTable.COLUMN_S06BF, new JSONObject(s06BFtoString()));
            json.put(FormsContract.FormsTable.COLUMN_S07CV, new JSONObject(s07CVtoString()));
            json.put(FormsContract.FormsTable.COLUMN_S08SE, new JSONObject(s08SEtoString()));


            if (this.s01HH != null && !this.s01HH.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S01HH, new JSONObject(this.s01HH));
            }

            if (this.s05PD != null && !this.s05PD.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S05PD, new JSONObject(this.s05PD));
            }

            if (this.s06BF != null && !this.s06BF.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S06BF, new JSONObject(this.s06BF));
            }

            if (this.s07CV != null && !this.s07CV.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S07CV, new JSONObject(this.s07CV));
            }

            if (this.s08SE != null && !this.s08SE.equals("")) {
                json.put(FormsContract.FormsTable.COLUMN_S08SE, new JSONObject(this.s08SE));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void s01HHHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);
                this.hh01 = json.getString("hh01");
                this.hh0201 = json.getString("hh0201");
                this.hh0202 = json.getString("hh0202");
                this.hh03 = json.getString("hh03");
                this.hh04 = json.getString("hh04");
                this.hh05 = json.getString("hh05");
                this.hh06 = json.getString("hh06");
                this.hh07 = json.getString("hh07");
                this.hh08 = json.getString("hh08");
                this.hh09 = json.getString("hh09");
                this.hh10 = json.getString("hh10");
                this.hh11 = json.getString("hh11");
                this.hh12 = json.getString("hh12");
                this.hh13 = json.getString("hh13");
                this.hh14 = json.getString("hh14");
                this.hh15 = json.getString("hh15");
                this.hh16 = json.getString("hh16");
                this.hh17 = json.getString("hh17");
                this.hh1796x = json.getString("hh1796x");
                this.hh18 = json.getString("hh18");
                this.hh19 = json.getString("hh19");
                this.hh20 = json.getString("hh20");
                this.hh2096x = json.getString("hh2096x");
                this.hh21 = json.getString("hh21");
                this.hh22 = json.getString("hh22");
                this.hh23 = json.getString("hh23");
                this.hh24 = json.getString("hh24");
                this.hh25 = json.getString("hh25");
                this.hh25a = json.getString("hh25a");
                this.hh26 = json.getString("hh26");
                this.hh2696x = json.getString("hh2696x");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public void s05PDHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.pd01 = json.getString("pd01");
                this.pd02 = json.getString("pd02");
                this.pd03 = json.getString("pd03");
                this.pd04 = json.getString("pd04");
                this.pd05 = json.getString("pd05");
                this.pd0596x = json.getString("pd0596x");
                this.pd06 = json.getString("pd06");
                this.pd06961x = json.getString("pd06961x");
                this.pd06962x = json.getString("pd06962x");
                this.pd07 = json.getString("pd07");
                this.pd0701x = json.getString("pd0701x");
                this.pd08 = json.getString("pd08");
                this.pd08a01 = json.getString("pd08a01");
                this.pd08a02 = json.getString("pd08a02");
                this.pd08a03 = json.getString("pd08a03");
                this.pd08a04 = json.getString("pd08a04");
                this.pd08a05 = json.getString("pd08a05");
                this.pd08a06 = json.getString("pd08a06");
                this.pd08a07 = json.getString("pd08a07");
                this.pd08a08 = json.getString("pd08a08");
                this.pd08a09 = json.getString("pd08a09");
                this.pd08a96 = json.getString("pd08a96");
                this.pd08a96x = json.getString("pd08a96x");
                this.pd08b = json.getString("pd08b");
                this.pd08c = json.getString("pd08c");
                this.pd09 = json.getString("pd09");
                this.pd10 = json.getString("pd10");
                this.pd1101 = json.getString("pd1101");
                this.pd1102 = json.getString("pd1102");
                this.pd12 = json.getString("pd12");
                this.pd1296x = json.getString("pd1296x");
                this.pd13 = json.getString("pd13");
                this.pd13961x = json.getString("pd13961x");
                this.pd13962x = json.getString("pd13962x");
                this.pd14 = json.getString("pd14");
                this.pd1496x = json.getString("pd1496x");
                this.pd15 = json.getString("pd15");
                this.pd16 = json.getString("pd16");
                this.pd1601 = json.getString("pd1601");
                this.pd1602 = json.getString("pd1602");
                this.pd1603 = json.getString("pd1603");
                this.pd1604 = json.getString("pd1604");
                this.pd1605 = json.getString("pd1605");
                this.pd1606 = json.getString("pd1606");
                this.pd1607 = json.getString("pd1607");
                this.pd1696 = json.getString("pd1696");
                this.pd1696x = json.getString("pd1696x");
                this.pd17 = json.getString("pd17");
                this.pd1701x = json.getString("pd1701x");
                this.pd1702x = json.getString("pd1702x");
                this.pd1703x = json.getString("pd1703x");
                this.pd18 = json.getString("pd18");
                this.pd19 = json.getString("pd19");
                this.pd20 = json.getString("pd20");
                this.pd2001 = json.getString("pd2001");
                this.pd2002 = json.getString("pd2002");
                this.pd2003 = json.getString("pd2003");
                this.pd2004 = json.getString("pd2004");
                this.pd2005 = json.getString("pd2005");
                this.pd2006 = json.getString("pd2006");
                this.pd2007 = json.getString("pd2007");
                this.pd2096 = json.getString("pd2096");
                this.pd2096x = json.getString("pd2096x");
                this.pd21 = json.getString("pd21");
                this.pd2101x = json.getString("pd2101x");
                this.pd2102x = json.getString("pd2102x");
                this.pd2103x = json.getString("pd2103x");
                this.pd22 = json.getString("pd22");
                this.pd23 = json.getString("pd23");
                this.pd2401 = json.getString("pd2401");
                this.pd2402 = json.getString("pd2402");
                this.pd2403 = json.getString("pd2403");
                this.pd2404 = json.getString("pd2404");
                this.pd2405 = json.getString("pd2405");
                this.pd2406 = json.getString("pd2406");
                this.pd2496 = json.getString("pd2496");
                this.pd2496x = json.getString("pd2496x");
                this.pd2498 = json.getString("pd2498");

                this.pddate = json.getString("pddate");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public void s06BFHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.bf01 = json.getString("bf01");
                this.bf02 = json.getString("bf02");
                this.bf03 = json.getString("bf03");
                this.bf3y = json.getString("bf3y");
                this.bf03m = json.getString("bf03m");
                this.bf3d = json.getString("bf3d");
                this.bf03a01 = json.getString("bf03a01");
                this.bf03a02 = json.getString("bf03a02");
                this.bf04 = json.getString("bf04");
                this.bf05 = json.getString("bf05");
                this.bf0502x = json.getString("bf0502x");
                this.bf0503x = json.getString("bf0503x");
                this.bf06 = json.getString("bf06");
                this.bf07 = json.getString("bf07");
                this.bf0796x = json.getString("bf0796x");
                this.bf08 = json.getString("bf08");
                this.bf0901 = json.getString("bf0901");
                this.bf0902 = json.getString("bf0902");
                this.bf0903 = json.getString("bf0903");
                this.bf0904 = json.getString("bf0904");
                this.bf0905 = json.getString("bf0905");
                this.bf0906 = json.getString("bf0906");
                this.bf0907 = json.getString("bf0907");
                this.bf0908 = json.getString("bf0908");
                this.bf0909 = json.getString("bf0909");
                this.bf0910 = json.getString("bf0910");
                this.bf0999 = json.getString("bf0999");
                this.bf0996 = json.getString("bf0996");
                this.bf0996x = json.getString("bf0996x");
                this.bf10 = json.getString("bf10");
                this.bf11 = json.getString("bf11");
                this.bf12 = json.getString("bf12");
                this.bf13 = json.getString("bf13");
                this.bf14a = json.getString("bf14a");
                this.bf14b = json.getString("bf14b");
                this.bf14b01x = json.getString("bf14b01x");
                this.bf14c = json.getString("bf14c");
                this.bf14c01x = json.getString("bf14c01x");
                this.bf14d = json.getString("bf14d");
                this.bf14e = json.getString("bf14e");
                this.bf14e01x = json.getString("bf14e01x");
                this.bf14f = json.getString("bf14f");
                this.bf14f01x = json.getString("bf14f01x");
                this.bf14g = json.getString("bf14g");
                this.bf14h = json.getString("bf14h");
                this.bf14i = json.getString("bf14i");
                this.bf15a = json.getString("bf15a");
                this.bf15b = json.getString("bf15b");
                this.bf15c = json.getString("bf15c");
                this.bf15d = json.getString("bf15d");
                this.bf15e = json.getString("bf15e");
                this.bf15f = json.getString("bf15f");
                this.bf15g = json.getString("bf15g");
                this.bf15h = json.getString("bf15h");
                this.bf15i = json.getString("bf15i");
                this.bf15j = json.getString("bf15j");
                this.bf15k = json.getString("bf15k");
                this.bf15l = json.getString("bf15l");
                this.bf15m = json.getString("bf15m");
                this.bf15n = json.getString("bf15n");
                this.bf15o = json.getString("bf15o");
                //      this.bf15p = json.getString("bf15p");
                this.bf15q = json.getString("bf15q");
                this.bf16 = json.getString("bf16");
                this.bf17 = json.getString("bf17");
                this.bf1701x = json.getString("bf1701x");
                this.bf18 = json.getString("bf18");
                this.bf19 = json.getString("bf19");
                this.bf1996x = json.getString("bf1996x");
                this.bf20 = json.getString("bf20");
                this.bfdate = json.getString("bfdate");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public void s07CVHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.cv01 = json.getString("cv01");
                this.cv02 = json.getString("cv02");
                this.cv03 = json.getString("cv03");
                this.cv04 = json.getString("cv04");
                this.cv0501 = json.getString("cv0501");
                this.cv0502 = json.getString("cv0502");
                this.cv0503 = json.getString("cv0503");
                this.cv0504 = json.getString("cv0504");
                this.cv0505 = json.getString("cv0505");
                this.cv0506 = json.getString("cv0506");
                this.cv0507 = json.getString("cv0507");
                this.cv0596 = json.getString("cv0596");
                this.cv0596x = json.getString("cv0596x");
                this.cv0601 = json.getString("cv0601");
                this.cv0602 = json.getString("cv0602");
                this.cv0603 = json.getString("cv0603");
                this.cv0604 = json.getString("cv0604");
                this.cv0605 = json.getString("cv0605");
                this.cv0606 = json.getString("cv0606");
                this.cv0607 = json.getString("cv0607");
                this.cv0608 = json.getString("cv0608");
                this.cv0609 = json.getString("cv0609");
                this.cv0610 = json.getString("cv0610");
                this.cv0611 = json.getString("cv0611");
                this.cv0696 = json.getString("cv0696");
                this.cv0696x = json.getString("cv0696x");
                this.cv07 = json.getString("cv07");
                this.cv0801 = json.getString("cv0801");
                this.cv0802 = json.getString("cv0802");
                this.cv0803 = json.getString("cv0803");
                this.cv0804 = json.getString("cv0804");
                this.cv0805 = json.getString("cv0805");
                this.cv0806 = json.getString("cv0806");
                this.cv0807 = json.getString("cv0807");
                this.cv0898 = json.getString("cv0898");
                this.cv0896 = json.getString("cv0896");
                this.cv0896x = json.getString("cv0896x");
                this.cv0901 = json.getString("cv0901");
                this.cv0902 = json.getString("cv0902");
                this.cv0903 = json.getString("cv0903");
                this.cv0904 = json.getString("cv0904");
                this.cv0905 = json.getString("cv0905");
                this.cv0906 = json.getString("cv0906");
                this.cv0907 = json.getString("cv0907");
                this.cv0998 = json.getString("cv0998");
                this.cv0996 = json.getString("cv0996");
                this.cv0996x = json.getString("cv0996x");
                this.cv1001 = json.getString("cv1001");
                this.cv1002 = json.getString("cv1002");
                this.cv1003 = json.getString("cv1003");
                this.cv1004 = json.getString("cv1004");
                this.cv1005 = json.getString("cv1005");
                this.cv1006 = json.getString("cv1006");
                this.cv1007 = json.getString("cv1007");
                this.cv1008 = json.getString("cv1008");
                this.cv1098 = json.getString("cv1098");
                this.cv1096 = json.getString("cv1096");
                this.cv1096x = json.getString("cv1096x");
                this.cv11 = json.getString("cv11");
                this.cv12 = json.getString("cv12");
                this.cv1296x = json.getString("cv1296x");
                this.cv13 = json.getString("cv13");
                this.cv14 = json.getString("cv14");
                this.cv15 = json.getString("cv15");
                this.cv16 = json.getString("cv16");
                this.cv1696x = json.getString("cv1696x");
                this.cv17 = json.getString("cv17");
                this.cv18 = json.getString("cv18");
                this.cv1896x = json.getString("cv1896x");
                this.cv19 = json.getString("cv19");
                this.cv1996x = json.getString("cv1996x");
                this.cvdate = json.getString("cvdate");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    public void s08SEHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.se01 = json.getString("se01");
                this.se0196x = json.getString("se0196x");
                this.se02 = json.getString("se02");
                this.se0296x = json.getString("se0296x");
                this.se03 = json.getString("se03");
                this.se0396x = json.getString("se0396x");
                this.se04 = json.getString("se04");
                this.se0496x = json.getString("se0496x");
                this.se05 = json.getString("se05");
                this.se0596x = json.getString("se0596x");
                this.se06a = json.getString("se06a");
                this.se07a = json.getString("se07a");
                this.se08 = json.getString("se08");
                this.se0896x = json.getString("se0896x");
                this.se09 = json.getString("se09");
                this.se10 = json.getString("se10");
                this.se1099x = json.getString("se1099x");
                this.se11 = json.getString("se11");
                this.se1196x = json.getString("se1196x");
                this.se12 = json.getString("se12");
                this.se1296x = json.getString("se1296x");
                this.se13 = json.getString("se13");
                this.se14 = json.getString("se14");
                this.se15 = json.getString("se15");
                this.se16 = json.getString("se16");
                this.se17 = json.getString("se17");
                this.se1701 = json.getString("se1701");
                this.se1702 = json.getString("se1702");
                this.se1703 = json.getString("se1703");
                this.se1704 = json.getString("se1704");
                this.se1705 = json.getString("se1705");
                this.se1801 = json.getString("se1801");
                this.se1802 = json.getString("se1802");
                this.se1803 = json.getString("se1803");
                this.se1804 = json.getString("se1804");
                this.se1805 = json.getString("se1805");
                this.se1896 = json.getString("se1896");
                this.se189601x = json.getString("se189601x");
                this.se19 = json.getString("se19");
                this.se1996x = json.getString("se1996x");
                //      this.se20 = json.getString("se20");
                this.se2001 = json.getString("se2001");
                this.se2002 = json.getString("se2002");
                this.se2003 = json.getString("se2003");
                this.se2004 = json.getString("se2004");
                this.se2005 = json.getString("se2005");
                this.se2006 = json.getString("se2006");
                this.se2096 = json.getString("se2096");
                this.se2096x = json.getString("se2096x");
//                this.se21 = json.getString("se21");
                this.se2101 = json.getString("se2101");
                this.se2102 = json.getString("se2102");
                this.se2103 = json.getString("se2103");
                this.se2104 = json.getString("se2104");
                this.se2105 = json.getString("se2105");
                this.se2196 = json.getString("se2196");
                this.se2196x = json.getString("se2196x");
                this.se2201 = json.getString("se2201");
                this.se2202 = json.getString("se2202");
                this.se2203 = json.getString("se2203");
                this.se2204 = json.getString("se2204");
                this.se2205 = json.getString("se2205");
                this.se2206 = json.getString("se2206");
                this.se2207 = json.getString("se2207");
                this.se2208 = json.getString("se2208");
                this.se2209 = json.getString("se2209");
                this.se2210 = json.getString("se2210");
                this.se2211 = json.getString("se2211");
                this.se2212 = json.getString("se2212");
                this.se2213 = json.getString("se2213");
                this.se2214 = json.getString("se2214");
                this.se2215 = json.getString("se2215");
                this.se2216 = json.getString("se2216");
                this.se2217 = json.getString("se2217");
                this.se2218 = json.getString("se2218");
                this.se23 = json.getString("se23");
                this.se24 = json.getString("se24");
                this.se25 = json.getString("se25");
                this.se26 = json.getString("se26");
                this.se27 = json.getString("se27");
                this.se2701 = json.getString("se2701");
                this.se2702 = json.getString("se2702");
                this.se2703 = json.getString("se2703");
                this.se2704 = json.getString("se2704");
                this.se28 = json.getString("se28");
                this.se2801 = json.getString("se2801");
                this.se2802 = json.getString("se2802");
                this.se2803 = json.getString("se2803");
                this.se29 = json.getString("se29");
                this.se30 = json.getString("se30");
                this.se3001 = json.getString("se3001");
                this.se3002 = json.getString("se3002");
                this.se3003 = json.getString("se3003");
                this.se3096 = json.getString("se3096");
                this.se3096x = json.getString("se3096x");
                this.se31 = json.getString("se31");
                this.se3196x = json.getString("se3196x");
                this.se32 = json.getString("se32");
                this.se3302 = json.getString("se3302");
                this.se3301 = json.getString("se3301");
                this.se3401 = json.getString("se3401");
                this.se3402 = json.getString("se3402");
                this.se35 = json.getString("se35");
                this.se36 = json.getString("se36");
                this.se37 = json.getString("se37");
                this.se3701 = json.getString("se3701");
                this.se3702 = json.getString("se3702");
                this.se3703 = json.getString("se3703");
                this.se3704 = json.getString("se3704");
                this.se3705 = json.getString("se3705");
                this.se3706 = json.getString("se3706");
                this.se3707 = json.getString("se3707");
                this.se3708 = json.getString("se3708");
                this.se3709 = json.getString("se3709");
                this.se3710 = json.getString("se3710");
                this.se3796 = json.getString("se3796");
                this.se3796x = json.getString("se3796x");
                this.se38 = json.getString("se38");
                this.se39 = json.getString("se39");
                this.se40 = json.getString("se40");
                this.sedate = json.getString("sedate");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
