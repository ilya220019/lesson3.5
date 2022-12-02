package com.example.lesson35;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class ListFragment extends Fragment implements OnClick {

    RecyclerView chatsRecyclerView;
    ChatAdapter chatAdapter;
    private ArrayList<ChatModel> chats;
    FloatingActionButton floatingActionButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        chats = new ArrayList<>();
        chatsRecyclerView = view.findViewById(R.id.chap_tv);
        setChats();
        chatAdapter=new ChatAdapter(chats, this);
        chatsRecyclerView.setAdapter(chatAdapter);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onClick(View v) {
                chats.add(0,new ChatModel(R.drawable.bbhic_launcher_background,"newchat","drfghjk"));
                chatAdapter.notifyDataSetChanged();
            }
        });
    }
    private void setChats(){
        chats.add(new ChatModel(R.drawable.ic_launcher_background, "a1", "a1"));
        chats.add(new ChatModel(R.drawable.bbhic_launcher_background, "a2", "a2"));
        chats.add(new ChatModel(R.drawable.ic_launcher_background, "a3", "a3"));
        chats.add(new ChatModel(R.drawable.bbhic_launcher_background, "a4", "a4"));
        chats.add(new ChatModel(R.drawable.ic_launcher_background, "a5", "a5"));
        chats.add(new ChatModel(R.drawable.bbhic_launcher_background, "a6", "a6"));
        chats.add(new ChatModel(R.drawable.ic_launcher_background, "a7", "a7"));
        chats.add(new ChatModel(R.drawable.bbhic_launcher_background, "a8", "a8"));
        chats.add(new ChatModel(R.drawable.ic_launcher_background, "a9", "a9"));
        chats.add(new ChatModel(R.drawable.bbhic_launcher_background, "a10", "a10"));
        chats.add(new ChatModel(R.drawable.ic_launcher_background, "a11", "a11"));
    }

    @Override
    public void onClick(ChatModel chatModel) {
        Bundle bundle = new Bundle();
        DetailsFragment detailsFragment = new DetailsFragment();
        bundle.putString("title",chatModel.title);
        bundle.putString("message",chatModel.massage);
        bundle.putInt("image",chatModel.image);
        detailsFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,detailsFragment).addToBackStack("").commit();
    }
}