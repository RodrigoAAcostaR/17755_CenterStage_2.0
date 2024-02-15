package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red;

import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;

import org.firstinspires.ftc.teamcode.autonomousThings.Trajectories.RedLong;
import org.firstinspires.ftc.teamcode.commands.IntakeCommand;
import org.firstinspires.ftc.teamcode.commands.TrajectoryFollowerCommand;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

import java.util.function.BooleanSupplier;

public class RojoMidLargo extends SequentialCommandGroup {
    RedLong redLong = new RedLong();

    public RojoMidLargo(MecanumDriveSubsystem drive, Intake intake, Elevador elevador){
        BooleanSupplier sup = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return RojoMidLargo.super.isScheduled();
            }
        };

        addCommands(
                new TrajectoryFollowerCommand(drive, redLong.redMidLong1(drive.getDrive())),
                new TrajectoryFollowerCommand(drive, redLong.redMidLong2(drive.getDrive())),
                new InstantCommand(intake::dejar),
                new IntakeCommand(intake, 1)
        );

    }
}
