package edu.aku.hassannaqvi.hf_patient.models;

import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.hf_patient.BR;
import edu.aku.hassannaqvi.hf_patient.contracts.IMContract;
import edu.aku.hassannaqvi.hf_patient.core.MainApp;

public class Immunization extends BaseObservable {

    //Section IM
    private String im02 = StringUtils.EMPTY;
    private String im01 = StringUtils.EMPTY;
    private String im03 = StringUtils.EMPTY;
    private String im0396x = StringUtils.EMPTY;
    private String im04dd = StringUtils.EMPTY;
    private String im04mm = StringUtils.EMPTY;
    private String im04yy = StringUtils.EMPTY;
    private String im0501dd = StringUtils.EMPTY;
    private String im0501mm = StringUtils.EMPTY;
    private String im0501yy = StringUtils.EMPTY;
    private String im0502dd = StringUtils.EMPTY;
    private String im0502mm = StringUtils.EMPTY;
    private String im0502yy = StringUtils.EMPTY;
    private String im0503dd = StringUtils.EMPTY;
    private String im0503mm = StringUtils.EMPTY;
    private String im0503yy = StringUtils.EMPTY;
    private String im0504dd = StringUtils.EMPTY;
    private String im0504mm = StringUtils.EMPTY;
    private String im0504yy = StringUtils.EMPTY;
    private String im0505dd = StringUtils.EMPTY;
    private String im0505mm = StringUtils.EMPTY;
    private String im0505yy = StringUtils.EMPTY;
    private String im0506dd = StringUtils.EMPTY;
    private String im0506mm = StringUtils.EMPTY;


    // FIELD VARIABLES
    private String im0506yy = StringUtils.EMPTY;
    private String im0507dd = StringUtils.EMPTY;
    private String im0507mm = StringUtils.EMPTY;
    private String im0507yy = StringUtils.EMPTY;
    private String im0508dd = StringUtils.EMPTY;
    private String im0508mm = StringUtils.EMPTY;
    private String im0508yy = StringUtils.EMPTY;
    private String im0509dd = StringUtils.EMPTY;
    private String im0509mm = StringUtils.EMPTY;
    private String im0509yy = StringUtils.EMPTY;
    private String im0510dd = StringUtils.EMPTY;
    private String im0510mm = StringUtils.EMPTY;
    private String im0510yy = StringUtils.EMPTY;
    private String im0511dd = StringUtils.EMPTY;
    private String im0511mm = StringUtils.EMPTY;
    private String im0511yy = StringUtils.EMPTY;
    private String im0512dd = StringUtils.EMPTY;
    private String im0512mm = StringUtils.EMPTY;
    private String im0512yy = StringUtils.EMPTY;
    private String im0513dd = StringUtils.EMPTY;
    private String im0513mm = StringUtils.EMPTY;
    private String im0513yy = StringUtils.EMPTY;
    private String im0514dd = StringUtils.EMPTY;
    private String im0514mm = StringUtils.EMPTY;
    private String im0514yy = StringUtils.EMPTY;
    private String im0515dd = StringUtils.EMPTY;
    private String im0515mm = StringUtils.EMPTY;
    private String im0515yy = StringUtils.EMPTY;
    private String im0516dd = StringUtils.EMPTY;
    private String im0516mm = StringUtils.EMPTY;
    private String im0516yy = StringUtils.EMPTY;
    private String im07 = StringUtils.EMPTY;
    private String im08 = StringUtils.EMPTY;
    private String im08a = StringUtils.EMPTY;
    private String im08b = StringUtils.EMPTY;
    private String im09 = StringUtils.EMPTY;
    private String im10 = StringUtils.EMPTY;
    private String im11 = StringUtils.EMPTY;
    private String im12 = StringUtils.EMPTY;
    private String im1201x = StringUtils.EMPTY;
    private String im12a = StringUtils.EMPTY;
    private String im12a1x = StringUtils.EMPTY;
    private String im13 = StringUtils.EMPTY;
    private String im14 = StringUtils.EMPTY;
    private String im15 = StringUtils.EMPTY;
    private String im1501 = StringUtils.EMPTY;
    private String im16 = StringUtils.EMPTY;
    private String im17 = StringUtils.EMPTY;
    private String im1701 = StringUtils.EMPTY;
    private String im18 = StringUtils.EMPTY;
    private String im19 = StringUtils.EMPTY;
    private String im1901x = StringUtils.EMPTY;
    private String im20 = StringUtils.EMPTY;
    private String im21 = StringUtils.EMPTY;
    private String im22 = StringUtils.EMPTY;
    private String im2201 = StringUtils.EMPTY;
    private String im23 = StringUtils.EMPTY;
    private String im2306x = StringUtils.EMPTY;
    private String im23a = StringUtils.EMPTY;
    private String im23a96x = StringUtils.EMPTY;
    private String im23b1 = StringUtils.EMPTY;
    private String im23b2 = StringUtils.EMPTY;
    private String im24 = StringUtils.EMPTY;
    private String im2496x = StringUtils.EMPTY;
    private String im25 = StringUtils.EMPTY;
    private String imdate = StringUtils.EMPTY;
    private String photoFront = StringUtils.EMPTY;
    private String photoBack = StringUtils.EMPTY;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    private String id;
    private String uid;
    private String uuid;
    private String fmuid;
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
    private String status;
    private String synced;
    private String syncDate;
    // SECTION VARIABLES
    private String mothername;
    private String childname;
    private String serial;
    private String sim;


    public Immunization() {

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

    public Immunization setUid(String uid) {
        this.uid = uid;
        return this;
    }


    @Bindable
    public String getUuid() {
        return uuid;
    }

    public Immunization setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public Immunization setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDcode() {
        return dcode;
    }

    public Immunization setDcode(String dcode) {
        this.dcode = dcode;
        return this;
    }


    @Bindable
    public String getUcode() {
        return ucode;
    }

    public Immunization setUcode(String ucode) {
        this.ucode = ucode;
        return this;
    }


    @Bindable
    public String getCluster() {
        return cluster;
    }

    public Immunization setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }


    @Bindable
    public String getHhno() {
        return hhno;
    }

    public Immunization setHhno(String hhno) {
        this.hhno = hhno;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public Immunization setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public Immunization setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public Immunization setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public Immunization setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }


    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public Immunization setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    @Bindable
    public String getSynced() {
        return synced;
    }

    public Immunization setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public Immunization setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    public String getMothername() {
        return mothername;
    }

    public Immunization setMothername(String mothername) {
        this.mothername = mothername;
        return this;
    }


    public String getChildname() {
        return childname;
    }

    public Immunization setChildname(String childname) {
        this.childname = childname;
        return this;
    }


    public String getSerial() {
        return serial;
    }

    public Immunization setSerial(String serial) {
        this.serial = serial;
        return this;
    }


    public String getSim() {
        return sim;
    }

    public Immunization setSim(String sim) {
        this.sim = sim;
        return this;
    }


    @Bindable
    public String getIm02() {
        return im02;
    }

    public void setIm02(String im02) {
        this.im02 = im02;
        notifyPropertyChanged(BR.im02);
    }

    @Bindable
    public String getIm01() {
        return im01;
    }

    public void setIm01(String im01) {
        this.im01 = im01;
        notifyPropertyChanged(BR.im01);
    }

    @Bindable
    public String getIm03() {
        return im03;
    }

    public void setIm03(String im03) {
        this.im03 = im03;
        notifyPropertyChanged(BR.im03);
    }

    @Bindable
    public String getIm0396x() {
        return im0396x;
    }

    public void setIm0396x(String im0396x) {
        this.im0396x = im0396x;
    }


    @Bindable
    public String getIm04dd() {
        return im04dd;
    }

    public void setIm04dd(String im04dd) {
        this.im04dd = im04dd;
        notifyPropertyChanged(BR.im04dd);
    }

    @Bindable
    public String getIm04mm() {
        return im04mm;
    }

    public void setIm04mm(String im04mm) {
        this.im04mm = im04mm;
        notifyPropertyChanged(BR.im04mm);
    }

    @Bindable
    public String getIm04yy() {
        return im04yy;
    }

    public void setIm04yy(String im04yy) {
        this.im04yy = im04yy;
        notifyPropertyChanged(BR.im04yy);
    }

    @Bindable
    public String getIm0501dd() {
        return im0501dd;
    }

    public void setIm0501dd(String im0501dd) {
        this.im0501dd = im0501dd;
        notifyPropertyChanged(BR.im0501dd);
    }

    @Bindable
    public String getIm0501mm() {
        return im0501mm;
    }

    public void setIm0501mm(String im0501mm) {
        this.im0501mm = im0501mm;
        notifyPropertyChanged(BR.im0501mm);
    }

    @Bindable
    public String getIm0501yy() {
        return im0501yy;
    }

    public void setIm0501yy(String im0501yy) {
        this.im0501yy = im0501yy;
        notifyPropertyChanged(BR.im0501yy);
    }

    @Bindable
    public String getIm0502dd() {
        return im0502dd;
    }

    public void setIm0502dd(String im0502dd) {
        this.im0502dd = im0502dd;
        notifyPropertyChanged(BR.im0502dd);
    }

    @Bindable
    public String getIm0502mm() {
        return im0502mm;
    }

    public void setIm0502mm(String im0502mm) {
        this.im0502mm = im0502mm;
        notifyPropertyChanged(BR.im0502mm);
    }

    @Bindable
    public String getIm0502yy() {
        return im0502yy;
    }

    public void setIm0502yy(String im0502yy) {
        this.im0502yy = im0502yy;
        notifyPropertyChanged(BR.im0502yy);
    }

    @Bindable
    public String getIm0503dd() {
        return im0503dd;
    }

    public void setIm0503dd(String im0503dd) {
        this.im0503dd = im0503dd;
        notifyPropertyChanged(BR.im0503dd);
    }

    @Bindable
    public String getIm0503mm() {
        return im0503mm;
    }

    public void setIm0503mm(String im0503mm) {
        this.im0503mm = im0503mm;
        notifyPropertyChanged(BR.im0503mm);
    }

    @Bindable
    public String getIm0503yy() {
        return im0503yy;
    }

    public void setIm0503yy(String im0503yy) {
        this.im0503yy = im0503yy;
        notifyPropertyChanged(BR.im0503yy);
    }

    @Bindable
    public String getIm0504dd() {
        return im0504dd;
    }

    public void setIm0504dd(String im0504dd) {
        this.im0504dd = im0504dd;
        notifyPropertyChanged(BR.im0504dd);
    }

    @Bindable
    public String getIm0504mm() {
        return im0504mm;
    }

    public void setIm0504mm(String im0504mm) {
        this.im0504mm = im0504mm;
        notifyPropertyChanged(BR.im0504mm);
    }

    @Bindable
    public String getIm0504yy() {
        return im0504yy;
    }

    public void setIm0504yy(String im0504yy) {
        this.im0504yy = im0504yy;
        notifyPropertyChanged(BR.im0504yy);
    }

    @Bindable
    public String getIm0505dd() {
        return im0505dd;
    }

    public void setIm0505dd(String im0505dd) {
        this.im0505dd = im0505dd;
        notifyPropertyChanged(BR.im0505dd);
    }

    @Bindable
    public String getIm0505mm() {
        return im0505mm;
    }

    public void setIm0505mm(String im0505mm) {
        this.im0505mm = im0505mm;
        notifyPropertyChanged(BR.im0505mm);
    }

    @Bindable
    public String getIm0505yy() {
        return im0505yy;
    }

    public void setIm0505yy(String im0505yy) {
        this.im0505yy = im0505yy;
        notifyPropertyChanged(BR.im0505yy);
    }

    @Bindable
    public String getIm0506dd() {
        return im0506dd;
    }

    public void setIm0506dd(String im0506dd) {
        this.im0506dd = im0506dd;
        notifyPropertyChanged(BR.im0506dd);
    }

    @Bindable
    public String getIm0506mm() {
        return im0506mm;
    }

    public void setIm0506mm(String im0506mm) {
        this.im0506mm = im0506mm;
        notifyPropertyChanged(BR.im0506mm);
    }

    @Bindable
    public String getIm0506yy() {
        return im0506yy;
    }

    public void setIm0506yy(String im0506yy) {
        this.im0506yy = im0506yy;
        notifyPropertyChanged(BR.im0506yy);
    }

    @Bindable
    public String getIm0507dd() {
        return im0507dd;
    }

    public void setIm0507dd(String im0507dd) {
        this.im0507dd = im0507dd;
        notifyPropertyChanged(BR.im0507dd);
    }

    @Bindable
    public String getIm0507mm() {
        return im0507mm;
    }

    public void setIm0507mm(String im0507mm) {
        this.im0507mm = im0507mm;
        notifyPropertyChanged(BR.im0507mm);
    }

    @Bindable
    public String getIm0507yy() {
        return im0507yy;
    }

    public void setIm0507yy(String im0507yy) {
        this.im0507yy = im0507yy;
        notifyPropertyChanged(BR.im0507yy);
    }

    @Bindable
    public String getIm0508dd() {
        return im0508dd;
    }

    public void setIm0508dd(String im0508dd) {
        this.im0508dd = im0508dd;
        notifyPropertyChanged(BR.im0508dd);
    }

    @Bindable
    public String getIm0508mm() {
        return im0508mm;
    }

    public void setIm0508mm(String im0508mm) {
        this.im0508mm = im0508mm;
        notifyPropertyChanged(BR.im0508mm);
    }

    @Bindable
    public String getIm0508yy() {
        return im0508yy;
    }

    public void setIm0508yy(String im0508yy) {
        this.im0508yy = im0508yy;
        notifyPropertyChanged(BR.im0508yy);
    }

    @Bindable
    public String getIm0509dd() {
        return im0509dd;
    }

    public void setIm0509dd(String im0509dd) {
        this.im0509dd = im0509dd;
        notifyPropertyChanged(BR.im0509dd);
    }

    @Bindable
    public String getIm0509mm() {
        return im0509mm;
    }

    public void setIm0509mm(String im0509mm) {
        this.im0509mm = im0509mm;
        notifyPropertyChanged(BR.im0509mm);
    }

    @Bindable
    public String getIm0509yy() {
        return im0509yy;
    }

    public void setIm0509yy(String im0509yy) {
        this.im0509yy = im0509yy;
        notifyPropertyChanged(BR.im0509yy);
    }

    @Bindable
    public String getIm0510dd() {
        return im0510dd;
    }

    public void setIm0510dd(String im0510dd) {
        this.im0510dd = im0510dd;
        notifyPropertyChanged(BR.im0510dd);
    }

    @Bindable
    public String getIm0510mm() {
        return im0510mm;
    }

    public void setIm0510mm(String im0510mm) {
        this.im0510mm = im0510mm;
        notifyPropertyChanged(BR.im0510mm);
    }

    @Bindable
    public String getIm0510yy() {
        return im0510yy;
    }

    public void setIm0510yy(String im0510yy) {
        this.im0510yy = im0510yy;
        notifyPropertyChanged(BR.im0510yy);
    }

    @Bindable
    public String getIm0511dd() {
        return im0511dd;
    }

    public void setIm0511dd(String im0511dd) {
        this.im0511dd = im0511dd;
        notifyPropertyChanged(BR.im0511dd);
    }

    @Bindable
    public String getIm0511mm() {
        return im0511mm;
    }

    public void setIm0511mm(String im0511mm) {
        this.im0511mm = im0511mm;
        notifyPropertyChanged(BR.im0511mm);
    }

    @Bindable
    public String getIm0511yy() {
        return im0511yy;
    }

    public void setIm0511yy(String im0511yy) {
        this.im0511yy = im0511yy;
        notifyPropertyChanged(BR.im0511yy);
    }

    @Bindable
    public String getIm0512dd() {
        return im0512dd;
    }

    public void setIm0512dd(String im0512dd) {
        this.im0512dd = im0512dd;
        notifyPropertyChanged(BR.im0512dd);
    }

    @Bindable
    public String getIm0512mm() {
        return im0512mm;
    }

    public void setIm0512mm(String im0512mm) {
        this.im0512mm = im0512mm;
        notifyPropertyChanged(BR.im0512mm);
    }

    @Bindable
    public String getIm0512yy() {
        return im0512yy;
    }

    public void setIm0512yy(String im0512yy) {
        this.im0512yy = im0512yy;
        notifyPropertyChanged(BR.im0512yy);
    }

    @Bindable
    public String getIm0513dd() {
        return im0513dd;
    }

    public void setIm0513dd(String im0513dd) {
        this.im0513dd = im0513dd;
        notifyPropertyChanged(BR.im0513dd);
    }

    @Bindable
    public String getIm0513mm() {
        return im0513mm;
    }

    public void setIm0513mm(String im0513mm) {
        this.im0513mm = im0513mm;
        notifyPropertyChanged(BR.im0513mm);
    }

    @Bindable
    public String getIm0513yy() {
        return im0513yy;
    }

    public void setIm0513yy(String im0513yy) {
        this.im0513yy = im0513yy;
        notifyPropertyChanged(BR.im0513yy);
    }

    @Bindable
    public String getIm0514dd() {
        return im0514dd;
    }

    public void setIm0514dd(String im0514dd) {
        this.im0514dd = im0514dd;
        notifyPropertyChanged(BR.im0514dd);
    }

    @Bindable
    public String getIm0514mm() {
        return im0514mm;
    }

    public void setIm0514mm(String im0514mm) {
        this.im0514mm = im0514mm;
        notifyPropertyChanged(BR.im0514mm);
    }

    @Bindable
    public String getIm0514yy() {
        return im0514yy;
    }

    public void setIm0514yy(String im0514yy) {
        this.im0514yy = im0514yy;
        notifyPropertyChanged(BR.im0514yy);
    }

    @Bindable
    public String getIm0515dd() {
        return im0515dd;
    }

    public void setIm0515dd(String im0515dd) {
        this.im0515dd = im0515dd;
        notifyPropertyChanged(BR.im0515dd);
    }

    @Bindable
    public String getIm0515mm() {
        return im0515mm;
    }

    public void setIm0515mm(String im0515mm) {
        this.im0515mm = im0515mm;
        notifyPropertyChanged(BR.im0515mm);
    }

    @Bindable
    public String getIm0515yy() {
        return im0515yy;
    }

    public void setIm0515yy(String im0515yy) {
        this.im0515yy = im0515yy;
        notifyPropertyChanged(BR.im0515yy);
    }

    @Bindable
    public String getIm0516dd() {
        return im0516dd;
    }

    public void setIm0516dd(String im0516dd) {
        this.im0516dd = im0516dd;
        notifyPropertyChanged(BR.im0516dd);
    }

    @Bindable
    public String getIm0516mm() {
        return im0516mm;
    }

    public void setIm0516mm(String im0516mm) {
        this.im0516mm = im0516mm;
        notifyPropertyChanged(BR.im0516mm);
    }

    @Bindable
    public String getIm0516yy() {
        return im0516yy;
    }

    public void setIm0516yy(String im0516yy) {
        this.im0516yy = im0516yy;
        notifyPropertyChanged(BR.im0516yy);
    }

    @Bindable
    public String getIm07() {
        return im07;
    }

    public void setIm07(String im07) {
        this.im07 = im07;
        notifyPropertyChanged(BR.im07);
    }

    @Bindable
    public String getIm08() {
        return im08;
    }

    public void setIm08(String im08) {
        this.im08 = im08;
        notifyPropertyChanged(BR.im08);
    }

    @Bindable
    public String getIm08a() {
        return im08a;
    }

    public void setIm08a(String im08a) {
        this.im08a = im08a;
        notifyPropertyChanged(BR.im08a);
    }

    @Bindable
    public String getIm08b() {
        return im08b;
    }

    public void setIm08b(String im08b) {
        this.im08b = im08b;
        notifyPropertyChanged(BR.im08b);
    }

    @Bindable
    public String getIm09() {
        return im09;
    }

    public void setIm09(String im09) {
        this.im09 = im09;
        notifyPropertyChanged(BR.im09);
    }

    @Bindable
    public String getIm10() {
        return im10;
    }

    public void setIm10(String im10) {
        this.im10 = im10;
        notifyPropertyChanged(BR.im10);
    }

    @Bindable
    public String getIm11() {
        return im11;
    }

    public void setIm11(String im11) {
        this.im11 = im11;
        notifyPropertyChanged(BR.im11);
    }

    @Bindable
    public String getIm12() {
        return im12;
    }

    public void setIm12(String im12) {
        this.im12 = im12;
        notifyPropertyChanged(BR.im12);
    }

    @Bindable
    public String getIm1201x() {
        return im1201x;
    }

    public void setIm1201x(String im1201x) {
        this.im1201x = im1201x;
        notifyPropertyChanged(BR.im1201x);
    }

    @Bindable
    public String getIm12a() {
        return im12a;
    }

    public void setIm12a(String im12a) {
        this.im12a = im12a;
        notifyPropertyChanged(BR.im12a);
    }

    @Bindable
    public String getIm12a1x() {
        return im12a1x;
    }

    public void setIm12a1x(String im12a1x) {
        this.im12a1x = im12a1x;
        notifyPropertyChanged(BR.im12a1x);
    }

    @Bindable
    public String getIm13() {
        return im13;
    }

    public void setIm13(String im13) {
        this.im13 = im13;
        notifyPropertyChanged(BR.im13);
    }

    @Bindable
    public String getIm14() {
        return im14;
    }

    public void setIm14(String im14) {
        this.im14 = im14;
        notifyPropertyChanged(BR.im14);
    }

    @Bindable
    public String getIm15() {
        return im15;
    }

    public void setIm15(String im15) {
        this.im15 = im15;
        notifyPropertyChanged(BR.im15);
    }

    @Bindable
    public String getIm1501() {
        return im1501;
    }

    public void setIm1501(String im1501) {
        this.im1501 = im1501;
        notifyPropertyChanged(BR.im1501);
    }

    @Bindable
    public String getIm16() {
        return im16;
    }

    public void setIm16(String im16) {
        this.im16 = im16;
        notifyPropertyChanged(BR.im16);
    }

    @Bindable
    public String getIm17() {
        return im17;
    }

    public void setIm17(String im17) {
        this.im17 = im17;
        notifyPropertyChanged(BR.im17);
    }

    @Bindable
    public String getIm1701() {
        return im1701;
    }

    public void setIm1701(String im1701) {
        this.im1701 = im1701;
        notifyPropertyChanged(BR.im1701);
    }

    @Bindable
    public String getIm18() {
        return im18;
    }

    public void setIm18(String im18) {
        this.im18 = im18;
        notifyPropertyChanged(BR.im18);
    }

    @Bindable
    public String getIm19() {
        return im19;
    }

    public void setIm19(String im19) {
        this.im19 = im19;
        notifyPropertyChanged(BR.im19);
    }

    @Bindable
    public String getIm1901x() {
        return im1901x;
    }

    public void setIm1901x(String im1901x) {
        this.im1901x = im1901x;
        notifyPropertyChanged(BR.im1901x);
    }

    @Bindable
    public String getIm20() {
        return im20;
    }

    public void setIm20(String im20) {
        this.im20 = im20;
        notifyPropertyChanged(BR.im20);
    }

    @Bindable
    public String getIm21() {
        return im21;
    }

    public void setIm21(String im21) {
        this.im21 = im21;
        notifyPropertyChanged(BR.im21);
    }

    @Bindable
    public String getIm22() {
        return im22;
    }

    public void setIm22(String im22) {
        this.im22 = im22;
        notifyPropertyChanged(BR.im22);
    }


    @Bindable
    public String getIm2201() {
        return im2201;
    }

    public void setIm2201(String im2201) {
        this.im2201 = im2201;
        notifyPropertyChanged(BR.im2201);
    }


    @Bindable
    public String getIm23() {
        return im23;
    }

    public void setIm23(String im23) {
        this.im23 = im23;
        notifyPropertyChanged(BR.im23);
    }

    @Bindable
    public String getIm2306x() {
        return im2306x;
    }

    public void setIm2306x(String im2306x) {
        this.im2306x = im2306x;
        notifyPropertyChanged(BR.im2306x);
    }

    @Bindable
    public String getIm23a() {
        return im23a;
    }

    public void setIm23a(String im23a) {
        this.im23a = im23a;
        notifyPropertyChanged(BR.im23a);
    }


    @Bindable
    public String getIm23a96x() {
        return im23a96x;
    }

    public void setIm23a96x(String im23a96x) {
        this.im23a96x = im23a96x;
        notifyPropertyChanged(BR.im23a96x);
    }


    @Bindable
    public String getIm23b1() {
        return im23b1;
    }

    public void setIm23b1(String im23b1) {
        this.im23b1 = im23b1;
        notifyPropertyChanged(BR.im23b1);
    }

    @Bindable
    public String getIm23b2() {
        return im23b2;
    }

    public void setIm23b2(String im23b2) {
        this.im23b2 = im23b2;
        notifyPropertyChanged(BR.im23b2);
    }

    @Bindable
    public String getIm24() {
        return im24;
    }

    public void setIm24(String im24) {
        this.im24 = im24;
        notifyPropertyChanged(BR.im24);
    }

    @Bindable
    public String getIm2496x() {
        return im2496x;
    }

    public void setIm2496x(String im2496x) {
        this.im2496x = im2496x;
        notifyPropertyChanged(BR.im2496x);
    }

    @Bindable
    public String getIm25() {
        return im25;
    }

    public void setIm25(String im25) {
        this.im25 = im25;
        notifyPropertyChanged(BR.im25);
    }

    @Bindable
    public String getImdate() {
        return imdate;
    }

    public void setImdate(String imdate) {
        this.imdate = imdate;
        notifyPropertyChanged(BR.imdate);
    }


    @Bindable
    public String getPhotoFront() {
        return photoFront;
    }

    public void setPhotoFront(String photoFront) {
        this.photoFront = photoFront;
        notifyPropertyChanged(BR.photoFront);
    }


    @Bindable
    public String getPhotoBack() {
        return photoBack;
    }

    public void setPhotoBack(String photoBack) {
        this.photoBack = photoBack;
        notifyPropertyChanged(BR.photoBack);
    }


    @Bindable
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyPropertyChanged(BR.status);
    }


    public Immunization Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(IMContract.IMTable.COLUMN_ID);
        this.uid = jsonObject.getString(IMContract.IMTable.COLUMN_UID);
        this.uuid = jsonObject.getString(IMContract.IMTable.COLUMN_UUID);
        this.fmuid = jsonObject.getString(IMContract.IMTable.COLUMN_FMUID);
        this.userName = jsonObject.getString(IMContract.IMTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(IMContract.IMTable.COLUMN_SYSDATE);
        this.dcode = jsonObject.getString(IMContract.IMTable.COLUMN_DCODE);
        this.ucode = jsonObject.getString(IMContract.IMTable.COLUMN_UCODE);
        this.cluster = jsonObject.getString(IMContract.IMTable.COLUMN_CLUSTER);
        this.hhno = jsonObject.getString(IMContract.IMTable.COLUMN_HHNO);
        this.deviceId = jsonObject.getString(IMContract.IMTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(IMContract.IMTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(IMContract.IMTable.COLUMN_APPVERSION);
        this.synced = jsonObject.getString(IMContract.IMTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(IMContract.IMTable.COLUMN_SYNCED_DATE);
        this.status = jsonObject.getString(IMContract.IMTable.COLUMN_STATUS);
        this.mothername = jsonObject.getString(IMContract.IMTable.COLUMN_MOTHER_NAME);
        this.childname = jsonObject.getString(IMContract.IMTable.COLUMN_CHILD_NAME);
        this.serial = jsonObject.getString(IMContract.IMTable.COLUMN_SERIAL);

        this.sim = jsonObject.getString(IMContract.IMTable.COLUMN_SIM);

        return this;

    }


    public Immunization Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_FMUID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_SYSDATE));
        this.dcode = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_DCODE));
        this.ucode = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_UCODE));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_CLUSTER));
        this.hhno = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_HHNO));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_SYNCED_DATE));
        this.status = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_STATUS));
        this.mothername = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_MOTHER_NAME));
        this.childname = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_CHILD_NAME));
        this.serial = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_SERIAL));

        //For childCount
        //this.s01HH = cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_S01HH));

        s04IMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(IMContract.IMTable.COLUMN_SIM)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Immunization.class);
    }


    public String s04IMtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("im02", im02)
                    .put("im01", im01)
                    .put("im03", im03)
                    .put("im0396x", im0396x)
                    .put("im04dd", im04dd)
                    .put("im04mm", im04mm)
                    .put("im04yy", im04yy)
                    .put("im0501dd", im0501dd)
                    .put("im0501mm", im0501mm)
                    .put("im0501yy", im0501yy)
                    .put("im0502dd", im0502dd)
                    .put("im0502mm", im0502mm)
                    .put("im0502yy", im0502yy)
                    .put("im0503dd", im0503dd)
                    .put("im0503mm", im0503mm)
                    .put("im0503yy", im0503yy)
                    .put("im0504dd", im0504dd)
                    .put("im0504mm", im0504mm)
                    .put("im0504yy", im0504yy)
                    .put("im0505dd", im0505dd)
                    .put("im0505mm", im0505mm)
                    .put("im0505yy", im0505yy)
                    .put("im0506dd", im0506dd)
                    .put("im0506mm", im0506mm)
                    .put("im0506yy", im0506yy)
                    .put("im0507dd", im0507dd)
                    .put("im0507mm", im0507mm)
                    .put("im0507yy", im0507yy)
                    .put("im0508dd", im0508dd)
                    .put("im0508mm", im0508mm)
                    .put("im0508yy", im0508yy)
                    .put("im0509dd", im0509dd)
                    .put("im0509mm", im0509mm)
                    .put("im0509yy", im0509yy)
                    .put("im0510dd", im0510dd)
                    .put("im0510mm", im0510mm)
                    .put("im0510yy", im0510yy)
                    .put("im0511dd", im0511dd)
                    .put("im0511mm", im0511mm)
                    .put("im0511yy", im0511yy)
                    .put("im0512dd", im0512dd)
                    .put("im0512mm", im0512mm)
                    .put("im0512yy", im0512yy)
                    .put("im0513dd", im0513dd)
                    .put("im0513mm", im0513mm)
                    .put("im0513yy", im0513yy)
                    .put("im0514dd", im0514dd)
                    .put("im0514mm", im0514mm)
                    .put("im0514yy", im0514yy)
                    .put("im0515dd", im0515dd)
                    .put("im0515mm", im0515mm)
                    .put("im0515yy", im0515yy)
                    .put("im0516dd", im0516dd)
                    .put("im0516mm", im0516mm)
                    .put("im0516yy", im0516yy)
                    .put("im07", im07)
                    .put("im08", im08)
                    .put("im08a", im08a)
                    .put("im08b", im08b)
                    .put("im09", im09)
                    .put("im10", im10)
                    .put("im11", im11)
                    .put("im12", im12)
                    .put("im1201x", im1201x)
                    .put("im12a", im12a)
                    .put("im12a1x", im12a1x)
                    .put("im13", im13)
                    .put("im14", im14)
                    .put("im15", im15)
                    .put("im1501", im1501)
                    .put("im16", im16)
                    .put("im17", im17)
                    .put("im1701", im1701)
                    .put("im18", im18)
                    .put("im19", im19)
                    .put("im1901x", im1901x)
                    .put("im20", im20)
                    .put("im21", im21)
                    .put("im22", im22)
                    .put("im2201", im2201)
                    .put("im23", im23)
                    .put("im2306x", im2306x)
                    .put("im23a", im23a)
                    .put("im23a96x", im23a96x)
                    .put("im23b1", im23b1)
                    .put("im23b2", im23b2)
                    .put("im24", im24)
                    .put("im2496x", im2496x)
                    .put("im25", im25)
                    .put("imdate", imdate)
                    .put("photoFront", photoFront)
                    .put("photoBack", photoBack);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";

        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(IMContract.IMTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(IMContract.IMTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(IMContract.IMTable.COLUMN_UUID, this.uuid == null ? JSONObject.NULL : this.uuid);
            json.put(IMContract.IMTable.COLUMN_FMUID, this.fmuid == null ? JSONObject.NULL : this.fmuid);
            json.put(IMContract.IMTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(IMContract.IMTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(IMContract.IMTable.COLUMN_DCODE, this.dcode == null ? JSONObject.NULL : this.dcode);
            json.put(IMContract.IMTable.COLUMN_UCODE, this.ucode == null ? JSONObject.NULL : this.ucode);
            json.put(IMContract.IMTable.COLUMN_CLUSTER, this.cluster == null ? JSONObject.NULL : this.cluster);
            json.put(IMContract.IMTable.COLUMN_HHNO, this.hhno == null ? JSONObject.NULL : this.hhno);
            json.put(IMContract.IMTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(IMContract.IMTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);
            json.put(IMContract.IMTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(IMContract.IMTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(IMContract.IMTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);
            json.put(IMContract.IMTable.COLUMN_STATUS, this.status == null ? JSONObject.NULL : this.status);
            json.put(IMContract.IMTable.COLUMN_MOTHER_NAME, this.mothername == null ? JSONObject.NULL : this.mothername);
            json.put(IMContract.IMTable.COLUMN_CHILD_NAME, this.childname == null ? JSONObject.NULL : this.childname);
            json.put(IMContract.IMTable.COLUMN_SERIAL, this.serial == null ? JSONObject.NULL : this.serial);

            //For ChildCount
            //json.put(IMContract.IMTable.COLUMN_S08SE, this.s08SE == null ? JSONObject.NULL : this.s08SE);

            json.put(IMContract.IMTable.COLUMN_SIM, new JSONObject(s04IMtoString()));


            if (this.sim != null && !this.sim.equals("")) {
                json.put(IMContract.IMTable.COLUMN_SIM, new JSONObject(this.sim));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void s04IMHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.im02 = json.getString("im02");
                this.im01 = json.getString("im01");
                this.im03 = json.getString("im03");
                this.im0396x = json.getString("im0396x");
                this.im04dd = json.getString("im04dd");
                this.im04mm = json.getString("im04mm");
                this.im04yy = json.getString("im04yy");
                this.im0501dd = json.getString("im0501dd");
                this.im0501mm = json.getString("im0501mm");
                this.im0501yy = json.getString("im0501yy");
                this.im0502dd = json.getString("im0502dd");
                this.im0502mm = json.getString("im0502mm");
                this.im0502yy = json.getString("im0502yy");
                this.im0503dd = json.getString("im0503dd");
                this.im0503mm = json.getString("im0503mm");
                this.im0503yy = json.getString("im0503yy");
                this.im0504dd = json.getString("im0504dd");
                this.im0504mm = json.getString("im0504mm");
                this.im0504yy = json.getString("im0504yy");
                this.im0505dd = json.getString("im0505dd");
                this.im0505mm = json.getString("im0505mm");
                this.im0505yy = json.getString("im0505yy");
                this.im0506dd = json.getString("im0506dd");
                this.im0506mm = json.getString("im0506mm");
                this.im0506yy = json.getString("im0506yy");
                this.im0507dd = json.getString("im0507dd");
                this.im0507mm = json.getString("im0507mm");
                this.im0507yy = json.getString("im0507yy");
                this.im0508dd = json.getString("im0508dd");
                this.im0508mm = json.getString("im0508mm");
                this.im0508yy = json.getString("im0508yy");
                this.im0509dd = json.getString("im0509dd");
                this.im0509mm = json.getString("im0509mm");
                this.im0509yy = json.getString("im0509yy");
                this.im0510dd = json.getString("im0510dd");
                this.im0510mm = json.getString("im0510mm");
                this.im0510yy = json.getString("im0510yy");
                this.im0511dd = json.getString("im0511dd");
                this.im0511mm = json.getString("im0511mm");
                this.im0511yy = json.getString("im0511yy");
                this.im0512dd = json.getString("im0512dd");
                this.im0512mm = json.getString("im0512mm");
                this.im0512yy = json.getString("im0512yy");
                this.im0513dd = json.getString("im0513dd");
                this.im0513mm = json.getString("im0513mm");
                this.im0513yy = json.getString("im0513yy");
                this.im0514dd = json.getString("im0514dd");
                this.im0514mm = json.getString("im0514mm");
                this.im0514yy = json.getString("im0514yy");
                this.im0515dd = json.getString("im0515dd");
                this.im0515mm = json.getString("im0515mm");
                this.im0515yy = json.getString("im0515yy");
                this.im0516dd = json.getString("im0516dd");
                this.im0516mm = json.getString("im0516mm");
                this.im0516yy = json.getString("im0516yy");
                this.im07 = json.getString("im07");
                this.im08 = json.getString("im08");
                this.im08a = json.getString("im08a");
                this.im08b = json.getString("im08b");
                this.im09 = json.getString("im09");
                this.im10 = json.getString("im10");
                this.im11 = json.getString("im11");
                this.im12 = json.getString("im12");
                this.im1201x = json.getString("im1201x");
                this.im12a = json.getString("im12a");
                this.im12a1x = json.getString("im12a1x");
                this.im13 = json.getString("im13");
                this.im14 = json.getString("im14");
                this.im15 = json.getString("im15");
                this.im1501 = json.getString("im1501");
                this.im16 = json.getString("im16");
                this.im17 = json.getString("im17");
                this.im1701 = json.getString("im1701");
                this.im18 = json.getString("im18");
                this.im19 = json.getString("im19");
                this.im1901x = json.getString("im1901x");
                this.im20 = json.getString("im20");
                this.im21 = json.getString("im21");
                this.im22 = json.getString("im22");
                this.im2201 = json.getString("im2201");
                this.im23 = json.getString("im23");
                this.im2306x = json.getString("im2306x");
                this.im23a = json.getString("im23a");
                this.im23a96x = json.getString("im23a96x");
                this.im23b1 = json.getString("im23b1");
                this.im23b2 = json.getString("im23b2");
                this.im24 = json.getString("im24");
                this.im2496x = json.getString("im2496x");
                this.im25 = json.getString("im25");
                this.imdate = json.getString("imdate");
                this.photoFront = json.getString("photoFront");
                this.photoBack = json.getString("photoBack");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}
