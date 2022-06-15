package edu.aku.hassannaqvi.hf_patient.models;

import android.database.Cursor;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.GsonBuilder;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.threeten.bp.LocalDate;

import java.io.Serializable;

import edu.aku.hassannaqvi.hf_patient.BR;
import edu.aku.hassannaqvi.hf_patient.contracts.ChildInformationContract;
import edu.aku.hassannaqvi.hf_patient.core.MainApp;

public class ChildInformation extends BaseObservable implements Serializable {

    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    private String id;
    private String uid;
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
    private String status;
    private String synced;
    private String syncDate;
    private String isSelected = "0";

    // SECTION VARIABLES
    private String scb;

    // FIELD VARIABLES
    private String cb01 = StringUtils.EMPTY;
    private String cb02 = StringUtils.EMPTY;
    private String cb03 = StringUtils.EMPTY;
    private String cb04dd = StringUtils.EMPTY;
    private String cb04mm = StringUtils.EMPTY;
    private String cb04yy = StringUtils.EMPTY;
    private String cb0501 = StringUtils.EMPTY;
    private String cb0502 = StringUtils.EMPTY;
    private String cb06 = StringUtils.EMPTY;
    private String cb07 = StringUtils.EMPTY;
    private String cb08 = StringUtils.EMPTY;
    private String cb09 = StringUtils.EMPTY;
    private String cb10 = StringUtils.EMPTY;
    private String cb1096x = StringUtils.EMPTY;
    private String cb11 = StringUtils.EMPTY;
    private String cb12 = StringUtils.EMPTY;
    private String cb13 = StringUtils.EMPTY;
    private String cb14 = StringUtils.EMPTY;
    private String cb1496x = StringUtils.EMPTY;
    private String cb15 = StringUtils.EMPTY;
    private String cb1598 = StringUtils.EMPTY;
    private String cb16 = StringUtils.EMPTY;
    private String cb17 = StringUtils.EMPTY;

    //Not saving in db
    private boolean flag = true,
            motherAvailable = true,
            under35 = false,
            editFlag = false;
    private int totalMonths = 0;
    private Child childTableDataExist = null;
    private LocalDate calculatedDOB = null;

    public ChildInformation() {
    }

    public ChildInformation(String serial) {
        cb01 = serial;
    }

    public ChildInformation(String serial, boolean flag, ChildInformation child) {
        cb01 = serial;
        this.flag = flag;

        this.cb06 = child.getCb06();
        this.cb07 = child.getCb07();
        this.cb08 = child.getCb08();
        this.cb09 = child.getCb09();
        this.cb10 = child.getCb10();
        this.cb11 = child.getCb11();
        this.cb12 = child.getCb12();
        this.cb13 = child.getCb13();
        this.cb14 = child.getCb14();

    }

    public boolean isEditFlag() {
        return editFlag;
    }

    public void setEditFlag(boolean editFlag) {
        this.editFlag = editFlag;
    }

    public int getTotalMonths() {
        return totalMonths;
    }

    public void setTotalMonths(int totalMonths) {
        this.totalMonths = totalMonths;
    }

    public LocalDate getCalculatedDOB() {
        return calculatedDOB;
    }

    public void setCalculatedDOB(LocalDate calculatedDOB) {
        this.calculatedDOB = calculatedDOB;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isMotherAvailable() {
        return motherAvailable;
    }

    public void setMotherAvailable(boolean motherAvailable) {
        this.motherAvailable = motherAvailable;
    }

    public boolean isUnder35() {
        return under35;
    }

    public void setUnder35(boolean under35) {
        this.under35 = under35;
    }

    public Child getChildTableDataExist() {
        return childTableDataExist;
    }

    public void setChildTableDataExist(Child childTableDataExist) {
        this.childTableDataExist = childTableDataExist;
    }

    public String getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
    }

    @Bindable
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        if (!projectName.equals(projectName))
            this.projectName = projectName;
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

    public ChildInformation setUid(String uid) {
        this.uid = uid;
        return this;
    }


    @Bindable
    public String getUuid() {
        return uuid;
    }

    public ChildInformation setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }


    @Bindable
    public String getUserName() {
        return userName;
    }

    public ChildInformation setUserName(String userName) {
        this.userName = userName;
        return this;
    }


    @Bindable
    public String getDcode() {
        return dcode;
    }

    public ChildInformation setDcode(String dcode) {
        this.dcode = dcode;
        return this;
    }


    @Bindable
    public String getUcode() {
        return ucode;
    }

    public ChildInformation setUcode(String ucode) {
        this.ucode = ucode;
        return this;
    }


    @Bindable
    public String getCluster() {
        return cluster;
    }

    public ChildInformation setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }


    @Bindable
    public String getHhno() {
        return hhno;
    }

    public ChildInformation setHhno(String hhno) {
        this.hhno = hhno;
        return this;
    }


    @Bindable
    public String getDeviceId() {
        return deviceId;
    }

    public ChildInformation setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Bindable
    public String getDeviceTag() {
        return deviceTag;
    }

    public ChildInformation setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }

    @Bindable
    public String getAppver() {
        return appver;
    }

    public ChildInformation setAppver(String appver) {
        this.appver = appver;
        return this;
    }

    @Bindable
    public String getSysDate() {
        return sysDate;
    }

    public ChildInformation setSysDate(String sysDate) {
        this.sysDate = sysDate;
        return this;
    }

    @Bindable
    public String getEndTime() {
        return endTime;
    }

    public ChildInformation setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    @Bindable
    public String getSynced() {
        return synced;
    }

    public ChildInformation setSynced(String synced) {
        this.synced = synced;
        return this;
    }

    @Bindable
    public String getSyncDate() {
        return syncDate;
    }

    public ChildInformation setSyncDate(String syncDate) {
        this.syncDate = syncDate;
        return this;
    }


    public String getScb() {
        return scb;
    }

    public ChildInformation setScb(String scb) {
        this.scb = scb;
        return this;
    }


    @Bindable
    public String getCb01() {
        return cb01;
    }

    public void setCb01(String cb01) {
        this.cb01 = cb01;
        notifyPropertyChanged(BR.cb01);
    }

    @Bindable
    public String getCb02() {
        return cb02;
    }

    public void setCb02(String cb02) {
        this.cb02 = cb02;
        notifyPropertyChanged(BR.cb02);
    }

    @Bindable
    public String getCb03() {
        return cb03;
    }

    public void setCb03(String cb03) {
        this.cb03 = cb03;
        notifyPropertyChanged(BR.cb03);
    }

    @Bindable
    public String getCb04dd() {
        return cb04dd;
    }

    public void setCb04dd(String cb04dd) {
        this.cb04dd = cb04dd;
        notifyPropertyChanged(BR.cb04dd);
    }

    @Bindable
    public String getCb04mm() {
        return cb04mm;
    }

    public void setCb04mm(String cb04mm) {
        this.cb04mm = cb04mm;
        notifyPropertyChanged(BR.cb04mm);
    }

    @Bindable
    public String getCb04yy() {
        return cb04yy;
    }

    public void setCb04yy(String cb04yy) {
        this.cb04yy = cb04yy;
        notifyPropertyChanged(BR.cb04yy);
    }

    @Bindable
    public String getCb0501() {
        return cb0501;
    }

    public void setCb0501(String cb0501) {
        this.cb0501 = cb0501;
        notifyPropertyChanged(BR.cb0501);
    }

    @Bindable
    public String getCb0502() {
        return cb0502;
    }

    public void setCb0502(String cb0502) {
        this.cb0502 = cb0502;
        notifyPropertyChanged(BR.cb0502);
    }

    @Bindable
    public String getCb06() {
        return cb06;
    }

    public void setCb06(String cb06) {
        this.cb06 = cb06;
        notifyPropertyChanged(BR.cb06);
    }

    @Bindable
    public String getCb07() {
        return cb07;
    }

    public void setCb07(String cb07) {
        this.cb07 = cb07;
        notifyPropertyChanged(BR.cb07);
    }

    @Bindable
    public String getCb08() {
        return cb08;
    }

    public void setCb08(String cb08) {
        this.cb08 = cb08;
        notifyPropertyChanged(BR.cb08);
    }

    @Bindable
    public String getCb09() {
        return cb09;
    }

    public void setCb09(String cb09) {
        this.cb09 = cb09;
        notifyPropertyChanged(BR.cb09);
    }

    @Bindable
    public String getCb10() {
        return cb10;
    }

    public void setCb10(String cb10) {
        this.cb10 = cb10;
        notifyPropertyChanged(BR.cb10);
    }


    @Bindable
    public String getCb1096x() {
        return cb1096x;
    }

    public void setCb1096x(String cb1096x) {
        this.cb1096x = cb1096x;
        notifyPropertyChanged(BR.cb1096x);
    }


    @Bindable
    public String getCb11() {
        return cb11;
    }

    public void setCb11(String cb11) {
        this.cb11 = cb11;
        notifyPropertyChanged(BR.cb11);
    }

    @Bindable
    public String getCb12() {
        return cb12;
    }

    public void setCb12(String cb12) {
        this.cb12 = cb12;
        notifyPropertyChanged(BR.cb12);
    }

    @Bindable
    public String getCb13() {
        return cb13;
    }

    public void setCb13(String cb13) {
        this.cb13 = cb13;
        notifyPropertyChanged(BR.cb13);
    }

    @Bindable
    public String getCb14() {
        return cb14;
    }

    public void setCb14(String cb14) {
        this.cb14 = cb14;
        notifyPropertyChanged(BR.cb14);
    }


    @Bindable
    public String getCb1496x() {
        return cb1496x;
    }

    public void setCb1496x(String cb1496x) {
        this.cb1496x = cb1496x;
        notifyPropertyChanged(BR.cb14);
    }

    @Bindable
    public String getCb15() {
        return cb15;
    }

    public void setCb15(String cb15) {
        this.cb15 = cb15;
        notifyPropertyChanged(BR.cb15);
    }

    @Bindable
    public String getCb1598() {
        return cb1598;
    }

    public void setCb1598(String cb1598) {
        this.cb1598 = cb1598;
        notifyPropertyChanged(BR.cb1598);
    }

    @Bindable
    public String getCb16() {
        return cb16;
    }

    public void setCb16(String cb16) {
        this.cb16 = cb16;
        notifyPropertyChanged(BR.cb16);
    }

    @Bindable
    public String getCb17() {
        return cb17;
    }


    public void setCb17(String cb17) {
        this.cb17 = cb17;
        notifyPropertyChanged(BR.cb17);
    }


    @Bindable
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyPropertyChanged(BR.status);
    }


    public ChildInformation Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_ID);
        this.uid = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_UID);
        this.uuid = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_UUID);
        this.userName = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_USERNAME);
        this.sysDate = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_SYSDATE);
        this.dcode = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_DCODE);
        this.ucode = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_UCODE);
        this.cluster = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_CLUSTER);
        this.hhno = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_HHNO);
        this.deviceId = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_DEVICEID);
        this.deviceTag = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_DEVICETAGID);
        this.appver = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_APPVERSION);
        this.synced = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_SYNCED);
        this.syncDate = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_SYNCED_DATE);
        this.status = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_STATUS);
        this.isSelected = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_ISSELECTED);

        this.scb = jsonObject.getString(ChildInformationContract.ChildInfoTable.COLUMN_SCB);

        return this;

    }


    public ChildInformation Hydrate(Cursor cursor) {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_UUID));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_SYSDATE));
        this.dcode = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_DCODE));
        this.ucode = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_UCODE));
        this.cluster = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_CLUSTER));
        this.hhno = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_HHNO));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_SYNCED_DATE));
        this.status = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_STATUS));
        this.isSelected = cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_ISSELECTED));

        //For childCount
        //this.s01HH = cursor.getString(cursor.getColumnIndexOrThrow(ChildContract.ChildTable.COLUMN_S01HH));

        sCBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(ChildInformationContract.ChildInfoTable.COLUMN_SCB)));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, ChildInformation.class);
    }


    public String sCBtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("cb01", cb01)
                    .put("cb02", cb02)
                    .put("cb03", cb03)
                    .put("cb04dd", cb04dd)
                    .put("cb04mm", cb04mm)
                    .put("cb04yy", cb04yy)
                    .put("cb0501", cb0501)
                    .put("cb0502", cb0502)
                    .put("cb06", cb06)
                    .put("cb07", cb07)
                    .put("cb08", cb08)
                    .put("cb09", cb09)
                    .put("cb10", cb10)
                    .put("cb1096x", cb1096x)
                    .put("cb11", cb11)
                    .put("cb12", cb12)
                    .put("cb13", cb13)
                    .put("cb14", cb14)
                    .put("cb1496x", cb1496x)
                    .put("cb15", cb15)
                    .put("cb1598", cb1598)
                    .put("cb16", cb16)
                    .put("cb17", cb17);

        } catch (JSONException e) {
            e.printStackTrace();
            return "\"error\":, \"" + e.getMessage() + "\"";
        }
        return json.toString();
    }


    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_UID, this.uid == null ? JSONObject.NULL : this.uid);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_UUID, this.uuid == null ? JSONObject.NULL : this.uuid);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_SYSDATE, this.sysDate == null ? JSONObject.NULL : this.sysDate);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_DCODE, this.dcode == null ? JSONObject.NULL : this.dcode);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_UCODE, this.ucode == null ? JSONObject.NULL : this.ucode);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_CLUSTER, this.cluster == null ? JSONObject.NULL : this.cluster);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_HHNO, this.hhno == null ? JSONObject.NULL : this.hhno);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_DEVICEID, this.deviceId == null ? JSONObject.NULL : this.deviceId);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_DEVICETAGID, this.deviceTag == null ? JSONObject.NULL : this.deviceTag);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_APPVERSION, this.appver == null ? JSONObject.NULL : this.appver);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_SYNCED_DATE, this.syncDate == null ? JSONObject.NULL : this.syncDate);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_STATUS, this.status == null ? JSONObject.NULL : this.status);
            json.put(ChildInformationContract.ChildInfoTable.COLUMN_ISSELECTED, this.isSelected == null ? JSONObject.NULL : this.isSelected);

            json.put(ChildInformationContract.ChildInfoTable.COLUMN_SCB, new JSONObject(sCBtoString()));

            if (this.scb != null && !this.scb.equals("")) {
                json.put(ChildInformationContract.ChildInfoTable.COLUMN_SCB, new JSONObject(this.scb));
            }

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    private void sCBHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = null;
                json = new JSONObject(string);

                this.cb01 = json.getString("cb01");
                this.cb02 = json.getString("cb02");
                this.cb03 = json.getString("cb03");
                this.cb04dd = json.getString("cb04dd");
                this.cb04mm = json.getString("cb04mm");
                this.cb04yy = json.getString("cb04yy");
                this.cb0501 = json.getString("cb0501");
                this.cb0502 = json.getString("cb0502");
                this.cb06 = json.getString("cb06");
                this.cb07 = json.getString("cb07");
                this.cb08 = json.getString("cb08");
                this.cb09 = json.getString("cb09");
                this.cb10 = json.getString("cb10");
                this.cb1096x = json.getString("cb1096x");
                this.cb11 = json.getString("cb11");
                this.cb12 = json.getString("cb12");
                this.cb13 = json.getString("cb13");
                this.cb14 = json.getString("cb14");
                this.cb1496x = json.getString("cb1496x");
                this.cb15 = json.getString("cb15");
                this.cb1598 = json.getString("cb1598");
                this.cb16 = json.getString("cb16");
                this.cb17 = json.getString("cb17");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
