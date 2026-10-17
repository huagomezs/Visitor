package visitor;

import model.DesktopComputer;
import model.Laptop;
import model.Tablet;
import model.Television;

public class SubtotalCalculatorVisitor implements Visitor {

    private double subtotal = 0;

    @Override
    public void visit(Tablet tablet) {
        subtotal += tablet.getPrice();
    }

    @Override
    public void visit(Laptop laptop) {
        subtotal += laptop.getPrice();
    }

    @Override
    public void visit(DesktopComputer desktopComputer) {
        subtotal += desktopComputer.getPrice();
    }

    @Override
    public void visit(Television television) {
        subtotal += television.getPrice();
    }

    public double getSubtotal() {
        return subtotal;
    }
}