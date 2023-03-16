package projects.learning;

public class Main{
    public static void main(String[] args){
        PaintAmountCalculator paintAmountCalculator = new PaintAmountCalculator();
        System.out.println(paintAmountCalculator.getBucketCount(2.6, 7));
        System.out.println(paintAmountCalculator.getBucketCount(-9, 14.5));
        System.out.println(paintAmountCalculator.getBucketCount(17.32, 4.3, 18));
        System.out.println(paintAmountCalculator.getBucketCount(163, 97, 6));
        System.out.println(paintAmountCalculator.getBucketCount(5.3, -7.66, 3.6, 4));
        System.out.println(paintAmountCalculator.getBucketCount(37, 433, 16, 7));
    }
}
