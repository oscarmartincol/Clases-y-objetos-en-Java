/**
 * Representa las características de la cuenta de un banco.
 * @ author Oscar David Martinez Benavides
 */
public class BankAccount {
    /**
     * Variable con el número de cuenta
     */
    protected int accountNumber;
    /**
     * Variable que representa la activación de la cuenta.
     */
    private boolean activated;

    /**
     * Constructor que instancia la clase BankAccount y
     * inicializa el valor de la variable accountNumber.
     * @param accountNumber Número de cuenta.
     */
    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    /**
     * Método para definir el estado de activación de la cuenta.
     * @param actived Estado de la cuenta
     */
    public void setActived(boolean actived){
        this.activated = actived;
    }

    /**
     * Método para obtener el estado de activación de la cuenta
     * @return Estado de la cuenta.
     */
    public boolean getActived(){
        return this.activated;
    }

}
