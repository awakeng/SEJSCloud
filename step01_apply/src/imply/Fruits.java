package imply;

public class Fruits {
	private String name;
	private int brix;
	private String region;
	
	
	public Fruits() {}
	public Fruits(String name, int brix, String region) {
		this.name = name;
		this.brix = brix;
		this.region = region;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBrix() {
		return brix;
	}
	public void setBrix(int brix) {
		this.brix = brix;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
}
