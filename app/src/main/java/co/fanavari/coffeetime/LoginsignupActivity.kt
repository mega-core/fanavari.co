package co.fanavari.coffeetime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.fanavari.coffeetime.databinding.ActivityLoginsignupBinding

class LoginsignupActivity:AppCompatActivity() {
    private lateinit var bind:ActivityLoginsignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityLoginsignupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)

    }
}