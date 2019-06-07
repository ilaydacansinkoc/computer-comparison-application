
public class GoldCableDecorator extends ComputerCableDecorator {

	public GoldCableDecorator(Computer computer) {
		super(computer);
	}

	@Override
	public void setCable() {
		this.computer.setCable(Cable.GOLD);
		
	}

}
