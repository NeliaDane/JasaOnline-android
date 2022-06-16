package id.ac.polbeng.n.themecolor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import id.ac.polbeng.n.themecolor.activities.LoginActivity
import id.ac.polbeng.n.themecolor.activities.MainActivity
import id.ac.polbeng.n.themecolor.helpers.Config

class SplasScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splas_screen)
        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, Config.SPLASH_TIME_OUT)
    }
}