package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.Element;
import ro.uvt.info.designpatternslab2023.dao.Visitee;
import ro.uvt.info.designpatternslab2023.dao.Visitor;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Visitee {
    private String imageName;

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getImageName() {
        return imageName;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + getImageName());
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

        visitor.visitImage(this);
    }

    public String getName() {

        return imageName;
    }
}
