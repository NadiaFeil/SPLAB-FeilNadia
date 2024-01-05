package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.Visitor;


public class RenderContentVisitor implements Visitor {
    @Override
    public Object visitBook(Book book) {

        book.print();
        return null;
    }

    @Override
    public Object visitSection(Section section) {

        section.print();
        return null;
    }

    @Override
    public Object visitTableOfContents(TableOfContents tabelOfContents) {

        tabelOfContents.print();
        return null;
    }

    @Override
    public Object visitParagraph(Paragraph paragraph) {

        paragraph.print();
        return null;
    }

    @Override
    public Object visitImageProxy(ImageProxy imageProxy) {

        imageProxy.print();
        return null;
    }

    @Override
    public Object visitImage(Image image) {

        image.print();
        return null;
    }

    @Override
    public Object visitTabel(Table table) {

        table.print();
        return null;
    }
}
