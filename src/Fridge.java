/**
 * Representa una nevera con sus propiedades.
 * @ author Oscar David Martinez Benavides
 */
public class Fridge {

    /**
     * Representa la marca de la nevera.
     */
    protected String brand;

    /**
     * Representa el número de puertas.
     */
    protected int doorsNumber;

    /**
     * Representa el color de la nevera.
     */
    protected String color;

    /**
     * Representa los litros de almacenamiento.
     */
    protected int litersStorage;

    /**
     * Representa el consumo de energía.
     */
    protected float powerConsumption;

    /**
     * Método para asignar valor a la variable color.
     * @param color Color de la nevera.
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Método para leer el valor de la variable color.
     * @return Color de la nevera.
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Método para asignar el valor de la variable brand.
     * @param brand Marca de la nevera.
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    /**
     * Método para leer el valor de la variable brand.
     * @return Marca de la nevera.
     */
    public String getBrand(){
        return this.brand;
    }

    /**
     * Método donde se asigna el valor de la variable doorsNumber.
     * @param doorsNumber número de puertas de la nevera.
     */
    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    /**
     * Método para leer el valor de la variable doorsNumber.
     * @return Número de puertas.
     */
    public int getDoorsNumber(){
        return this.doorsNumber;
    }

    /**
     * Método para asignar el valor a la variable litersStorage.
     * @param litersStorage Litros de almacenamiento.
     */
    public void setLitersStorage(int litersStorage){
        this.litersStorage = litersStorage;
    }

    /**
     * Método para leer el valor de la variable litersStorage
     * @return Litros de almacenamiento.
     */
    public int getLitersStorage(){
        return this.litersStorage;
    }

    /**
     * Método para asignar el valor de la variable powerConsumption.
     * @param powerConsumption Consumo de energía.
     */
    public void setPowerConsumption(float powerConsumption){
        this.powerConsumption = powerConsumption;
    }

    /**
     * Método para leer el valor de la variable powerConsumption
     * @return Consumo de energía.
     */
    public float getPowerConsumption(){
        return this.powerConsumption;
    }
}
