package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class MoveArm extends CommandBase {
    double speed;
	public MoveArm(double speed ) {
        this.speed = speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    RobotContainer.Arm().move(speed);
  }

  @Override
  public void end(boolean interrupted) {
    RobotContainer.Arm().stop();
  }