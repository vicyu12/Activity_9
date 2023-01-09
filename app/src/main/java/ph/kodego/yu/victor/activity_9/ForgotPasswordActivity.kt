package ph.kodego.yu.victor.activity_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.yu.victor.activity_9.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}