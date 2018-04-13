package com.company;



        import java.awt.*;
        import java.util.ArrayList;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaring all variables
        Scanner keyboard = new Scanner(System.in);
        Event anEvent;
        Speaker speakers;
        String speakerAnswer = " ";
        String eventAnswer = " ";
        boolean speakerDone = false;
        boolean eventDone = false;
        int option;


        ArrayList<Event> allEvents = new ArrayList<>();


        //menu

        System.out.println("1. Create an event ");
        System.out.println("2. Add a speaker to an event  ");
        System.out.println("3. Show all the speakers for all events ");
        System.out.println("4. Show all the speakers for a given event");

        System.out.println(" Enter your choice here:");
        option = keyboard.nextInt();
        keyboard.nextLine();



        if (option == 1) {

            do {
                anEvent = new Event();
                System.out.println("Enter an event name here");
                anEvent.setTitle(keyboard.nextLine());
                System.out.println("Enter room number");
                anEvent.setRoomNumber(keyboard.nextLine());
                System.out.println("Enter an event start date");
                anEvent.setStartDate(keyboard.nextLine());
                System.out.println("Enter an event end date");
                anEvent.setEndDate(keyboard.nextLine());
                allEvents.add(anEvent);

                System.out.println("Do you want to enter another event?");
                eventAnswer = keyboard.nextLine();

                eventDone = false;

                if (eventAnswer.equalsIgnoreCase("No") || eventAnswer.equalsIgnoreCase("n"))
                    eventDone = true;
                else eventDone = false;
            }while(!eventDone);

        } else if (option == 2) {

            do {

            } while ();

        } else if(option ==3) {
            do {
            }while();

            }



        for (Event eachEvent : allEvents)
        {
            System.out.println("These are the events"  +"" + eachEvent.getTitle() +"" + eachEvent.getRoomNumber() +"" + eachEvent.getStartDate() + "" + eachEvent.getEndDate());

        }



        }


    }
}
