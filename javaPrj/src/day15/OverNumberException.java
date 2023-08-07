package day15;

public class OverNumberException extends Exception {

	public OverNumberException() {
		super("100초과하면 안됨");
	}
}
