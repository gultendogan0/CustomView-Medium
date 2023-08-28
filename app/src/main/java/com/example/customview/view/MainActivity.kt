 package com.example.customview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customview.adapter.AgentListAdapter
import com.example.customview.databinding.ActivityMainBinding
import com.example.customview.model.Agent
import com.example.customview.other.Constants.ASTRA_IMAGE_URL
import com.example.customview.other.Constants.BREACH_IMAGE_URL
import com.example.customview.other.Constants.BRIMSTONE_IMAGE_URL
import com.example.customview.other.Constants.CHAMBER_IMAGE_URL
import com.example.customview.other.Constants.CYPHER_IMAGE_URL
import com.example.customview.other.Constants.DEADLOCK_IMAGE_URL
import com.example.customview.other.Constants.FADE_IMAGE_URL
import com.example.customview.other.Constants.GEKKO_IMAGE_URL
import com.example.customview.other.Constants.NEON_IMAGE_URL
import com.example.customview.other.Constants.PHOENIX_IMAGE_URL
import com.example.customview.other.Constants.RAZE_IMAGE_URL
import com.example.customview.other.Constants.VIPER_IMAGE_URL

 class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAgentRecyclerView()

    }

     private fun setupAgentRecyclerView() {
         val agentSections = listOf(
             listOf(
                 Agent("Raze", "Duelist", RAZE_IMAGE_URL),
                 Agent("Phoenix", "Duelist", PHOENIX_IMAGE_URL),
                 Agent("Neon", "Duelist", NEON_IMAGE_URL)
             ),
             listOf(
                 Agent("Gekko", "Initiator", GEKKO_IMAGE_URL),
                 Agent("Fade", "Initiator", FADE_IMAGE_URL),
                 Agent("Breach", "Initiator", BREACH_IMAGE_URL)
             ),
             listOf(
                 Agent("Deadlock", "Sentinel", DEADLOCK_IMAGE_URL),
                 Agent("Chamber", "Sentinel", CHAMBER_IMAGE_URL),
                 Agent("Cypher", "Sentinel", CYPHER_IMAGE_URL)
             ),
             listOf(
                 Agent("Viper", "Controller", VIPER_IMAGE_URL),
                 Agent("Astra", "Controller", ASTRA_IMAGE_URL),
                 Agent("Brimstone", "Controller", BRIMSTONE_IMAGE_URL)
             )
         )

         val sectionTitles = listOf("DUELISTS", "INITIATOR", "SENTINEL", "CONTROLLER")

         val adapter = AgentListAdapter(agentSections, sectionTitles)
         binding.agentRecyclerView.adapter = adapter
     }
}