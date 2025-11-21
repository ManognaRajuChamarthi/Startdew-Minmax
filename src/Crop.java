public class Crop{

    public enum Seasons {Spring, Summer, Fall, Winter}

    //variables
    private String cropName;
    private int stages;
    private int daysTakenToHarvest;
    private int seedCost;
    private int cropSellsFor;
    private Seasons seasonOfTheCrop;

    //getters and Setters
    public String getCropName(){return this.cropName;}
    public int getStages(){return this.stages;}
    public int getDaysTakenToHarvest(){return this.daysTakenToHarvest;}
    public int getSeedCost(){return this.seedCost;}
    public int getCropSellsFor(){return this.cropSellsFor;}
    public Seasons getSeasonOfTheCrop(){return this.seasonOfTheCrop;}

    

    //constructor
    public Crop(String cropName,int stages, int daysTakenToHarvest, int seedCost, int cropSellsFor, Seasons seasonOfTheCrop){
        this.cropName = cropName;
        this.stages = stages;
        this.daysTakenToHarvest = daysTakenToHarvest;
        this.seedCost = seedCost;
        this.cropSellsFor = cropSellsFor;
        this.seasonOfTheCrop = seasonOfTheCrop;
    }

    //methods
    public void PrintCropDetails(Crop crop){
        System.out.println(crop.getSeasonOfTheCrop());
    }
}