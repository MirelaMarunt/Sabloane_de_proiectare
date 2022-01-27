package lab6;
import lab6.models.*;
import lab6.services.AlignCenter;
import lab6.services.AlignLeft;
import lab6.services.AlignRight;
import lab6.services.RenderContentVisitor;

public class Main {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.addWithoutCopy(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        RenderContentVisitor stats = new RenderContentVisitor();
        cap1.accept(stats);
    }
}
