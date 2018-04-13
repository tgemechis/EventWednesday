package com.company;

import java.util.ArrayList;

public class Event {
    private String startDate;
    private String endDate;
    private String title;
    private String roomNumber;
    private ArrayList<Speaker> speaker;

    public Event() {
        speaker = new ArrayList<>();
    }

    public Event(String startDate, String endDate, String title, String roomNumber) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.roomNumber = roomNumber;
        speaker = new ArrayList<>();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ArrayList<Speaker> getSpeaker() {
        return speaker;
    }

    public void setSpeaker(ArrayList<Speaker> speaker) {
        this.speaker = speaker;
    }

    public void hasTheSpeaker(Speaker speakers){
        this.speaker.add(speakers);
    }

    public String getEventDetails(){
        return getTitle() + " " + getStartDate() + " " + getEndDate() + " " + getRoomNumber();
    }


}