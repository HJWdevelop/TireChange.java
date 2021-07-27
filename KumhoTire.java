package Chapter07;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
		@Override
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation<maxRotation) {
				System.out.println(location + "금호 Tire의 수명 : "+(maxRotation-accumulatedRotation));
				return true;
			}
			else {
				System.out.println("***"+location+"금호 Tire 펑크***");
				return false;
			}
		}
	}
