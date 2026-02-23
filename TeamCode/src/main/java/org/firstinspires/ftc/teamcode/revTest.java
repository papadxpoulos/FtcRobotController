package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.me
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp
public class revTest extends OpMode {

    mechDistance dist = new mechDistance();

    @Override
    public void init() {
        dist.init(hardwareMap);
    }
    @Override
    public void loop() {
        telemetry.addData("distance", dist.getDistance());
    }

}