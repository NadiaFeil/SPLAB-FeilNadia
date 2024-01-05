package ro.uvt.info.designpatternslab2023.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ro.uvt.info.designpatternslab2023.dao.Element;
import ro.uvt.info.designpatternslab2023.dao.Visitee;
import ro.uvt.info.designpatternslab2023.dao.Visitor;

public class TableOfContents implements Element, Visitee {
    private List<String> entries;

    public TableOfContents() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        entries.add(entry);
    }

    @Override
    public void print() {
        System.out.println("Table of Contents:");
        for (String entry : entries) {
            System.out.println(entry);
        }
    }

    @Override
    public void addElement(Element element) {
    }

    @Override
    public void removeElement(Element element) {
    }

    @Override
    public Element get(int number) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

    public Collection<String> getEntries() {

        return entries;
    }
}
