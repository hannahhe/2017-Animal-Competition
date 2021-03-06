package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CloseGearGadget extends Command
{

  public CloseGearGadget() {
    requires(Robot.gearGadget);
  }

  @Override
  protected void initialize() {}

  @Override
  protected void execute() {
    Robot.gearGadget.close();
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.gearGadget.stop();
  }

  @Override
  protected void interrupted() {
    end();
  }
}
