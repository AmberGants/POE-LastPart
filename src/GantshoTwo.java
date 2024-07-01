import java.util.ArrayList;

public class GantshoTwo {
    private ArrayList<String> Developers = new ArrayList<>();
    private ArrayList<String> TasksName = new ArrayList<String>();
    private ArrayList<String> TasksID = new ArrayList<String>();
    private ArrayList<String> TasksDuration = new ArrayList<String>();
    private ArrayList<String> TasksStatus = new ArrayList<String>();

    //Method to add Task
    public void addTask(String developer, String taskName, String taskID, String taskDuration, String taskStatus){
        Developers.add(developer);
        TasksName.add(taskName);
        TasksID.add(taskID);
        TasksDuration.add(taskDuration);
        TasksStatus.add(taskStatus);
    }
    //Method to display Tasks with status of done
    public void displayTasks(){
        for(int i = 0; i < TasksName.size(); i++){
            if(TasksStatus.get(i).equals("Done")){
                System.out.println("Task Name: " + TasksName.get(i));
                System.out.println("Task ID: " + TasksID.get(i));
                System.out.println("Task Duration: " + TasksDuration.get(i));
                System.out.println("Task Status: " + TasksStatus.get(i));
                System.out.println("Developer: " + Developers.get(i));
                System.out.println("------------------------");
            }
        }
    }
    //Method to display the Task with the longest duration
    public void displayLongestTask(){
        int maxDuration = 0;
        int index = 0;
        for(int i = 0; i < TasksDuration.size(); i++){
            int duration = Integer.parseInt(TasksDuration.get(i));
            if(duration > maxDuration){
                maxDuration = duration;
                index = i;
            }
        }
        System.out.println("Task Name: " + TasksName.get(index));
        System.out.println("Task ID: " + TasksID.get(index));
        System.out.println("Task Duration: " + TasksDuration.get(index));
        System.out.println("Task Status: " + TasksStatus.get(index));
        System.out.println("Developer: " + Developers.get(index));

    }


}





