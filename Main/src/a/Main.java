package a;

class Bank{
	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	@Override
	float getRateOfInterest() {
		return 6.0f;
	}
}

public class Main {
	public static void main(String[] args) {
		Bank b;
	}
}
