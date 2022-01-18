package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystem.DriveTrain;

public class autonomous extends CommandBase {

    private final Timer timer = new Timer();

    private boolean reset = false;
    
    public void execute() {
      if (reset == false) {
        timer.reset();
        timer.start();
        reset = true;
      } else {
        if (timer.get() < 2.0) {
            DriveTrain.arcadeDrive(0.5, 0.0); // drive forwards half speed
          } else {
            DriveTrain.stop(); // stop robot
            // drove = true;
            // timer.reset();
          }
      }
    }
}
