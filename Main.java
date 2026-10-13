import java.util.Scanner;

public class Main {
    
    public static void main( String[] args )
    {

        boolean repete = true ; 
        Scanner sc = new Scanner(System.in); 

        while( repete )
        {
            System.out.println("**********************************") ;
            System.out.println("   Welcome To The Task Area !!!   ") ;
            System.out.println("**********************************") ;
            System.out.println("1. Add The New Task ") ; 
            System.out.println("2. Show The All Tasks ") ; 
            System.out.println("3. Search The Task By Id") ; 
            System.out.println("4. Changer The Task Condition ") ; 
            System.out.println("5. Delete Task By Id") ; 
            System.out.println("6. exit") ;
            System.out.println("**********************************") ;
            System.out.println("**********************************") ;

            try
            {
                int choice = sc.nextInt() ; 

                switch( choice )
                {
                    case 1 -> System.out.println("Not finish ") ; 
                    case 2 -> System.out.println("Not finish ") ; 
                    case 3 -> System.out.println("Not finish ") ; 
                    case 4 -> System.out.println("Not finish ") ; 
                    case 5 -> System.out.println("Not finish ") ; 
                    case 6 -> repete = false ; 
                    default -> System.out.println(" Un nombree!!! con!! , pas de la nom de ta matrise!! ") ; 
                }
            }
            catch( Exception e )
            {
                System.out.println(" Euhh il faut entrez un nombre, pas de nude de ta mere !!!") ; 
            }
        }
    }
}
