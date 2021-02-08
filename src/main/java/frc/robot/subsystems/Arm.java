import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.SteelTalonsController;

public void checkin(){
    if ((Robot.armPot.get() >= Constants.armtop) || (Robot.armPot.get() <= Constants.armbottom)){
        return false; //stops it i think
    }
    else{
        return true; //else do whatever yknow
    }
}


public class Arm extends SubsystemBase {
    /**
     * Creates a new ExampleSubsystem.
     */
    public SteelTalonsController Arm;
    private SpeedController armmotor;


    public Arm(SpeedController armmotor){
         //this is supposed to go out of this class but idk why so i'll leave it here as a learning moment
        this.arm = armmotor;
         
        
  
    }
  
    public void movetheArm(double armspeed) {
        if checkin(){
            armmotor.set(armspeed); //else do whatever yknow
        }
        else{
            armmotor.set(0);
        }   
    }
    public void stop(){
        armmotor.set(0); //CEASE
    }

    
    @Override
    public void periodic() {
        if !checkin(){
            armmotor.set(0); //else do whatever ykno
    }
  }