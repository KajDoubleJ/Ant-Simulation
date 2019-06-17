package myOwnAnthill;
/**
 * This is the interface which contains methods for the inhabitants.
 * @authors K.O.  A.P.  E.B.K
 *
 */
public interface I_Inhabitant {
	/**
	 * This method implements the whole turn the unit can perform.
	 * @param Represents the change in the map object.
	 */
	void turn(Map map);
	/**
	 * This method implements the way ant escapes the anthill.
	 * @param Represents the change in the map object.
	 */
	void escape(Map map);
	/**
	 * This method implements going up.
	 * @param Represents the change in the map object.
	 * @return 'true' or 'false'
	 */
	boolean goUp(Map map);
	/**
	 * This method implements going right.
	 * @param Represents the change in the map object.
	 * @return 'true' or 'false'
	 */
	boolean goRight(Map map);
	/**
	 * This method implements going down.
	 * @param Represents the change in the map object.
	 * @return 'true' or 'false'
	 */
	boolean goDown(Map map);
	/**
	 * This method implements going left.
	 * @param Represents the change in the map object.
	 * @return 'true' or 'false'
	 */
	boolean goLeft(Map map);
}
