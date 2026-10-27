// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.utils.Kraken;

public class MotorTSubsystem extends SubsystemBase {
  /** Creates a new MotorTSubsystem. */
  public Kraken motorTSS;
  public MotorTSubsystem() {
    motorTSS = new Kraken(Constants.OperatorConstants.motorT);
  }
  public void motorSpeed(){
    motorTSS.setMotorSpeed(Constants.OperatorConstants.motorSpeed);
  }
  public void stopMotor(){
    motorTSS.stopMotor();
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
