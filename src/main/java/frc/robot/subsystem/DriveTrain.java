// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
 
package frc.robot.subsystem;

// import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain {
  static Spark frontLeft = new Spark(0);
  static Spark rearLeft = new Spark(1);
  static MotorControllerGroup left = new MotorControllerGroup(frontLeft, rearLeft);

  static Spark frontRight = new Spark(2);
  static Spark rearRight = new Spark(7);
  static MotorControllerGroup right = new MotorControllerGroup(frontRight, rearRight);

  static DifferentialDrive diffDrive = new DifferentialDrive(left, right);

  public static void setInverted() {
    right.setInverted(true);
  }

  public static void arcadeDrive(double speed, double rotation) {
    diffDrive.arcadeDrive(speed, rotation);
  }

  public static void stop() {
    diffDrive.stopMotor();
  }
}
