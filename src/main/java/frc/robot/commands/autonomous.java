package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.DriveTrain;
import frc.robot.subsystem.autonSubsystem;

public class autonomous extends CommandBase {
    
  private autonSubsystem atonSub = new autonSubsystem();
  private int stage = autonSubsystem.stage;

  public void execute() {
    if (atonSub.getTime() < 1.0 & stage == 0) {
      DriveTrain.arcadeDrive(0.0, 0.5);
    } else if (atonSub.getTime() < 1.0 & stage == 1) {
      DriveTrain.arcadeDrive(0.5, 0.0);
    } else if (atonSub.getTime() < 1.0 & stage == 2) {
      DriveTrain.arcadeDrive(0.0, 0.5);
    } else if (atonSub.getTime() < 1.0 & stage == 3) {
      DriveTrain.arcadeDrive(0.5, 0.0);
    } else {
      DriveTrain.stop(); // stop robot
      stage += 1;
      atonSub.resetTimer();
    }
  }
}
