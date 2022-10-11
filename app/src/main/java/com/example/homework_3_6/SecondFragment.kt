package com.example.homework_3_6

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_3_6.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val songList = arrayListOf<Song>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = SongAdapter(songList,this::onClick)
        binding.resyclerSong.adapter = adapter
        songList.add(Song("Blank Space","Taylor Swift",1,"3:22"))
        songList.add(Song("Watch Me","Silento",2,"5:36"))
        songList.add(Song("Earned It","The Weekend",3,"4:51"))
        songList.add(Song("The Hills","The Weekend",4,"3:41"))
        songList.add(Song("Writing’s On The Wall","Sam Smith",5,"5:33"))
        songList.add(Song("In Your Eyes","The Weeknd",6,"3:58"))
        songList.add(Song("I Was Never There","The Weeknd",7,"3:20"))
        songList.add(Song("Save Your Tears","The Weeknd",8,"3:37"))
        songList.add(Song("Die for You","The Weeknd",9,"3:48"))
        songList.add(Song("Blinding Lights","The Weeknd",10,"3:24"))

    }
    fun onClick(position: Int){
        val song = songList[position]
        val intent = Intent(this.activity,SecondActivity::class.java)
        intent.putExtra("key",song.songName)
        startActivity(intent)
    }
}