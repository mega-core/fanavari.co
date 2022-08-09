package co.fanavari.coffeetime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import co.fanavari.coffeetime.databinding.ActivityDashboardBinding
import co.fanavari.coffeetime.fragment.Dashboard.HomeFragment
import co.fanavari.coffeetime.fragment.Dashboard.LearnFragment
import co.fanavari.coffeetime.fragment.Dashboard.SettingsFragment
import co.fanavari.coffeetime.fragment.Dashboard.ShopFragment
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    private lateinit var bind: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityDashboardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        val homeFragment = HomeFragment()
        val shopFragment = ShopFragment()
        val learnFragment = LearnFragment()
        val settingsFragment = SettingsFragment()
        fragmentChanger(homeFragment)
        navBottom.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.homeNav -> fragmentChanger(homeFragment)
                R.id.shopNav -> fragmentChanger(shopFragment)
                R.id.learnNav -> fragmentChanger(learnFragment)
                R.id.settingsNav -> fragmentChanger(settingsFragment)
            }
            true
        }
        floatingActionButton.setOnClickListener {
            finish()
        }
    }
    private fun fragmentChanger(fragmentName: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragmentName)
            commit()
        }
    }
}
