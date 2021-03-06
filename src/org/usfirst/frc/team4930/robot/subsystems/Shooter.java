package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem
{

  private final CANTalon shooter = RobotMap.shooter;

  public void spinUp(double amount) {
    shooter.set(amount);
  }

  public void clearBalls() {
    shooter.set(-0.9);
  }

  public void disableBrakeMode() {
    shooter.enableBrakeMode(false);
  }

  public void stop() {
    shooter.set(0);
  }

  @Override
  protected void initDefaultCommand() {}

  public double getShooter() {
    return shooter.get();
  }

}
