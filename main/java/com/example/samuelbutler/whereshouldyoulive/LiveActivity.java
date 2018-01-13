package com.example.samuelbutler.whereshouldyoulive;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class LiveActivity extends Activity implements SeekBar.OnSeekBarChangeListener {
    SeekBar seekBar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);

        seekBar1=(SeekBar)findViewById(R.id.seekBar8);
        seekBar1.setOnSeekBarChangeListener(this);
        seekBar1.setMax(1000);
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {
        Toast.makeText(getApplicationContext(),"seekbar progress: "+progress, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(getApplicationContext(),"seekbar touch stopped!", Toast.LENGTH_SHORT).show();
    }
}
