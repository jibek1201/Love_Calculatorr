package com.example.hw_5_5.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hw_5_5.databinding.ItemOnboardingBinding
import com.example.hw_5_5.utils.loadImage


class OnBoardingAdapter(val onClick:()->Unit):Adapter<OnBoardingAdapter.OnBoardingViewHolder>() {

    private val list = arrayListOf(
        OnBoardingModel("LoveSync", "Your Ultimate Love Compatibility Checker", "https://e7.pngegg.com/pngimages/997/899/png-clipart-red-heart-illustration-heart-icon-3d-red-heart-love-heart.png"),
        OnBoardingModel("HeartBeat", "Love Calculator for Modern Romantics", "https://e7.pngegg.com/pngimages/268/972/png-clipart-heart-drawing-icon-hand-drawn-heart-shaped-material-orange-heart-illustration-love-text-thumbnail.png"),
        OnBoardingModel("AmoreMeter", "Decode Your Love Equation", "https://e7.pngegg.com/pngimages/719/307/png-clipart-green-heart-illustration-computer-icons-neon-heart-light-glowing-heart-shaped-love-heart-thumbnail.png"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        return OnBoardingViewHolder(ItemOnboardingBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class OnBoardingViewHolder(private val binding:ItemOnboardingBinding):ViewHolder(binding.root){
        fun bind(onBoardingModel: OnBoardingModel) = with(binding){
            tvDesc.text = onBoardingModel.desc
            tvTitle.text = onBoardingModel.title
            imgLove.loadImage(onBoardingModel.image)
            btnGetStarted.setOnClickListener {
                onClick()
            }
        }

    }
}