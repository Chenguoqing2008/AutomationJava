package DesignPattern.BuilderProtoType;

public class SiemensWasher {
	
	private String washerSkeleton;
	private Compressor washerEngine;
	private String washerWheels;
	private String washerDoor;
	private String washerColor;
	public SiemensWasher(){	}
	

	public void setWasherColor(String washerColor) {
		this.washerColor = washerColor;
	}

	public void setWasherDoor(String washerDoor) {
		this.washerDoor = washerDoor;
	}

	public void setWasherEngine(Compressor washerEngine) {
		this.washerEngine = washerEngine;
	}

	public void setWasherSkeleton(String washerSkeleton) {
		this.washerSkeleton = washerSkeleton;
	}

	public void setWasherWheels(String washerWheels) {
		this.washerWheels =washerWheels;
	}

	public String toString(){
		return washerSkeleton+ "," + washerEngine.toString() +"," + washerWheels + "," +
		washerDoor + "," + washerColor  ;			
	}
}
