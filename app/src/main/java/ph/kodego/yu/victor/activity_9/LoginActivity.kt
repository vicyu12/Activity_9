package ph.kodego.yu.victor.activity_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.yu.victor.activity_9.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            var goToMain = Intent(this, ViewPagerActivity::class.java)
            startActivity(goToMain)
        }

        binding.btnForgotPassword.setOnClickListener {
            var goToForgotPassword =Intent(this, ForgotPasswordActivity::class.java)
            startActivity(goToForgotPassword)
        }

        binding.btnRegister.setOnClickListener {
            var goToRegister = Intent(this, RegisterActivity::class.java)
            startActivity(goToRegister)
        }
    }
}