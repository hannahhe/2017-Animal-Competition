package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftUp extends Command
{

  public ShiftUp() {
    requires(Robot.shifter);
  }

  protected void initialize() {
    RobotMap.values.put("close_gadget", RobotMap.values.get("close_gadget") * 1.5);
  }

  protected void execute() {
    Robot.shifter.highGear();
    System.out.println(RobotMap.values.get("close_gadget"));
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {}

  protected void interrupted() {
    end();
  }
}
