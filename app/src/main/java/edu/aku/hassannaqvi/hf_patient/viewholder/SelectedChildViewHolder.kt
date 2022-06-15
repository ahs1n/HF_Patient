package edu.aku.hassannaqvi.hf_patient.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import edu.aku.hassannaqvi.hf_patient.R
import edu.aku.hassannaqvi.hf_patient.databinding.SelectedChildViewBinding
import edu.aku.hassannaqvi.hf_patient.models.ChildInformation
import edu.aku.hassannaqvi.hf_patient.utils.convertStringToUpperCase
import edu.aku.hassannaqvi.hf_patient.utils.shortStringLength

/*
* @author Ali Azaz Alam dt. 01.14.21
* */
class SelectedChildViewHolder(private val bi: SelectedChildViewBinding) :
    RecyclerView.ViewHolder(bi.root) {

    fun bind(item: ChildInformation) {
        bi.resName.text =
            String.format("Mother: %s", item.cb07.convertStringToUpperCase().shortStringLength())
        bi.name.text = item.cb02.convertStringToUpperCase().shortStringLength()
        bi.age.text =
            String.format("Age: [%d]M", item.cb0501.toInt().times(12).plus(item.cb0502.toInt()))
        if (item.isSelected == "1" || item.isSelected == "2") bi.childImg.setBackgroundColor(
            ContextCompat.getColor(this.itemView.context, R.color.lightPink)
        )
        val imageRes: Int =
            if (item.cb03 == "1") R.drawable.ctr_childboy else R.drawable.ctr_childgirl
        val flagImage: Int
        if (item.childTableDataExist == null) {
            flagImage = R.drawable.ic_incomplete_star
        } else {
            bi.parentLayout.isEnabled = false
            flagImage = R.drawable.ic_complete_star
        }
        if (!item.isMotherAvailable) {
//            bi.parentLayout.isEnabled = false
            bi.containeridcard.setBackgroundColor(
                ContextCompat.getColor(
                    this.itemView.context,
                    R.color.grayLight
                )
            )
        }
        Glide.with(this.itemView.context)
            .asBitmap()
            .load(imageRes)
            .into(bi.childImg)
        Glide.with(this.itemView.context)
            .asBitmap()
            .load(flagImage)
            .into(bi.completeFlag)
        bi.executePendingBindings()
    }


    companion object {
        fun create(viewGroup: ViewGroup): SelectedChildViewHolder {
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.selected_child_view, viewGroup, false)
            val binding = SelectedChildViewBinding.bind(view)
            return SelectedChildViewHolder(binding)
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