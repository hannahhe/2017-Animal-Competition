package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.commands.ClearBalls;
import org.usfirst.frc.team4930.robot.commands.Climb;
import org.usfirst.frc.team4930.robot.commands.Intake;
import org.usfirst.frc.team4930.robot.commands.PlaceGear;
import org.usfirst.frc.team4930.robot.commands.Playback;
import org.usfirst.frc.team4930.robot.commands.Record;
import org.usfirst.frc.team4930.robot.commands.ShiftDown;
import org.usfirst.frc.team4930.robot.commands.ShiftUp;
import org.usfirst.frc.team4930.robot.commands.ShootCommandGroup;
import org.usfirst.frc.team4930.robot.commands.StopRecord;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator interface to the commands
 * and command groups that allow control of the robot.
 */
public class OI
{
  public static Joystick joystick0;
  public static Joystick joystick1;
  public static Joystick joystick2;
  public static JoystickButton joystick0button11;

  public static JoystickButton joystick0Button1;
  public static JoystickButton joystick0Button2;
  public static JoystickButton joystick0Button3;
  public static JoystickButton joystick0Button6;
  public static JoystickButton joystick0Button7;
  public static JoystickButton joystick0Button8;
  public static JoystickButton joystick0Button9;

  public static JoystickButton joystick1Button1;
  public static JoystickButton joystick1Button3;
  public static JoystickButton joystick1Button4;
  public static JoystickButton joystick1Button5;
  public static JoystickButton joystick1Button12;

  public static JoystickButton joystick2Button1;
  public static JoystickButton joystick2Button3;
  public static JoystickButton joystick2Button4;
  public static JoystickButton joystick2Button5;
  public static JoystickButton joystick2Button8;
  public static JoystickButton joystick2Button10;
  public static JoystickButton joystick2Button12;

  public OI() {
    joystick0 = new Joystick(0);
    joystick1 = new Joystick(1);

    // delete these when ShiftToggle is implemented....
    joystick0Button2 = new JoystickButton(joystick0, 2);
    joystick0Button2.whenPressed(new ShiftUp());
    joystick0Button3 = new JoystickButton(joystick0, 3);
    joystick0Button3.whenPressed(new ShiftDown());

    // ShiftToggle not yet implemented...
    joystick0Button1 = new JoystickButton(joystick0, 1);
    // joystick0Button1.whenPressed(new ShiftToggle());

    // ChangeOrientation not yet implemented....
    joystick0Button6 = new JoystickButton(joystick0, 6);
    // joystick0Button6.whenPressed(new ChangeOrientation());

    // ChangeCamera not yet implemented.....
    joystick1Button5 = new JoystickButton(joystick1, 5);
    // joystick1Button5.whenPressed(new ChangeCamera());
    joystick2Button5 = new JoystickButton(joystick2, 5);
    // joystick2Button5.whenPressed(new ChangeCamera);

    joystick0button11 = new JoystickButton(joystick0, 11);
    joystick0button11.whileHeld(new Climb());

    joystick1Button1 = new JoystickButton(joystick1, 1);
    joystick1Button1.whileHeld(new Intake());

    joystick1Button3 = new JoystickButton(joystick1, 3);
    joystick1Button3.whileHeld(new ShootCommandGroup());

    joystick1Button4 = new JoystickButton(joystick1, 4);
    joystick1Button4.whileHeld(new ClearBalls());

    joystick1Button12 = new JoystickButton(joystick1, 12);
    joystick1Button12.whileHeld(new PlaceGear());

    joystick2Button1 = new JoystickButton(joystick2, 1);
    joystick2Button1.whileHeld(new ShootCommandGroup());

    joystick2Button3 = new JoystickButton(joystick2, 3);
    joystick2Button3.whileHeld(new Climb());

    joystick2Button4 = new JoystickButton(joystick2, 4);
    joystick2Button4.whileHeld(new ClearBalls());

    joystick2Button8 = new JoystickButton(joystick2, 8);
    joystick2Button8.whenPressed(new Record());

    joystick2Button10 = new JoystickButton(joystick2, 10);
    joystick2Button10.whenPressed(new StopRecord());

    joystick2Button12 = new JoystickButton(joystick2, 12);
    joystick2Button12.whenPressed(new Playback());
  }

  public double getJoystick0() {
    return joystick0.getY();
  }

  public double getJoystick1() {
    return joystick1.getY();
  }
}
