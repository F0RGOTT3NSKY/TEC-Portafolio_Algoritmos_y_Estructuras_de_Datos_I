package Compuertas_Logicas;


/**
 * Esta interfaz es la base para
 * la creacion de cualquier componente
 * logico.
 */
public interface Compuerta_Default {
    /**
     * Metodo para establecer el valor de la entrada 1
     * @param entrada - Valor de la entrada
     */
    public void setInput1(int Input1);
    /**
     * Metodo para establecer el valor de la segunda entrada
     * @param entrada - Valor de la entrada
     */
    public void setInput2(int Input2);
    /**
     * Metodo para obtener la salida de la operacion logica
     * @return - Resultado de la operacion logica
     */
    public int getOutput();
    /**
     * Metodo para establecer el valor de la salida
     * @param Input1
     * @param Input2
     */
    public void setOutput(int Input1, int Input2);
    /**
     * Metodo para obtener el valor de la entrada 1
     * @return
     */
    public int getInput1();
    /**
     * Metodo para obtener el valor de la entrada 2
     * @return entrada - Valor de la entrada
     */
    public int getInput2();
    
}