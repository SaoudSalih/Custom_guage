package gaugechart.ssa.alrais.custom_gauge_ssa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import gaugechart.ssa.alrais.customgaugechart.CustomGauge;


public class MainActivity extends AppCompatActivity {

    CustomGauge guage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
