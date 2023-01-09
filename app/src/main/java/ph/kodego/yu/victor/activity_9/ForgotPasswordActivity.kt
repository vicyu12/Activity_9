package ph.kodego.yu.victor.activity_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import ph.kodego.yu.victor.activity_9.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendEmail.setOnClickListener {
            counter += 1

            if(counter == 1) {
                Snackbar.make(binding.root,
                    "E-mail Address Received. Click again to return to Login.",
                    Snackbar.LENGTH_LONG).show()
            } else if (counter > 1) {
                var goToLogin = Intent(this, LoginActivity::class.java)
                startActivity(goToLogin)
            }
        }

    }
}