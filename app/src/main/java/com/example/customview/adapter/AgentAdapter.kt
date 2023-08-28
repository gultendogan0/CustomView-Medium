package com.example.customview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.customview.databinding.AgentItemViewBinding
import com.example.customview.model.Agent

class AgentAdapter(private val agents: List<Agent>) : RecyclerView.Adapter<AgentAdapter.AgentHolder>(){

    class AgentHolder(val binding: AgentItemViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgentHolder {
        val binding = AgentItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AgentHolder(binding)
    }

    override fun getItemCount(): Int {
        return agents.size
    }

    override fun onBindViewHolder(holder: AgentHolder, position: Int) {

        val itemWidth = (holder.binding.root.context.resources.displayMetrics.widthPixels * 0.40).toInt()
        val layoutParams = holder.binding.root.layoutParams
        layoutParams.width = itemWidth

        holder.binding.root.layoutParams = layoutParams
        holder.binding.agentName.text = agents[position].agentName
        holder.binding.agentRole.text = agents[position].agentRole
        Glide.with(holder.binding.root).load(agents[position].agentImage).into(holder.binding.agentImage)
    }
}