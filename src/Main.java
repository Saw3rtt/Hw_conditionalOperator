public class Main {
    public static void main(String[] args){
        //task1
        int age = 18;
        if (age >=18){
            System.out.println("Он совершеннолетний.");
        }else{
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }

        //task2
        int temperature = -1;
        if(temperature < 5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }else{
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");

        }
        //task3
        int speed = 50;
        if(speed > 60){
            System.out.println("Если скорость " + speed + ",то придется заплатить штраф.");
        }else{
            System.out.println("Если скорость " + speed + ",то можно ездить спокойно");
        }
        System.out.println();

        //task4
        int ageHuman = 60;
        if(ageHuman < 2){
            System.out.println("Если возраст человека равен " + ageHuman + ",то ему пора спать");
        }
        if(ageHuman >= 2 && ageHuman <=6){
            System.out.println("Если возраст человека равен " + ageHuman + ",то ему нужно ходить в детский сад");
        }
        if(ageHuman >=7 && ageHuman < 18){
            System.out.println("Если возраст человека равен " + ageHuman + ",то ему нужно ходить в школу");
        }
        if(ageHuman >=18 && ageHuman < 24){
            System.out.println("Если возраст человека равен " + ageHuman + ",то его место в университете");
        }
        if(ageHuman >=24 && ageHuman < 60 ){
            System.out.println("Если возраст человека равен " + ageHuman + ",то ему пора ходить на работу");
        }else{
            System.out.println("Если возраст человека равен " + ageHuman + ",то он может отдохнуть");
        }
        System.out.println();

        //task5
        int ageChild = 15;
        if(ageChild < 5){
            System.out.println("Если возраст ребенка равен " + ageChild + ",то он не может кататься на аттракционе");
        }
        else if(ageChild > 5 && ageChild < 14){
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else if(ageChild >= 14){
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого.");
        }
        System.out.println();




    }
        }

