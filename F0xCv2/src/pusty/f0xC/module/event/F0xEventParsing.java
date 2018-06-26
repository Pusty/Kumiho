package pusty.f0xC.module.event;

import java.util.ArrayList;

import pusty.f0xC.F0xC;
import pusty.f0xC.module.F0xEventCancelable;

public class F0xEventParsing extends F0xEventCancelable {
	private ArrayList<String> current;
	public F0xEventParsing(F0xC fox, ArrayList<String> current) {
		super(fox);
		this.current = current;
	}
	/**
	 * Return the Array List containing the "clear text" format with the possibility to modify it
	 * @return a array list containing the assembly output
	 */
	public ArrayList<String> getCurrentList() {
		return current;
	}
	
}
