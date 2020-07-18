package com.example.gymadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

   private workoutexpert expert=new workoutexpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void workoutdetails(View view){

        TextView workout =(TextView) findViewById(R.id.workout);

        Spinner workselect =(Spinner) findViewById(R.id.workselect);

        String work= String.valueOf(workselect.getSelectedItem());

//        workout.setText(work);

        List<String > workoutlist =expert.getWorkouts(work);

        StringBuilder workoutsformatted =new StringBuilder();

        for(String work1 :workoutlist)
        {
            workoutsformatted.append(work1).append('\n');
        }

        workout.setText(workoutsformatted);

    }
}
