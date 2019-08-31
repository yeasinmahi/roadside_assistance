package com.gits.arafat.roadsideassistance.Others;

import android.view.View;

import com.gits.arafat.roadsideassistance.R;

/**
 * Created by Arafat on 29/07/2017.
 */

public class Utility {
    enum ProblemKey{
        UnDefined,
        RoadSideAssistance,
        KeyLost,
        BatteryProblem,
        OutOfFuel,
        TyreProblem,
        CollisionDamage
    }
    public static String getTitleByProblemKey(ProblemKey key){
        switch (key){
            case KeyLost: return "Key Lost";
            case RoadSideAssistance: return "Road Side Assistance";
            case BatteryProblem: return "Battery Problem";
            case OutOfFuel: return "Out Of Fuel";
            case TyreProblem: return "Tyre problem";
            case CollisionDamage: return "Collision Damage";
            default: return "Undefined";
        }
    }
    public static ProblemKey getProblemKeyById(int problemId){
        switch (problemId){
            case R.id.key_lost: return ProblemKey.KeyLost;
            case R.id.road_side_assistance: return ProblemKey.RoadSideAssistance;
            case R.id.battery_problem: return ProblemKey.BatteryProblem;
            case R.id.out_of_fuel: return ProblemKey.OutOfFuel;
            case R.id.tyre_problem: return ProblemKey.TyreProblem;
            case R.id.collision_damage: return ProblemKey.CollisionDamage;
            default: return ProblemKey.UnDefined;
        }
    }
}
