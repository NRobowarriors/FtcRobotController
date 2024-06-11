/*package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@Autonomous(name = "auto")
public class auto extends LinearOpMode {
//private AutoMethods autoMethods;
private DcMotor left_front_drive, left_back_drive, right_front_drive, right_back_drive;

@Override
public void runOpMode() throns InterruptedException {
    left_front_drive = hardwareMap.DcMotor.get(left_front_drive);
    right_front_drive = hardwareMap.DcMotor.get(right_front_drive);
    left_back_drive = hardwareMap.DcMotor.get(left_back_drive);
    right_back_drive = hardwareMap.DcMotor.get(right_back_drive);
    left_front_drive.setDirection(DcMotor.Direction.REVERSE );
    right_front_drive.setDirection(DcMotor.Direction.REVERSE);
    left_back_drive.setDirection(DcMotorSimple.Direction.FORWARD);
    right_back_drive.setDirection(DcMotorSimple.Direction.FORWARD);
    left_front_drive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    right_front_drive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    left_back_drive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    right_back_drive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    //AutoMethods = new AutoMethods(left_front_drive, left_back_drive, right_front_drive, right_back_drive);

    waitForStart();

}
}

 */