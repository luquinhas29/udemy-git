package entities;

public class OutsourcedEmployee extends Employee {
	private double AdditionalCharge;
	
	public OutsourcedEmployee() {
	}

	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		AdditionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return AdditionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		AdditionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + AdditionalCharge * 1.1;
	}
	
}
