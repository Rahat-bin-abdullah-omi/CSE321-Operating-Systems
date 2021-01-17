/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scheduling;

/**
 *
 * @author SHOVON
 */
   public class Process {
        private int id;
        private int time;

        private int startTime;
        private int endTime;
        private int waitTime;
        public int priority;
        public int arrivalTime;
        public int remainTime;
        boolean started;

        public void setStarted(boolean started){
        this.started =started;
        }
        public boolean isStarted(){
        return started;
        }

         public int getRemainTime() {
            return remainTime;
        }

        public void setRemainTime(int remainTime) {
            this.remainTime = remainTime;
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


        public int getArrivalTime() {
            return arrivalTime;
        }
        public void setArrivalTime(int arrivalTime)  {
            this.arrivalTime = arrivalTime;
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
        public void setPriority(int priority){
             this.priority=priority ;    
        }
        public int getPriority(){
            return priority;
        }
    }
