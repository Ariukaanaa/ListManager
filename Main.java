import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main( String[] args )
    {

        boolean repete = true ; 
        Scanner sc = new Scanner(System.in); 
        TaskManager manager = new TaskManager() ; 

        Task task1 = new Task("HomeWork"  , false ); 
        Task task2 = new Task("Do washes" , false ); 
        Task task3 = new Task("Training"  , false ); 
        
        manager.addTask(task1) ; 
        manager.addTask(task2) ;
        manager.addTask(task3) ;

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
            System.out.println("6. Show Task Not Finished") ; 
            System.out.println("7. exit") ;
            System.out.println("**********************************") ;
            System.out.println("**********************************") ;

            try
            {
                int choice = sc.nextInt() ; 

                switch( choice )
                {
                    case 1 ->
                    {
                        String title ; 
                        boolean compelted ; 

                        sc.nextLine(); // choice = sc.nextInt() ; uunees uldsen Enteriig ustgana

                        System.out.println("Entrez le nom de task : ") ; 
                        title = sc.nextLine() ; 
                        System.out.println("Choisisez 1 pour le task finished , autre pour contraire") ; 
                        if( sc.nextInt() == 1 ) compelted = true ; 
                        else compelted = false ; 

                        manager.addTask( new Task(title , compelted)); 
                    }
                    case 2 -> manager.afficherTout() ; 
                    case 3 ->
                    {
                        boolean searchId = true ; 
                        int id = 0 ; 
                        while(searchId)
                        {
                            System.out.print("Entrez le id ce que vous voulez chercher : "); 
                            try
                            {
                                id = sc.nextInt() ; 
                                searchId = false ; 
                            }
                            catch( InputMismatchException e )
                            {
                                System.out.println(" Encore un fois , tu vas mettre autre chose que le int , je vais baiser ta meuf !!! ") ; 
                                sc.next() ; 
                            }
                        }
                        boolean search = manager.searchById(id) ; 
                        if( search )
                        {
                            System.out.println("Trouveee !! "); 
                        }     
                        else{
                            System.out.println(" Task nontrouvable !! ") ;
                        }          
                    } 
                    case 4 ->
                    {
                        boolean changeCondition = true ; 
                        int id = 0 ; 
                        while(changeCondition)
                        {
                            System.out.print("Entrez le id ce que vous voulez changer conditoin : "); 
                            try
                            {
                                id = sc.nextInt() ; 
                                changeCondition = false ; 
                            }
                            catch( InputMismatchException e )
                            {
                                System.out.println(" Encore un fois , tu vas mettre autre chose que le int , je vais baiser ta meuf !!! ") ; 
                                sc.next() ; 
                            }
                        }

                        boolean changer = manager.changeCondition(id) ; 
                        if( changer )    System.out.println("Changement reussi !! "); 
                        else             System.out.println("Changement echoue !! ") ; 
                    }
                    case 5 ->
                    {
                        boolean delete = true ; 
                        int id = 0 ; 
                        while(delete)
                        {
                            System.out.print("Entrez le id ce que vous voulez supprimer : "); 
                            try
                            {
                                id = sc.nextInt() ; 
                                delete = false ; 
                            }
                            catch( InputMismatchException e )
                            {
                                System.out.println(" Encore un fois , tu vas mettre autre chose que le int , je vais baiser ta meuf !!! ") ; 
                                sc.next() ; 
                            }
                        }

                        boolean deleteById = manager.deleteById(id) ; 
                        if( deleteById ) System.out.println("Delete reussi !! "); 
                        else             System.out.println("Delete echoue !! ") ; 
                    } 
                    case 6 -> manager.afficherTaskNotFinish() ; 
                    case 7 -> repete = false ; 
                    default -> System.out.println(" Un nombree!!! con!! , pas de la nom de ta matrise!! ") ; 
                }
            }
            catch( InputMismatchException e )
            {
                System.out.println(" Euhh il faut entrez un nombre, pas de nude de ta mere !!!") ; 
                sc.next(); 
            }
        }
    }
}
