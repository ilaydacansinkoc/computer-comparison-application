//Yucel Ozdemir
//Cansin Koc
//Tayfun Yonka

public class Main {

	public static void main(String[] args) {
		
		RegularComputerFactory regularComputerFactory = new RegularComputerFactory();
		GamingComputerFactory gamingComputerFactory = new GamingComputerFactory();

		ComputerCreator computerCreator = new ComputerCreator();
		
		Computer regularComputer = computerCreator.createComputerOn(regularComputerFactory);
		Computer gamingComputer = computerCreator.createComputerOn(gamingComputerFactory);
		
		System.out.println("Before decorating:");
		System.out.println(regularComputer.toString());
		System.out.println(gamingComputer.toString());
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		
		System.out.println("\nAfter decorating with Gold:");
		ComputerCableDecorator goldCableDecorator1 = new GoldCableDecorator(regularComputer);
		ComputerCableDecorator goldCableDecorator2 = new GoldCableDecorator(gamingComputer);
		
		goldCableDecorator1.setCable();
		goldCableDecorator2.setCable();
		
		System.out.println(regularComputer.toString());
		System.out.println(gamingComputer.toString());
		

		//////////////////////////////////////////////////////////////////////////////////////////
		
		
		System.out.println("\nAfter decorating with Silver:");
		ComputerCableDecorator silverCableDecorator1 = new SilverCableDecorator(regularComputer);
		ComputerCableDecorator silverCableDecorator2 = new SilverCableDecorator(gamingComputer);
		
		silverCableDecorator1.setCable();
		silverCableDecorator2.setCable();
		
		System.out.println(regularComputer.toString());
		System.out.println(gamingComputer.toString());
		
		/////////
				
		
		
	}

}
