package co.fanavari.coffeetime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.fanavari.coffeetime.databinding.ActivityDashboardBinding

class DashboardActivity:AppCompatActivity() {
    private lateinit var bind:ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityDashboardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)

    }
}