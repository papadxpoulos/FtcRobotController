package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.mechDistance;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class revTest extends OpMode {

    mechDistance dist = new mechDistance();
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;

    @Override
    public void init() {
        dist.init(hardwareMap);
        frontLeft = hardwareMap.get(DcMotor.class,"B");
        frontRight = hardwareMap.get(DcMotor.class,"F");
        backLeft = hardwareMap.get(DcMotor.class,"A");
        backRight = hardwareMap.get(DcMotor.class,"E");
    }
    @Override
    public void loop() {
        telemetry.addData("distance", dist.getDistance());
    }

}