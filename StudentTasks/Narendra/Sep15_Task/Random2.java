package Sep15_Task;

public class Random2 {
    public static void main(String argd[]){
        int min=0;
        int max=100;
        int n =(int)((Math.random()*(max-min+1))+min);
        System.out.print("Random Number between 0 to 100 : "+n);
    }
}

