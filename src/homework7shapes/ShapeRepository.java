package homework7shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeRepository
{
    public List<Shape> shapes = new ArrayList<>();

    public void save(Shape shape) {
        shapes.add(shape);
    }

    public void getShapes() {
        for (Shape shape: shapes){
            System.out.println(shape);
        }
    }

}
