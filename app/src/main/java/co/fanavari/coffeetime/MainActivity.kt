package co.fanavari.coffeetime

import android.content.Intent
import android.os.Bundle
import android.service.autofill.Validators.or
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import co.fanavari.coffeetime.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_CoffeeTime)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.aboutMainActivityBtn.setOnClickListener {

            MaterialAlertDialogBuilder(this)
                .setTitle(resources.getString(R.string.about_dialog_title))
                .setMessage(resources.getString(R.string.about_dialog_message))
                .show()
        }
        bind.logInButton.setOnClickListener {
            startActivity(Intent(this,LoginsignupActivity::class.java))
        }
        bind.guest.setOnClickListener {

        }
    }


}