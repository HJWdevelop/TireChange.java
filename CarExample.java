package Chapter07;

public class CarExample {

	public static void main(String[] args) {
		Car c = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = c.run();
			if(problemLocation !=0) {
				System.out.println(c.tires[problemLocation-1].location+"HankookTire로 교체");
				c.tires[problemLocation -1] = new HankookTire(c.tires[problemLocation-1].location, 15);
				}
			System.out.println("----------------------");
		}
}
}
