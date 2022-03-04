package com.thecoo.crown.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.dakuinternational.common.domain.model.DataContent
import com.dakuinternational.common.ui.base.BaseActivity
import com.dakuinternational.common.ui.ActivityViewModel
import com.google.gson.Gson
import com.thecoo.crown.R
import com.thecoo.crown.databinding.ActivityMainBinding
import com.thecoo.crown.ui.adapter.DashboardAdapter
import com.thecoo.crown.ui.fragments.DashboardFragmentDirections

class MainActivity : BaseActivity(), DashboardAdapter.OnItemClickListener {

    private lateinit var binding: ActivityMainBinding

    private val viewModel by viewModels<ActivityViewModel>()
    private val navHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.navigation_host) as NavHostFragment
    }
    private val navController get() = navHostFragment.navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = LayoutInflater.from(this)
        binding = ActivityMainBinding.inflate(inflater, null, false)
        setContentView(binding.root)

    }

    companion object{
        fun createIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun onItemClick(data: DataContent) {
        val direction = DashboardFragmentDirections.actionDashboardFragmentToDetailsFragment(Gson().toJson(data))
        navController.navigate(direction)
    }
}