package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class AzulLargo {

    public Trajectory azulMid1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(-39, 66.17, Math.toRadians(90));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .back(50)
                .build();
    }

    public Trajectory azulMid2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-39, 16.17))
                .lineToLinearHeading(new Pose2d(-39, 66.17, Math.toRadians(0)))
                .build();

    }
}
