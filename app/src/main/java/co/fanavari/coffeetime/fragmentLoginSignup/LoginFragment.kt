package co.fanavari.coffeetime.fragmentLoginSignup

import android.widget.Toast
import androidx.fragment.app.Fragment
import co.fanavari.coffeetime.DashboardActivity
import co.fanavari.coffeetime.R
import co.fanavari.coffeetime.password
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login) {
    override fun onResume() {
        super.onResume()

        button.setOnClickListener {
            if (textInputLayout2_text.text?.toString() == password)
                Toast.makeText(context, "Correct Password!", Toast.LENGTH_SHORT).show()else
                Toast.makeText(context, "Wrong password please try again!", Toast.LENGTH_SHORT)
                    .show()
        }
    }
}