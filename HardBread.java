/**
 * @author Santiago Garcia
 * @version 1.0
 * @since Java 17
 *  Determines the optimal packaging size for a box of Hard Bread.
 */
public class HardBread {
    //Attributes
    public final double MAX_HEIGHT = 5.5;
    public final double MAX_LENGTH = 21.5;
    public final double MAX_WIDTH = 5.3;

    private double height;
    private double length;
    private double width;
    private boolean isOliveBread;

    /*
    Constructors
     */
    public HardBread(){
        setOliveBread(true);
        this.height = MAX_HEIGHT;
        this.length = MAX_LENGTH;
        this.width = MAX_WIDTH;
    }
    public HardBread(double height, double length, double width, boolean isOliveBread) {
        this.height = height;
        this.length = length;
        this.width = width;
        this.isOliveBread = isOliveBread;
    }

    //Methods

    /**
     * @return Returns the surface area of the object
     */
    public double calculateTotalSurfaceArea(){
        return 2 * ((height * length) + (height * width) + (width * length));
    }

    /**
     * @return Prints the height, length and width of the object formatted to two decimal places.
     */

    @Override
    public String toString() {
        return "Height " + String.format("%.2f",height) + ", " +
                "Length " + String.format("%.2f", length) + ", " +
                "Width " + String.format("%.2f", width);
    }

    //Getters and setters
    public void setOliveBread(boolean oliveBread) {
        isOliveBread = oliveBread;
    }
}
