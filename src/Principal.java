import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CallMain callMain = new CallMain();
        try{
            callMain.callMain();
        }catch (InputMismatchException e){
            System.out.println("Opción Inválida, intente de nuevo...");
        }catch (Exception e){
            System.out.println("Error al Ejecutar el Programa" + e.getMessage());
        }
    }


}
