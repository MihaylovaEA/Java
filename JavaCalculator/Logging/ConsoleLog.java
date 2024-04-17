package Logging;

import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class ConsoleLog implements Log {

    private static final Logger logger = Logger.getLogger(ConsoleLog.class.getName());

    // Создаем обработчик логов для вывода в консоль
    private static final ConsoleHandler consoleHandler = new ConsoleHandler();

    @Override
    public String getExpression(Double x, Double y, Double result, Integer operation) {
        String op = "";
        if (operation == 1)
            op = " + ";
        else if (operation == 2)
            op = " * ";
        else
            op = " / ";
        return String.format("%s%s%s = %s", x, op, y, result);
    }

    static {
        // Создаем форматтер для вывода простого текста
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        // Устанавливаем форматтер для обработчика логов
        consoleHandler.setFormatter(simpleFormatter);
        // Добавляем обработчик к логгеру
        logger.addHandler(consoleHandler);
    }

    public void writeExpressionToConsole(String expression) {
        System.out.println(expression + ";");
    }
}
