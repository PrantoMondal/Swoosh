package Controller

import Model.Player
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.prantokm.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }
    fun onMensClicked(view: View){
      womensLeagueBtn.isChecked = false
      coedLeagueBtn.isChecked = false

        player.league = "mens"
    }
    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"
    }
    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View){
        if (player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra()
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()

        }


    }

}