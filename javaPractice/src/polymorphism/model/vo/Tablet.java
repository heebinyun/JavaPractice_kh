package polymorphism.model.vo;

public class Tablet extends Electronic{
	
	private boolean penFlag;
	
	public Tablet() {	}

	public Tablet(boolean penFlag) {
		super();
		this.penFlag = penFlag;
	}

	public boolean isPenFlag() {
		return penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + penFlag;
	}
	
}
