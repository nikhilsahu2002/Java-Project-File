import java.util.ArrayList;
import java.util.List;

class Process {
    private String name;
    private int arrivalTime;
    private int burstTime;

    public Process(String name, int arrivalTime, int burstTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }

    public String getName() {
        return name;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }
}

public class FCFS_Scheduling {
    public static void main(String[] args) {
        // Create a list of processes
        List<Process> processes = new ArrayList<>();
        processes.add(new Process("P1", 0, 8));
        processes.add(new Process("P2", 1, 4));
        processes.add(new Process("P3", 2, 2));
        processes.add(new Process("P4", 3, 6));

        // Sort the processes based on arrival time (if necessary)
        processes.sort((p1, p2) -> p1.getArrivalTime() - p2.getArrivalTime());

        // Calculate the completion time, turnaround time, and waiting time for each process
        int currentTime = 0;
        int totalTurnaroundTime = 0;
        int totalWaitingTime = 0;
        
        for (Process process : processes) {
            int waitingTime = currentTime - process.getArrivalTime();
            if (waitingTime < 0) {
                currentTime = process.getArrivalTime();
                waitingTime = 0;
            }
            int completionTime = currentTime + process.getBurstTime();
            int turnaroundTime = completionTime - process.getArrivalTime();

            // Output the results for each process
            System.out.println("Process: " + process.getName());
            System.out.println("Completion Time: " + completionTime);
            System.out.println("Turnaround Time: " + turnaroundTime);
            System.out.println("Waiting Time: " + waitingTime);
            System.out.println("--------------------");

            currentTime = completionTime;
            totalTurnaroundTime += turnaroundTime;
            totalWaitingTime += waitingTime;
        }

        // Calculate average turnaround time and average waiting time
        double avgTurnaroundTime = (double) totalTurnaroundTime / processes.size();
        double avgWaitingTime = (double) totalWaitingTime / processes.size();

        // Output the average results
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
        System.out.println("Average Waiting Time: " + avgWaitingTime);
    }
}
