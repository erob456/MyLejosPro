package lejos.controller;

import lejos.model.Robot;
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class RobotController
{
	private Robot myRobot;
	
	public RobotController()
	{
		myRobot = new Robot(this);
	}
	public void start()
	{	
		
		Button.waitForAnyPress();
		try
		{
			Thread.sleep(500);
		}
		catch (InterruptedException ie)
		{
			System.out.println(ie);
		}
		
		myRobot.objectAvoid();
		//myRobot.square();
		//myRobot.triangle();
		//myRobot.hexagon();
		//myRobot.octagon();
		//myRobot.circle();
	}
}
