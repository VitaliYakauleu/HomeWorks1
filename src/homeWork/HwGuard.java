package homeWork;
//Два охранника попеременно стоят на посту по 12 часов.
      //  Пока один стоит на посту, другой спит.
 //       Когда срабатывает будильник, первый охранник засыпает, второй заменяет первого.
//        Процесс повторяется.
  //      Должны быть классы Guard, Watch
class Guard {
    private String name;

    public Guard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void standWatch() {
        System.out.println(name + " is standing guard.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

public class HwGuard {
    public static void main(String[] args) {
        Guard guard1 = new Guard("Guard 1");
        Guard guard2 = new Guard("Guard 2");

        while (true) {
            guard1.standWatch();
            guard2.sleep();

            try {
                Thread.sleep(5000); // пауза
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            guard2.standWatch();
            guard1.sleep();

            try {
                Thread.sleep(5000); // Simulating some time passing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}