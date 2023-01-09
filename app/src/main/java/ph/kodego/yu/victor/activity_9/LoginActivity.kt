package ph.kodego.yu.victor.activity_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.yu.victor.activity_9.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}