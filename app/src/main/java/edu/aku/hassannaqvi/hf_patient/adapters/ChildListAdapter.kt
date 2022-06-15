package edu.aku.hassannaqvi.hf_patient.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import edu.aku.hassannaqvi.hf_patient.models.ChildInformation
import edu.aku.hassannaqvi.hf_patient.viewholder.ChildViewHolder
import kotlinx.android.synthetic.main.child_view.view.*

/*
 * @author Ali Azaz Alam dt. 01.08.21
 * */
class ChildListAdapter(private val clickListener: OnItemClickListener) :
    RecyclerView.Adapter<ChildViewHolder>() {

    var childItems: ArrayList<ChildInformation> = ArrayList()
        set(value) {
            field = value
            val diffCallback = ChildViewHolder.ChildViewDiffUtils(filteredChildItems, childItems)
            val diffResult = DiffUtil.calculateDiff(diffCallback)
            if (filteredChildItems.size > 0)
                filteredChildItems.clear()
            filteredChildItems.addAll(value)
            diffResult.dispatchUpdatesTo(this)
        }

    var filteredChildItems: ArrayList<ChildInformation> = ArrayList()
        set(value) {
            field = value
            val diffCallback = ChildViewHolder.ChildViewDiffUtils(filteredChildItems, childItems)
            val diffResult = DiffUtil.calculateDiff(diffCallback)
            diffResult.dispatchUpdatesTo(this)
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ChildViewHolder {
        return ChildViewHolder.create(viewGroup)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, i: Int) {
        val item = filteredChildItems[i]
        holder.bind(item)
        /*holder.itemView.parentLayout.setOnClickListener {
            clickListener.onItemClick(item, i)
        }*/
        holder.itemView.addSiblings.setOnClickListener {
            clickListener.onButtonItemClick(item, false)
        }
        holder.itemView.parentLayout.setOnLongClickListener {
            clickListener.onItemClick(item, i)
        }
    }

    override fun getItemCount(): Int = filteredChildItems.size

    interface OnItemClickListener {
        fun onItemClick(item: ChildInformation, position: Int): Boolean
        fun onButtonItemClick(item: ChildInformation, flag: Boolean)
    }
}