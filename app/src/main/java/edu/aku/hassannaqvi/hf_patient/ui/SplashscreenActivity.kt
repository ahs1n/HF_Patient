package edu.aku.hassannaqvi.hf_patient.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.aku.hassannaqvi.hf_patient.R
import edu.aku.hassannaqvi.hf_patient.utils.extension.gotoActivity
import kotlinx.coroutines.*

/*
* @author Ali Azaz Alam dt. 12.16.20
* */
class SplashscreenActivity : AppCompatActivity() {
    private lateinit var activityScope: Job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        activityScope = launchSplashScope()

        /*
        * Show FullScreen
        * */
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) window.insetsController?.hide(WindowInsets.Type.statusBars())
        else window?.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)*/
    }

    override fun onPause() {
        super.onPause()
        activityScope.cancel()
    }

    override fun onResume() {
        super.onResume()
        if (activityScope.isActive.not())
            launchSplashScope()
    }

    override fun onDestroy() {
        super.onDestroy()
        activityScope.cancel()
    }

    private fun launchSplashScope() =
        CoroutineScope(Dispatchers.Main).launch {
            delay(SPLASH_TIME_OUT.toLong())
            finish()
            gotoActivity(edu.aku.hassannaqvi.hf_patient.ui.LoginActivity::class.java)
        }

    companion object {
        private const val SPLASH_TIME_OUT = 1000
    }
}