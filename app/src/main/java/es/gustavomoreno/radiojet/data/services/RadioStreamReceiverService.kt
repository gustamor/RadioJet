package es.gustavomoreno.radiojet.data.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.media3.exoplayer.ExoPlayer
import javax.inject.Inject

class RadioStreamReceiverService @Inject constructor(private val player: ExoPlayer) : Service() {
    override fun onBind(p0: Intent?): IBinder? {
       // TODO("Not yet implemented")
        return null;
    }
}
