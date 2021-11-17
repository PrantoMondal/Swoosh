package Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prantokm.swoosh.EXTRA_PLAYER
import com.prantokm.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableArrayExtra(EXTRA_PLAYER)


        searchLeagueText.text = "Looking for ${player.league} ${player.skill} league for you..."
    }
}