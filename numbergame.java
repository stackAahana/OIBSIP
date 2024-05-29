import java.util.*;
class numbergame
{
    public static void main(String args[])
    {
        int guess,maxattempt=5,round=0,won=0,totalpoint=0;
        Scanner sc=new Scanner(System.in);
        int min=1;
        int max=100;
        System.out.println("The maximum attempts for guesssing the correct number in each round is 5");
        System.out.println("The points for each successful attempt is 10");
        System.out.println("enter the max number of rounds the user wants to play");
        int maxround=sc.nextInt();
        while(round<maxround)
        {
         int attempt=0,success=0,point=0;
         int a=(int)(Math.random()*(max-min+1)+min);
        while(attempt<maxattempt && success<=0)
        {
        System.out.println("enter your guessed number");
        guess=sc.nextInt();
        attempt++;
        if(guess==a){
        System.out.println("guess is correct");
        success++;
        }
        else if(guess>a)
        System.out.println("guess is higher");
        else
        System.out.println("guess is lower");
    }
    point=((maxattempt-attempt)+1)*10;
    totalpoint=totalpoint+point;
    System.out.println("attempt"+"    "+"successful_attempts"+"    "+"points");
    System.out.println("   "+attempt+"               "+success+"               "+point);
    round++;
    if(success>0)
    won++;
    }
    System.out.println("rounds"+"  "+"won"+"  "+"total_points");
     System.out.println("  "+round+"      "+won+"     "+totalpoint);
}
} 