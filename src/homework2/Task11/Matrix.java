package homework2.Task11;

public class Matrix
{
    private int rows;
    private int columns;
    private int[][] elements;


    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setPosition(int row, int columns){

    }
}
