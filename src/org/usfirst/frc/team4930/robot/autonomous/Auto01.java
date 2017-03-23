package org.usfirst.frc.team4930.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Auto Dial (01): Drive forward across line.
 * Red/Blue: Ignored.
 * ReplayCode: Ignored.
 *
 *                     ^
 *                     |
 *                     |
 *                     |
 *                    [^]
 *     _____________________
 */
public class Auto01 extends CommandGroup
{
  public Auto01() {

    System.out.println("AUTO 01: Initializing");

    // 4 ft/s * .75 = 3 ft/s // drive speed
    // 3 ft/s * 4.5s = 13.5 ft // distance traveled

    // move forward for 4.5 seconds at 3/4 speed
    addSequential(new GoStraightDR(0.75, 4.5), 5);

  }
}
