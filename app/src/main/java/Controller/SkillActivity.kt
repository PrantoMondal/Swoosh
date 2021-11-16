package Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.prantokm.swoosh.EXTRA_LEAGUE
import com.prantokm.swoosh.EXTRA_SKILL
import com.prantokm.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }

    fun onBeginnerClick(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }
    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }
    fun onSkillFinishClicked(view: View){
        if(skill != ""){
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        }
       else{
           Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }
    }

}