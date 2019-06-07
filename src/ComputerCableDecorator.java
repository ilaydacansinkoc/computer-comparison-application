
public abstract class ComputerCableDecorator {
	
	protected Computer computer;
	
	public ComputerCableDecorator(Computer computer) {
		this.computer = computer;
	}
	
	public abstract void setCable();

}
