/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3800.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Drivetrain
	public static int leftFrontMotor = 1;
	public static int leftBackMotor = 2;
	public static int rightFrontMotor = 3;
	public static int rightBackMotor = 4;

	// Intake
	public static int leftIntakeMotor = 5;
	public static int rightIntakeMotor = 6;
	
	// Lift
	public static int leftLiftMotor = 3;
	public static int rightLiftMotor = 4;
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
