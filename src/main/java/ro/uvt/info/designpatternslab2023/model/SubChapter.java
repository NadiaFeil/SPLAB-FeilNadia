package ro.uvt.info.designpatternslab2023.model;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Object> content;

    public SubChapter(String name) {
        this.name = name;
        this.content = new ArrayList<>();
    }

    public void createNewParagraph(String text) {
        content.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        content.add(new Image(imageName));
    }

    public void createNewTable(String tableTitle) {
        Table table = new Table(tableTitle);
        content.add(table);
    }

    public void print() {
        System.out.println("SubChapter: " + name);
        for (Object obj : content) {
            if (obj instanceof Paragraph) {
                System.out.println("Paragraph: " + ((Paragraph) obj).getText());
            } else if (obj instanceof Image) {
                System.out.println("Image with name: " + ((Image) obj).getImageName());
            } else if (obj instanceof Table) {
                System.out.println("Table with Title: " + ((Table) obj).getTableTitle());
            }
        }
    }
}



