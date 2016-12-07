package com.example.android.friendlychat;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by android on 12/5/2016.
 */
public class MessageAdapter extends ArrayAdapter<ChatMessages> {

   public MessageAdapter(Context context, int resource, List<ChatMessages> chatMessages){
        super(context,resource,chatMessages );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.chat_messages,parent,false);
        }

        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);
        TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);

        ChatMessages chatMessages = getItem(position);

        boolean isphoto = chatMessages.getPhotoUrl() != null;

        if(isphoto){
            messageTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext())
                    .load(chatMessages.getPhotoUrl())
                    .into(photoImageView);
        }
        else {
            messageTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            messageTextView.setText(chatMessages.getText());
        }
        authorTextView.setText(chatMessages.getName());

        return convertView;


    }

}
