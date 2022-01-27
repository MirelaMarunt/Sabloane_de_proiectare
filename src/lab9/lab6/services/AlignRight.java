package lab9.lab6.services;

import lab9.lab6.models.Context;
import lab9.lab6.models.Paragraph;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Right: " + paragraph);
    }
}
