package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.dao.AlignStrategy;
import ro.uvt.info.designpatternslab2023.model.Content;
import ro.uvt.info.designpatternslab2023.model.Paragraph;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph p, Content c) {
        System.out.println("Aligning to the right: " + p.getText());
    }

}

