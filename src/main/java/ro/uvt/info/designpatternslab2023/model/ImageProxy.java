package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.Element;
import ro.uvt.info.designpatternslab2023.dao.Visitee;
import ro.uvt.info.designpatternslab2023.dao.Visitor;

public class ImageProxy implements Element, Visitee {
    private Image realImage;
    private String imageName;

    public ImageProxy(String name) {
        imageName = name;
    }

    private Image loadImage() {
        if (realImage == null) {
            realImage = new Image(imageName);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void addElement(Element element) {
        loadImage().addElement(element);
    }

    @Override
    public void removeElement(Element element) {
        loadImage().removeElement(element);
    }

    @Override
    public Element get(int number) {
        return loadImage().get(number);
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visitImageProxy(this);
    }
}

