package org.firstinspires.ftc.teamcode.opMode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.commands.ElevadorDefault;
import org.firstinspires.ftc.teamcode.commands.MecanumDriveCommand;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.Elevador;
import org.firstinspires.ftc.teamcode.subsystems.Escalador;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDriveSubsystem;

@TeleOp
public class TeleOpModeFieldCentric2P extends CommandOpMode {
    @Override
    public void initialize() {
        SampleMecanumDrive sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        MecanumDriveSubsystem driveSystem = new MecanumDriveSubsystem(sampleMecanumDrive, true);
        Intake intake = new Intake(hardwareMap, telemetry);
        Elevador elevador = new Elevador(hardwareMap, telemetry);
        Escalador escalador = new Escalador(hardwareMap, telemetry);

        GamepadEx gamepadDriver = new GamepadEx(gamepad1);
        GamepadEx gamepadC = new GamepadEx(gamepad2);

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.RIGHT_BUMPER)
                .whileHeld(()-> intake.setPower(1))
                .whileHeld(()-> intake.servoA())
                .whenReleased(()-> intake.servoB())
                .whenReleased(()-> intake.setPower(0));

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.LEFT_BUMPER)
            .whileHeld(()-> intake.setPower(-.4))
                .whenReleased(()-> intake.setPower(0));

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.Y)
                .whileHeld(()-> escalador.setPower(1))
                .whenReleased(()-> escalador.setPower(0));

        new GamepadButton(new GamepadEx(gamepad2), GamepadKeys.Button.A)
                .whileHeld(()-> escalador.setPower(-1))
                .whenReleased(()-> escalador.setPower(0));

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.DPAD_LEFT)
                .whenPressed(()-> intake.servoA());

        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.DPAD_DOWN)
                .whenPressed(()-> intake.servoB());


        new GamepadButton(new GamepadEx(gamepad1), GamepadKeys.Button.RIGHT_STICK_BUTTON)
                .whenPressed(()-> driveSystem.toggleInverted());

        driveSystem.setDefaultCommand(new MecanumDriveCommand(
                driveSystem, () -> -gamepadDriver.getLeftY(), gamepadDriver::getLeftX, gamepadDriver::getRightX
        ));

        elevador.setDefaultCommand(new ElevadorDefault(elevador, gamepadC, intake));

        schedule(new RunCommand(() -> {
            driveSystem.update();
            telemetry.addData("Heading", driveSystem.getPoseEstimate().getHeading());
            telemetry.update();
        }));
    }
}
