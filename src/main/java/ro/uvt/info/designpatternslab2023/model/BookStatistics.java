package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.Visitor;

public class BookStatistics implements Visitor {

    Integer numberOfImages=0;
    Integer numberOfTables=0;
    Integer numberOfParagraph=0;
    @Override
    public Object visitBook(Book book) {
        return null;
    }

    @Override
    public Object visitSection(Section section) {
        return null;
    }

    @Override
    public Object visitTabelOfContents(TabelOfContents tabelOfContents) {
        return null;
    }

    @Override
    public Object visitParagraph(Paragraph paragraph) {
        numberOfParagraph++;
        return null;
    }

    @Override
    public Object visitImageProxy(ImageProxy imageProxy) {
        numberOfImages++;
        return null;
    }

    @Override
    public Object visitImage(Image image) {
        numberOfImages++;
        return null;
    }

    @Override
    public Object visitTabel(Table table) {
        numberOfTables++;
        return null;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + numberOfImages);
        System.out.println("*** Number of tables: " + numberOfTables);
        System.out.println("*** Number of paragraphs: " + numberOfParagraph);
    }
}
