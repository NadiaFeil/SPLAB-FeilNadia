package ro.uvt.info.designpatternslab2023;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.designpatternslab2023.model.*;
import ro.uvt.info.designpatternslab2023.services.AlignLeft;
import ro.uvt.info.designpatternslab2023.services.AlignRight;

@SpringBootApplication
public class DesignPatternsLab2023Application {

    public static void main(String[] args) throws Exception {
        /*Book b = new Book("The book");
        Section cap1 = new Section("Chapter 1");
        Section cap11 = new Section("Subchapter 1.1");
        Section cap2 = new Section("Chapter 2");
        cap1.add(new Paragraph("Paragraph 1"));
        cap1.add(new Paragraph("Paragraph 2"));
        cap1.add(new Paragraph("Paragraph 3"));

        cap11.add(new ImageProxy("ImageOne"));
        cap11.add(new Image("ImageTwo"));

        cap2.add(new Paragraph("Paragraph 4"));
        cap1.add(cap11);
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        b.addContent(cap1);
        b.addContent(cap2);
        TableOfContentUpdate tocUpdate = new TableOfContentUpdate();
        b.accept(tocUpdate);
        tocUpdate.getToC().accept(new RenderContentVisitor());*/

        Book book = new Book("My book");

        BookSaveVisitor saveVisitor = new BookSaveVisitor();
        book.accept(saveVisitor);

        saveVisitor.saveToJsonFile("output.json");
    }
}
