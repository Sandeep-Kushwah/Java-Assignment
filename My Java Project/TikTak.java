import java.util.Scanner;
import java.util.InputMismatchException;
class TikTacToe
{
    //To color the text(ChatGPT)
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String WHITE = "\u001B[37m";

    static int mtx[]=new int[]{1,2,3,4,5,6,7,8,9};
    static int check[]=new int[9];

    static int input,alternate=1,inp_exit=1,for_len=0;
    static String ply1,ply2,won=null;

    public static void main(String args[])
    {
        boolean again; //Do-While loop condition check to Play again.
        Scanner sc=new Scanner(System.in);   
        clr();

        System.out.print("Enter First Player Name : ");
        ply1=sc.nextLine();
        ply1 += " (X)";
        System.out.print("Enter Second Player Name : ");
        ply2=sc.nextLine();
        ply2 += " (O)";
        do
        {
            game();
            System.out.print("Do you want to play again (1/0) : ");
            int playAgainInput=sc.nextInt();
            switch(playAgainInput)
            {
                case 1 : {
                    //Here this variables are re-initilize to play again.
                    //Otherwise We can also create different to play again.
                    for(int i=0; i<9; i++)
                    {
                        check[i]=0;
                        mtx[i]=i+1;
                    }
                    alternate=1;
                    inp_exit=1;
                    for_len=0;
                    won=null;
                    again=true; break;
                }
                case 0 : again=false; break; 
                default : System.out.println("Wrong choice !!!"); again=false; break;
            }
        }while(again);
    }
    static void game()
    {
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            clr();
            System.out.println("First Player is : "+ply1);
            System.out.println("Second Player is : "+ply2);
            printMatrix();

            while(true) //To take correct input from user.
            {
                while(true) //(If Exception occurs)This loop for to take again input/We could also use recursion
                {
                    try
                    {
                        System.out.print(((alternate==1)? YELLOW : BLUE )+"Enter choice 1-9 ("+((alternate==1)? ply1 : ply2)+") : "+RESET);
                        input=sc.nextInt();
                        break;
                    }catch(InputMismatchException e)
                    {
                        System.out.println("Invalid Input !!!");
                        sc.nextLine();      
                    }
                }
                if(input==10) //If player want to Quit the game.
                System.exit(0); //Terminate program(By 10 number)
                inp_exit=1;
                for(int i=0; i<for_len+1; i++)
                {
                    /*Error not occur at first input bcz 
                      compiler starts checking conditions
                      from right to left*/
                    if(check[i]==input || input<0 || input>9) 
                    {
                        System.out.println("Already exist/Not valid !");
                        inp_exit=0;
                        break;
                    }
                }
                if(inp_exit==1)
                {
                    check[for_len]=input;
                    for_len++;
                    break;
                }
            }

            switch(input) //To adjust keys
            {
                case 1 : input = 7; break;
                case 2 : input = 8; break;
                case 3 : input = 9; break; 
                case 7 : input = 1; break;
                case 8 : input = 2; break;
                case 9 : input = 3; break;
            }
        
            if(alternate==1) // To assign 'X'
            {
                mtx[input-1]='X';
                alternate=0;
            }
            else // To assign 'O'
            {
                mtx[input-1]='O';                                                            
                alternate=1;
            }

            //Conditions when someone won.
            if( mtx[0]==mtx[1] && mtx[1]==mtx[2] ) 
            won=(mtx[1]=='X')? ply1: ply2;

            if( mtx[3]==mtx[4] && mtx[4]==mtx[5] ) 
            won=(mtx[4]=='X')? ply1: ply2;

            if( mtx[6]==mtx[7] && mtx[7]==mtx[8] ) 
            won=(mtx[7]=='X')? ply1: ply2;

            if( mtx[0]==mtx[3] && mtx[3]==mtx[6] ) 
            won=(mtx[3]=='X')? ply1: ply2;

            if( mtx[1]==mtx[4] && mtx[4]==mtx[7] ) 
            won=(mtx[4]=='X')? ply1: ply2;

            if( mtx[2]==mtx[5] && mtx[5]==mtx[8] ) 
            won=(mtx[5]=='X')? ply1: ply2;

            if( mtx[0]==mtx[4] && mtx[4]==mtx[8] ) 
            won=(mtx[4]=='X')? ply1: ply2;

            if( mtx[2]==mtx[4] && mtx[4]==mtx[6] ) 
            won=(mtx[4]=='X')? ply1: ply2;
    

            if(won==ply1 || won==ply2) //Break and print last time matrix when someone won.
            {
                clr();
                printMatrix();
                System.out.println(((won==ply1)? YELLOW : BLUE )+"Congratulation "+won+" has Won !!!"+RESET);
                break;
            }

            if(for_len==9)
            {
                clr();
                printMatrix();
                System.out.println(RED+"Match Draw !!!"+RESET);
                break;
            }
        }
    }
    static void clr()
    {
        // ANSI escape code to clear screen and move cursor to top-left
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    static void printMatrix()
    {
        //For printing matrix
        for(int i=0; i<9; i++)
        {
            if(mtx[i]!='O' && mtx[i]!='X')
            System.out.print("_ ");
            else
            System.out.print(((mtx[i]=='X')? YELLOW : BLUE)+ (char)(mtx[i])+" " +RESET);
            if (i==2 || i==5)
            System.out.println();
        }
        System.out.println();
    }
}
