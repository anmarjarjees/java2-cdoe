package polymorphism_review;

/* 
 * polymorphism => method overriding 
 * 
 * Triangle "is a" Shape 
 * OR:
 * Triangle "is a type of" Shape
 */
public class Triangle extends Shape {
    // three values for side1, side2, and base (no difference)
    private double value1;
    private double value2;
    private double value3;

    public Triangle(double value1, double value2, double value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    /*
     * @Override (to recap):
     * Indicates that a method declaration is intended to override a method
     * declaration in a supertype.
     */
    @Override
    public double calcPerimeter() {
        return this.value1 + this.value2 + this.value3;
    }

    // Override the toString() method from the mother object/class "Object"
    /*
     * Remember that every class we create in Java,
     * will implicitly extend the main Java class "Object"
     * the "Object" class has a method named "toString()"
     */
    @Override
    public String toString() {
        return "Triangle Shape";
    }

}
