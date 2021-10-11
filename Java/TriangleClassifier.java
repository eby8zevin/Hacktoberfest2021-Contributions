/**
 * A classifier for triangles (scalene, isosceles, or equilateral)
 * Given the lengths of the three sides.
 */
public class TriangleClassifier {

	/**
	 * Types that can be detected by the classifier
	 */
	public enum Type {
		SCALENE,
		ISOSCELES,
		EQUILATERAL,
		NOT_A_TRIANGLE;
		
	}
	
	/**
	 * Determines the type of triangle given the lengths of the sides.
	 * 
	 * @param side1Str the first side, as a string
	 * @param side2Str the second side, as a string
	 * @param side3Str the third side, as a string
	 * @return the type of triangle
	 */
	public Type classify(String side1Str, String side2Str, String side3Str) {
		int side1 = Integer.parseInt(side1Str);
		int side2 = Integer.parseInt(side2Str);
		int side3 = Integer.parseInt(side3Str);
		
		return classify(side1, side2, side3);
	}
	
	/**
	 * A triangle is equilateral if all sides are equal in length. 
     * A triangle is isosceles if two sides are equal in length. 
     * Otherwise, a triangle has three different side lengths, and is scalene.
	 * 
	 * @param side1Str the length of the first side
	 * @param side2Str the length of the second side
	 * @param side3Str the length of the third side
	 * @return the type of triangle
	 */
	private Type classify(int side1, int side2, int side3) {
		if (side1 > side2+side3) {
			return Type.NOT_A_TRIANGLE;
		} else if (side1==side2 && side2==side3) {
			return Type.EQUILATERAL;
		} else if (side1==side2) {
			return Type.ISOSCELES;
		} else {
			return Type.SCALENE;
		}
	}
	
}