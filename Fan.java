package school;

public class Fan {
	
	private int speed;
	private double radius;
	private String color;
	private boolean switchedOn;
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	
	public Fan () {
		speed  = SLOW;
		switchedOn = false;
		radius = 5;
		color = "blue";
	}
	public int getSpeed() {
		return speed;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public boolean getSwitchedOn() {
		return switchedOn;
	}
	public void setSpeed(int newSpeed) {
		if (newSpeed < 1 || newSpeed > 3) {
			System.out.println("Choose a valid value for the speed");
		}else {
		speed = newSpeed;
		}
	}
	public void setRadius (double newRadius) {
		radius = newRadius;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public void turnOn (boolean isOn) {
		switchedOn = isOn;
	}
	public String toString() {
		String n;
		if (switchedOn) {
			n = ("The fan is switched on:\nspeed - " + speed + "\nradius - " + radius + "\ncolor - " + color);
		}else {
			n = ("The fan is switched off:" + "\nradius - " + radius + "\ncolor - " + color);
		}
		return n;
	}
	
}
