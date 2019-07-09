package com.epam.lab27.tasks;

public class Runner {

    public static void main(String[] args) {
        RiseCountService service = new RiseCountService();
        service.calculateRise();
        QueenService queenService = new QueenService();
        queenService.execute();
        HorseService horseService = new HorseService();
        horseService.printHorseSteps();
    }
}
