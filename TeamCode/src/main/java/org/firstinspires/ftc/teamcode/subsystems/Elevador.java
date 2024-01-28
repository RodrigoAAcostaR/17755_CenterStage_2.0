package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Elevador extends SubsystemBase {
    private DcMotorEx elevator;
    private Telemetry telemetry;
    private HardwareMap hardwareMap;

    public Elevador(HardwareMap hardwareMap, Telemetry telemetry) {
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;

        elevator = hardwareMap.get(DcMotorEx.class, "elevador");
        elevator.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setPosition(double power, int pos) {
        elevator.setPower(power);
        elevator.setTargetPosition(pos);
        elevator.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void setPower(double power) {
        elevator.setPower(power);
    }


    public boolean isAtSetpoint() {
        boolean isAtPosition = elevator.getCurrentPosition() - elevator.getTargetPosition() < elevator.getTargetPositionTolerance();
        return isAtPosition;
    }

    @Override
    public void periodic(){
        telemetry.addData("Elevador: ", elevator.getCurrentPosition());
    }
}
