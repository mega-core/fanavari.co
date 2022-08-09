package co.fanavari.coffeetime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import co.fanavari.coffeetime.fragmentLoginSignup.LoginFragment
import co.fanavari.coffeetime.fragmentLoginSignup.SignupFragment
import kotlinx.android.synthetic.main.activity_loginsignup.*

class LoginSignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginsignup)
        fragmentChanger(LoginFragment())
        login_switch_btn.setOnClickListener {
            fragmentChanger(LoginFragment())
        }
        signup_switch_btn.setOnClickListener {
            fragmentChanger(SignupFragment())
        }
    }
    private fun fragmentChanger(fragment:Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer,fragment)
            commit()
        }
    }
}





