package edu.aku.hassannaqvi.hf_patient.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import edu.aku.hassannaqvi.hf_patient.R
import edu.aku.hassannaqvi.hf_patient.databinding.ChildViewBinding
import edu.aku.hassannaqvi.hf_patient.models.ChildInformation
import edu.aku.hassannaqvi.hf_patient.utils.convertStringToUpperCase
import edu.aku.hassannaqvi.hf_patient.utils.shortStringLength

/*
* @author Ali Azaz Alam dt. 01.08.21
* */
class ChildViewHolder(private val bi: ChildViewBinding) :
    RecyclerView.ViewHolder(bi.root) {

    fun bind(item: ChildInformation) {
        bi.serial.text = item.cb01
        bi.resName.text =
            String.format("Mother: %s", item.cb07.convertStringToUpperCase().shortStringLength())
        bi.name.text = item.cb02.convertStringToUpperCase().shortStringLength()
        bi.age.text = item.cb0501.toInt().times(12).plus(item.cb0502.toInt()).toString()
        if (item.cb11 == "2") bi.subLayout.setBackgroundColor(
            ContextCompat.getColor(
                this.itemView.context,
                R.color.redOverlay
            )
        )
        else bi.subLayout.setBackgroundColor(
            ContextCompat.getColor(
                this.itemView.context,
                R.color.white
            )
        )
        val imageRes: Int =
            if (item.cb03 == "1") R.drawable.ctr_childboy else R.drawable.ctr_childgirl

        Glide.with(this.itemView.context)
            .asBitmap()
            .load(imageRes)
            .into(bi.childImg)
        bi.executePendingBindings()
    }


    companion object {
        fun create(viewGroup: ViewGroup): ChildViewHolder {
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.child_view, viewGroup, false)
            val binding = ChildViewBinding.bind(view)
            return ChildViewHolder(binding)
        }
    }

    class ChildViewDiffUtils(
        private val oldList: ArrayList<ChildInformation>,
        private val newList: ArrayList<ChildInformation>
    ) :
        DiffUtil.Callback() {
        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition].id == newList[newItemPosition].id
        }

        override fun getOldListSize(): Int {
            return oldList.size
        }

        override fun getNewListSize(): Int {
            return newList.size
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition] == newList[newItemPosition]
        }
    }
}