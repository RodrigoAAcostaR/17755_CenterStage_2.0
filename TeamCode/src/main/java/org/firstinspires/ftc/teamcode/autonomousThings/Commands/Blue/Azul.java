package org.firstinspires.ftc.teamcode.autonomousThings.Commands.Blue;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

@Autonomous
public class Azul extends CommandOpMode {

    AzulMidCorto azulMidCorto;
    AzulIzqCorto azulIzqCorto;
    AzulDerCorto azulDerCorto;
    Elevador elevador;
    SampleMecanumDrive drive;
    MecanumDriveSubsystem driveSubsystem;
    Intake intake;

    @Override
    public void initialize() {
        drive = new SampleMecanumDrive(hardwareMap);
        intake = new Intake(hardwareMap, telemetry);
        elevador = new Elevador(hardwareMap, telemetry);
        driveSubsystem = new MecanumDriveSubsystem(drive, false);
        //azulMidCorto = new AzulMidCorto(driveSubsystem, elevador);
        azulIzqCorto = new AzulIzqCorto(driveSubsystem, elevador);
        //azulDerCorto = new AzulDerCorto(driveSubsystem, elevador);

        schedule(azulIzqCorto);
    }
}
