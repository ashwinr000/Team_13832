package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;

/**
 * Created by ashwinr on 10/24/17.
 */


@Autonomous(name="Autonomous using encoders", group="AutoBot")

public class Autonomous1 extends LinearOpMode{

    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();

    static final double COUNT_PER_MOTOR_REV = 1440;
    static final double DRIVE_GEAR_REDUCTION = 2.0;
    static final double WHEEL_DIAMETER_INCHES = 4.0;
    static final double COUNT_PER_INCH = (COUNT_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /
                                                       (WHEEL_DIAMETER_INCHES * 3.1415);

    static final double FORWARD_SPEED = 0.55;
    static final double TURN_SPEED = 0.5;


    @Override
    public void runOpMode(){

        robot.init(hardwareMap);

        // showing telemetry message to indicate robot wait
        telemetry.addData("Status", "Resetting Encoders");
        telemetry.update();

        // resetting robot motors with encoders
        robot.leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        // using robot motors with encoders
        robot.leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        // sending telemetry message that robot that resetting encoders is a success
        telemetry.addData("Path0",  "Starting at %7d :%7d",
                robot.leftDrive.getCurrentPosition(),
                robot.rightDrive.getCurrentPosition());
        telemetry.update();

        // waiting for driver to click play
        waitForStart();




    }


}
