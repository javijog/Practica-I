
package ejercicioderepaso;


public class Pajarito {
    private static int numPajaritos;
    private static int MAX_NUM=5;

   public boolean esMasGrande(Pajarito objetoPajarito){
       //Necesito dos objetos para comparar.
       boolean respuesta;
       respuesta=this.tamaño>objetoPajarito.tamaño;
       return respuesta;
   }
    
    
    
    public static int getNumPajaritos() {
        return numPajaritos;
    }

    /**
     * @param aNumPajaritos the numPajaritos to set
     */
    public static void setNumPajaritos(int aNumPajaritos) {
        numPajaritos = aNumPajaritos;
    }

    /**
     * @return the MAX_NUM
     */
    public static int getMAX_NUM() {
        return MAX_NUM;
    }

    /**
     * @param aMAX_NUM the MAX_NUM to set
     */
    public static void setMAX_NUM(int aMAX_NUM) {
        MAX_NUM = aMAX_NUM;
    }
    private String raza;
    private int tamaño;
    
    public Pajarito (String raza, int tamaño){
        this.raza=raza;
        this.tamaño=tamaño;
        numPajaritos++;
    }
    public void engorda (int cantidad){
        setTamaño(getTamaño() + cantidad);
    }
    public void quitarPajarito(){
        setNumPajaritos(getNumPajaritos() - 1);
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public void visualiza(){
        System.out.println(getRaza()+getTamaño()); 
       
    }
    
    
}
