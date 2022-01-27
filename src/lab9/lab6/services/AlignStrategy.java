package lab9.lab6.services;

import lab9.lab6.models.Context;
import lab9.lab6.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph, Context context);
}
