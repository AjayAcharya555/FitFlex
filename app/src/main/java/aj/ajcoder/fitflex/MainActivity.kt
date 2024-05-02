package aj.ajcoder.fitflex

import aj.ajcoder.fitflex.databinding.ActivityMainBinding
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
//        val start_btn :Button = findViewById(R.id.btn_start)

        binding?.btnStart?.setOnClickListener {
          val intent =Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroy(){
    super.onDestroy()

        binding = null
    }
}