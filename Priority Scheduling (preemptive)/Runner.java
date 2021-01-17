/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scheduling;

/**
 *
 * @author RAHAT
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    List<Process> processes = new ArrayList<>();
    List<Process> arrival = new ArrayList<>();
    List<Process> done = new ArrayList<>();
    int processCount = 0;
    int timeline = 0;
    

    public void inputValue() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Select Number of Process:");
        processCount= sc.nextInt();
        
            
        for (int id=1; id<=processCount; id++){
        System.out.println("enter arrivaltime" + id );
        int aT= sc.nextInt();
        System.out.println("enter bursttime" + id );
        int time= sc.nextInt();
        System.out.println("enter prioritytime" + id );
        int priority= sc.nextInt();
        Process process= new Process();
        process.setTime(time);
        process.setArrivalTime(aT);
        process.setPriority(priority);
        process.setId(id);
        process.setRemainTime(time);
        process.setStarted(false);
        processes.add(process);
        }
     }

    public void runProcesses() throws InterruptedException {
        while(done.size()!=processes.size()){
        for(Process p: processes){
          if(p.getArrivalTime()==timeline){
          arrival.add(p);
          }
        }
        arrival.sort((o1,o2)->o1.getPriority() - o2.getPriority ());
        if(!arrival.isEmpty()){
        Process p=arrival.get(0);
        p.setRemainTime(p.getRemainTime()-1);
        if(p.started==false){
        p.setStartTime(timeline);
        p.setStarted(true);
        }
        if(p.getRemainTime()==0){
        p.setEndTime(timeline+1);
        done.add(p);
        arrival.remove(p);
        }
        }
        timeline++;
        
        
        
    }
     }

    public void printResult() {
        System.out.println("------------------------------------");
        System.out.println("Id   Time   WaitT   StartT    EndT");
        System.out.println("------------------------------------");
        // TODO: Print the result accordingly
        processes.forEach((process) -> System.out.println(process.getId() +"      " + process.getTime() + "      " + process.getStartTime()+ "      "+ process.getWaitTime() +"     "+ process.getEndTime() ) ) ;
    }
}
