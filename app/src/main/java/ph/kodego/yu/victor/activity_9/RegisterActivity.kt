package ph.kodego.yu.victor.activity_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import ph.kodego.yu.victor.activity_9.databinding.ActivityLoginBinding
import ph.kodego.yu.victor.activity_9.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private var registercounter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            registercounter += 1

            if (registercounter == 1) {
                Snackbar.make(binding.root,
                    "Registered!!! Click again to return to Login.",
                    Snackbar.LENGTH_LONG).show()
            } else if (registercounter > 1) {
                var goToLogin = Intent(this, LoginActivity::class.java)
                startActivity(goToLogin)
            }
        }

    }
}