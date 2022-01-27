package lab6.services;

import lab6.models.Context;
import lab6.models.Paragraph;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Left: " + paragraph);
    }
}