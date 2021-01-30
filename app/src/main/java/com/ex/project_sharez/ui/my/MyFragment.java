package com.ex.project_sharez.ui.my;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.ex.project_sharez.R;

public class MyFragment extends Fragment {
    String TAG = "MyFragment";

    MyData myData;
    ImageView myIcon;
    TextView myNickname;
    TextView myLocation;

    public MyFragment(MyData myData) {
        this.myData = myData;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bot_my, container, false);

        // Fragment별로 툴바 구성을 다르게 할때 필요
        setHasOptionsMenu(true);

        myIcon = view.findViewById(R.id.my_iv_myImage);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            myIcon.setClipToOutline(true);
        }

        myNickname = view.findViewById(R.id.my_tv_nickName);
        myLocation = view.findViewById(R.id.my_tv_location);

        myNickname.setText(myData.getUserName());
        myLocation.setText(myData.getUserAddress());

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        Log.d("change", "My Menu inflate");
        getActivity().getMenuInflater().inflate(R.menu.bot_menu_my, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(getActivity(), "Click My menu item", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}