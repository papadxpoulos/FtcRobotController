package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp
public class revTest extends OpMode {
    @Override
    public void init() {
        sensorDistance1 = hardwareMap.get(DistanceSensor.class, "sensor_distance"); // change sensor_distance1 to its name
        sensorDistance2 = hardwareMap.get(DistanceSensor.class, "sensor_distance"); // change sensor_distance2 to its name
    }
    @Override
    public void loop() {

    }


}
