package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DistanceSensor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class mechDistance2 {
    private DistanceSensor distance2;

    public void init(HardwareMap hwMap) {
        distance2 = hwMap.get(DistanceSensor.class, "distance sensor 1");
    }

    public double getDistance () {
        return distance2.getDistance(DistanceUnit.CM);
    }

}
