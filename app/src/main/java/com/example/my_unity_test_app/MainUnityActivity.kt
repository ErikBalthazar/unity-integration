package com.example.my_unity_test_app

import android.os.Bundle
import com.company.product.OverrideUnityActivity
import com.unity3d.player.UnityPlayer

class MainUnityActivity : OverrideUnityActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val gameId = intent.getStringExtra("gameId")
        goToGame(gameId)
    }

    override fun goToGame(gameId: String?) {
        UnityPlayer.UnitySendMessage("gm", "GoToScene", gameId)
    }
}