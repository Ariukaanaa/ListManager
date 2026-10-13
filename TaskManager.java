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
        for( Task task : list )
        {
            System.out.println( task.toString()) ; 
        }
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