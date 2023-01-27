import java.util.Date;
/**
 *Representa a una persona con sus principales datos personales
 * @ author Oscar David Martinez Benavides
 */
public class Person {

    /**
    *Variable donde se almacena el nombre de la persona.
     */
    protected String name;

    /**
     * Variable donde se almacena el primer apellido de la persona.
     */
    protected String lastName1;
    /**
     * Variable donde se almacena el segundo apellido de la persona.
     */
    protected String lastName2;

    /**
     * Variable donde se almacena la fecha de nacimiento.
     */
    private Date dateBirth;

    /**
     * Variable donde se almacena la altura.
     */
    private float height;

    /**
     *Le asigna una cadena de texto con el nombre de la persona a la variable name.
     * @param name Cadena de texto con el nombre de la persona
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Método para obtener el nombre.
     * @return Nombre de la persona almacenado en la variable name.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Método para almacenar el primer apellido.
     * @param lastName Primer apellido.
     */
    public void setLastName1(String lastName){
        this.lastName1 = lastName;
    }

    /**
     * Método para obtener el primer apellido
     * @return Primer apellido
     */
    public String getLastName1(){
        return this.lastName1;
    }

    /**
     * Método para almacenar el segundo apellido en la variable lastName2
     * @param lastname Segundo apellido
     */
    public void setLastName2(String lastname){
        this.lastName2 = lastname;
    }

    /**
     * Método para obtener el segundo apellido
     * @return Segundo apellido
     */
    public String getLastName2(){
        return this.lastName2;
    }


    /**
     * Método para almacenar la fecha de nacimiento en la variable birthDate
     * @param birthDate Fecha de nacimiento
     */
    public void setDateBirth(Date birthDate){
        this.dateBirth = birthDate;
    }

    /**
     * Método para obtener la fecha de nacimiento.
     * @return Fecha de nacimiento.
     */
    public Date getDateBirth(){
        return this.dateBirth;
    }

    /**
     * Método para almacenar la altura en la variable height
     * @param height Altura de la persona.
     */
    public void setHeight(float height){
        this.height = height;
    }

    /**
     * Método para obtener la altura.
     * @return Altura.
     */
    public float getHeight(){
        return this.height;
    }

}



















