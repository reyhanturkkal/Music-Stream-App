package com.example.musicstreamapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.musicstreamapp.adapter.SongsListAdapter
import com.example.musicstreamapp.databinding.ActivitySongsListBinding
import com.example.musicstreamapp.models.CategoryModel

class SongsListActivity : AppCompatActivity() {

    companion object{
        lateinit var category: CategoryModel
    }

    lateinit var binding: ActivitySongsListBinding
    lateinit var songsListAdapter: SongsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nameTextView.text = category.name

        Glide.with(binding.coverImgView).load(category.coverUrl)
            .apply(
                RequestOptions().transform(RoundedCorners(32))
            )
            .into(binding.coverImgView)

        setUpSongsListRecylerView()
    }

    fun setUpSongsListRecylerView(){
        songsListAdapter = SongsListAdapter(category.songs)
        binding.songsListRecylerView.layoutManager = LinearLayoutManager(this)
        binding.songsListRecylerView.adapter = songsListAdapter
    }

}