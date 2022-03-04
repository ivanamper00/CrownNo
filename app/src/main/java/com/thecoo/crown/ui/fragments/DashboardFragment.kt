package com.thecoo.crown.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.dakuinternational.common.domain.model.DataContent
import com.dakuinternational.common.ui.base.BaseFragment
import com.dakuinternational.common.ui.binding.viewBinding
import com.thecoo.crown.R
import com.thecoo.crown.databinding.FragmentDashboardBinding
import com.thecoo.crown.ui.adapter.DashboardAdapter

class DashboardFragment : BaseFragment(R.layout.fragment_dashboard) {

    val binding by viewBinding(FragmentDashboardBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView();
    }

    private fun initRecyclerView() {
        binding.dashboardRecycler.adapter = DashboardAdapter(requireActivity() as DashboardAdapter.OnItemClickListener)
        binding.dashboardRecycler.layoutManager = GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
    }

}