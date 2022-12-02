package com.example.lesson35;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder {
    ImageView chatImageView;
    TextView chatTitleTextView;
    TextView chatMassageTextView;
    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
        chatImageView = itemView.findViewById(R.id.chap_tv);
        chatTitleTextView = itemView.findViewById(R.id.title_id);
        chatMassageTextView = itemView.findViewById(R.id.message_tv);
    }
    public void bind(int image,String title, String message){
        chatImageView.setImageResource(image);
        chatTitleTextView.setText(title);
        chatMassageTextView.setText(message);
    }
}
