package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class Intake extends SubsystemBase {
    private DcMotorEx intake;
    private ServoEx x1, x2;
    private Telemetry telemetry;
    private HardwareMap hardwareMap;

    public Intake(HardwareMap hardwareMap, Telemetry telemetry){
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;

        intake = hardwareMap.get(DcMotorEx.class, "intake");
        x1 = new SimpleServo(hardwareMap, "izq", 0, 360, AngleUnit.DEGREES);
        x2 = new SimpleServo(hardwareMap, "der", 0, 360, AngleUnit.DEGREES);
        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        x2.setInverted(true);

        servoB();
    }

    public void setPower(double power){
        intake.setPower(power);
    }

    public void servoA(){
        x1.turnToAngle(45);
        x2.turnToAngle(45);
    }

    public void servoB(){
        x1.turnToAngle(75);
        x2.turnToAngle(75);
    }

    public void stack(){
        x1.turnToAngle(100);
        x2.turnToAngle(100);
    }

    public void dejar(){
        x1.turnToAngle(70);
        x2.turnToAngle(70);
    }
}
