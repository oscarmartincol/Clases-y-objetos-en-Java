# Manejo de clases y objetos en Java

*En el presente repositorio se encuentran 6 clases de Java que describen 6 
objetos y sus características más importantes. A continuación se describe más a detalle el contenido de cada clase.*
## Clase Person 

*Esta clase representa un objeto persona y contiene como atributos los datos personales y métodos  tanto para definir el valor de los atributos como para acceder a los mismos.*

#### Contenido de la clase Person:

- **name:** *Es una variable de tipo String que tiene el propósito de almacenar el nombre que tenga cada entidad creada con esta clase, tiene un modificador de acceso protected por lo que no permite ser accedida de forma directa* 

- **lastName1** y **lastName2:** *Son variables de tipo String que tienen el propósito de almacenar el primer y segundo apellido respectivamente.*

- **dateBirth:** *Es una variable de tipo Date destinada a almacenar la fecha de nacimiento, su modificador de acceso es private.*

- **height:** *Es una variable de tipo float donde se almacena el dato de la altura de la entidad persona, su modificador de acceso es private.*

- **void setName(String name):** *Método que recibe un parametro de tipo String que contiene el nombre que le sera asignado a la variable name por medio de este.* 
 
- **String getName():** *Método que retorna el nombre almacenado en la variable name.*

- **void setLastName1(String lastName) y setLastName2(String lastName):** *Métodos que reciben dos apellidos que son asignados a las variables lastName1 y lastName2.*

- **String getLastName1() y getLastName2():** *Métodos para acceder al valor de las variables lastName1 y lastName2 desde otra clase.

- **void setBirthDate(Date birthDate):** *Método para ingresar la fecha de nacimiento y guardarla en la variable birthDate.*

- **Date getBirthDate():** *Método para acceder a la fecha de nacimiento almacenada en la variable birthDate.*

- **void setHeight(float height):** *Método para ingresar la altura y guardarla en la variable height.*

- **float getHeight():** *Método para obtener la altura almacenada en la variable height.*

## Clase Fruit

*Esta clase representa un objeto de tipo fruta con sus características.

### Contenido de la clase Fruit:

- **String name:** *Atributo que se utiliza para almacenar el nombre de la fruta, tiene modificador de acceso protected por lo que no se puede acceder directamente a ella desde otra clase.*

- **float averageWeight:** *Atributo para almacenar el peso promedio de la fruta, tiene modificador de acceso protected.*

- **ArrayList<String> colors:** *Lista donde se van a almacenar los colores característicos de la fruta.*
  
- **Fruit():** *Constructor para instanciar objetos de tipo fruta donde se crea el arrayList para almacenar los colores.**
  
- **void setName(String name):** *Método para asignar el nombre de la fruta a la variable name.*
  
- **String getName():** *Método para acceder al nombre almacenado en la variable name.*
  
- **void setAverageWeight(float weight):** *Método para asignar el peso promedio a la variable averageWeight.*
  
- **Float getAverageWeight():** *Método para acceder al peso promedio almacenado en la variable averageWeight.*
  
- **void setColor(String color):** *Método para agregar un color al ArrayList colors.*
  
- **ArrayList <String> getColors():** *Método para acceder a la lista de colores almacenados en el ArrayList colors.*
