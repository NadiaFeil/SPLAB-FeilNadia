package ro.uvt.info.designpatternslab2023.dao;

import ro.uvt.info.designpatternslab2023.model.Paragraph;
import ro.uvt.info.designpatternslab2023.model.Content;

import javax.naming.Context;

public interface AlignStrategy {

    public void render(Paragraph p, Content c);
}
