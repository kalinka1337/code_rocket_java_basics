package homework7shapes;

import java.util.List;

public class ShapeOutput
{
    ShapeRepository shapeRepository;

    public ShapeOutput(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    public void output(){
        shapeRepository.getShapes();
    }
}
