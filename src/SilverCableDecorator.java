
public class SilverCableDecorator extends ComputerCableDecorator {

	public SilverCableDecorator(Computer computer) {
		super(computer);
	}

	@Override
	public void setCable() {
		this.computer.setCable(Cable.SILVER);
		
	}
}
