package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.opencv.core.Mat;

public class AzulCorto {

    public Trajectory azulMid1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(12.29, 66.17, Math.toRadians(90));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .back(50)
                .build();
    }

    public Trajectory azulMid2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(12.29, 16.17, Math.toRadians(90)))
                .splineToSplineHeading(new Pose2d(77, 35, Math.toRadians(0.00)), Math.toRadians(0.00))
                .build();
    }

    public Trajectory azulMid3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(77, 35))
                .back(10)
                .build();
    }

    public Trajectory azulMid4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(67, 35, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(77, -20, Math.toRadians(180)))
                .build();
    }

    public Trajectory azulIzq1(SampleMecanumDrive drive){
        Pose2d firstPose = new Pose2d(12.29, 66.17, Math.toRadians(90));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(firstPose)
                .lineTo(new Vector2d(28, 26))
                .build();
    }

    public Trajectory azulIzq2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(28, 26))
                .splineToSplineHeading(new Pose2d(80, 44, Math.toRadians(0)), Math.toRadians(0))
                .build();
    }

    public Trajectory azulIzq3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(80, 44, Math.toRadians(0)))
                .back(10)
                .build();
    }

    public Trajectory azulIzq4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(70, 44, Math.toRadians(0)))
                .lineToLinearHeading(new Pose2d(77, -20, Math.toRadians(180)))
                .build();
    }
}
