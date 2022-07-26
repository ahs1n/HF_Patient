package edu.aku.hassannaqvi.hf_patient.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import edu.aku.hassannaqvi.hf_patient.R;
import edu.aku.hassannaqvi.hf_patient.database.DatabaseHelper;
import edu.aku.hassannaqvi.hf_patient.models.PatientDetails;


/**
 * Created by hassan.naqvi on 8/1/2016.
 */
public class FormsAdapter extends RecyclerView.Adapter<FormsAdapter.ViewHolder> {
    Context c;
    DatabaseHelper db;
    private List<PatientDetails> fc = Collections.emptyList();

    // Provide a suitable constructor (depends on the kind of dataset)
    public FormsAdapter(List<PatientDetails> fc, Context c) {
        this.fc = fc;
        this.c = c;
        Log.d("TAG:count", String.valueOf(getItemCount()));
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pendingform_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        db = new DatabaseHelper(c);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

/*        int childCount = 0;
        childCount = db.getChildrenByUUID(fc.get(position).getUid());
        int photoChild = 0;
        photoChild = db.getChildrenPhotoCheck(fc.get(position).getUid());
        int cardChild = 0;
        cardChild = db.getChildrenCardCheck(fc.get(position).getUid());*/


        String Status = "Status  Unknown";
        int iColor = 0;
        switch (fc.get(position).getSs108()) {
            case "1":
                holder.status.setBackgroundColor(c.getResources().getColor(R.color.colorAccent));
                holder.status.setImageResource(R.drawable.male);
                break;
            case "2":
                holder.status.setBackgroundColor(c.getResources().getColor(R.color.colorPrimary));
                holder.status.setImageResource(R.drawable.female);
                break;
        }
      /*  switch (fc.get(position).getIStatus()) {
            case "1":
                iStatus = "Complete";
                iColor = Color.GREEN;
                break;
            case "2":
                iStatus = "No Respondent";
                iColor = Color.RED;
                break;
            case "3":
                iStatus = "Memebers Absent";
                iColor = Color.RED;
                break;
            case "4":
                iStatus = "Refused";
                iColor = Color.RED;
                break;
            case "5":
                iStatus = "Empty";
                iColor = Color.RED;
                break;
            case "6":
                iStatus = "Not Found";
                iColor = Color.RED;
                break;
            case "96":
                iStatus = "Other Reason";
                iColor = Color.RED;
                break;
            default:
                iStatus = "Open Form";
                iColor = Color.RED;
                break;

        }*/

        holder.hhno.setText(fc.get(position).getSs102() + "\t\t\t | \t\t\t" + fc.get(position).getSysDate());
        holder.father.setText(" ( " + fc.get(position).getSs108() + " )");
        holder.cluster.setText(fc.get(position).getSs107());
        holder.istatus.setText(fc.get(position).getSs106());
        holder.sysdate.setText(fc.get(position).getSs107y() + "y \t\t\t " + (fc.get(position).getSs108().equals("1") ? "Male" : "Female"));
        holder.status.setBackgroundColor(iColor);


    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return fc.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerView rv;
        public TextView sysdate;
        public TextView cluster;
        public TextView hhno;
        public TextView istatus;
        public ImageView status;
        public TextView father;
        // each data item is just a string in this case

        public ViewHolder(View v) {
            super(v);
//            rv = v.findViewById(R.id.FormsList);
            sysdate = v.findViewById(R.id.sysdate);
            cluster = v.findViewById(R.id.cluster);
            hhno = v.findViewById(R.id.hhno);
            istatus = v.findViewById(R.id.istatus);
            status = v.findViewById(R.id.status);
            father = v.findViewById(R.id.fathername);

        }


    }
}