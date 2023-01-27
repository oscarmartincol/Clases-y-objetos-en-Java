/**
 *Representa un avión y sus propiedades
 * @ author Oscar David Martinez Benavides
 */
public class Airplane {

    /**
     * Representa el número de motores del avión.
     */
    private int motorsNumber;

    /**
     * Representa la cantidad de combustible que puede almacenar.
     */
    private float fuelCapacity;

    /**
     * Representa la marca del avión.
     */
    private String brand;

    /**
     * Representa la capacidad de carga que soporta.
     */
    private float carryingCapacity;

    /**
     * Crea instancia de la clase Airplane asignando valores a las variables
     * brand y motorsNumber.
     * @param brand Marca del avión
     * @param motorsNumber Número de motores.
     */
    public Airplane(String brand, int motorsNumber){
        this.brand = brand;
        this.motorsNumber = motorsNumber;
    }

    /**
     * Método para asignar la capacidad de combustible.
     * @param fuelCapacity Capacidad de combustible.
     */
    public void setFuelCapacity(float fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * Método para acceder a la capacidad de combustible.
     * @return Capacidad de combustible.
     */
    public float getFuelCapacity(){
        return this.fuelCapacity;
    }

    /**
     * Método para definir la capacidad de carga.
     * @param carryingCapacity Capacidad de carga.
     */
    public void setCarryingCapacity(float carryingCapacity){
        this.carryingCapacity = carryingCapacity;
    }

    /**
     * Método para obtener la capacidad de carga
     * @return Capacidad de carga.
     */
    public float getCarryingCapacity(){
        return this.carryingCapacity;
    }

    
}
