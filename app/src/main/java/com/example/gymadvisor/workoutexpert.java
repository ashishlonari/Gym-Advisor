package com.example.gymadvisor;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class workoutexpert {

    List<String> getWorkouts  (String workouttypes)
    {
        List<String> workout=new ArrayList<String>();

        if(workouttypes.equals("Chest"))
        {
            workout.add("Bench Press");
            workout.add("Bench Flys");
            workout.add("Machine Flys");
        }

        else if(workouttypes.equals("Biceps"))
        {
            workout.add("Picher Gun");
            workout.add("Bicep Pullups");
            workout.add("Biceps Curls");
        }
        else if (workouttypes.equals("Triceps"))
        {
            workout.add("Rope");
            workout.add("Extension");
        }

        else if(workouttypes.equals("Back"))
        {
            workout.add("Lat Pull Down");
        }
        else if(workouttypes.equals("Legs"))
        {
            workout.add("Press Leg");
        }
        return workout;

    }


}
