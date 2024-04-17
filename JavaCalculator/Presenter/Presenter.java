package Presenter;

import View.View;
import Logging.ConsoleLog;

import Model.SumModel;
import Model.Divide;
import Model.Multiply;

public class Presenter {
    View view;
    SumModel model;

    public Presenter(SumModel m, View v) {
        model = m;
        view = v;
    }

    public void runOperation() {
        ConsoleLog log = new ConsoleLog();
        String txt = "";
        Double x = (double) view.getValue("Введите первое число: ");
        Double y = (double) view.getValue("Введите второе число: ");
        int choice = view.getChoice();
        switch (choice) {
            case 1: {
                SumModel model = new SumModel();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 2: {
                Multiply model = new Multiply();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 3: {
                Divide model = new Divide();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
        }
        log.writeExpressionToConsole(txt);

    }

}
