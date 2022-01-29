package frc.robot.subsystem;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class autonSubsystem extends SubsystemBase{

    private Timer time = new Timer();
    public static int stage = 0;

    public double getTime() {
        return time.get();
    }

    public void resetTimer() {
        time.reset();
    }

    public void start() {
        time.reset();
        time.start();
        stage = 0;
    }
}
