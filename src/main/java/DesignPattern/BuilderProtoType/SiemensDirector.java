package DesignPattern.BuilderProtoType;

public class SiemensDirector {
	WasherBuilder builder;

	public SiemensDirector(WasherBuilder builder){
		this.builder = builder;
	}

	public void contruct(){
		builder.buildeWasherSkeleton();
		builder.buildeWasherEngine();
		builder.buildeWasherWheels();
		builder.buildeWasherBody();
	}
}