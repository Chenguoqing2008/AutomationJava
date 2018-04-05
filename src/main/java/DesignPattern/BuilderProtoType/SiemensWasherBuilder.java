package DesignPattern.BuilderProtoType;

public class SiemensWasherBuilder implements WasherBuilder {
	
	private DesignPattern.BuilderProtoType.SiemensWasher siemensWasher = new SiemensWasher();


	public void buildeWasherBody() {
		siemensWasher.setWasherDoor("又开");
		siemensWasher.setWasherColor("白色");
	}

	public void buildeWasherEngine() {
		Compressor audiEngine = new Compressor("强制冷压缩机");
		siemensWasher.setWasherEngine(audiEngine);
	}

	public void buildeWasherSkeleton() {
		siemensWasher.setWasherSkeleton("中国原产");
	}

	public void buildeWasherWheels() {
		siemensWasher.setWasherWheels("������");
	}
	
	public SiemensWasher retrieveWasher(){
		return siemensWasher;
	}


}
 
