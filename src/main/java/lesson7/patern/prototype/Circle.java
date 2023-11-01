package lesson7.patern.prototype;

import java.util.Objects;

public class Circle extends Shape {
    public int radius;

    public Circle(){

    }

    public Circle(Circle target){
        super(target);
        if (target!=null){
            this.radius=target.radius;
        }
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        if (!super.equals(o)) return false;
        return radius == circle.radius;
    }

}
