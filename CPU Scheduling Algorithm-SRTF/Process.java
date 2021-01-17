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
public class Process {

    private int id;
    private int time;
    private int startTime;
    private int endTime;
    private int waitTime;
    private int arvTime;

    Process(int id, int time, int arvTime) {
        setId(id);
        setTime(time);
        setArv(arvTime);
    }

    public int getArv() {
        return arvTime;
    }

    public void setArv(int arvTime) {
        this.arvTime = arvTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }
}
