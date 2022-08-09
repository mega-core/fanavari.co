package co.fanavari.coffeetime.fragmentLoginSignup

import android.app.Activity
import android.content.Intent
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import co.fanavari.coffeetime.*
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textfield.TextInputLayout.END_ICON_PASSWORD_TOGGLE
import kotlinx.android.synthetic.main.fragment_signup.*
import java.util.logging.Handler

class SignupFragment : Fragment(R.layout.fragment_signup) {
    override fun onResume() {
        super.onResume()
        textInputLayout13_text.addTextChangedListener {
            textInputLayout13.error = null
        }
        textInputLayout14_text.addTextChangedListener {
            textInputLayout14.error = null
        }
        textInputLayout15_text.addTextChangedListener {
            textInputLayout15.error = null
            textInputLayout15.endIconMode = END_ICON_PASSWORD_TOGGLE
            if (textInputLayout15_text.text.toString() == "")
                textInputLayout15.endIconMode = TextInputLayout.END_ICON_NONE
        }
        textInputLayout17_text.addTextChangedListener {
            textInputLayout17.error = null
            textInputLayout17.endIconMode = END_ICON_PASSWORD_TOGGLE
            if (textInputLayout17_text.text.toString() == "")
                textInputLayout17.endIconMode = TextInputLayout.END_ICON_NONE
        }
        button2.setOnClickListener {
            if (textInputLayout13_text.text.toString() != "" && textInputLayout14_text.text.toString() != "" && textInputLayout15_text.text.toString() != "" && textInputLayout17_text.text.toString() != "" && textInputLayout15_text.text.toString() != "" && textInputLayout17_text.text.toString() != "" )
                if (textInputLayout15_text.text.toString() != textInputLayout17_text.text.toString()){
                    textInputLayout15.error = "Password doesn't match"
                    android.os.Handler().postDelayed(fun(){textInputLayout15.error = null},2000)
                    textInputLayout17.error = "Password doesn't match"
                    android.os.Handler().postDelayed(fun(){textInputLayout17.error = null},2000)
                }else
                    Intent(context, DashboardActivity::class.java).apply {
                        putExtra(Constant.USER_NAME, textInputLayout13_text.text.toString())
                        putExtra(Constant.PHONE_NUMBER, textInputLayout14_text.text.toString())
                        putExtra(Constant.PASS, textInputLayout15_text.text.toString())
                        password = textInputLayout15_text.text.toString()
                        startActivity(this)

                    }

            else {
                if (textInputLayout13_text.text.toString() == "")
                    textInputLayout13.error = "Empty field"
                if (textInputLayout14_text.text.toString() == "")
                    textInputLayout14.error = "Empty field"
                if (textInputLayout15_text.text.toString() == "")
                    textInputLayout15.error = "Empty field"
                if (textInputLayout17_text.text.toString() == "")
                    textInputLayout17.error = "Empty field"
                else if (textInputLayout15_text.text.toString() != textInputLayout17_text.text.toString()){
                    textInputLayout15.error = "Password doesn't match"
                    android.os.Handler().postDelayed(fun(){textInputLayout15.error = null},2000)
                    textInputLayout17.error = "Password doesn't match"
                    android.os.Handler().postDelayed(fun(){textInputLayout17.error = null},2000)
                }
            }
        }
    }
}
