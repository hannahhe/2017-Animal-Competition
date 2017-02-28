package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class BallIntake extends Subsystem
{
  private final CANTalon ballIntakeRight = RobotMap.ballIntakeRight;
  // ballIntakeRight is inverted

  public void agitate() {
    ballIntakeRight.set(-0.45);
  }

  public void intake(double x) {
    ballIntakeRight.set(-x);
  }

  public void disableBrakeMode() {
    ballIntakeRight.enableBrakeMode(false);
  }

  public void stop() {
    ballIntakeRight.set(0);
  }

  public double getBallIntakeRight() {
    return ballIntakeRight.get();
  }

  protected void initDefaultCommand() {}

}