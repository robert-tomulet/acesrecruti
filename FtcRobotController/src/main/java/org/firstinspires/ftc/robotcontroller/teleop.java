package org.firstinspires.ftc.robotcontroller;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@Config
@TeleOp
public class teleop extends LinearOpMode {
    public Servo servo;
    @Override
    public void runOpMode() throws InterruptedException {
    servo = hardwareMap.get(Servo.class, "servo1");
    waitForStart();
    while(opModeIsActive()){
        if(gamepad1.circle) servo.setPosition(0);
        if(gamepad1.triangle) servo.setPosition(1);
    }
    }
}
