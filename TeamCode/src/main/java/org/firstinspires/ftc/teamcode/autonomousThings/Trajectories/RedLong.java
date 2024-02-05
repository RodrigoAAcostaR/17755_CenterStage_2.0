package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class RedLong {

    public Trajectory rojo(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(-34.78, -61.03, Math.toRadians(90.00));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .splineTo(new Vector2d(-35.20, -25.34), Math.toRadians(90))
                .splineTo(new Vector2d(-35.62, -47.14), Math.toRadians(160))
                .splineTo(new Vector2d(-65.61, -36.03), Math.toRadians(180))
                .build();

    }

    public Trajectory RojoLargo1(SampleMecanumDrive drive) {
        Pose2d firstPose = new Pose2d(-35.48, -61.72, Math.toRadians(90.00));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .splineTo(new Vector2d(-37.15, -29.92), Math.toRadians(90))
                .build();
    }

    public Trajectory RojoLargo2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-37.15, -29.92), Math.toRadians(90))
                .splineTo(new Vector2d(-36.73, -40.34), Math.toRadians(90))
                .build();
    }

    public Trajectory RojoLargo3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-36.73, -40.34), Math.toRadians(90))
                .splineTo(new Vector2d(-63.53, -36.17), Math.toRadians(180))
                .build();
    }

    public Trajectory RojoLargo4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-63.53, -36.17), Math.toRadians(180))
                .splineTo(new Vector2d(-17.15, -63.39), Math.toRadians(0))
                .build();
    }

    public Trajectory RojoLargo5(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-17.15, -63.39), Math.toRadians(0))
                .splineTo(new Vector2d(45.76, -42.14), Math.toRadians(0))
                .build();
    }
}
