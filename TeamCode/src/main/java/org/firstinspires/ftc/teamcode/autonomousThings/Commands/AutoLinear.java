package org.firstinspires.ftc.teamcode.autonomousThings.Commands;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;


@Autonomous
public class AutoLinear extends LinearOpMode {
    @Override
    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        Pose2d firstPose = new Pose2d(-34.78, -61.03, Math.toRadians(90.00));
        drive.setPoseEstimate(firstPose);
        Trajectory Rojo = drive.trajectoryBuilder(firstPose)
                .splineTo(new Vector2d(-35.20, -25.34), Math.toRadians(90))
                .splineTo(new Vector2d(-35.62, -47.14), Math.toRadians(160))
                .splineTo(new Vector2d(-65.61, -36.03), Math.toRadians(180))
                .build();

        waitForStart();

        if(isStopRequested())return;

        drive.followTrajectory(Rojo);

    }
}
