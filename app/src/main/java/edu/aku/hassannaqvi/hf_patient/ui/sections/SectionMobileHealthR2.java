package edu.aku.hassannaqvi.hf_patient.ui.sections;

import static edu.aku.hassannaqvi.hf_patient.core.MainApp.patientDetails;
import static edu.aku.hassannaqvi.hf_patient.utils.extension.ActivityExtKt.gotoActivity;
import static edu.aku.hassannaqvi.hf_patient.utils.extension.ActivityExtKt.gotoActivityWithPutExtra;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.gson.Gson;
import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import edu.aku.hassannaqvi.hf_patient.R;
import edu.aku.hassannaqvi.hf_patient.contracts.PDContract;
import edu.aku.hassannaqvi.hf_patient.core.MainApp;
import edu.aku.hassannaqvi.hf_patient.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient.databinding.ActivityMobileHealthR2Binding;
import edu.aku.hassannaqvi.hf_patient.models.Camps;
import edu.aku.hassannaqvi.hf_patient.models.Doctor;
import edu.aku.hassannaqvi.hf_patient.models.PatientDetails;
import edu.aku.hassannaqvi.hf_patient.ui.MainActivity;
import edu.aku.hassannaqvi.hf_patient.utils.AppUtilsKt;
import edu.aku.hassannaqvi.hf_patient.utils.DateUtils;
import edu.aku.hassannaqvi.hf_patient.utils.EndSectionActivity;
import edu.aku.hassannaqvi.hf_patient.utils.shared.SharedStorage;

public class SectionMobileHealthR2 extends AppCompatActivity implements EndSectionActivity {

    private final boolean AllVaccinationsViewed = false;
    ActivityMobileHealthR2Binding bi;
    private String patientType;
    private List<String> campNo;
    private DatabaseHelper db;
    private ArrayList<String> doctorNames, doctorCodes;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_mobile_health_r2);
        bi.setCallback(this);
        setSupportActionBar(bi.toolbar);

        /*
         * Get camp data and set it to xml
         * */
        Camps camp = new Gson().fromJson(SharedStorage.INSTANCE.getSelectedFacilityData(this), Camps.class);
        bi.setCamps(camp);

        db = MainApp.appInfo.dbHelper;
        //populateSpinner(camp.getIdCamp());  // Populate Doctors' Name
//        bi.ss101.setMinDate(convertDateFormat(camp.getPlan_date()));
        setupSkips();
        populateSpinner();

        bi.ss101.setMinDate(DateUtils.getMonthsBack("dd/MM/yyyy", -4));
    }

    private void populateSpinner() {

        Collection<Doctor> doctors = db.getDoctorsByUC(MainApp.user.getUcCode());

        doctorNames = new ArrayList<>();
        doctorCodes = new ArrayList<>();
        doctorNames.add("...");
        doctorCodes.add("...");

        for (Doctor dc : doctors) {
            doctorNames.add(dc.getStaff_name());
            doctorCodes.add(dc.getIddoctor());
        }

        if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {
            doctorNames.add("Test Doctor 1");
            doctorNames.add("Test Doctor 2");
            doctorNames.add("Test Doctor 3");

            doctorCodes.add("001");
            doctorCodes.add("002");
            doctorCodes.add("003");
        }
        // Apply the adapter to the spinner
        bi.pc201a.setAdapter(new ArrayAdapter<>(SectionMobileHealthR2.this, R.layout.custom_spinner, doctorNames));

        bi.pc201a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0) {
                    MainApp.selectedDoctorName = (doctorNames.get(bi.pc201a.getSelectedItemPosition()));
//                    mobileHealth.setPc201a(MainApp.selectedDoctorName);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
    }


    private void setupSkips() {

        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == bi.ss10801.getId()) {
                Clear.clearAllFields(bi.fldGrpCVss109);
                bi.fldGrpCVss109.setVisibility(View.GONE);
                Clear.clearAllFields(bi.fldGrpCVvs301);
                bi.fldGrpCVvs301.setVisibility(View.GONE);
            } else {
                if (TextUtils.isEmpty(bi.ss107y.getText().toString())) {
                    return;
                } else if (Integer.parseInt(bi.ss107y.getText().toString()) >= 14) {
                    bi.fldGrpCVss109.setVisibility(View.VISIBLE);
                    bi.fldGrpCVvs301.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.ss108a.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVss109));
        bi.ss108a.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVss111));

        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVss109));
        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVss111));
        bi.ss108.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVvs301));

        bi.vs307.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVvs308));

        bi.vs30699.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.vs306check, !b));
//        bi.vs30699.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.vs306check, !b));

        bi.ss11099.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss110, !b));
        bi.ss11199.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.ss111check, !b));
        bi.pc20199.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.pc201check, !b));
        bi.di20299.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.di202check, !b));
        bi.me20399.setOnCheckedChangeListener((compoundButton, b) -> Clear.clearAllFields(bi.me203check, !b));

        bi.ss111c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if (isChecked) {
                    bi.fldGrpCVvs306v.setVisibility(View.VISIBLE);
                    bi.fldGrpCVvs307.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrpCVvs306v.setVisibility(View.GONE);
                    bi.fldGrpCVvs307.setVisibility(View.GONE);
                    Clear.clearAllFields(bi.fldGrpCVvs306v);
                    Clear.clearAllFields(bi.fldGrpCVvs307);
                    bi.bcg.setTag(null);
                    bi.penta.setTag(null);
                    bi.measles.setTag(null);
                    bi.dpt.setTag(null);
                    bi.opv.setTag(null);
                    bi.pcv.setTag(null);
                    bi.rota.setTag(null);
                    bi.hepb.setTag(null);
                    bi.tcv.setTag(null);
                    bi.ipv.setTag(null);
                    bi.bcg.setChecked(false);
                    bi.dpt.setChecked(false);
                    bi.hepb.setChecked(false);
                    bi.tcv.setChecked(false);
                }
            }
        });


        setTags(bi.bcg, new View[]{bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.penta, new View[]{bi.bcg, bi.measles, bi.opv, bi.pcv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.measles, new View[]{bi.bcg, bi.penta, bi.opv, bi.pcv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.dpt, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.ipv, bi.hepb, bi.tcv});
        setTags(bi.opv, new View[]{bi.bcg, bi.penta, bi.measles, bi.pcv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.pcv, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.rota, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.rota, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.ipv, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.ipv, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.dpt, bi.hepb, bi.tcv});
        setTags(bi.hepb, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.dpt, bi.ipv, bi.tcv});
        setTags(bi.tcv, new View[]{bi.bcg, bi.penta, bi.measles, bi.opv, bi.pcv, bi.rota, bi.dpt, bi.ipv, bi.hepb});

    }

    public void ss107yOnTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(bi.ss107y.getText().toString()))
            return;

        Clear.clearAllFields(bi.fldGrpCVss108);

        int age = Integer.parseInt(bi.ss107y.getText().toString());

        if (age >= 5) {
            Clear.clearAllFields(bi.fldGrpCVdi202);
            bi.fldGrpCVdi202.setVisibility(View.GONE);
            Clear.clearAllFields(bi.fldGrpU5);
            bi.fldGrpU5.setVisibility(View.GONE);
        } else {
            bi.fldGrpCVdi202.setVisibility(View.VISIBLE);
            bi.fldGrpU5.setVisibility(View.VISIBLE);
        }

        if (age < 5) {
            Clear.clearAllFields(bi.fldGrpCVpc201);
            bi.fldGrpCVpc201.setVisibility(View.GONE);
        } else {
            bi.fldGrpCVpc201.setVisibility(View.VISIBLE);
        }

        if (age < 14) {
            Clear.clearAllFields(bi.fldGrpCVss109);
            bi.fldGrpCVss109.setVisibility(View.GONE);
            Clear.clearAllFields(bi.fldGrpCVvs301);
            bi.fldGrpCVvs301.setVisibility(View.GONE);
        } else {
            bi.fldGrpCVss109.setVisibility(View.VISIBLE);
            bi.fldGrpCVvs301.setVisibility(View.VISIBLE);
        }

        if (age < 13) {
//            Clear.clearAllFields(bi.fldGrpCVss108a);
            bi.ss1082.setChecked(true);
            bi.fldGrpCVss108a.setVisibility(View.GONE);
        } else {
            Clear.clearAllFields(bi.fldGrpCVss108a);
            bi.fldGrpCVss108a.setVisibility(View.VISIBLE);
        }
    }

    public void setTags(RadioGroup rg, View[] views) {
        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            for (View view : views) view.setTag("-1");
        });
    }

    public void setTags(RadioButton rb, View[] views) {
        rb.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) for (View view : views) view.setTag("-1");
        });
    }


    public void segregateByAge(CharSequence s, int i, int i1, int i2) {
        segregate();
    }


    public void segregateByGender(RadioGroup radioGroup, int i) {
        segregate();
    }


    public void segregate() {
       /* if (TextUtils.isEmpty(bi.mh09d.getText()) || TextUtils.isEmpty(bi.mh09m.getText()) || TextUtils.isEmpty(bi.mh09y.getText()) || bi.mh010.getCheckedRadioButtonId() == -1)
            return;
        int age = Integer.parseInt(bi.mh09d.getText().toString()) + (Integer.parseInt(bi.mh09m.getText().toString()) * 29) + (Integer.parseInt(bi.mh09y.getText().toString()) * 365);

       *//* bi.mh012.setMinvalue(15f);
        bi.mh012.setMaxvalue(250f);*//*
        bi.mh012.setMask("###.#");
        bi.mh012.setHint("###.#");
        Clear.clearAllFields(bi.fldGrpCVmh010a);
        Clear.clearAllFields(bi.fldGrpCVmh017);
        Clear.clearAllFields(bi.llmh020);
        Clear.clearAllFields(bi.fldGrpCVmh015);
        Clear.clearAllFields(bi.fldGrpCVmh016);
        Clear.clearAllFields(bi.fldGrpCVmh018);
        Clear.clearAllFields(bi.llchild);
        bi.mh02601.setChecked(false);
        bi.mh026019.setChecked(false);
        bi.fldGrpCVmh010a.setVisibility(View.GONE);
        bi.fldGrpCVmh017.setVisibility(View.GONE);
        bi.llmh020.setVisibility(View.GONE);
        bi.fldGrpCVmh015.setVisibility(View.GONE);
        bi.fldGrpCVmh016.setVisibility(View.GONE);
        bi.fldGrpCVmh018.setVisibility(View.GONE);
        bi.llchild.setVisibility(View.GONE);
        patientType = "General";

        if (age >= 5110 && age < 18250 && bi.mh01002.isChecked()) {
            bi.fldGrpCVmh017.setVisibility(View.VISIBLE);
            bi.llmh020.setVisibility(View.VISIBLE);
            patientType = "MWRA";
        }
        if (age >= 5110) {
            bi.fldGrpCVmh010a.setVisibility(View.VISIBLE);
        }
        if (age <= 1825) {
            bi.fldGrpCVmh015.setVisibility(View.VISIBLE);
            bi.fldGrpCVmh016.setVisibility(View.VISIBLE);
            bi.fldGrpCVmh018.setVisibility(View.VISIBLE);
            bi.llchild.setVisibility(View.VISIBLE);
            bi.mh012.setMinvalue(0.9f);
            bi.mh012.setMaxvalue(58f);
            bi.mh012.setMask("###.#");
            bi.mh012.setHint("###.#");
            patientType = "Child";
        }*/
    }


    private boolean UpdateDB() {
        long updcount = db.addMH(patientDetails);
        patientDetails.setId(String.valueOf(updcount));
        if (updcount > 0) {
            patientDetails.setUid(patientDetails.getDeviceId() + patientDetails.getId());
            long count = db.updatesMHColumn(PDContract.MHTable.COLUMN_UID, patientDetails.getUid());
            if (count > 0)
                count = db.updatesMHColumn(PDContract.MHTable.COLUMN_SA, patientDetails.sAtoString());
            if (count > 0) return true;
            else {
                Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
                return false;
            }
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private void saveDraft() {

        patientDetails = new PatientDetails();
        patientDetails.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        patientDetails.setUserName(MainApp.user.getUserName());
        patientDetails.setDeviceId(MainApp.appInfo.getDeviceID());
        patientDetails.setDeviceTag(MainApp.appInfo.getTagName());
        patientDetails.setAppver(MainApp.appInfo.getAppVersion());


        patientDetails.setSs101(bi.ss101.getText().toString());
        patientDetails.setSs102(bi.ss102.getText().toString());
        patientDetails.setSs103(bi.ss103.getText().toString());
        patientDetails.setSs104(bi.ss104.getText().toString());
        patientDetails.setSs105(bi.ss105.getText().toString());
        patientDetails.setSs106(bi.ss106.getText().toString());
        patientDetails.setSs107(bi.ss107y.getText().toString() + "-" + bi.ss107m.getText().toString() + "-" + bi.ss107d.getText().toString());
        patientDetails.setSs107y(bi.ss107y.getText().toString());
        patientDetails.setSs107m(bi.ss107m.getText().toString());
        patientDetails.setSs107d(bi.ss107d.getText().toString());
        patientDetails.setSs108(bi.ss10801.isChecked() ? "1"
                : bi.ss10802.isChecked() ? "2"
                : "-1");
        patientDetails.setSs108a(bi.ss1081.isChecked() ? "1"
                : bi.ss1082.isChecked() ? "2"
                : bi.ss1083.isChecked() ? "3"
                : "-1");
        patientDetails.setSs109(bi.ss109a.isChecked() ? "1"
                : bi.ss109b.isChecked() ? "2"
                : bi.ss10999.isChecked() ? "99"
                : "-1");
        patientDetails.setSs110(bi.ss110.getText().toString());
        patientDetails.setSs11099(bi.ss11099.isChecked() ? "99" : "-1");
        patientDetails.setSs111a(bi.ss111a.isChecked() ? "1" : "-1");
        patientDetails.setSs111b(bi.ss111b.isChecked() ? "2" : "-1");
        patientDetails.setSs111c(bi.ss111c.isChecked() ? "3" : "-1");
        patientDetails.setSs111d(bi.ss111d.isChecked() ? "4" : "-1");
        patientDetails.setSs11199(bi.ss11199.isChecked() ? "99" : "-1");
        patientDetails.setPc201a(bi.pc201a.getSelectedItem().toString());
        patientDetails.setPc20101(bi.pc20101.isChecked() ? "1" : "-1");
        patientDetails.setPc20102(bi.pc20102.isChecked() ? "2" : "-1");
        patientDetails.setPc20103(bi.pc20103.isChecked() ? "3" : "-1");
        patientDetails.setPc20104(bi.pc20104.isChecked() ? "4" : "-1");
        patientDetails.setPc20105(bi.pc20105.isChecked() ? "5" : "-1");
        patientDetails.setPc20106(bi.pc20106.isChecked() ? "6" : "-1");
        patientDetails.setPc20107(bi.pc20107.isChecked() ? "7" : "-1");
        patientDetails.setPc20108(bi.pc20108.isChecked() ? "8" : "-1");
        patientDetails.setPc20109(bi.pc20109.isChecked() ? "9" : "-1");
        patientDetails.setPc20110(bi.pc20110.isChecked() ? "10" : "-1");
        patientDetails.setPc20111(bi.pc20111.isChecked() ? "11" : "-1");
        patientDetails.setPc20112(bi.pc20112.isChecked() ? "12" : "-1");
        patientDetails.setPc20113(bi.pc20113.isChecked() ? "13" : "-1");
        patientDetails.setPc20114(bi.pc20114.isChecked() ? "14" : "-1");
        patientDetails.setPc20115(bi.pc20115.isChecked() ? "15" : "-1");
        patientDetails.setPc20116(bi.pc20116.isChecked() ? "16" : "-1");
        patientDetails.setPc20117(bi.pc20117.isChecked() ? "17" : "-1");
        patientDetails.setPc20118(bi.pc20118.isChecked() ? "18" : "-1");
        patientDetails.setPc20119(bi.pc20119.isChecked() ? "19" : "-1");
        patientDetails.setPc20196(bi.pc20196.isChecked() ? "20" : "-1");
        patientDetails.setPc20196x(bi.pc20196x.getText().toString());
        patientDetails.setPc20199(bi.pc20199.isChecked() ? "99" : "-1");
        patientDetails.setDi20201(bi.di20201.isChecked() ? "1" : "-1");
        patientDetails.setDi20202(bi.di20202.isChecked() ? "2" : "-1");
        patientDetails.setDi20203(bi.di20203.isChecked() ? "3" : "-1");
        patientDetails.setDi20204(bi.di20204.isChecked() ? "4" : "-1");
        patientDetails.setDi20205(bi.di20205.isChecked() ? "5" : "-1");
        patientDetails.setDi20206(bi.di20206.isChecked() ? "6" : "-1");
        patientDetails.setDi20207(bi.di20207.isChecked() ? "7" : "-1");
        patientDetails.setDi20208(bi.di20208.isChecked() ? "8" : "-1");
        patientDetails.setDi20209(bi.di20209.isChecked() ? "9" : "-1");
        patientDetails.setDi20210(bi.di20210.isChecked() ? "10" : "-1");
        patientDetails.setDi20211(bi.di20211.isChecked() ? "11" : "-1");
        patientDetails.setDi20212(bi.di20212.isChecked() ? "12" : "-1");
        patientDetails.setDi20213(bi.di20213.isChecked() ? "13" : "-1");
        patientDetails.setDi20214(bi.di20214.isChecked() ? "14" : "-1");
        patientDetails.setDi20215(bi.di20215.isChecked() ? "15" : "-1");
        patientDetails.setDi20216(bi.di20216.isChecked() ? "16" : "-1");
        patientDetails.setDi20217(bi.di20217.isChecked() ? "17" : "-1");
        patientDetails.setDi20218(bi.di20218.isChecked() ? "18" : "-1");
        patientDetails.setDi20219(bi.di20219.isChecked() ? "19" : "-1");
        patientDetails.setDi20296(bi.di20296.isChecked() ? "96" : "-1");
        patientDetails.setDi20296x(bi.di20296x.getText().toString());
        patientDetails.setDi20299(bi.di20299.isChecked() ? "99" : "-1");
        patientDetails.setMe20301(bi.me20301.isChecked() ? "1" : "-1");
        patientDetails.setMe20302(bi.me20302.isChecked() ? "2" : "-1");
        patientDetails.setMe20303(bi.me20303.isChecked() ? "3" : "-1");
        patientDetails.setMe20304(bi.me20304.isChecked() ? "4" : "-1");
        patientDetails.setMe20305(bi.me20305.isChecked() ? "5" : "-1");
        patientDetails.setMe20306(bi.me20306.isChecked() ? "6" : "-1");
        patientDetails.setMe20307(bi.me20307.isChecked() ? "7" : "-1");
        patientDetails.setMe20308(bi.me20308.isChecked() ? "8" : "-1");
        patientDetails.setMe20309(bi.me20309.isChecked() ? "9" : "-1");
        patientDetails.setMe20310(bi.me20310.isChecked() ? "10" : "-1");
        patientDetails.setMe20311(bi.me20311.isChecked() ? "11" : "-1");
        patientDetails.setMe20312(bi.me20312.isChecked() ? "12" : "-1");
        patientDetails.setMe20313(bi.me20313.isChecked() ? "13" : "-1");
        patientDetails.setMe20314(bi.me20314.isChecked() ? "14" : "-1");
        patientDetails.setMe20315(bi.me20315.isChecked() ? "15" : "-1");
        patientDetails.setMe20316(bi.me20316.isChecked() ? "16" : "-1");
        patientDetails.setMe20317(bi.me20317.isChecked() ? "17" : "-1");
        patientDetails.setMe20318(bi.me20318.isChecked() ? "18" : "-1");
        patientDetails.setMe20319(bi.me20319.isChecked() ? "19" : "-1");
        patientDetails.setMe20320(bi.me20320.isChecked() ? "20" : "-1");
        patientDetails.setMe20321(bi.me20321.isChecked() ? "21" : "-1");
        patientDetails.setMe20322(bi.me20322.isChecked() ? "22" : "-1");
        patientDetails.setMe20323(bi.me20323.isChecked() ? "23" : "-1");
        patientDetails.setMe20324(bi.me20324.isChecked() ? "24" : "-1");
        patientDetails.setMe20396(bi.me20396.isChecked() ? "96" : "-1");
        patientDetails.setMe20396x(bi.me20396x.getText().toString());
        patientDetails.setMe20399(bi.me20399.isChecked() ? "99" : "-1");
        patientDetails.setVs301(bi.vs301a.isChecked() ? "1"
                : bi.vs301b.isChecked() ? "2"
                : bi.vs30199.isChecked() ? "99"
                : "-1");
        patientDetails.setVs302(bi.vs302a.isChecked() ? "1"
                : bi.vs302b.isChecked() ? "2"
                : bi.vs30299.isChecked() ? "99"
                : "-1");
        patientDetails.setVs303(bi.vs303a.isChecked() ? "1"
                : bi.vs303b.isChecked() ? "2"
                : bi.vs30399.isChecked() ? "99"
                : "-1");
        patientDetails.setVs304(bi.vs304a.isChecked() ? "1"
                : bi.vs304b.isChecked() ? "2"
                : bi.vs304c.isChecked() ? "3"
                : bi.vs304d.isChecked() ? "4"
                : bi.vs30499.isChecked() ? "99"
                : "-1");
        patientDetails.setVs305(bi.vs305a.isChecked() ? "1"
                : bi.vs305b.isChecked() ? "2"
                : bi.vs305c.isChecked() ? "3"
                : bi.vs305d.isChecked() ? "4"
                : bi.vs30599.isChecked() ? "99"
                : "-1");
        patientDetails.setVs306a(bi.vs306a.isChecked() ? "1" : "-1");
        patientDetails.setVs306b(bi.vs306b.isChecked() ? "2" : "-1");
        patientDetails.setVs306c(bi.vs306c.isChecked() ? "3" : "-1");
        patientDetails.setVs306d(bi.vs306d.isChecked() ? "4" : "-1");
        patientDetails.setVs306e(bi.vs306e.isChecked() ? "5" : "-1");
        patientDetails.setVs306f(bi.vs306f.isChecked() ? "6" : "-1");
        patientDetails.setVs306g(bi.vs306g.isChecked() ? "7" : "-1");
        patientDetails.setVs306i(bi.vs306i.isChecked() ? "8" : "-1");
        patientDetails.setVs30699(bi.vs30699.isChecked() ? "99" : "-1");

        patientDetails.setBcg(bi.bcg.isChecked() ? "1" : "-1");
        patientDetails.setPenta1(bi.penta1.isChecked() ? "1" : "-1");
        patientDetails.setPenta2(bi.penta2.isChecked() ? "1" : "-1");
        patientDetails.setPenta3(bi.penta3.isChecked() ? "1" : "-1");
        patientDetails.setMeasles1(bi.measles1.isChecked() ? "1" : "-1");
        patientDetails.setMeasles2(bi.measles2.isChecked() ? "1" : "-1");
        patientDetails.setDpt(bi.dpt.isChecked() ? "1" : "-1");
        patientDetails.setOpv0(bi.opv0.isChecked() ? "1" : "-1");
        patientDetails.setOpv1(bi.opv1.isChecked() ? "1" : "-1");
        patientDetails.setOpv2(bi.opv2.isChecked() ? "1" : "-1");
        patientDetails.setOpv3(bi.opv3.isChecked() ? "1" : "-1");
        patientDetails.setTcv(bi.tcv.isChecked() ? "1" : "-1");
        patientDetails.setPcv1(bi.pcv1.isChecked() ? "1" : "-1");
        patientDetails.setPcv2(bi.pcv2.isChecked() ? "1" : "-1");
        patientDetails.setPcv3(bi.pcv3.isChecked() ? "1" : "-1");
        patientDetails.setHepb(bi.hepb.isChecked() ? "1" : "-1");
        patientDetails.setRota1(bi.rota1.isChecked() ? "1" : "-1");
        patientDetails.setRota2(bi.rota2.isChecked() ? "1" : "-1");
        patientDetails.setIpv1(bi.ipv1.isChecked() ? "1" : "-1");
        patientDetails.setIpv2(bi.ipv2.isChecked() ? "1" : "-1");

        patientDetails.setVs307(bi.vs307a.isChecked() ? "1"
                : bi.vs307b.isChecked() ? "2"
                : bi.vs30799.isChecked() ? "99"
                : "-1");
        patientDetails.setVs308(bi.vs308a.isChecked() ? "1"
                : bi.vs308b.isChecked() ? "2"
                : "-1");

    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {
            Toast.makeText(this, "Patient Added", Toast.LENGTH_SHORT).show();
            finish();
            gotoActivityWithPutExtra(this, SectionMobileHealthR2.class, "complete", true);
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
        finish();
        gotoActivity(this, MainActivity.class);

    }
}