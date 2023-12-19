package ro.uvt.info.designpatternslab2023.dao;

import ro.uvt.info.designpatternslab2023.model.*;

public interface Visitor<T> {

    T  visitBook(Book book);
    T visitSection(Section section);
    T visitTabelOfContents(TabelOfContents tabelOfContents);
    T visitParagraph(Paragraph paragraph);
    T visitImageProxy(ImageProxy imageProxy);
    T visitImage(Image image);
    T visitTabel(Table table);
}
