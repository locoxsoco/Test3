package com.example.test3;

import android.content.Context;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;


public class FriendAdapter extends ArrayAdapter<FriendFb> {

    private Context mContext;
    private List<FriendFb> FriendsList = new ArrayList<>();

    public FriendAdapter(@NonNull Context context, ArrayList<FriendFb> list) {
        super(context, 0 , list);
        mContext = context;
        FriendsList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item_fb_friends,parent,false);

        FriendFb currentFriendFb= FriendsList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.icon);
        image.setImageResource(currentFriendFb.getmImageDrawable());

        TextView name = (TextView) listItem.findViewById(R.id.firstLine);
        name.setText(currentFriendFb.getmName());

        TextView release = (TextView) listItem.findViewById(R.id.secondLine);
        release.setText(currentFriendFb.getmRelease());

        return listItem;
    }
}