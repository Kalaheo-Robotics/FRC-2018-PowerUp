/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3800.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj.GyroBase;
// import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3800.robot.RobotMap;
// import edu.wpi.first.wpilibj.IterativeRobot;
// import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import com.ctre.phoenix.motorcontrol.can.*;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
	
	private WPI_TalonSRX _leftFrontMotor;
	private WPI_TalonSRX _leftBackMotor;
	private WPI_TalonSRX _rightFrontMotor;
	private WPI_TalonSRX _rightBackMotor;
    
    private static MecanumDrive _drive;
    
    private static ADXRS450_Gyro gyro;
 
	public void init() {
	    _leftFrontMotor = new WPI_TalonSRX(RobotMap.leftFrontMotor);
	    _leftBackMotor = new WPI_TalonSRX(RobotMap.leftBackMotor);
	    _rightFrontMotor = new WPI_TalonSRX(RobotMap.rightFrontMotor);
	    _rightBackMotor = new WPI_TalonSRX(RobotMap.rightBackMotor);
	    
	    gyro.reset();
	    
	    _drive = new MecanumDrive(_leftFrontMotor, _leftBackMotor, _rightFrontMotor, _rightBackMotor);
	}

	public static void setMecanum(double x, double y, double rot, double gyro) {
        _drive.driveCartesian(x, y, rot, gyro);
    }
	
	public static double getgyroval() {
		return(gyro.getAngle());
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
