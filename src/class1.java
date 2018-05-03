import java.util.Random;

public class class1 {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int lowest = 1000;
        int highest = 0; //lowest and highest in random num generator
        for(int i=0;i<200;i++)
        {
            int randomNum = rand.nextInt((1000-0) + 1);
            System.out.println("Hurrah: " + randomNum);
            if (lowest > randomNum)
            {
                lowest = randomNum;
                //jnom is key2
            }

            if (highest < randomNum)
            {
                highest = randomNum;//this sets the highest num equal to our variable
            }
        }
        System.out.println("lowest: " + lowest + " Highest: " + highest);
    }
}
