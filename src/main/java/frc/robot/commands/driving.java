package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.DriveTrain;

public class driving extends CommandBase{
    private final XboxController controller = new XboxController(0);

    private double rot;
    private double speed;

    public void execute() {
        if (controller.getRawAxis(4) >= 0.1 | controller.getRawAxis(4) <= -0.1) {
            rot = controller.getRawAxis(4);
          } else {
            rot = 0;
          }
          if (controller.getRawAxis(1) >= 0.1 | controller.getRawAxis(1) <= -0.1) {
            speed = controller.getRawAxis(1);
          } else {
            speed = 0;
          }
          if (speed >= 0.7) {
            speed = 0.7;
          } else if (speed <= -0.7) {
            speed = -0.7;
          }
          if (rot >= 0.7) {
            rot = 0.7;
          } else if (rot <= -0.7) {
            rot = -0.7;
          }
          DriveTrain.arcadeDrive(-speed, rot);
    }
}
