package com.example.lesson35;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolder>{

    private ArrayList<ChatModel> chats;
    private OnClick onClick;
    public ChatAdapter(ArrayList<ChatModel> chats, OnClick onClick){
        this.chats = chats;
        this.onClick = onClick;
    }


    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        holder.bind(chats.get(position).image, chats.get(position).title, chats.get(position).massage);
        holder.itemView.setOnClickListener(view ->
                onClick.onClick(chats.get(position))
                );

    }

    @Override
    public int getItemCount() {
        return chats.size();
    }
}
