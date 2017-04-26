
package ejercicioderepaso;


public class Ejercicioderepaso {

    
    public static void main(String[] args) {
       //Accedo a las variables y constantes comunes de la clase pajarito.
//        System.out.println("Hay " + Pajarito.getNumPajaritos() +" Pajaritos");
//        System.out.println("Puedes poner hasta "+Pajarito.getMAX_NUM()+" Pajaritos");
       //Creamos unos pajaros
        Pajarito paloma;
        Pajarito tortola;
        paloma=new Pajarito("Paloma",8000);
        tortola=new Pajarito("Tortola",150);
        Pantalla.menuPajarito();
        Pajarito p=null;
        int op=Pantalla.opcion();
        while(op !=4){          
            switch (op){
                case 1:
                    //Poner pajarito
                    if (Pajarito.getNumPajaritos()<Pajarito.getMAX_NUM()){
                        p=new Pajarito(Pantalla.pideString("Introduce la raza:")
                                ,Pantalla.pideEntero("Introduce el tamaño:"));                      
                    }
                    break;
                case 2:
                    //Quitar pajarito
                    if (Pajarito.getNumPajaritos()>0){
                        p.quitarPajarito();
                        System.out.println("Tienes "+Pajarito.getNumPajaritos());
                    }
                    break;
                case 3:
                    //Mostrar datos
                    p.visualiza();
                    break;
                case 4:
                    System.out.println("FIN");
                    break;
                    //Fin
            }
            op=Pantalla.opcion();
        }
      
//        //llamada al metodo elGrande.
//        System.out.println("El mas grande es "+elGrande(paloma,tortola).getRaza());
//        //llamada al metido suma.
//        System.out.println("La suma de 4 y 5 es "+suma(4,5));
//        
//        int x=5;
//        int y=6;       
//        int resultado=suma(++x, y++);
//        System.out.println("X: "+x+" Y: "+y+" resultado "+resultado);
//        //LLamada al metodo esMasGrande de la clase Pajarito.
//        if(paloma.esMasGrande(tortola)){
//            System.out.println("La paloma es mas grande");
//        }else{
//            System.out.println("La tortola es mas grande");
//        }
//    }
//    public static Pajarito elGrande(Pajarito uno,Pajarito dos){
//        if (uno.getTamaño()>dos.getTamaño()){
//            return uno;
//        }else {
//            return dos;
//        }
//    }
//    public static int suma(int a,int b){
//        return a+b;
//    }
}
}
