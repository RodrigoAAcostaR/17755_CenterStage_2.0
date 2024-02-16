package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.Corto;

import com.arcrobotics.ftclib.command.SequentialCommandGroup;

import org.firstinspires.ftc.teamcode.autonomousThings.Trajectories.RedShort;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

public class RojoDerCorto extends SequentialCommandGroup {
    RedShort redShort = new RedShort();

    public RojoDerCorto(MecanumDriveSubsystem drive, Elevador elevador){

    }
}
