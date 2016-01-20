import java.util.Random;

/**
 * Created by SantiagoRuiz on 20/01/2016.
 */
public class DiceRolling {

    public void simpleSimulates(int rolls){
        Random random = new Random();
        int twos=0;
        int twelves=0;
        for(int i=0; i<rolls;i++){
            int d1 = random.nextInt(6)+1;
            int d2 = random.nextInt(6)+1;
            if(d1+d2==2){
                twos++;
            }else{
                if(d1+d2==12){
                    twelves++;
                }
            }
        }
        System.out.println("2'=\t"+twos+"\t"+(100.0*twos)/rolls);
        System.out.println("12'=\t"+twelves+"\t"+(100.0*twelves)/rolls);
    }

    public void simulates(int rolls){
        Random random = new Random();
        int[] counts = new int[13];
        for(int i=0; i<rolls;i++){
            int d1 = random.nextInt(6)+1;
            int d2 = random.nextInt(6)+1;
           counts[d1+d2]+=1;
        }
        for(int k =2; k<=12;k++){
            System.out.println("number"+k+"=\t"+counts[k]+"\t"+(100.0*counts[k])/rolls);
        }
    }

}
