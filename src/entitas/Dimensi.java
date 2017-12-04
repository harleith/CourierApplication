package entitas;

public class Dimensi {

    private double lenght;
    private double weight;
    private double height;

    public Dimensi() {
    }

    public Dimensi(double lenght, double weight, double height) {
        this.lenght = lenght;
        this.weight = weight;
        this.height = height;
    }

    /**
     * @return the lenght
     */
    public double getLenght() {
        return lenght;
    }

    /**
     * @param lenght the lenght to set
     */
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    
    
}
