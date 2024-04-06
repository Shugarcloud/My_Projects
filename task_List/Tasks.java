
package task_List;


public class Tasks {
    public String description;
    public boolean completed;

    public Tasks(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }
    public boolean isComplete(){
        return completed;
    }
    public void setAsCompleted(){
        completed = true;
    }
    
    //Override
    
    public String toString(){
        return description + (completed ? "(completada)":"");
    }
    
    
}
