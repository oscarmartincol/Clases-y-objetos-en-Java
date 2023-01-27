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

*Esta clase representa un objeto de tipo fruta con sus características.*

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

## Clase BankAccount

*Representa la cuenta de un banco con sus características.*

### Contenido de la clase BankAccount:

- **accountNumber:** *Variable de tipo int donde se almacena la propiedad número de cuenta.*

- **activated:** *Variable de tipo boolean que expresa si la cuenta esta activa o no lo está.*

- **BankAccount(int accountNumber):** *Constructor que instancia una cuenta definiendo su número asignado.*

- **void setActived(boolean actived):** *Método para definir la activación o desactivación de la cuenta.*

- **boolean getActived():** *Método para verificar el estado de la cuenta.*

## Clase Airplane

*Representa al objeto avión con algunas características que lo identifican.*

### Contenido de la clase Airplane:

- **motorsNumber:** *Es una variable de tipo entero que representa el número de motores que tiene el objeto avión.*

- **fuelCapacity:** *Esta variable es de tipo flotante y representa la capacidad de almacenamiento de combustible que tiene el avión.*

- **brand:** *Es una variable de tipo cadena de texto, la cual representa la marca del fabricante.*

- **carryingCapacity** *Es una variable de tipo flotante que representa la capacidad que tiene el avión para transportar carga.*

- **Airplane(String brand, int motorsNumber)** *Constructor que crea una instancia del objeto Airplane, recibe los parámetros de marca y número de motores y los asigna a las variables de brand y motorsNumber respectivamente.*

- **void setFuelCapacity(float fuelCapacity):** *Método que recibe el parámetro con la capacidad de combustible y lo asigna a la variable fuelCapacity.*

- **float getFuelCapacity:** *Método que permite acceder al valor de la variable fuelCapacity desde el exterior de la clase.*

- **void setCarryingCapacity(float carryingCapacity):** *Método que recibe el parámetro capacidad de carga y se lo asigna a la variable carryingCapacity.*

- **float getCarryingCapacity():** *Método que permite el acceso a la variable carryingCapacity desde el exterior de la clase.*

 ## Clase Fridge
 
 *Representa una nevera con las características que la identifican.*
 
 ### Contenido de la clase Fridge:
 
 - **brand:** *Variable de tipo cadena de texto que representa la propiedad marca de la nevera.*
 
 - **doorsNumber:** *Variable de tipo entero que describe el número de puertas que tiene la nevera.*
 
 - **color:** *Variable de tipo cadena de texto que contiene el color de la nevera.*
 
 - **litersStorage:** *Variable de tipo entero que describe la capacidad de almacenamiento en litros de la nevera.*
 
 - **powerConsumption:** *Variable que representa el consumo eléctrico minimo de la nevera.*
 
 - **void setColor(String color):** *Método que recibe como parámetro el color de la nevera y lo asigna a la variable color.*
 
 - **String getColor():** *Método que permite el acceso al valor de la variable color desde el exterior de la clase.*
 
 - **void setBrand(String brand):** *Método que recibe como parámetro una cadena de texto con la marca de la nevera y la asigna a la variable brand.*
 
 - **Sting getBrand():** *Método que permite el acceso al valor de la variable brand desde el exterior de la clase.*
 
 - **void setDoorsNumber(int doorsNumber):** *Método que recibe como parámetro un entero con el número de puertas de la nevera y se lo asigna a la variable doorsNumber.*
 
 - **Int getDoorsNumber():** *Método que permite el acceso al valor de la variable doorsNumber desde el exterior de la clase.*
 
 - **void setLitersStorage(int litersStorage):** *Método que recibe como parámetro un entero con la capacidad de almacenamiento en litros de la nevera y se lo asigna a la variable litersStorage.*
 
 - **int getLitersStorage()** *Método que permite el acceso al valor de la variable litersStorage desde el exterior de la clase.*
 
 - **void setPowerConsumption(float powerConsumption)** *Método que recibe como parámetro un número de tipo flotante que describe el consumo de energía de la nevera y lo almacena en la variable powerConsumption.*
 
 - **float getPowerConsumption()** *Método que permite el acceso al valor almacenado en la variable powerConsumption desde el exterior de la clase.*
