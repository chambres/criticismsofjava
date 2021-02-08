import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.SteelTalonsController;

public boolean checkin(){
    if ((Robot.armPot.get() >= Constants.wristtop) || (Robot.armPot.get() <= Constants.wristbottom)){
        return false; //stops it i think
    }
    else{
        return true; //else do whatever yknow
    }
}


public class Wrist extends SubsystemBase {
    /**
     * Creates a new ExampleSubsystem.
     */
    public SteelTalonsController Arm;
    private SpeedController armmotor;


    public Wrist(SpeedController armmotor){
         //this is supposed to go out of this class but idk why so i'll leave it here as a learning moment
        this.wrist = armmotor;
         
        
  
    }
  
    public void movetheWrist(double wristspeed) {
        if checkin(){
            wristmotor.set(wristspeed); //else do whatever yknow
        }
        else{
            wristmotor.set(0);
        }   
    }
    public void stop(){
        wristmotor.set(0); //CEASE
    }

    
    @Override
    public void periodic() {
        if !checkin(){
            wristmotor.set(0); //else do whatever ykno
    }
  }