package com.example.customview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customview.model.Agent
import com.example.customview.view.AgentView

class AgentListAdapter(
    private val agentSections: List<List<Agent>>,
    private val sectionTitles: List<String>
) : RecyclerView.Adapter<AgentListAdapter.AgentListHolder>() {

    class AgentListHolder(val agentView: AgentView) : RecyclerView.ViewHolder(agentView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgentListHolder {
        val context = parent.context
        val agentView = AgentView(context, null)
        return AgentListHolder(agentView)
    }

    override fun getItemCount(): Int {
        return agentSections.size
    }

    override fun onBindViewHolder(holder: AgentListHolder, position: Int) {
        val agents = agentSections[position]
        val sectionTitle = sectionTitles[position]

        holder.agentView.setAgentList(agents)
        holder.agentView.setListName(sectionTitle)
    }
}