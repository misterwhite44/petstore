package fr.epsi.b3devc1.tp_eval.entity;

import jakarta.persistence.Entity;

@Entity
public class Cat extends Animal {
    private String furColor;

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }
}
