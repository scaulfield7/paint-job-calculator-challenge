package projects.learning;

public class PaintAmountCalculator{
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int numberOfBucketsToBuy = -1;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return numberOfBucketsToBuy;
        }
        numberOfBucketsToBuy = (int) Math.ceil(((height * width) / areaPerBucket)) - extraBuckets;
        return numberOfBucketsToBuy;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        int numberOfBucketsToBuy = -1;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return numberOfBucketsToBuy;
        }
        numberOfBucketsToBuy = (int) Math.ceil(((height * width) / areaPerBucket));
        return numberOfBucketsToBuy;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        int numberOfBucketsToBuy = -1;
        if(area <= 0 || areaPerBucket <= 0){
            return numberOfBucketsToBuy;
        }
        numberOfBucketsToBuy = (int) Math.ceil(area / areaPerBucket);
        return numberOfBucketsToBuy;
    }
}
