package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.opencv.core.Mat;

public class RedLong {

    public Trajectory redMidLong1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(-36, -71, Math.toRadians(270));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .back(50)
                .build();
    }

    public Trajectory redMidLong2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-36, -21, Math.toRadians(270)))
                .splineToSplineHeading(new Pose2d(-73, -32, Math.toRadians(180)), Math.toRadians(180))
                .build();
    }

    public Trajectory redMidLong3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-73, -34, Math.toRadians(180)))
                .lineToLinearHeading(new Pose2d(-6, -72, Math.toRadians(0)))
                .build();
    }


    public Trajectory redMidLong4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-6, -72, Math.toRadians(0)))
                .forward(40)
                .build();
    }


/*
    public Trajectory redMidLong4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-6, -72, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(120, -20, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

 */

    public Trajectory redMidLong5(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(34, -72, Math.toRadians(0)))
                .splineToSplineHeading(new Pose2d(126, -23, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory redMidLrg6(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(126, -23))
                .back(10)
                .build();
    }

    public Trajectory redMidLrg7(SampleMecanumDrive drive) {
        return drive.trajectoryBuilder(new Pose2d(116, -23, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(120, -74, Math.toRadians(180)))
                .build();
    }


}
