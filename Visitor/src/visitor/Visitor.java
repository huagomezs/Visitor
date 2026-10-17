package visitor;

import model.DesktopComputer;
import model.Laptop;
import model.Tablet;
import model.Television;

public interface Visitor {
    void visit(Tablet tablet);
    void visit(Laptop laptop);
    void visit(DesktopComputer desktopComputer);
    void visit(Television television);
}