package ph.kodego.yu.victor.activity_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import ph.kodego.yu.victor.activity_9.adapter.FragmentAdapter
import ph.kodego.yu.victor.activity_9.databinding.ActivityViewPagerBinding

class ViewPagerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fragmentAdapter = FragmentAdapter(supportFragmentManager, lifecycle)
        var tabList: ArrayList<String> = ArrayList()

        fragmentAdapter.addFragment(ListFragment())
        fragmentAdapter.addFragment(SearchFragment())
        fragmentAdapter.addFragment(TransactionFragment())

        tabList.add("List")
        tabList.add("Search")
        tabList.add("Transaction")

        with(binding.viewPager2) {
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            setPageTransformer(ZoomOutPageTransformer())
            adapter = fragmentAdapter
        }

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) {
                tab, position ->
            tab.text = tabList[position]
        }.attach()
    }

    override fun onBackPressed() {
        if(binding.viewPager2.currentItem == 0) {
            super.onBackPressed()
//            binding.viewPager2.currentItem = 2
        }else{
            binding.viewPager2.currentItem = binding.viewPager2.currentItem -1
        }
    }
}