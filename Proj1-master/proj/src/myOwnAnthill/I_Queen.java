package myOwnAnthill;
/**
 * This is the interface which contains methods for the queen.
 * @authors K.O.  A.P.  E.B.K
 *
 */
public interface I_Queen {
	/**
	 * This method implements how the queen eats.
	 * @param Represents the change in the map object..
	 */
	void eat(Map map);
	/**
	 * This method implements producing the ants by the queen.
	 * @param Represents the change in the map object.
	 * @return 'true' - ants produced,'false' - bad conditions for producing.
	 */
	boolean produce(Map map);
}
