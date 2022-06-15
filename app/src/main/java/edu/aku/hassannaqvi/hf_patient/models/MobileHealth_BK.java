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


public class MobileHealth_BK extends BaseObservable {

    //Section MobileHealth
    private String mh01 = StringUtils.EMPTY;
    private String mh02 = StringUtils.EMPTY;
    private String mh03 = StringUtils.EMPTY;
    private String mh04 = StringUtils.EMPTY;
    private String mh05 = StringUtils.EMPTY;
    private String mh06 = StringUtils.EMPTY;
    private String mh06a = StringUtils.EMPTY;
    private String mh07 = StringUtils.EMPTY;
    private String mh08 = StringUtils.EMPTY;
    private String mh08a = StringUtils.EMPTY;
    private String mh09y = StringUtils.EMPTY;
    private String mh09m = StringUtils.EMPTY;
    private String mh09d = StringUtils.EMPTY;
    private String patientType = StringUtils.EMPTY;
    private String mh010 = StringUtils.EMPTY;
    private String mh010a = StringUtils.EMPTY;
    private String mh010b = StringUtils.EMPTY;
    private String mh010b04x = StringUtils.EMPTY;
    private String mh01101 = StringUtils.EMPTY;
    private String mh01102 = StringUtils.EMPTY;
    private String mh01103 = StringUtils.EMPTY;
    private String mh012 = StringUtils.EMPTY;
    private String chkWeight = StringUtils.EMPTY;
    private String mh013 = StringUtils.EMPTY;
    private String mh014 = StringUtils.EMPTY;
    private String mh015 = StringUtils.EMPTY;
    private String chkHeight = StringUtils.EMPTY;
    private String mh016 = StringUtils.EMPTY;
    private String chkMUAC = StringUtils.EMPTY;
    private String mh01701 = StringUtils.EMPTY;
    private String mh01702 = StringUtils.EMPTY;
    private String mh01703 = StringUtils.EMPTY;
    private String mh01704 = StringUtils.EMPTY;
    private String mh017077 = StringUtils.EMPTY;
    private String mh017077x = StringUtils.EMPTY;
    private String mh017097 = StringUtils.EMPTY;
    private String mh01801 = StringUtils.EMPTY;
    private String mh01802 = StringUtils.EMPTY;
    private String mh01803 = StringUtils.EMPTY;
    private String mh01804 = StringUtils.EMPTY;
    private String mh01805 = StringUtils.EMPTY;
    private String mh01806 = StringUtils.EMPTY;
    private String mh01807 = StringUtils.EMPTY;
    private String mh01808 = StringUtils.EMPTY;
    private String mh01809 = StringUtils.EMPTY;
    private String mh018010 = StringUtils.EMPTY;
    private String mh018011 = StringUtils.EMPTY;
    private String mh018012 = StringUtils.EMPTY;
    private String mh018013 = StringUtils.EMPTY;
    private String mh018014 = StringUtils.EMPTY;
    private String mh018015 = StringUtils.EMPTY;
    private String mh018016 = StringUtils.EMPTY;
    private String mh018077 = StringUtils.EMPTY;
    private String mh018077x = StringUtils.EMPTY;
    private String mh018097 = StringUtils.EMPTY;
    private String mh01901 = StringUtils.EMPTY;
    private String mh01902 = StringUtils.EMPTY;
    private String mh01903 = StringUtils.EMPTY;
    private String mh01904 = StringUtils.EMPTY;
    private String mh01905 = StringUtils.EMPTY;
    private String mh01906 = StringUtils.EMPTY;
    private String mh01907 = StringUtils.EMPTY;
    private String mh01908 = StringUtils.EMPTY;
    private String mh01909 = StringUtils.EMPTY;
    private String mh019010 = StringUtils.EMPTY;
    private String mh019011 = StringUtils.EMPTY;
    private String mh019012 = StringUtils.EMPTY;
    private String mh019013 = StringUtils.EMPTY;
    private String mh019014 = StringUtils.EMPTY;
    private String mh019015 = StringUtils.EMPTY;
    private String mh019077 = StringUtils.EMPTY;
    private String mh019077x = StringUtils.EMPTY;
    private String mh019097 = StringUtils.EMPTY;
    private String mh020 = StringUtils.EMPTY;
    private String mh021 = StringUtils.EMPTY;
    private String mh022 = StringUtils.EMPTY;
    private String mh023 = StringUtils.EMPTY;
    private String mh024 = StringUtils.EMPTY;
    private String mh025 = StringUtils.EMPTY;
    private String mh027b = StringUtils.EMPTY;
    private String mh02601 = StringUtils.EMPTY;
    private String mh02602 = StringUtils.EMPTY;
    private String mh02603 = StringUtils.EMPTY;
    private String mh02604 = StringUtils.EMPTY;
    private String mh02605 = StringUtils.EMPTY;
    private String mh02606 = StringUtils.EMPTY;
    private String mh02608 = StringUtils.EMPTY;
    private String mh02609 = StringUtils.EMPTY;
    private String mh026010 = StringUtils.EMPTY;
    private String mh026011 = StringUtils.EMPTY;
    private String mh026014 = StringUtils.EMPTY;
    private String mh026015 = StringUtils.EMPTY;
    private String mh026016 = StringUtils.EMPTY;
    private String mh026017 = StringUtils.EMPTY;
    private String mh026018 = StringUtils.EMPTY;
    private String mh026019 = StringUtils.EMPTY;
    private String mh026020 = StringUtils.EMPTY;
    private String mh026021 = StringUtils.EMPTY;
    private String mh026022 = StringUtils.EMPTY;
    private String mh027a = StringUtils.EMPTY;
    private String mh027 = StringUtils.EMPTY;
    private String mh028 = StringUtils.EMPTY;//mh028
    private String mh029 = StringUtils.EMPTY;//mh029
    private String mh030 = StringUtils.EMPTY;//mh030

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


    public MobileHealth_BK() {

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

    public MobileHealth_BK setUid(String uid) {
        this.uid = uid;
        return this;
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public MobileHealth_BK setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public MobileHealth_BK setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public MobileHealth_BK setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public MobileHealth_BK setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public MobileHealth_BK setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }


    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public MobileHealth_BK setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    @Bindable
    public String getSynced() {
        return synced;
    }

    public MobileHealth_BK setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public MobileHealth_BK setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    public String getSerial() {
        return serial;
    }

    public MobileHealth_BK setSerial(String serial) {
        this.serial = serial;
        return this;
    }


    public String getsA() {
        return sA;
    }

    public MobileHealth_BK setsA(String sA) {
        this.sA = sA;
        return this;
    }


    @Bindable
    public String getMh01() {
        return mh01;
    }

    public void setMh01(String mh01) {
        this.mh01 = mh01;
        notifyPropertyChanged(BR.mh01);
    }


    @Bindable
    public String getMh02() {
        return mh02;
    }

    public void setMh02(String mh02) {
        this.mh02 = mh02;
        notifyPropertyChanged(BR.mh02);
    }


    @Bindable
    public String getMh03() {
        return mh03;
    }

    public void setMh03(String mh03) {
        this.mh03 = mh03;
        notifyPropertyChanged(BR.mh03);
    }


    @Bindable
    public String getMh04() {
        return mh04;
    }

    public void setMh04(String mh04) {
        this.mh04 = mh04;
        notifyPropertyChanged(BR.mh04);
    }


    @Bindable
    public String getMh05() {
        return mh05;
    }

    public void setMh05(String mh05) {
        this.mh05 = mh05;
        notifyPropertyChanged(BR.mh05);
    }


    @Bindable
    public String getMh06() {
        return mh06;
    }

    public void setMh06(String mh06) {
        this.mh06 = mh06;
        notifyPropertyChanged(BR.mh06);
    }


    @Bindable
    public String getMh06a() {
        return mh06a;
    }

    public void setMh06a(String mh06a) {
        this.mh06a = mh06a;
        notifyPropertyChanged(BR.mh06a);
    }


    @Bindable
    public String getMh07() {
        return mh07;
    }

    public void setMh07(String mh07) {
        this.mh07 = mh07;
        notifyPropertyChanged(BR.mh07);
    }


    @Bindable
    public String getMh08() {
        Log.d("TAG", "Mh08: " + this.mh08);
        return mh08;
    }

    public void setMh08(String mh08) {
        this.mh08 = mh08;
        Log.d("TAG", "Mh08: " + this.mh08);

        notifyPropertyChanged(BR.mh08);
    }

    @Bindable
    public String getMh08a() {
        Log.d("TAG", "mh08a: " + this.mh08a);
        return mh08a;
    }

    public void setMh08a(String mh08a) {
        this.mh08a = mh08a;
        Log.d("TAG", "mh08a: " + this.mh08a);

        notifyPropertyChanged(BR.mh08a);
    }


    @Bindable
    public String getMh09y() {
        Log.d("TAG", "Mh09y: " + this.mh09y);
        return mh09y;
    }

    public void setMh09y(String mh09y) {
        this.mh09y = mh09y;
        Log.d("TAG", "Mh09y: " + this.mh09y);
        notifyPropertyChanged(BR.mh09y);
    }


    @Bindable
    public String getMh09m() {
        return mh09m;
    }

    public void setMh09m(String mh09m) {
        this.mh09m = mh09m;

        notifyPropertyChanged(BR.mh09m);
    }


    @Bindable
    public String getMh09d() {
        return mh09d;
    }

    public void setMh09d(String mh09d) {
        this.mh09d = mh09d;
        notifyPropertyChanged(BR.mh09d);
    }


    @Bindable
    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
        notifyPropertyChanged(BR.patientType);
    }


    @Bindable
    public String getMh010() {
        return mh010;
    }

    public void setMh010(String mh010) {
        this.mh010 = mh010;
        notifyPropertyChanged(BR.mh010);
    }


    @Bindable
    public String getMh010a() {
        return mh010a;
    }

    public void setMh010a(String mh010a) {
        this.mh010a = mh010a;
        notifyPropertyChanged(BR.mh010a);
    }


    @Bindable
    public String getMh010b() {
        return mh010b;
    }

    public void setMh010b(String mh010b) {
        this.mh010b = mh010b;
        notifyPropertyChanged(BR.mh010b);
    }


    @Bindable
    public String getMh010b04x() {
        return mh010b04x;
    }

    public void setMh010b04x(String mh010b04x) {
        this.mh010b04x = mh010b04x;
        notifyPropertyChanged(BR.mh010b04x);
    }


    @Bindable
    public String getMh01101() {
        return mh01101;
    }

    public void setMh01101(String mh01101) {
        this.mh01101 = mh01101;
        notifyPropertyChanged(BR.mh01101);
    }


    @Bindable
    public String getMh01102() {
        return mh01102;
    }

    public void setMh01102(String mh01102) {
        this.mh01102 = mh01102;
        notifyPropertyChanged(BR.mh01102);
    }


    @Bindable
    public String getMh01103() {
        return mh01103;
    }

    public void setMh01103(String mh01103) {
        this.mh01103 = mh01103;
        notifyPropertyChanged(BR.mh01103);
    }


    @Bindable
    public String getMh012() {
        return mh012;
    }

    public void setMh012(String mh012) {
        this.mh012 = mh012;
        notifyPropertyChanged(BR.mh012);
    }


    @Bindable
    public String getChkWeight() {
        return chkWeight;
    }

    public void setChkWeight(String chkWeight) {
        this.chkWeight = chkWeight;
        notifyPropertyChanged(BR.chkWeight);
    }


    @Bindable
    public String getMh013() {
        return mh013;
    }

    public void setMh013(String mh013) {
        this.mh013 = mh013;
        notifyPropertyChanged(BR.mh013);
    }


    @Bindable
    public String getMh014() {
        return mh014;
    }

    public void setMh014(String mh014) {
        this.mh014 = mh014;
        notifyPropertyChanged(BR.mh014);
    }


    @Bindable
    public String getMh015() {
        return mh015;
    }

    public void setMh015(String mh015) {
        this.mh015 = mh015;
        notifyPropertyChanged(BR.mh015);
    }


    @Bindable
    public String getChkHeight() {
        return chkHeight;
    }

    public void setChkHeight(String chkHeight) {
        this.chkHeight = chkHeight;
        notifyPropertyChanged(BR.chkHeight);
    }


    @Bindable
    public String getMh016() {
        return mh016;
    }

    public void setMh016(String mh016) {
        this.mh016 = mh016;
        notifyPropertyChanged(BR.mh016);
    }


    @Bindable
    public String getChkMUAC() {
        return chkMUAC;
    }

    public void setChkMUAC(String chkMUAC) {
        this.chkMUAC = chkMUAC;
        notifyPropertyChanged(BR.chkMUAC);
    }


    @Bindable
    public String getMh01701() {
        return mh01701;
    }

    public void setMh01701(String mh01701) {
        this.mh01701 = mh01701;
        notifyPropertyChanged(BR.mh01701);
    }


    @Bindable
    public String getMh01702() {
        return mh01702;
    }

    public void setMh01702(String mh01702) {
        this.mh01702 = mh01702;
        notifyPropertyChanged(BR.mh01702);
    }


    @Bindable
    public String getMh01703() {
        return mh01703;
    }

    public void setMh01703(String mh01703) {
        this.mh01703 = mh01703;
        notifyPropertyChanged(BR.mh01703);
    }


    @Bindable
    public String getMh01704() {
        return mh01704;
    }

    public void setMh01704(String mh01704) {
        this.mh01704 = mh01704;
        notifyPropertyChanged(BR.mh01704);
    }


    @Bindable
    public String getMh017077() {
        return mh017077;
    }

    public void setMh017077(String mh017077) {
        this.mh017077 = mh017077;
        notifyPropertyChanged(BR.mh017077);
    }


    @Bindable
    public String getMh017077x() {
        return mh017077x;
    }

    public void setMh017077x(String mh017077x) {
        this.mh017077x = mh017077x;
        notifyPropertyChanged(BR.mh017077x);
    }


    @Bindable
    public String getMh017097() {
        return mh017097;
    }

    public void setMh017097(String mh017097) {
        this.mh017097 = mh017097;
        notifyPropertyChanged(BR.mh017097);
    }


    @Bindable
    public String getMh01801() {
        return mh01801;
    }

    public void setMh01801(String mh01801) {
        this.mh01801 = mh01801;
        notifyPropertyChanged(BR.mh01801);
    }


    @Bindable
    public String getMh01802() {
        return mh01802;
    }

    public void setMh01802(String mh01802) {
        this.mh01802 = mh01802;
        notifyPropertyChanged(BR.mh01802);
    }


    @Bindable
    public String getMh01803() {
        return mh01803;
    }

    public void setMh01803(String mh01803) {
        this.mh01803 = mh01803;
        notifyPropertyChanged(BR.mh01803);
    }


    @Bindable
    public String getMh01804() {
        return mh01804;
    }

    public void setMh01804(String mh01804) {
        this.mh01804 = mh01804;
        notifyPropertyChanged(BR.mh01804);
    }


    @Bindable
    public String getMh01805() {
        return mh01805;
    }

    public void setMh01805(String mh01805) {
        this.mh01805 = mh01805;
        notifyPropertyChanged(BR.mh01805);
    }


    @Bindable
    public String getMh01806() {
        return mh01806;
    }

    public void setMh01806(String mh01806) {
        this.mh01806 = mh01806;
        notifyPropertyChanged(BR.mh01806);
    }


    @Bindable
    public String getMh01807() {
        return mh01807;
    }

    public void setMh01807(String mh01807) {
        this.mh01807 = mh01807;
        notifyPropertyChanged(BR.mh01807);
    }


    @Bindable
    public String getMh01808() {
        return mh01808;
    }

    public void setMh01808(String mh01808) {
        this.mh01808 = mh01808;
        notifyPropertyChanged(BR.mh01808);
    }


    @Bindable
    public String getMh01809() {
        return mh01809;
    }

    public void setMh01809(String mh01809) {
        this.mh01809 = mh01809;
        notifyPropertyChanged(BR.mh01809);
    }


    @Bindable
    public String getMh018010() {
        return mh018010;
    }

    public void setMh018010(String mh018010) {
        this.mh018010 = mh018010;
        notifyPropertyChanged(BR.mh018010);
    }


    @Bindable
    public String getMh018011() {
        return mh018011;
    }

    public void setMh018011(String mh018011) {
        this.mh018011 = mh018011;
        notifyPropertyChanged(BR.mh018011);
    }


    @Bindable
    public String getMh018012() {
        return mh018012;
    }

    public void setMh018012(String mh018012) {
        this.mh018012 = mh018012;
        notifyPropertyChanged(BR.mh018012);
    }


    @Bindable
    public String getMh018013() {
        return mh018013;
    }

    public void setMh018013(String mh018013) {
        this.mh018013 = mh018013;
        notifyPropertyChanged(BR.mh018013);
    }


    @Bindable
    public String getMh018014() {
        return mh018014;
    }

    public void setMh018014(String mh018014) {
        this.mh018014 = mh018014;
        notifyPropertyChanged(BR.mh018014);
    }


    @Bindable
    public String getMh018015() {
        return mh018015;
    }

    public void setMh018015(String mh018015) {
        this.mh018015 = mh018015;
        notifyPropertyChanged(BR.mh018015);
    }


    @Bindable
    public String getMh018016() {
        return mh018016;
    }

    public void setMh018016(String mh018016) {
        this.mh018016 = mh018016;
        notifyPropertyChanged(BR.mh018016);
    }


    @Bindable
    public String getMh018077() {
        return mh018077;
    }

    public void setMh018077(String mh018077) {
        this.mh018077 = mh018077;
        notifyPropertyChanged(BR.mh018077);
    }


    @Bindable
    public String getMh018077x() {
        return mh018077x;
    }

    public void setMh018077x(String mh018077x) {
        this.mh018077x = mh018077x;
        notifyPropertyChanged(BR.mh018077x);
    }


    @Bindable
    public String getMh018097() {
        return mh018097;
    }

    public void setMh018097(String mh018097) {
        this.mh018097 = mh018097;
        notifyPropertyChanged(BR.mh018097);
    }


    @Bindable
    public String getMh01901() {
        return mh01901;
    }

    public void setMh01901(String mh01901) {
        this.mh01901 = mh01901;
        notifyPropertyChanged(BR.mh01901);
    }


    @Bindable
    public String getMh01902() {
        return mh01902;
    }

    public void setMh01902(String mh01902) {
        this.mh01902 = mh01902;
        notifyPropertyChanged(BR.mh01902);
    }


    @Bindable
    public String getMh01903() {
        return mh01903;
    }

    public void setMh01903(String mh01903) {
        this.mh01903 = mh01903;
        notifyPropertyChanged(BR.mh01903);
    }


    @Bindable
    public String getMh01904() {
        return mh01904;
    }

    public void setMh01904(String mh01904) {
        this.mh01904 = mh01904;
        notifyPropertyChanged(BR.mh01904);
    }


    @Bindable
    public String getMh01905() {
        return mh01905;
    }

    public void setMh01905(String mh01905) {
        this.mh01905 = mh01905;
        notifyPropertyChanged(BR.mh01905);
    }


    @Bindable
    public String getMh01906() {
        return mh01906;
    }

    public void setMh01906(String mh01906) {
        this.mh01906 = mh01906;
        notifyPropertyChanged(BR.mh01906);
    }


    @Bindable
    public String getMh01907() {
        return mh01907;
    }

    public void setMh01907(String mh01907) {
        this.mh01907 = mh01907;
        notifyPropertyChanged(BR.mh01907);
    }


    @Bindable
    public String getMh01908() {
        return mh01908;
    }

    public void setMh01908(String mh01908) {
        this.mh01908 = mh01908;
        notifyPropertyChanged(BR.mh01908);
    }


    @Bindable
    public String getMh01909() {
        return mh01909;
    }

    public void setMh01909(String mh01909) {
        this.mh01909 = mh01909;
        notifyPropertyChanged(BR.mh01909);
    }


    @Bindable
    public String getMh019010() {
        return mh019010;
    }

    public void setMh019010(String mh019010) {
        this.mh019010 = mh019010;
        notifyPropertyChanged(BR.mh019010);
    }


    @Bindable
    public String getMh019011() {
        return mh019011;
    }

    public void setMh019011(String mh019011) {
        this.mh019011 = mh019011;
        notifyPropertyChanged(BR.mh019011);
    }


    @Bindable
    public String getMh019012() {
        return mh019012;
    }

    public void setMh019012(String mh019012) {
        this.mh019012 = mh019012;
        notifyPropertyChanged(BR.mh019012);
    }


    @Bindable
    public String getMh019013() {
        return mh019013;
    }

    public void setMh019013(String mh019013) {
        this.mh019013 = mh019013;
        notifyPropertyChanged(BR.mh019013);
    }


    @Bindable
    public String getMh019014() {
        return mh019014;
    }

    public void setMh019014(String mh019014) {
        this.mh019014 = mh019014;
        notifyPropertyChanged(BR.mh019014);
    }


    @Bindable
    public String getMh019015() {
        return mh019015;
    }

    public void setMh019015(String mh019015) {
        this.mh019015 = mh019015;
        notifyPropertyChanged(BR.mh019015);
    }


    @Bindable
    public String getMh019077() {
        return mh019077;
    }

    public void setMh019077(String mh019077) {
        this.mh019077 = mh019077;
        notifyPropertyChanged(BR.mh019077);
    }


    @Bindable
    public String getMh019077x() {
        return mh019077x;
    }

    public void setMh019077x(String mh019077x) {
        this.mh019077x = mh019077x;
        notifyPropertyChanged(BR.mh019077x);
    }


    @Bindable
    public String getMh019097() {
        return mh019097;
    }

    public void setMh019097(String mh019097) {
        this.mh019097 = mh019097;
        notifyPropertyChanged(BR.mh019097);
    }


    @Bindable
    public String getMh020() {
        return mh020;
    }

    public void setMh020(String mh020) {
        this.mh020 = mh020;
        notifyPropertyChanged(BR.mh020);
    }


    @Bindable
    public String getMh021() {
        return mh021;
    }

    public void setMh021(String mh021) {
        this.mh021 = mh021;
        notifyPropertyChanged(BR.mh021);
    }


    @Bindable
    public String getMh022() {
        return mh022;
    }

    public void setMh022(String mh022) {
        this.mh022 = mh022;
        notifyPropertyChanged(BR.mh022);
    }


    @Bindable
    public String getMh023() {
        return mh023;
    }

    public void setMh023(String mh023) {
        this.mh023 = mh023;
        notifyPropertyChanged(BR.mh023);
    }


    @Bindable
    public String getMh024() {
        return mh024;
    }

    public void setMh024(String mh024) {
        this.mh024 = mh024;
        notifyPropertyChanged(BR.mh024);
    }


    @Bindable
    public String getMh025() {
        return mh025;
    }

    public void setMh025(String mh025) {
        this.mh025 = mh025;
        notifyPropertyChanged(BR.mh025);
    }


    @Bindable
    public String getMh02601() {
        return mh02601;
    }

    public void setMh02601(String mh02601) {
        this.mh02601 = mh02601;
        notifyPropertyChanged(BR.mh02601);
    }


    @Bindable
    public String getMh02602() {
        return mh02602;
    }

    public void setMh02602(String mh02602) {
        this.mh02602 = mh02602;
        notifyPropertyChanged(BR.mh02602);
    }


    @Bindable
    public String getMh02603() {
        return mh02603;
    }

    public void setMh02603(String mh02603) {
        this.mh02603 = mh02603;
        notifyPropertyChanged(BR.mh02603);
    }


    @Bindable
    public String getMh02604() {
        return mh02604;
    }

    public void setMh02604(String mh02604) {
        this.mh02604 = mh02604;
        notifyPropertyChanged(BR.mh02604);
    }


    @Bindable
    public String getMh02605() {
        return mh02605;
    }

    public void setMh02605(String mh02605) {
        this.mh02605 = mh02605;
        notifyPropertyChanged(BR.mh02605);
    }


    @Bindable
    public String getMh02606() {
        return mh02606;
    }

    public void setMh02606(String mh02606) {
        this.mh02606 = mh02606;
        notifyPropertyChanged(BR.mh02606);
    }


    @Bindable
    public String getMh02608() {
        return mh02608;
    }

    public void setMh02608(String mh02608) {
        this.mh02608 = mh02608;
        notifyPropertyChanged(BR.mh02608);
    }


    @Bindable
    public String getMh02609() {
        return mh02609;
    }

    public void setMh02609(String mh02609) {
        this.mh02609 = mh02609;
        notifyPropertyChanged(BR.mh02609);
    }


    @Bindable
    public String getMh026010() {
        return mh026010;
    }

    public void setMh026010(String mh026010) {
        this.mh026010 = mh026010;
        notifyPropertyChanged(BR.mh026010);
    }


    @Bindable
    public String getMh026011() {
        return mh026011;
    }

    public void setMh026011(String mh026011) {
        this.mh026011 = mh026011;
        notifyPropertyChanged(BR.mh026011);
    }


    @Bindable
    public String getMh026014() {
        return mh026014;
    }

    public void setMh026014(String mh026014) {
        this.mh026014 = mh026014;
        notifyPropertyChanged(BR.mh026014);
    }


    @Bindable
    public String getMh026015() {
        return mh026015;
    }

    public void setMh026015(String mh026015) {
        this.mh026015 = mh026015;
        notifyPropertyChanged(BR.mh026015);
    }


    @Bindable
    public String getMh026016() {
        return mh026016;
    }

    public void setMh026016(String mh026016) {
        this.mh026016 = mh026016;
        notifyPropertyChanged(BR.mh026016);
    }


    @Bindable
    public String getMh026017() {
        return mh026017;
    }

    public void setMh026017(String mh026017) {
        this.mh026017 = mh026017;
        notifyPropertyChanged(BR.mh026017);
    }


    @Bindable
    public String getMh026018() {
        return mh026018;
    }

    public void setMh026018(String mh026018) {
        this.mh026018 = mh026018;
        notifyPropertyChanged(BR.mh026018);
    }


    @Bindable
    public String getMh026019() {
        return mh026019;
    }

    public void setMh026019(String mh026019) {
        this.mh026019 = mh026019;
        notifyPropertyChanged(BR.mh026019);
    }

    @Bindable
    public String getMh026020() {
        return mh026020;
    }

    public void setMh026020(String mh026020) {
        this.mh026020 = mh026020;
        notifyPropertyChanged(BR.mh026020);
    }

    @Bindable
    public String getMh026021() {
        return mh026021;
    }

    public void setMh026021(String mh026021) {
        this.mh026021 = mh026021;
        notifyPropertyChanged(BR.mh026021);
    }

    @Bindable
    public String getMh026022() {
        return mh026022;
    }

    public void setMh026022(String mh026022) {
        this.mh026022 = mh026022;
        notifyPropertyChanged(BR.mh026022);
    }

    @Bindable
    public String getMh027a() {
        return mh027a;
    }

    public void setMh027a(String mh027a) {
        this.mh027a = mh027a;
        notifyPropertyChanged(BR.mh027a);
    }


    @Bindable
    public String getMh027b() {
        return mh027b;
    }

    public void setMh027b(String mh027b) {
        this.mh027b = mh027b;
        notifyPropertyChanged(BR.mh027b);
    }


    @Bindable
    public String getMh027() {
        return mh027;
    }

    public void setMh027(String mh027) {
        this.mh027 = mh027;
        notifyPropertyChanged(BR.mh027);
    }


    @Bindable
    public String getMh028() {
        return mh028;
    }

    public void setMh028(String mh028) {
        this.mh028 = mh028;
        notifyPropertyChanged(BR.mh028);
    }


    @Bindable
    public String getMh029() {
        return mh029;
    }

    public void setMh029(String mh029) {
        this.mh029 = mh029;
        notifyPropertyChanged(BR.mh029);
    }


    @Bindable
    public String getMh030() {
        return mh030;
    }

    public void setMh030(String mh030) {
        this.mh030 = mh030;
        notifyPropertyChanged(BR.mh030);
    }


    @Bindable
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyPropertyChanged(BR.status);
    }


    public MobileHealth_BK Sync(JSONObject jsonObject) throws JSONException {
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
        this.mh01 = jsonObject.getString(MHContract.MHTable.COLUMN_SS101);
        this.mh02 = jsonObject.getString(MHContract.MHTable.COLUMN_SS102);
        this.mh03 = jsonObject.getString(MHContract.MHTable.COLUMN_SS103);
        this.mh04 = jsonObject.getString(MHContract.MHTable.COLUMN_SS104);
        this.mh05 = jsonObject.getString(MHContract.MHTable.COLUMN_SS105);
        this.mh06 = jsonObject.getString(MHContract.MHTable.COLUMN_SS106);
        this.mh07 = jsonObject.getString(MHContract.MHTable.COLUMN_SS107);

        this.sA = jsonObject.getString(MHContract.MHTable.COLUMN_SA);

        return this;

    }


    public MobileHealth_BK Hydrate(Cursor cursor) {
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
        this.mh01 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS101));
        this.mh02 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS102));
        this.mh03 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS103));
        this.mh04 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS104));
        this.mh05 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS105));
        this.mh06 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS106));
        this.mh07 = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SS107));

        //For childCount
        //this.sA = cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SA));

        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(MHContract.MHTable.COLUMN_SA)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, MobileHealth_BK.class);
    }


    public String sAtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("mh06a", mh06a)
                    .put("mh08", mh08)
                    .put("mh08a", mh08a)
                    .put("mh09y", mh09y)
                    .put("mh09m", mh09m)
                    .put("mh09d", mh09d)
                    .put("patientType", patientType)
                    .put("mh010", mh010)
                    .put("mh010a", mh010a)
                    .put("mh010b", mh010b)
                    .put("mh01101", mh01101)
                    .put("mh01102", mh01102)
                    .put("mh01103", mh01103)
                    .put("mh012", mh012)
                    .put("chkWeight", chkWeight)
                    .put("mh013", mh013)
                    .put("mh014", mh014)
                    .put("mh015", mh015)
                    .put("chkHeight", chkHeight)
                    .put("mh016", mh016)
                    .put("chkMUAC", chkMUAC)
                    .put("mh01701", mh01701)
                    .put("mh01702", mh01702)
                    .put("mh01703", mh01703)
                    .put("mh017077", mh017077)
                    .put("mh017077x", mh017077x)
                    .put("mh017097", mh017097)
                    .put("mh01801", mh01801)
                    .put("mh01802", mh01802)
                    .put("mh01803", mh01803)
                    .put("mh01804", mh01804)
                    .put("mh01805", mh01805)
                    .put("mh01806", mh01806)
                    .put("mh01807", mh01807)
                    .put("mh01808", mh01808)
                    .put("mh01809", mh01809)
                    .put("mh018010", mh018010)
                    .put("mh018011", mh018011)
                    .put("mh018012", mh018012)
                    .put("mh018013", mh018013)
                    .put("mh018014", mh018014)
                    .put("mh018015", mh018015)
                    .put("mh018016", mh018016)
                    .put("mh018077", mh018077)
                    .put("mh018077x", mh018077x)
                    .put("mh018097", mh018097)
                    .put("mh01901", mh01901)
                    .put("mh01902", mh01902)
                    .put("mh01903", mh01903)
                    .put("mh01904", mh01904)
                    .put("mh01905", mh01905)
                    .put("mh01906", mh01906)
                    .put("mh01907", mh01907)
                    .put("mh01908", mh01908)
                    .put("mh01909", mh01909)
                    .put("mh019010", mh019010)
                    .put("mh019011", mh019011)
                    .put("mh019012", mh019012)
                    .put("mh019013", mh019013)
                    .put("mh019014", mh019014)
                    .put("mh019015", mh019015)
                    .put("mh019077", mh019077)
                    .put("mh019077x", mh019077x)
                    .put("mh019097", mh019097)
                    .put("mh020", mh020)
                    .put("mh021", mh021)
                    .put("mh022", mh022)
                    .put("mh023", mh023)
                    .put("mh024", mh024)
                    .put("mh025", mh025)
                    .put("mh027b", mh027b)
                    .put("mh02601", mh02601)
                    .put("mh02602", mh02602)
                    .put("mh02603", mh02603)
                    .put("mh02604", mh02604)
                    .put("mh02605", mh02605)
                    .put("mh02606", mh02606)
                    .put("mh02608", mh02608)
                    .put("mh02609", mh02609)
                    .put("mh026010", mh026010)
                    .put("mh026011", mh026011)
                    .put("mh026014", mh026014)
                    .put("mh026015", mh026015)
                    .put("mh026016", mh026016)
                    .put("mh026017", mh026017)
                    .put("mh026018", mh026018)
                    .put("mh026019", mh026019)
                    .put("mh026020", mh026020)
                    .put("mh026021", mh026021)
                    .put("mh026022", mh026022)
                    .put("mh027a", mh027a)
                    .put("mh027", mh027)
                    .put("mh028", mh028)
                    .put("mh029", mh029)
                    .put("mh030", mh030);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(MHContract.MHTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(MHContract.MHTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(MHContract.MHTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(MHContract.MHTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(MHContract.MHTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(MHContract.MHTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);
            json.put(MHContract.MHTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(MHContract.MHTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(MHContract.MHTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);
            json.put(MHContract.MHTable.COLUMN_STATUS, this.status == null ? JSONObject.NULL : this.status);
            json.put(MHContract.MHTable.COLUMN_SERIAL, this.serial == null ? JSONObject.NULL : this.serial);
            json.put(MHContract.MHTable.COLUMN_SS101, this.mh01 == null ? JSONObject.NULL : this.mh01);
            json.put(MHContract.MHTable.COLUMN_SS102, this.mh02 == null ? JSONObject.NULL : this.mh02);
            json.put(MHContract.MHTable.COLUMN_SS103, this.mh03 == null ? JSONObject.NULL : this.mh03);
            json.put(MHContract.MHTable.COLUMN_SS104, this.mh04 == null ? JSONObject.NULL : this.mh04);
            json.put(MHContract.MHTable.COLUMN_SS105, this.mh05 == null ? JSONObject.NULL : this.mh05);
            json.put(MHContract.MHTable.COLUMN_SS106, this.mh06 == null ? JSONObject.NULL : this.mh06);
            json.put(MHContract.MHTable.COLUMN_SS107, this.mh07 == null ? JSONObject.NULL : this.mh07);

            //For ChildCount
            //json.put(MHContract.MHTable.COLUMN_SA, this.sA == null ? JSONObject.NULL : this.sA);

            json.put(MHContract.MHTable.COLUMN_SA, new JSONObject(sAtoString()));


            if (this.sA != null && !this.sA.equals("")) {
                json.put(MHContract.MHTable.COLUMN_SA, new JSONObject(this.sA));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void sAHydrate(String string) {
        Log.d("sAHydrateS", "string: " + string);

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.mh06a = json.getString("mh06a");
                this.mh08 = json.getString("mh08");
                this.mh08a = json.getString("mh08a");
                Log.d("sAHydrate", "Mh08: " + this.mh08);
                Log.d("sAHydrateJ", "Mh08: " + json.getString("mh08"));

                this.mh09y = json.getString("mh09y");
                Log.d("sAHydrate", "Mh09y: " + this.mh09y);
                Log.d("sAHydrateJ", "Mh09y: " + json.getString("mh09y"));

                this.mh09m = json.getString("mh09m");
                this.mh09d = json.getString("mh09d");
                this.patientType = json.getString("patientType");
                this.mh010 = json.getString("mh010");
                this.mh010a = json.getString("mh010a");
                this.mh010b = json.getString("mh010b");
                this.mh01101 = json.getString("mh01101");
                this.mh01102 = json.getString("mh01102");
                this.mh01103 = json.getString("mh01103");
                this.mh012 = json.getString("mh012");
                this.chkWeight = json.getString("chkWeight");
                this.mh013 = json.getString("mh013");
                this.mh014 = json.getString("mh014");
                this.mh015 = json.getString("mh015");
                this.chkHeight = json.getString("chkHeight");
                this.mh016 = json.getString("mh016");
                this.chkMUAC = json.getString("chkMUAC");
                this.mh01701 = json.getString("mh01701");
                this.mh01702 = json.getString("mh01702");
                this.mh01703 = json.getString("mh01703");
                this.mh017077 = json.getString("mh017077");
                this.mh017077x = json.getString("mh017077x");
                this.mh017097 = json.getString("mh017097");
                this.mh01801 = json.getString("mh01801");
                this.mh01802 = json.getString("mh01802");
                this.mh01803 = json.getString("mh01803");
                this.mh01804 = json.getString("mh01804");
                this.mh01805 = json.getString("mh01805");
                this.mh01806 = json.getString("mh01806");
                this.mh01807 = json.getString("mh01807");
                this.mh01808 = json.getString("mh01808");
                this.mh01809 = json.getString("mh01809");
                this.mh018010 = json.getString("mh018010");
                this.mh018011 = json.getString("mh018011");
                this.mh018012 = json.getString("mh018012");
                this.mh018013 = json.getString("mh018013");
                this.mh018014 = json.getString("mh018014");
                this.mh018015 = json.getString("mh018015");
                this.mh018016 = json.getString("mh018016");
                this.mh018077 = json.getString("mh018077");
                this.mh018077x = json.getString("mh018077x");
                this.mh018097 = json.getString("mh018097");
                this.mh01901 = json.getString("mh01901");
                this.mh01902 = json.getString("mh01902");
                this.mh01903 = json.getString("mh01903");
                this.mh01904 = json.getString("mh01904");
                this.mh01905 = json.getString("mh01905");
                this.mh01906 = json.getString("mh01906");
                this.mh01907 = json.getString("mh01907");
                this.mh01908 = json.getString("mh01908");
                this.mh01909 = json.getString("mh01909");
                this.mh019010 = json.getString("mh019010");
                this.mh019011 = json.getString("mh019011");
                this.mh019012 = json.getString("mh019012");
                this.mh019013 = json.getString("mh019013");
                this.mh019014 = json.getString("mh019014");
                this.mh019015 = json.getString("mh019015");
                this.mh019077 = json.getString("mh019077");
                this.mh019077x = json.getString("mh019077x");
                this.mh019097 = json.getString("mh019097");
                this.mh020 = json.getString("mh020");
                this.mh021 = json.getString("mh021");
                this.mh022 = json.getString("mh022");
                this.mh023 = json.getString("mh023");
                this.mh024 = json.getString("mh024");
                this.mh025 = json.getString("mh025");
                this.mh027b = json.getString("mh027b");
                this.mh02601 = json.getString("mh02601");
                this.mh02602 = json.getString("mh02602");
                this.mh02603 = json.getString("mh02603");
                this.mh02604 = json.getString("mh02604");
                this.mh02605 = json.getString("mh02605");
                this.mh02606 = json.getString("mh02606");
                this.mh02608 = json.getString("mh02608");
                this.mh02609 = json.getString("mh02609");
                this.mh026010 = json.getString("mh026010");
                this.mh026011 = json.getString("mh026011");
                this.mh026014 = json.getString("mh026014");
                this.mh026015 = json.getString("mh026015");
                this.mh026016 = json.getString("mh026016");
                this.mh026017 = json.getString("mh026017");
                this.mh026018 = json.getString("mh026018");
                this.mh026019 = json.getString("mh026019");
                this.mh026020 = json.getString("mh026020");
                this.mh026021 = json.getString("mh026021");
                this.mh026022 = json.getString("mh026022");
                this.mh027a = json.getString("mh027a");
                this.mh027 = json.getString("mh027");
                this.mh028 = json.getString("mh028");
                this.mh029 = json.getString("mh029");
                this.mh030 = json.getString("mh030");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}
