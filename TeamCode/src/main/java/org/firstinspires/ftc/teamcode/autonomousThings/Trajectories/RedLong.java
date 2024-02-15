package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

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
                .splineToSplineHeading(new Pose2d(-72, -34, Math.toRadians(180)), Math.toRadians(180))
                .build();
    }

    public Trajectory redMidLong3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-67, -30, Math.toRadians(180)))
                .lineToLinearHeading(new Pose2d(-21, -62, Math.toRadians(0)))
                .build();
    }
}
