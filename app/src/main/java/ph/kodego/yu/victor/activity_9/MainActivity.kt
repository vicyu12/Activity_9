package ph.kodego.yu.victor.activity_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.yu.victor.activity_9.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}