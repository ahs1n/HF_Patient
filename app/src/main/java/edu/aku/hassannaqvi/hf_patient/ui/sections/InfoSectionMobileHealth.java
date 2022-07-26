package edu.aku.hassannaqvi.hf_patient.ui.sections;

import static edu.aku.hassannaqvi.hf_patient.core.MainApp.form;
import static edu.aku.hassannaqvi.hf_patient.core.MainApp.patientDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.hf_patient.R;
import edu.aku.hassannaqvi.hf_patient.contracts.PDContract;
import edu.aku.hassannaqvi.hf_patient.core.MainApp;
import edu.aku.hassannaqvi.hf_patient.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient.databinding.ActivityInfoMobileHealthR2Binding;
import edu.aku.hassannaqvi.hf_patient.models.PatientDetails;
import edu.aku.hassannaqvi.hf_patient.utils.AppUtilsKt;
import edu.aku.hassannaqvi.hf_patient.utils.EndSectionActivity;

public class InfoSectionMobileHealth extends AppCompatActivity implements EndSectionActivity {

    ActivityInfoMobileHealthR2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_info_mobile_health_r2);
        bi.setCallback(this);
        setupSkips();

    }

    private void setupSkips() {
    }


    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.dbHelper;
        long updcount = db.addMH(patientDetails);
        patientDetails.setId(String.valueOf(updcount));
        if (updcount > 0) {
            patientDetails.setUid(patientDetails.getDeviceId() + patientDetails.getId());
            long count = db.updatesMHColumn(PDContract.MHTable.COLUMN_UID, patientDetails.getUid());
            return true;
        } else {
            Toast.makeText(this, "SORRY!! Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void saveDraft() {

        patientDetails = new PatientDetails();
        patientDetails.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
       /* mobileHealth.setUuid(MainApp.form.getUid());
        mobileHealth.setUserName(MainApp.user.getUserName());
        mobileHealth.setDcode(MainApp.form.getDcode());
        mobileHealth.setUcode(MainApp.form.getUcode());
        mobileHealth.setCluster(MainApp.form.getCluster());
        mobileHealth.setHhno(MainApp.form.getHhno());
        mobileHealth.setDeviceId(MainApp.appInfo.getDeviceID());
        mobileHealth.setDeviceTag(MainApp.appInfo.getTagName());
        mobileHealth.setAppver(MainApp.appInfo.getAppVersion());*/

        patientDetails.setSs101(bi.ss101.getText().toString().trim().isEmpty() ? "-1" : bi.ss101.getText().toString());
        patientDetails.setSs102(bi.ss102.getText().toString().trim().isEmpty() ? "-1" : bi.ss102.getText().toString());
        patientDetails.setSs103(bi.ss103.getText().toString().trim().isEmpty() ? "-1" : bi.ss103.getText().toString());
        patientDetails.setSs104(bi.ss104.getText().toString().trim().isEmpty() ? "-1" : bi.ss104.getText().toString());
        //mobileHealth.setSs105(bi.ss105.getText().toString().trim().isEmpty() ? "-1" : bi.ss105.getText().toString());

    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, InfoSectionMobileHealth.class));
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);

    }

    public void BtnEnd(View view) {
        AppUtilsKt.contextEndActivity(this);
    }

    @Override
    public void endSecActivity(boolean flag) {
        saveDraft();
        form.setHhflag("2");
        if (UpdateDB()) {
            finish();
        }
    }
}