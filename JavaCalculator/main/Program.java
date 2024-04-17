package main;

import View.View;
import Model.SumModel;
import Presenter.Presenter;

public class Program {

    public static void main(String[] args) {

        Presenter presenter = new Presenter(new SumModel(), new View());

        presenter.runOperation();

    }
}
