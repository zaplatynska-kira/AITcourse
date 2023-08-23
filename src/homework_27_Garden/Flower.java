package homework_27_Garden;

public class Flower extends Plant{
    private static int FLOWER_GROW_PER_SEASON = 2;

    public Flower(String name, int height, int age) {
        super(name, height, age);


    }
    public void doSummer(){
        setHeight( getHeight() + getGrowPerSeason());
        System.out.println(getName()+" has blooming in Summer - "+getHeight());
    }

    public void doAutumn(){
        System.out.println(getName() + " has сut in Autumn - "+getHeight());
    }

    public int getGrowPerSeason(){

        return FLOWER_GROW_PER_SEASON;
    }
}

