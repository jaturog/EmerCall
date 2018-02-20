package masternote.snru.ac.th.emercall.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import masternote.snru.ac.th.emercall.R;

/**
 * Created by Admin on 20/02/61.
 */

public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.fragment_pcilce, container, false);
        return View;
    }
}  // Main class
