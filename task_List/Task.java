
package task_List;


public class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;   //para que durante el inicio este sin completar
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isCompleted(){
        return completed;
    }
    
    public void setCompleted(boolean completed){
        this.completed = completed;
    }
}
