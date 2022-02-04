package com.example.my_unity_test_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_game_1.setOnClickListener(this)
        btn_game_2.setOnClickListener(this)
        btn_game_3.setOnClickListener(this)
    }

    private fun initUnityGame(gameId: String) {
        val intent = Intent(this, MainUnityActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT
        intent.putExtra("gameId", gameId)
        startActivity(intent)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btn_game_1 -> {
                initUnityGame("FirstScene")
            }

            R.id.btn_game_2 -> {
                initUnityGame("SecondScene")
            }

            R.id.btn_game_3 -> {
                initUnityGame("ThirdScene")
            }
        }
    }
}