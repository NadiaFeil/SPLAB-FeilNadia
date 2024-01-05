package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.Element;
import ro.uvt.info.designpatternslab2023.dao.Visitor;

public class TableOfContentUpdate implements Visitor<Void> {
    private TableOfContents toc = new TableOfContents();
    private int currentPage = 0;

    public TableOfContents getToC() {
        return toc;
    }

    @Override
    public Void visitParagraph(Paragraph paragraph) {
        return null;
    }

    @Override
    public Void visitImage(Image image) {
        return null;
    }


    @Override
    public Void visitImageProxy(ImageProxy imageProxy) {
        return null;
    }

    @Override
    public Void visitTabel(Table table) {
        return null;
    }

    @Override
    public Void visitSection(Section section) {
        String title = section.getTitle();

        if (title.startsWith("Chapter")) {
            toc.addEntry(title + " ........................................................... " + currentPage);
        } else if (title.startsWith("Subchapter")) {
            toc.addEntry(title + " ............................. " + currentPage);
        }

        currentPage++;

        for (Element element : section.getElements()) {
            element.accept(this);
        }

        return null;
    }


    @Override
    public Void visitBook(Book book) {
        return null;
    }

    @Override
    public Void visitTableOfContents(TableOfContents toc) {
        return null;
    }

    public void resetPageNumbers() {
        currentPage = 1;
    }
}
