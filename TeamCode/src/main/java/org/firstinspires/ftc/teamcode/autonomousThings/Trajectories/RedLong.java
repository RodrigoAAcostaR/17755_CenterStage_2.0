package org.firstinspires.ftc.teamcode.autonomousThings.Trajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class RedLong {

    public Trajectory rojoLargo1(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d())
                .build();
    }
}
