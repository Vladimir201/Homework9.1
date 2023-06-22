import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.invoke.SwitchPoint;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }
    public static void task1(){
        System.out.println(" ");
        System.out.println("Exercise 1");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName =  middleName + " " + firstName + " " + lastName;

        System.out.println("ФИО сторудника - " + fullName);
    }

    public static void task2(){
        System.out.println(" ");
        System.out.println("Exercise 2");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName =  middleName + " " + firstName + " " + lastName;

        System.out.println("Даные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Exercise 3");

        String fullName = "Иванов Сёмен Сёменович";
        String fullNameTrue = fullName.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника - " + fullNameTrue);
    }
}