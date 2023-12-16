package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.AlignStrategy;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(Paragraph p, Content c) {
        System.out.println("Aligning to the left: " + p.getText());
    }
}
