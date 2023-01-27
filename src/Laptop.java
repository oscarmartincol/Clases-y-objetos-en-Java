/**
 * Representa al objeto Laptop con sus características.
 * @ author Oscar David Martinez Benavides
 */
public class Laptop {

    /**
     * Variable para almacenar la marca de la laptop.
     */
    private String brand;

    /**
     * Variable para almacenar la capacidad de almacenamiento.
     */
    private String storageCapacity;

    /**
     * Variable para almacenar sistema operativo.
     */
    private String operatingSystem;

    /**
     * Variable que almacena el número de núcleos del procesador
     * de la laptop.
     */
    private int processorCores;

    /**
     * Variable para almacenar las pulgadas de la pantalla.
     */
    private float screenInches;

    /**
     * Constructor que implementa el objeto Laptop.
     * @param brand Marca de la laptop.
     * @param operatingSystem Sistema operativo.
     */
    public Laptop(String brand, String operatingSystem){
        this.brand = brand;
        this.operatingSystem = operatingSystem;
    }

    /**
     * Método para almacenar el número de núcleos del procesador.
     * @param processorCores Núcleos del procesador.
     */
    public void setProcessorCores(int processorCores){
        this.processorCores = processorCores;
    }

    /**
     * Método para acceder al número de núcleos.
     * @return Número de núcleos del procesador.
     */
    private int getProcessorCores(){
        return this.processorCores;
    }

    /**
     * Método para definir la capacidad de almacenamiento.
     * @param storageCapacity Capacidad de almacenamiento.
     */
    public void setStorageCapacity(String storageCapacity){
        this.storageCapacity = storageCapacity;
    }

    /**
     * Método para acceder a  la capacidad de almacenamiento.
     * @return Capacidad de almacenamiento.
     */
    public String getStorageCapacity(){
        return this.storageCapacity;
    }

    /**
     * Método para determinar el tamaño de la pantalla.
     * @param inches Pulgadas de la pantalla.
     */
    public void setScreenInches(float inches){
        this.screenInches = inches;
    }

    /**
     * Método para acceder al tamaño de la pantalla
     * @return Tamaño de la pantalla.
     */
    public float getScreenInches(){
        return this.screenInches;
    }
}
