package homework13.task2;

import java.util.Objects;
import java.util.StringJoiner;

public class Box {
    private int height;
    private int width;
    private int length;
    private int weight;

    public Box(int height, int width, int length, int weight) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return height == box.height && width == box.width && length == box.length && weight == box.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, length, weight);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Box.class.getSimpleName() + "[", "]")
                .add("height=" + height)
                .add("width=" + width)
                .add("length=" + length)
                .add("weight=" + weight)
                .toString();
    }
}
