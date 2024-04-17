package Model;

public class SumModel extends CalcModel {

    public SumModel() {
    }

    @Override
    public void setX(Double value) {
        super.x = value;
    }

    @Override
    public void setY(Double value) {
        super.y = value;
    }

    @Override
    public Double result() {
        return x + y;
    }

}
