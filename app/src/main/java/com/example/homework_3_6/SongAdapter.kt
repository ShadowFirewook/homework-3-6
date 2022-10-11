package com.example.homework_3_6
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_3_6.databinding.ItemSongBinding
import java.util.ArrayList

class SongAdapter(
    val songList: ArrayList<Song>,
    val onClick:(position: Int) -> Unit
    ): RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(ItemSongBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return songList.size
    }


    inner class  SongViewHolder(private val binding: ItemSongBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = songList[adapterPosition]

            binding.numberSong.text = item.number.toString()
            binding.name.text = item.name
            binding.time.text = item.time
            binding.songName.text = item.songName
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
        }
    }
}