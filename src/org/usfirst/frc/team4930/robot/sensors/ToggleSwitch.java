package org.usfirst.frc.team4930.robot.sensors;

import org.usfirst.frc.team4930.robot.RobotMap;

public class ToggleSwitch
{

  public String getSide() {
    String side;
    if (RobotMap.toggleSwitch.get()) {
      side = "Red";
    } else {
      side = "Blue";
    }
    return side;
  }

  public boolean getValue() {
    return RobotMap.toggleSwitch.get();
  }

}
