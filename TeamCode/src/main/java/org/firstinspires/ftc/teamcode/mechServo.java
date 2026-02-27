package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class mechServo {
    private Servo servoPos;

    public void init(HardwareMap hwMap) {
        servoPos = hwMap.get(Servo.class,"port0exp");
        
    }
}
