package co.fanavari.coffeetime

import android.app.ProgressDialog.show
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.system.Os.accept
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AppCompatActivity
import co.fanavari.coffeetime.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.lang.reflect.Method

class MainActivity:AppCompatActivity() {
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
                .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
                    
                }
                .show()
        }
        bind.logInButton.setOnClickListener {
            startActivity(Intent(this,LoginsignupActivity::class.java))
        }
    }
}