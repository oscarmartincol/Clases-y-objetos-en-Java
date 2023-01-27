import java.util.ArrayList;

/**
 * Representa a una fruta con sus características.
 * @ author Oscar David Martinez Benavides
 */
public class Fruit {

    /**
     * Variable para almacenar el nombre de la fruta
     */
    protected String name;

    /**
     * Variable para almacenar el peso promedio de la fruta.
     */
    protected float averageWeight;

    /**
     * Lista para almacenar los colores de la fruta.
     */
    private ArrayList<String> colors;

    /**
     * Constructor que instancia la clase Fruit y crea el ArrayList.
     */
    public Fruit(){
        this.colors = new ArrayList<String>();
    }

    /**
     * Le asigna una cadena de texto a la variable name con el nombre de la fruta.
     * @param name Nombre de la fruta.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Método para obtener el nombre de la fruta.
     * @return Nombre de la fruta
     */
    public String getName(){
        return this.name;
    }

    /**
     * Asigna el peso promedio de la fruta.
     * @param weight peso promedio de la fruta.
     */
    public void setAverageWeight(float weight){
        this.averageWeight = weight;
    }

    /**
     * Método para obtener el peso promedio de la fruta.
     * @return Peso promedio de la fruta.
     */
    public float getAverageWeight(){
        return this.averageWeight;
    }

    /**
     * Agrega una cadena de texto con un color a la lista de colores.
     * @param color Color de la fruta
     */
    public void setColor(String color){
        this.colors.add(color);
    }

    /**
     * Método para obtener la lista de colores para la fruta.
     * @return Lista de colores.
     */
    public ArrayList<String> getColors(){
        return this.colors;
    }
}
