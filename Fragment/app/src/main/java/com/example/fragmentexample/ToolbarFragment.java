package com.example.fragmentexample;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ToolbarFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {
    private static int seekvalue = 10;
    private static EditText editText;

    ToolbarListener activityCallback;

    public interface ToolbarListener {
        public void onButtonClick(int position, String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityCallback = (ToolbarListener)context;
        } catch(ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement ToolvarListener.");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.toolbar_fragment, container, false);

        editText = view.findViewById(R.id.editText1);
        final SeekBar seekBar = view.findViewById(R.id.seekBar1);
        seekBar.setOnSeekBarChangeListener(this);

        final Button button = view.findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked(view);
            }
        });
        return view;
    }

    public void buttonClicked(View view) {
        activityCallback.onButtonClick(seekvalue, editText.getText().toString());
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        seekvalue = progress;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
