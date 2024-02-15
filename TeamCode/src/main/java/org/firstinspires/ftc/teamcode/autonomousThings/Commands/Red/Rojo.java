package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.autonomousThings.Commands.Red.RojoMidLargo;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

@Autonomous
public class Rojo extends CommandOpMode {
    RojoMidLargo rojoMidLargo;
    SampleMecanumDrive sampleMecanumDrive;
    MecanumDriveSubsystem drive;
    Intake intake;
    Elevador elevador;
    @Override
    public void initialize() {
        sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        drive = new MecanumDriveSubsystem(sampleMecanumDrive, false, false);
        intake = new Intake(hardwareMap, telemetry);
        elevador = new Elevador(hardwareMap, telemetry);
        rojoMidLargo = new RojoMidLargo(drive, intake, elevador);

        schedule(rojoMidLargo);
    }
}
