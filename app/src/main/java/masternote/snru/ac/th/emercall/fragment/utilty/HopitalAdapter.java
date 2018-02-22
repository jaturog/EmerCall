package masternote.snru.ac.th.emercall.fragment.utilty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Admin on 22/02/61.
 */

public class HopitalAdapter extends BaseAdapter{

//Explicit

    private Context context;
    private int[] ints;
    private  String[] titleStrings,phoneStrings;

    public HopitalAdapter(Context context, int[] ints, String[] titleStrings, String[] phoneStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.phoneStrings = phoneStrings;
    }

    @Override
    public int getCount() {
        return ints.length;
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

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);





        return null;
    }
} //Main Class