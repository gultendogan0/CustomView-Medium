package com.example.customview.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customview.R
import com.example.customview.adapter.AgentAdapter
import com.example.customview.databinding.AgentViewBinding
import com.example.customview.model.Agent

class AgentView(context: Context, attrs: AttributeSet?) : ConstraintLayout(context, attrs) {

    private val binding: AgentViewBinding

    init {
        binding = AgentViewBinding.inflate(LayoutInflater.from(context), this, true)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.AgentView)
        binding.listName.text = attributes.getString(R.styleable.AgentView_text)

        attributes.recycle()
    }

    fun setAgentList(agents: List<Agent>?) {
        if (agents != null) {
            binding.agentListRecyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            val adapter = AgentAdapter(agents)
            binding.agentListRecyclerView.adapter = adapter
        }
    }

    fun setListName(title: String) {
        binding.listName.text = title
    }
}