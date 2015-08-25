package br.com.rapidweb.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class ContactAdapter extends BaseAdapter {

    private Contact[] contacts = new Contact[] {
        new Contact("Fabiano", "234-5678", "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRIgNo6HgIAcATyMKvcDLYJZOJRHqPEDJAlNq-GOR5KSNc3YuxZlg"),
        new Contact("Fabiano", "234-5678", "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRIgNo6HgIAcATyMKvcDLYJZOJRHqPEDJAlNq-GOR5KSNc3YuxZlg")
    };

    private LayoutInflater inflater;

    private Context context;

    public ContactAdapter (Context context) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
    }

    @Override
    public int getCount() {
        return contacts.length;
    }

    @Override
    public Object getItem(int position) {
        return contacts[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if (convertView == null) {
            view = inflater.inflate(R.layout.contact_item, parent, false);
        } else {
            view = convertView;
        }

        Contact c = contacts[position];

        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtPhone = (TextView) view.findViewById(R.id.txtPhone);
        ImageView img = (ImageView) view.findViewById(R.id.imgPhoto);

        txtName.setText(c.getName());
        txtPhone.setText(c.getPhone());

        Picasso.with(this.context).load(c.getImage()).placeholder(R.drawable.images).into(img);

        return view;
    }
}
