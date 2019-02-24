package enumerations;

enum Count{
	One, Two, Three, Four, Five
}

enum AdvCount{
	One(1), Two(2), Three(3), Four(4), Five(5);
	
	private int val;
	
	AdvCount(int val){
		this.val = val;
	}
	
	int getval() {
		return val;
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		System.out.println("----------SIMPLE COUNT----------");
		Count five;
		five = Count.Five;
		System.out.println("Five = " + five);
		System.out.println("Value of Five = " + Count.valueOf("Five"));
		
		Count allNumbers[] = Count.values();
		for(Count num : allNumbers) {
			System.out.println(num);
		}
		
		System.out.println("----------ADVANCE COUNT----------");
		AdvCount advFive = AdvCount.Five;
		AdvCount allNums[] = AdvCount.values();
		for(AdvCount num : allNums) {
			System.out.println(num.getval() + " - " + num);
		}
		
		System.out.println("----------SOMETHING MORE----------");
		System.out.println("Ordinal...");
		for(Count num : allNumbers) {
			System.out.println(num.ordinal() + " - " + num);
		}
		
		System.out.println("Ordinal Comparison");
		System.out.println(Count.One.compareTo(Count.Four));
		
		System.out.println("Equals");
		System.out.println("AdvFive and Five : " + AdvCount.Five.equals(Count.Five));
		System.out.println("Five and Five : " + Count.Five.equals(Count.Five));
	}

}
