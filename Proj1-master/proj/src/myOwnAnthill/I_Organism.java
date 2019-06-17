package myOwnAnthill;
/**
 * This is the interface which contains methods for the organisms.
 * @authors K.O.  A.P.  E.B.K
 *
 */
public interface I_Organism {
	/**
	 * This method implements where the organism is setting.
	 * @param Represents the change in the map object.
	 */
	void setPlace(int x, int y, Map map);
	/**
	 * This method implements the way organism is changing the way. 
	 * @param Represents the change in the map object.
	 */
	void turn(Map map);
	/**
	 * This method implements moving.
	 * @param Represents the change in the map object.
	 */
	void move(Map map);
	/**
	 * This method checks if organism lives.
	 * @param Represents the change in the map object.
	 * @return 'true' - it lives,'false' - it doesn't live.
	 */
	boolean isAlive(Map map);
	/**
	 * This method implements organisms dying.
	 * @param Represents the change in the map object.
	 */
	void die(Map map);
	/**
	 * This method checks if there is a food nearby.
	 * @param Represents the change in the map object.
	 * @return 'true' - there is a food,'false' - there is no food.
	 */
	boolean foodNearby(Map map);
	/**
	 * This method implements organisms eating.
	 * @param Represents the change in the map object.
	 */
	void eat(Map map);
	/**
	 * This method implements eating a food from up.
	 * @param x stores the 'x' position on the map.
	 * @param y stores the 'y' position on the map.
	 * @param Represents the change in the map object.
	 */
	void eatUp(int x, int y, Map map);
	/**
	 * This method implements eating a food from right.
	 * @param x stores the 'x' position on the map.
	 * @param y stores the 'y' position on the map.
	 * @param Represents the change in the map object.
	 */
	void eatRight(int x, int y, Map map);
	/**
	 * This method implements eating a food from down.
	 * @param x stores the 'x' position on the map.
	 * @param y stores the 'y' position on the map.
	 * @param Represents the change in the map object.
	 */
	void eatDown(int x, int y, Map map);
	/**
	 * This method implements eating a food from left.
	 * @param x stores the 'x' position on the map.
	 * @param y stores the 'y' position on the map.
	 * @param Represents the change in the map object.
	 */
	void eatLeft(int x, int y, Map map);
}
