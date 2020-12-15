public class Bat extends Mammal{

	public Bat() {
		super(400);
	}
	public void fly() {
		System.out.println("hey im a bat");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("eating humans");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("im attacking a town");
		energyLevel -= 70;
	}
	

}