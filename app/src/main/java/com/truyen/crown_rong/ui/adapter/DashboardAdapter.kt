package com.truyen.crown_rong.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dakuinternational.common.domain.model.DataContent
import com.truyen.crown_rong.data.CrwnAsset
import com.truyen.crown_rong.databinding.ItemDashboardBinding

class DashboardAdapter(var onClick: OnItemClickListener) : RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {

    val data = CrwnAsset.home

    class ViewHolder(var binding: ItemDashboardBinding) : RecyclerView.ViewHolder(binding.root) {

        fun setData(data: DataContent, onClick: OnItemClickListener) {
            binding.item = data
            itemView.setOnClickListener {
                onClick.onItemClick(data)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDashboardBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.setData(data[position], onClick)
    }

    override fun getItemCount(): Int = data.size

    interface OnItemClickListener {
        fun onItemClick(data: DataContent)
    }
}