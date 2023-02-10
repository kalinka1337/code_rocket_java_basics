package homework7shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeRepository
{
    private List<Shape> shapes = new ArrayList<>();

    public void save(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
