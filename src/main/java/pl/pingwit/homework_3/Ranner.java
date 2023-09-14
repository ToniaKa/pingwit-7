package pl.pingwit.homework_3;

// можно уже выбирать имена, связанные с сутью задачи
public class Ranner {
   /* Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
    день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
    суммарный путь пробежит спортсмен за 7 дней?*/

    public static void main(String[] args) {
        double sumOfWay = 0;
        double runDay = 10.0;
        for (int i = 1; i <= 7; i++) {
            runDay = runDay + runDay * 0.1;
            System.out.println(runDay);
            sumOfWay = sumOfWay + runDay;
        }
        System.out.println(sumOfWay);
    }
}






