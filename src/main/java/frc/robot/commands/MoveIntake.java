import frc.robot.Constants;
import frc.robot.Robot;

public class move intake extends CommandBase
{
    private double speed
    public MoveIntake(double speed){
        this.speed = speed;
    }

    @Override
    public void initalize(){
        Robot.m_robotContainer.getIntake().MoveIntake(speed);

    }

    @Override 
    public void execute(){
        Robot.m_robotContainer.getIntake().MoveIntake(speed)
    }

    @Override
    public boolean isFinished(){
        if (speed>0){
        return !Robot.m_robotContainer.getJoystick().getRawButtonPressed(Constants.INTAKE_IN_BUTTON)
        }
        return !Robot.m_robotContainer.getJoystick().getRawButtonPressed(Constants.INTAKE_OUT_BUTTON)


    }

    @Override
    public void end(){
        Robot.m_robotContainer.getIntake().stopIntake();
    }
}