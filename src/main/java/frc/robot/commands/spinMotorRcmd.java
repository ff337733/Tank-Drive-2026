// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.MotorTSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class spinMotorRcmd extends Command {
  /** Creates a new spinMotorcmd. */
  public MotorTSubsystem motorTSubsystem;
  public CommandXboxController xboxcontrollern;
  public spinMotorRcmd(MotorTSubsystem motorTSubsystem, CommandXboxController xboxcontrollern) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.motorTSubsystem = motorTSubsystem;
    this.xboxcontrollern = xboxcontrollern;

    
  }
  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
     
  }
   
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
         motorTSubsystem.motorRSpeed(xboxcontrollern.getRightY());

  }
    
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    motorTSubsystem.stopRMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
