package info.androidhive.firebase;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 5/11/2018.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
ArrayList<User> users;
    int flags[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, ArrayList<User> users) {
        this.context = context;
        this.users = users;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }
public void SetData(ArrayList<User> users)
{
    this.users = users;
    notifyDataSetChanged();
}
    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView country = (TextView)           view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(users.get(i).name+" "+users.get(i).email);
        Log.e("customadapter",""+i);
       // icon.setImageResource(flags[i]);
        return view;
    }
    }