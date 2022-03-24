package com.truyen.crown_rong.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.dakuinternational.common.ui.base.BaseFragment
import com.dakuinternational.common.ui.binding.viewBinding
import com.truyen.crown_rong.R
import com.truyen.crown_rong.databinding.FragmentDashboardBinding
import com.truyen.crown_rong.ui.adapter.DashboardAdapter

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