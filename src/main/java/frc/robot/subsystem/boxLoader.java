package frc.robot.subsystem;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class boxLoader {
  private static final Spark Motor1 = new Spark(4);
  private static final Spark Motor2 = new Spark(5);

  public void setSpeed(double speed) {
    Motor1.set(-speed);
    Motor2.set(speed);
  }

  public void stop() {
    Motor1.stopMotor();
    Motor2.stopMotor();
  }
}
