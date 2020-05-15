package polymorphism.model.vo;

public class Computer extends Electronic{

	private String cpu;
	private String graphic;
	
	public Computer() {	}

	public Computer(String cpu, String graphic) {
		super();
		this.cpu = cpu;
		this.graphic = graphic;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + cpu + ", " + graphic;
	}
	
}
