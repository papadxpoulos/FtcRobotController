package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.mechDistance1;
import org.firstinspires.ftc.teamcode.mechDistance2;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class revTest extends OpMode {

    mechDistance1 dist1 = new mechDistance1();
    mechDistance2 dist2 = new mechDistance2();
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;
    private DcMotor shooter;
    private DcMotor elevator;

    @Override
    public void init() {
        dist1.init(hardwareMap);
        dist2.init(hardwareMap);
        frontLeft = hardwareMap.get(DcMotor.class,"B");
        frontRight = hardwareMap.get(DcMotor.class,"F");
        backLeft = hardwareMap.get(DcMotor.class,"A");
        backRight = hardwareMap.get(DcMotor.class,"E");
        shooter = hardwareMap.get(DcMotor.class,"motor F");
        elevator = hardwareMap.get(DcMotor.class,"motor B");
    }
    @Override
    public void loop() {
        telemetry.addData("distance piso", dist1.getDistance());
        telemetry.addData("distance mprosta",dist2.getDistance());
        if (gamepad1.y) {
            frontLeft.setPower(1);
            frontRight.setPower(1);
            backLeft.setPower(1);
            backRight.setPower(1);
        }
        else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }

        if (gamepad1.x) {
            frontLeft.setPower(-1);
            frontRight.setPower(-1);
            backLeft.setPower(-1);
            backRight.setPower(-1);
        }
        else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
        if (gamepad1.circle) {
            frontLeft.setPower(-1);
            frontRight.setPower(-1);
            backLeft.setPower(1);
            backRight.setPower(1);
        }
        else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
        if (gamepad1.square) {
            frontLeft.setPower(1);
            frontRight.setPower(1);
            backLeft.setPower(-1);
            backRight.setPower(-1);
        }
        else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
        if (gamepad1.left_stick_button) {
            frontLeft.setPower(1);
            frontRight.setPower(-1);
            backLeft.setPower(-1);
            backRight.setPower(1);
        }
        else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
        if (gamepad1.right_stick_button) {
            frontLeft.setPower(-1);
            frontRight.setPower(1);
            backLeft.setPower(1);
            backRight.setPower(-1);
        }
        else {
            frontLeft.setPower(0);
            frontRight.setPower(0);
            backLeft.setPower(0);
            backRight.setPower(0);
        }
        if (gamepad2.y) {
            shooter.setPower(1);
        }
        else {
            shooter.setPower(0);
        }
        if (gamepad2.right_bumper) {
            elevator.setPower(1);
        }
        else {
            elevator.setPower(0);
        }
        if (gamepad2.left_bumper) {
            elevator.setPower(-1);
        }
        else {
            elevator.setPower(0);
        }
    }

}