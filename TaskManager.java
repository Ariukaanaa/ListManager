import java.util.ArrayList;
import java.util.List;

public class TaskManager
{
    private List<Task> list ; 

    public TaskManager()
    {
        this.list = new ArrayList<>() ; 
    }

    public boolean addTask( Task task )
    {
        if( task == null ) return false ; 

        this.list.add(task); 
        return true ; 
    }

    public void afficherTout() 
    {
        if (list.isEmpty()) {
            System.out.println("Aucune tâche.");
            return;
        }

        for( Task task : list )
        {
            System.out.println( task.toString()) ; 
        }
    }

    public void afficherTaskNotFinish()
    {
        if (list.isEmpty()) {
            System.out.println("Aucune tâche.");
            return;
        }

        boolean cours = false ; 

        for( Task task : list )
        {
            if( !task.getCompleted()  )
            {
                System.out.println( task.toString()) ; 
                cours = true ; 
            }
        }

        if( !cours ) System.out.println("Aucune tâche en cours ");
    }

    public boolean changeCondition( int id )
    {
        for( Task task : list )
        {
            if( task.getId() == id )
            {
                if( task.getCompleted() == false ) task.setCompleted(true  ); 
                else                               task.setCompleted(false ); 

                return true ; 
            }
        }
        return false ; 
    }

    public boolean searchById( int id )
    {
        for( Task task : list ) 
        {
            if( task.getId() == id )
            {
                System.out.println( task.toString()) ; 
                return true ; 
            }
        }
        return false ; 
    }

    public boolean deleteById( int id )
    {
        for( Task task : list ) 
        {
            if( task.getId() == id )
            {
                list.remove(task) ; 
                return true ; 
            }
        }
        return false ; 
    }
}