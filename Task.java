public class Task
{
    private static int idTask = 0 ; 
    private String title ; 
    private boolean completed ; 
    private int id ; 

    public Task( String title , boolean completed )
    {
        this.id        = Task.idTask++ ; 
        this.title     = title ; 
        this.completed = completed ; 
    }

    public String getTitle() {
        return title;
    }

    public boolean getCompleted() {
        return completed;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return " id . " + id + "," + " title = " + title + ", completed=" + completed ;
    }

    
}