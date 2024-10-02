public class Main {
    public static void main(String[] args) {
        int age2 = 16;
        int age = 19;
        if (age >= 18) {
            System.out.println("Вам " +age+ " лет, это больше 18 лет");
        } else {
            System.out.println("Вам меньше 18 лет");
        }
        if (age2 >= 18) {
            System.out.println("Вам больше 18 лет");
        } else {
            System.out.println("Вам меньше 18 лет");
        }
        System.out.println(" ");


        int temp1 = -20;
        int temp2 = 19;
        if (temp1 >= 5) {
            System.out.println("\nСегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temp2 >= 18) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        System.out.println(" ");


        int speed1 = 150;
        int speed2 = 50;
        if (speed1 > 60) {
            System.out.println("Если скорост " + speed1 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорост " + speed1 + ", можно ездить спокойно");
        }
        if (speed2 > 60) {
            System.out.println("Если скорост " + speed2 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорост " + speed2 + ", можно ездить спокойно");
        }
        System.out.println(" ");


        int age5 = 20;
        int age6 = 3;
        int age7 = 8;
        int age8 = 40;


        if (age5 >= 2 && age5 <=6) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в садик");
        }
        if (age5 >= 7 && age5 <=17) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");
        }
        if (age5 >= 18 && age5 <=24) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в универ");
        }
        if (age5 >= 25) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");
        }


        if (age6 >= 2 && age6 <=6) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в садик");
        }
        if (age6 >= 7 && age6 <=17) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в школу");
        }
        if (age6 >= 18 && age6 <=24) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в универ");
        }
        if (age6 >= 25) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить на работу");
        }


        if (age7 >= 2 && age7 <=6) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в садик");
        }
        if (age7 >= 7 && age7 <=17) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в школу");
        }
        if (age7 >= 18 && age7 <=24) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в универ");
        }
        if (age7 >= 25) {
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить на работу");
        }


        if (age8 >= 2 && age8 <=6) {
            System.out.println("Если возраст человека равен " + age8 + ", то ему нужно ходить в садик");
        }
        if (age8 >= 7 && age8 <=17) {
            System.out.println("Если возраст человека равен " + age8 + ", то ему нужно ходить в школу");
        }
        if (age8 >= 18 && age8 <=24) {
            System.out.println("Если возраст человека равен " + age8 + ", то ему нужно ходить в универ");
        }
        if (age8 >= 25) {
            System.out.println("Если возраст человека равен " + age8 + ", то ему нужно ходить на работу");
        }






        System.out.println(" ");
        int childAge = 9;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else if (5 <= childAge && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }


        System.out.println(" ");
        int passengers = 80;
        if (passengers <= 102) {
            if (passengers <= 60) {
                System.out.println("В вагоне есть место, сидячее.");
            } else {
                System.out.println("В вагоне есть место, стоячее.");
            }
        } else {
            System.out.println("Вагон уже полностью забит.");
        }
        System.out.println(" ");


        int one = 1000000;
        int two = 2222222;
        int three = 52;
        if (one > two && one > three) {
            System.out.println("Самое большое число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число: " + two);
        } else {
            System.out.println("Самое большое число: " + three);
        }

    }
}