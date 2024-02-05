package org.firstinspires.ftc.teamcode.autonomousThings.Commands;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.autonomousThings.Trajectories.RedLong;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

@Autonomous
public class Rojo extends CommandOpMode {
    RojoMidLargo  rojoMidLargo;
    SampleMecanumDrive sampleMecanumDrive;
    MecanumDriveSubsystem drive;
    @Override
    public void initialize() {
        sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        drive = new MecanumDriveSubsystem(sampleMecanumDrive, false);
        rojoMidLargo = new RojoMidLargo(drive);
        schedule(rojoMidLargo);
    }
}
