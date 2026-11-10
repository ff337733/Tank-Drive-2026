// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorTSubsystem extends SubsystemBase {
  /** Creates a new MotorTSubsystem. */
  public SparkMax motorTSS;
  public SparkMax motorTWSS;
  public SparkMax motorTRSS;
  public SparkMax motorTRWSS;
  public MotorTSubsystem() {
    motorTSS = new SparkMax(Constants.OperatorConstants.motorT, MotorType.kBrushless);
    motorTWSS = new SparkMax(Constants.OperatorConstants.motorTR, MotorType.kBrushless);
    motorTRSS = new SparkMax(Constants.OperatorConstants.motorTW, MotorType.kBrushless);
    motorTRWSS = new SparkMax(Constants.OperatorConstants.motorTRW, MotorType.kBrushless);
  }
  public void motorSpeed(double speed){
    motorTSS.set(speed);
    motorTWSS.set(speed);

  }
  public void stopMotor(){
    motorTSS.stopMotor();
    motorTWSS.stopMotor();
  }
     public void motorRSpeed(double speed){
    motorTRSS.set(speed);
    motorTRWSS.set(speed);

  }
  public void stopRMotor(){
    motorTRSS.stopMotor();
    motorTRWSS.stopMotor();

  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
