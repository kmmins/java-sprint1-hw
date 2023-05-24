import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует программа Счетчик Калорий от производителя спортивных носков.");
        StepTracker stepTracker = new StepTracker();
        Converter converter = new Converter();

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                while (true) {
                    System.out.println("Введите цель по количеству шагов в день:");
                    int newTargetStep = scanner.nextInt();
                    if (newTargetStep <= 0) {
                        System.out.println("Ошибка! Введите неотрицательное значение");
                    } else {
                        stepTracker.statsNewTargetStep(newTargetStep);
                        System.out.println("Цель изменена. Новая цель: " + newTargetStep + " шагов в день");
                        break;
                    }
                }
            } else if (command == 2) {
                System.out.println("За какой месяц вы хотите ввести шаги: (введите код месяца: " +
                        "1-Янв, 2-Фев, 3-Мар, 4-апр, 5-май, 6-июн, 7-июл, 8-авг, 9-сен, 10-окт, 11-ноя, 12-дек");
                int month = scanner.nextInt();
                System.out.println("За какой день в этом месяце вы хотите ввести шаги: (введите день от 1 до 30)");
                int day = scanner.nextInt();
                System.out.println("Введите количество шагов, которое вы прошли в этот день:");
                int steps = scanner.nextInt();
                stepTracker.addSteps(month, day, steps);
                System.out.println("Количество шагов сохранено!");
            } else if (command == 3) {
                System.out.println("За какой месяц вы хотите вывести статистику шагов: (введите код месяца: " +
                        "1-Янв, 2-Фев, 3-Мар, 4-апр, 5-май, 6-июн, 7-июл, 8-авг, 9-сен, 10-окт, 11-ноя, 12-дек");
                int month = scanner.nextInt();
                System.out.println(stepTracker.countStepsMonth(month));
                System.out.println("Суммарное количество шагов в выбранном месяце составило: "
                        + stepTracker.statsSumStepMonth(month));
                System.out.println("Максимальное количество шагов в выбранном месяце составило: "
                        + stepTracker.statsMaxStepsMonth(month));
                System.out.println("Среднее количество шагов в выбранном месяце составило: "
                        + stepTracker.statsAvgStepsMonth(month));
                System.out.println("Пройденная дистанция в выбранном месяце (в км) составила: "
                        + converter.convertKm(stepTracker.statsSumStepMonth(month)));
                System.out.println("Количество сожжённых калорий в выбранном месяце (в Ккал) составило: "
                        + converter.convertCal(stepTracker.statsSumStepMonth(month)));
                System.out.println("В течении " + stepTracker.statsBestStepsMonth(month)
                        + " дней подряд в выбранном месяце вы достигли цели по количеству шагов в день!");
            } else if (command == 4) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Изменить цель по количеству шагов в день (по умолчанию 10000 шагов в день)");
        System.out.println("2 - Ввести количество шагов");
        System.out.println("3 - Вывести статистику");
        System.out.println("4 - Выход из приложения");
    }
}