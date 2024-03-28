  import java.util.*;
class guessthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low;
        int high;
        Random r = new Random();
        int user_num,computer_num;
        int cnt=0;
        int max_score=100;
        System.out.println("Enter the lowest limit you want");
        low=sc.nextInt();
        System.out.println("Enter the highest limit you want");
        high=sc.nextInt();
        System.out.println("The maximum score is "+ max_score);
        while(cnt!=10){
            computer_num=r.nextInt(low,high);
           System.out.println("Enter a number in between "+low+" and "+high);
            user_num=sc.nextInt();
            System.out.println("The computer guessed number is : "+computer_num);
            System.out.println("Your recent score is "+(10-cnt)*10);
            System.out.println("The number of attenmpts left is "+ (10-(cnt+1)));
            if(computer_num==user_num){
                System.out.println("Congratulations you have entered the correct choice. You won.");
                System.out.println("Your total score is "+(10-cnt)*10);
                System.out.println("Your have guessed the correct choice in "+(10-cnt)+"th choice.");
                break;
            }
            else if (computer_num>=user_num) {
                System.out.println("The guessed number is too low.");
                System.out.println("Please try again");
            }
           else if (computer_num<=user_num) {
                System.out.println("The guessed number is too high.");
                System.out.println(" Please Try again");
            }
            cnt=cnt+1;
            if(cnt==10){
                System.out.println("You have reached the maximum attempts.");
                System.out.println("Game is over.");
            }
                }

            }
    }
