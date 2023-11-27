package ro.uvt.info.designpatternslab2023.model;

import lombok.Getter;
import lombok.Setter;
import ro.uvt.info.designpatternslab2023.dao.Element;

import java.util.List;

public class Section implements Element{

    @Getter
    @Setter
    public String title;
    public List<Element> elements;

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
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
}
