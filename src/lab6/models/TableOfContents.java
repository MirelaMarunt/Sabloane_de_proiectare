package lab6.models;

import lab6.models.Element;
import lab6.services.Visitee;
import lab6.services.Visitor;

public class TableOfContents implements Element, Visitee {
    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}
