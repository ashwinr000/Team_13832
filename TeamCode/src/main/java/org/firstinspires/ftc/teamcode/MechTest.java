package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Mech", group="13832")

public class MechTest extends LinearOpMode {

    private DcMotor mechMotor = null;
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {

        mechMotor = hardwareMap.dcMotor.get("mechMotor");
        telemetry.addData("Status", "Running");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            mechMotor.setPower(1);
        }

        mechMotor.setPower(0);
    }
}
