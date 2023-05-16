
public class Main {
    public static void main(String[] args) {
        //Declarations:
        HardBread hardBread1 = new HardBread();
        HardBread hardBread2 = new HardBread(6.4,18.7,4.7,true);
        String report;
        double totalSurfaceArea;

        //HardBread object with default measures
        totalSurfaceArea = hardBread1.calculateTotalSurfaceArea();
        report = hardBread1.toString();
        System.out.println("Hard Bread 1: ");
        System.out.println("Total Surface Area " + String.format("%.2f", totalSurfaceArea));
        System.out.println(report);

        //HardBread object with specific measures
        totalSurfaceArea = hardBread2.calculateTotalSurfaceArea();
        report = hardBread2.toString();
        System.out.println("Hard Bread 2: ");
        System.out.println("Total Surface Area: " + String.format("%.2f", totalSurfaceArea));
        System.out.println(report);

        System.out.println("Program by Santiago Garcia");
    }
}