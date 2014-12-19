package lejos.model;

import lejos.controller.RobotController;
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;

public class Robot
{

	private UltrasonicSensor botSonar; // 4
	private TouchSensor BotTouch; //
	private SoundSensor BotSound; // 2
	private int getDistance;

	private RobotController baseController;

	public Robot(RobotController baseController)
	{
		this.baseController = baseController;
		//BotTouch = new TouchSensor(SensorPort.S1);
		//BotSound = new SoundSensor(SensorPort.S2);
		//botSonar = new UltrasonicSensor(SensorPort.S4);
		
	}
	
	public int getDistance()
	{
		return getDistance;
	}
	
	public void square()
	{
		int numberOfTimes = 0;
		while (numberOfTimes < 4)
		{
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(750);
			Motor.B.forward();
			Motor.C.backward();
			Delay.msDelay(500);
			numberOfTimes++;
		}
	}

	public void circle()
	{
		int numberOfTimes = 0;
		while (numberOfTimes < 2)
		{
			Motor.B.forward();
			Motor.B.setSpeed(500);
			Motor.C.forward();
			Motor.C.setSpeed(290);
			Delay.msDelay(4020);
			numberOfTimes++;
		}
	}

	public void triangle()
	{
		int numberOfTimes = 0;
		while (numberOfTimes < 3)
		{
			Motor.B.forward();
			//Motor.B.setSpeed(450);
			Motor.C.forward();
			//Motor.C.setSpeed(450);
			Delay.msDelay(1000);
			Motor.B.forward();
			Motor.C.backward();
			Delay.msDelay(460);
			numberOfTimes++;

		}
	}

	public void hexagon()
	{
		int numberOfTimes = 0;
		while (numberOfTimes < 6)
		{
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(600);
			Motor.B.forward();
			Motor.C.backward();
			Delay.msDelay(250);
			numberOfTimes++;
		}
	}

	public void octagon()
	{
		int numberOfTimes = 0;
		while (numberOfTimes < 8)
			
		{
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(600);
			Motor.B.forward();
			Motor.C.backward();
			Delay.msDelay(190);
			numberOfTimes++;
		}
	}
	
	public void objectAvoid()
	{
		if(botSonar.getDistance() < 30)
		{
			Motor.B.backward();
			Motor.C.backward();
			Delay.msDelay(400);
			Motor.B.rotate(120);
			Motor.C.rotate(-120);
		}
		else
		{
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(300);
		}
	}
	
	

}
