package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp
public class revTest extends OpMode {
    @Override
    public void init() {
        sensorDistance1 = hardwareMap.get(DistanceSensor.class, "distance sensor 1");
        sensorDistance2 = hardwareMap.get(DistanceSensor.class, "distance sensor 2");
    }
    @Override
    public void loop() {

    }


}
