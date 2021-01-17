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

class Runner {

    List<Process> processes = new ArrayList<>();
    int processCount = 0;
    int timeline = 0;

    Scanner sc = new Scanner(System.in);

    public void inputValue() {
        System.out.println("Select Number of Process:");
        // TODO: Take input for the total number of processes
        int proc = sc.nextInt();

        for (int i = 0; i < proc; i++) {
            System.out.println("Process => " + processCount);
            // TODO: Take input for the process time of each process
            System.out.println("Burst Time?");
            int BurstTime = sc.nextInt();
            System.out.println("Arrive Time?");
            int ArrivalTime = sc.nextInt();

            Process p = new Process(processCount, BurstTime, ArrivalTime);
            processes.add(p);
            processCount++;

        }
    }

    public void runProcesses() throws InterruptedException {
        // TODO: Calculate WaitT, StartT, EndT for each process

        Process temp = processes.get(0);
        timeline = timeline + temp.getArv();

        SRTF();
        for (int i = 0; i < processCount; i++) {
            temp = processes.get(i);
            temp.setStartTime(timeline);
            temp.setEndTime(temp.getStartTime() + temp.getTime());
            temp.setWaitTime(temp.getStartTime() - temp.getArv());
            timeline = timeline + temp.getTime();

        }
    }

    public void SRTF() {

    }

    public void printResult() {
        System.out.println("------------------------------------");
        System.out.println("Id  Time  WaitT  ArvTime  StartT  EndT");
        System.out.println("------------------------------------");
        // TODO: Print the result accordingly

        for (int i = 0; i < processCount; i++) {

            Process temp = processes.get(i);
            System.out.println(temp.getId() + "    " + temp.getTime() + "       " + temp.getWaitTime() + "      " + temp.getArv() + "      " + temp.getStartTime() + "       " + temp.getEndTime());
        }
    }

}
