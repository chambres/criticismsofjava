package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class MoveWrist extends CommandBase {
    double speed;
	public MoveWrist(double speed ) {
        this.speed = speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    RobotContainer.Wrist().move(speed);
  }

  @Override
  public void end(boolean interrupted) {
    RobotContainer.Wrist().stop();
  }