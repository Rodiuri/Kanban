package com.iuri.task.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragmentList = mutableListOf<Fragment>()
    private val titleList = mutableListOf<Int>()

    fun addFragment(fragment: Fragment, title: Int) {
        fragmentList.add(fragment)
        titleList.add(title)
    }

    override fun getItemCount(): Int = fragmentList.size
    override fun createFragment(position: Int): Fragment = fragmentList[position]
    fun getTitle(position: Int): Int = titleList[position]
}
