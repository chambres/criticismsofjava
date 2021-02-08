package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class moveHatch extends CommandBase{
    public static boolean move = false;

    @Override
    public void execute()
    {
        move = !move; //what in gods name is the point of this ujjaini
        RobotContainer.getHatch().movehatch(move);
    }
    
    @Override
    public boolean isFinished()
    {
        return true;
    }
}