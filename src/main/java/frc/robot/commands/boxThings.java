package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.boxLoader;
import frc.robot.subsystem.boxShooter;

public class boxThings extends CommandBase{
    private static boxLoader boxLoader = new boxLoader();
    private static boxShooter boxShooter = new boxShooter();

    private final XboxController controller = new XboxController(0);

    public void execute() {
        if (controller.getPOV() == -1) {
            boxLoader.setSpeed(0);
            boxShooter.setSpeed(0);
          } else if (controller.getPOV() == 90) {
            boxLoader.setSpeed(0);
            boxShooter.setSpeed(0.5);
          } else if (controller.getPOV() == 180) {
            boxLoader.setSpeed(-0.5);
            boxShooter.setSpeed(0);
          } else if (controller.getPOV() == 270) {
            boxLoader.setSpeed(0);
            boxShooter.setSpeed(-0.5);
          } else if (controller.getPOV() == 0) {
            boxLoader.setSpeed(0.5);
            boxShooter.setSpeed(0);
          }
    }
}
