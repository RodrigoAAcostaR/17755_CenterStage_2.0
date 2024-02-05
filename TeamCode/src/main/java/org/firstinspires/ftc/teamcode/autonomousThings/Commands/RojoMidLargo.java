package org.firstinspires.ftc.teamcode.autonomousThings.Commands;

import com.arcrobotics.ftclib.command.SequentialCommandGroup;

import org.firstinspires.ftc.teamcode.autonomousThings.Trajectories.RedLong;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

import java.util.function.BooleanSupplier;

public class RojoMidLargo extends SequentialCommandGroup {
    RedLong redLong = new RedLong();

    public RojoMidLargo(MecanumDriveSubsystem drive){
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return RojoMidLargo.super.isScheduled();
            }
        };

        addCommands(new TrajectoryFollowerCommand(drive, redLong.RojoLargo1(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redLong.RojoLargo2(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redLong.RojoLargo3(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redLong.RojoLargo4(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redLong.RojoLargo5(drive.getDrive()))
        );
    }
}
