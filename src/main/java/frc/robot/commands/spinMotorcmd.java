// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.MotorTSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class spinMotorcmd extends Command {
  /** Creates a new spinMotorcmd. */
  public MotorTSubsystem motorTSubsystem;
  public spinMotorcmd(MotorTSubsystem motorTSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.motorTSubsystem = motorTSubsystem;
    addRequirements(motorTSubsystem);
    
  }
  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
     motorTSubsystem.motorSpeed();
  }
   
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
         motorTSubsystem.motorSpeed();

  }
    
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    motorTSubsystem.stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
