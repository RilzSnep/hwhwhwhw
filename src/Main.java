public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("Вам " + age + " лет, это больше 18 лет");
        } else {
            System.out.println("Вам меньше 18 лет");
        }

        System.out.println(" ");

        int temp2 = 19;

        if (temp2 >= 18) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        System.out.println(" ");

        int speed2 = 50;
        if (speed2 > 60) {
            System.out.println("Если скорост " + speed2 + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорост " + speed2 + ", можно ездить спокойно");
        }
        System.out.println(" ");


        int age5 = 20;


        if (age5 >= 2 && age5 <= 6) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в садик");
        }
        if (age5 >= 7 && age5 <= 17) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");
        }
        if (age5 >= 18 && age5 <= 24) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в универ");
        }
        if (age5 >= 25) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");
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