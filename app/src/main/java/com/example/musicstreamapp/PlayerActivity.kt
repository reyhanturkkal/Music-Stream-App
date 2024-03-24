package com.example.musicstreamapp

import android.os.Bundle
import android.view.View
import androidx.annotation.OptIn
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import com.bumptech.glide.Glide
import com.example.musicstreamapp.databinding.ActivityPlayerBinding
import com.example.musicstreamapp.MyExoplayer

class PlayerActivity : AppCompatActivity() {

    lateinit var binding: ActivityPlayerBinding
    lateinit var exoPlayer: ExoPlayer

    var playerListener = object : Player.Listener{
        override fun onIsPlayingChanged(isPlaying: Boolean) {
            super.onIsPlayingChanged(isPlaying)
            showGif(isPlaying)
        }
    }

    @OptIn(UnstableApi::class) override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MyExoplayer.getCurrentSong()?.apply {
            binding.songTitleTextView.text = title
            binding.songSubtitleTextView.text = subtitle

            Glide.with(binding.songCoverImageView).load(coverUrl)
                .circleCrop()
                .into(binding.songCoverImageView)

            Glide.with(binding.songGifImageView).load(R.drawable.audio_playing)
                .circleCrop()
                .into(binding.songGifImageView)

            exoPlayer = MyExoplayer.getInstance()!!
            binding.playerView.player = exoPlayer
            binding.playerView.showController()
            exoPlayer.addListener(playerListener)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        exoPlayer?.removeListener(playerListener)
    }

    fun showGif(show : Boolean){
        if(show){
            binding.songGifImageView.visibility = View.VISIBLE
        }else{
            binding.songGifImageView.visibility = View.INVISIBLE
        }
    }

}