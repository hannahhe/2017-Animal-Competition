package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem
{

  @Override
  public void initDefaultCommand() {}

  public void climb(double x) {
    RobotMap.climber.set(-x);
  }

  public void enableBrakeMode() {
    RobotMap.climber.enableBrakeMode(true);
  }

  public void stop() {
    RobotMap.climber.set(0.0);
  }

  public double getClimber() {
    return -RobotMap.climber.get();
  }
}
