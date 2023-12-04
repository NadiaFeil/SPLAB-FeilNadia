package ro.uvt.info.designpatternslab2023.model;

import ro.uvt.info.designpatternslab2023.dao.Element;

public class ImageProxy implements Element {
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
}

