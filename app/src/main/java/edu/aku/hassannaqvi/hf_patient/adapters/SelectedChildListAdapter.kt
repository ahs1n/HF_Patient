package edu.aku.hassannaqvi.hf_patient.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import edu.aku.hassannaqvi.hf_patient.models.ChildInformation
import edu.aku.hassannaqvi.hf_patient.viewholder.SelectedChildViewHolder
import kotlinx.android.synthetic.main.child_view.view.*

/*
 * @author Ali Azaz Alam dt. 01.14.21
 * */
class SelectedChildListAdapter(private val clickListener: OnItemClickListener) :
    RecyclerView.Adapter<SelectedChildViewHolder>() {

    var childItems: ArrayList<ChildInformation> = ArrayList()
        set(value) {
            field = value
            val diffCallback =
                SelectedChildViewHolder.ChildViewDiffUtils(filteredChildItems, childItems)
            val diffResult = DiffUtil.calculateDiff(diffCallback)
            if (filteredChildItems.size > 0)
                filteredChildItems.clear()
            filteredChildItems.addAll(value)
            diffResult.dispatchUpdatesTo(this)
        }

    var filteredChildItems: ArrayList<ChildInformation> = ArrayList()
        set(value) {
            field = value
            val diffCallback =
                SelectedChildViewHolder.ChildViewDiffUtils(filteredChildItems, childItems)
            val diffResult = DiffUtil.calculateDiff(diffCallback)
            diffResult.dispatchUpdatesTo(this)
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): SelectedChildViewHolder {
        return SelectedChildViewHolder.create(viewGroup)
    }

    override fun onBindViewHolder(holder: SelectedChildViewHolder, i: Int) {
        val item = filteredChildItems[i]
        holder.bind(item)
        holder.itemView.parentLayout.setOnClickListener {
            clickListener.onItemClick(item, i)
        }
    }

    override fun getItemCount(): Int = filteredChildItems.size

    interface OnItemClickListener {
        fun onItemClick(item: ChildInformation, position: Int)
    }
}