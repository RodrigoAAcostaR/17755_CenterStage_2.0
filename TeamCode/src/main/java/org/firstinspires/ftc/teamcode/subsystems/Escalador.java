package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Escalador extends SubsystemBase {
    private DcMotorEx escalador;
    private Telemetry telemetry;
    private HardwareMap hardwareMap;

    private Servo launcher;

    public Escalador(HardwareMap hardwareMap, Telemetry telemetry){
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;

        escalador = hardwareMap.get(DcMotorEx.class, "escalador");
        escalador.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        launcher = hardwareMap.get(Servo.class, "launcher");

    }

    public void setPower(double power){
        escalador.setPower(power);
    }

    public void setPosition(int pos){
        escalador.setPower(1);
        escalador.setTargetPosition(pos);
        escalador.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void launch(){
        launcher.setPosition(.95);
    }

    public void setLaunch(){
        launcher.setPosition(.4);
    }

    public void open(){
        launcher.setPosition(0);
    }

    public boolean isAtSetpoint() {
        boolean isAtPosition = escalador.getCurrentPosition() - escalador.getTargetPosition() < escalador.getTargetPositionTolerance();
        return isAtPosition;
    }

    @Override
    public void periodic(){
        telemetry.addData("Elevador: ", escalador.getCurrentPosition());
    }

}
