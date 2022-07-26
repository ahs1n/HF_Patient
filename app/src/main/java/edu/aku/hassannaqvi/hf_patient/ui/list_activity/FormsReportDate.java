package edu.aku.hassannaqvi.hf_patient.ui.list_activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.hf_patient.R;
import edu.aku.hassannaqvi.hf_patient.adapters.FormsAdapter;
import edu.aku.hassannaqvi.hf_patient.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient.models.PatientDetails;


public class FormsReportDate extends AppCompatActivity {
    private static final String TAG = "FormsReportDate";
    DatabaseHelper db;
    Collection<PatientDetails> fc;
    String sysdateToday = new SimpleDateFormat("dd-MM-yy").format(new Date());
    TextView dtFilter;
    TextView noresult;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter formsAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms_report_date);
        recyclerView = findViewById(R.id.fc_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        dtFilter = findViewById(R.id.dtFilter);
        noresult = findViewById(R.id.noresult);
        db = new DatabaseHelper(this);
        try {
            fc = db.getTodayForms(sysdateToday);
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "onCreate(getTodayForms): " + e.getMessage());
            Toast.makeText(this, "onCreate(getTodayForms): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        // specify an adapter (see also next example)
        formsAdapter = new FormsAdapter((List<PatientDetails>) fc, this);
        recyclerView.setAdapter(formsAdapter);
    }

    public void filterForms(View view) {
        try {
            fc = db.getTodayForms(dtFilter.getText().toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, "filterForms(getTodayForms): " + e.getMessage());
            Toast.makeText(this, "filterForms(getTodayForms): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (fc.size() > 0) {
            recyclerView.setVisibility(View.VISIBLE);
            noresult.setVisibility(View.GONE);

            Toast.makeText(this, "updated: " + fc.size(), Toast.LENGTH_SHORT).show();
            formsAdapter = new FormsAdapter((List<PatientDetails>) fc, this);
            formsAdapter.notifyDataSetChanged();
            recyclerView.setAdapter(formsAdapter);
        } else {
            recyclerView.setVisibility(View.GONE);
            noresult.setVisibility(View.VISIBLE);
        }

    }
}