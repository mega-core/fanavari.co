package co.fanavari.coffeetime

import android.content.Intent
import android.os.Bundle
import android.service.autofill.UserData
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import co.fanavari.coffeetime.databinding.ActivityLoginsignupBinding
import com.google.android.material.button.MaterialButtonToggleGroup
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class LoginsignupActivity : AppCompatActivity() {
    private lateinit var bind: ActivityLoginsignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityLoginsignupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)


        val toggleButtonGroup = findViewById<MaterialButtonToggleGroup>(R.id.toggle_btn_group)
        toggleButtonGroup.addOnButtonCheckedListener { _, checkedId, isChecked ->
            if (isChecked) {
                when (checkedId) {
                    R.id.login_switch_btn -> {
                        bind.groupLogin.visibility = View.VISIBLE
                        bind.groupSignup.visibility = View.GONE
                    }
                    R.id.signup_switch_btn -> {
                        bind.groupLogin.visibility = View.GONE
                        bind.groupSignup.visibility = View.VISIBLE
                    }
                }
            } else {
                if (bind.toggleBtnGroup.checkedButtonId == View.NO_ID) {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Log In or Sign Up")
                        .setMessage("If you already have an account you can enter the username and password inside the login form. ")
                        .show()
                }
            }
        }

        bind.button.setOnClickListener {

            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra(Constant.USER_NAME, bind.nameInputEditText.text.toString())
            intent.putExtra(Constant.EMAIL, bind.emailInputEditText.text.toString())
            intent.putExtra(Constant.PHONE_NUMBER, bind.phoneInputEditText.text.toString())
            intent.putExtra(Constant.PASS,bind.passwordInputEditText2.text.toString())
            startActivity(intent)
        }

        bind.button2.setOnClickListener {

        }


    }


}





