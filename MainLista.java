package ListaPersona;

import java.util.Scanner;

/**
 *
 * @author Aldo
 */
public class MainLista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista ls = new Lista(); //instanciamos la lista
        int opcion = 0;
        int contadorp = 0;

        do {
            System.out.println();
            System.out.println("+++++++++++++++ Elija una Opcion +++++++++++++++");
            System.out.println("1) Agregar una persona a la Lista:");
            System.out.println("2) Mostrar Lista");
            System.out.println("3) Agregar una persona una posicion antes de una referencia");
            System.out.println("4) Agregar una persona una posicion despues de una referencia ");
            System.out.println("5) Eliminar una persona antes de una referencia ");
            System.out.println("6) Eliminar una persona despues de una refencia ");
            System.out.println("7) Eliminar una persona dada una referencia");
            System.out.println("8) Salir del programa ");
            opcion = sc.nextInt();
            String nombre = null;

            String sexo = null;
            int edad = 0;
            double estatura;
            float peso;
            switch (opcion) {

                case 1:
                    //--------------------------------------------------------------------//    
                    do {
                        System.out.println("Ingrese la edad entre 18 y 35");
                        edad = sc.nextInt();
                        if (edad < 18 || edad > 35) {
                            System.out.println("Edad Incorrecta");
                        }
                    } while (edad < 18 || edad > 35);
                    //------------------------------------------------------>>>
                    do {
                        System.out.println("Sexo: M / F");
                        sexo = sc.next();
                        if (sexo.equals("F")) {
                            System.out.println("Sexo incorrecto");
                        }
                    } while (sexo.equals("F"));
                    //------------------------------------------------>>>
                    do {
                        System.out.println("Ingrese estatura entre 1.80 y 2.10");
                        estatura = sc.nextDouble();
                        if (estatura < 1.80 || estatura > 2.10) {
                            System.out.println("Estatura incorrecta");
                        }
                    } while (estatura < 1.80 || estatura > 2.10);
                    //--------------------------------------------------
                    do {
                        System.out.println("Ingrese el peso menor o igual a 80 kg:");
                        peso = sc.nextFloat();
                        if (peso > 80) {
                            System.out.println("peso incorrecto");
                        }
                    } while (peso > 80);

                    System.out.println("Ingrese nombre persona");
                    nombre = sc.next();

                    ls.insertarPrincipio(new Persona(nombre, sexo, edad, estatura, peso)); // 
                    System.out.println("Persona agregada correctamente");
                    contadorp++;
                    
                     if (contadorp==0) {
                        System.out.println("LISTA VACIA!!");
                    }else{
                        System.out.println("----------Lista:--------");
                    for (int i = 0; i < contadorp; i++) {
                        System.out.println("# " + (i) + " :" + ls.obtener(i));
                    }
                    }

                    break;
                case 2:
                      if (contadorp==0) {
                        System.out.println("LISTA VACIA!!");
                    }else{
                        System.out.println("----------Lista:--------");
                    for (int i = 0; i < contadorp; i++) {
                        System.out.println("# " + (i) + " :" + ls.obtener(i));
                    }
                    }
                break;
                case 3:
                      //--------------------------------------------------------------------//    
                    do {
                        System.out.println("Ingrese la edad entre 18 y 35");
                        edad = sc.nextInt();
                        if (edad < 18 || edad > 35) {
                            System.out.println("Edad Incorrecta");
                        }
                    } while (edad < 18 || edad > 35);
                    //------------------------------------------------------>>>
                    do {
                        System.out.println("Sexo: M / F");
                        sexo = sc.next();
                        if (sexo.equals("F")) {
                            System.out.println("Sexo incorrecto");
                        }
                    } while (sexo.equals("F"));
                    //------------------------------------------------>>>
                    do {
                        System.out.println("Ingrese estatura entre 1.80 y 2.10");
                        estatura = sc.nextDouble();
                        if (estatura < 1.80 || estatura > 2.10) {
                            System.out.println("Estatura incorrecta");
                        }
                    } while (estatura < 1.80 || estatura > 2.10);
                    //--------------------------------------------------
                    do {
                        System.out.println("Ingrese el peso menor o igual a 80 kg:");
                        peso = sc.nextFloat();
                        if (peso > 80) {
                            System.out.println("peso incorrecto");
                        }
                    } while (peso > 80);

                    System.out.println("Ingrese nombre persona");
                    nombre = sc.next();
                    System.out.println("Ingrese numero como referencia,se agregara persona una posicion antes de este numero:");
                   do{ 
                    opcion = sc.nextInt();
                    if (opcion==1) {
                        ls.insertarPrincipio(new Persona(nombre, sexo, edad, estatura, peso));
                        System.out.println("Persona agregada correctamente");
                    contadorp++;
                    }else if(opcion<=0 || opcion>=contadorp){
                        System.out.println("Numero negativo o no existente ,ingrese numero positivo o existente");
                    }else{
                     ls.insertarDespues(opcion-2, new Persona(nombre, sexo, edad, estatura, peso));
                    System.out.println("Persona agregada correctamente");
                    contadorp++;
                    }
                   }while(opcion<=0 || opcion>=contadorp);
                   
                     if (contadorp==0) {
                        System.out.println("LISTA VACIA!!");
                    }else{
                        System.out.println("----------Lista:--------");
                    for (int i = 0; i < contadorp; i++) {
                        System.out.println("# " + (i) + " :" + ls.obtener(i));
                    }
                    }
                    break;
                case 4:
                      //--------------------------------------------------------------------//    
                    do {
                        System.out.println("Ingrese la edad entre 18 y 35");
                        edad = sc.nextInt();
                        if (edad < 18 || edad > 35) {
                            System.out.println("Edad Incorrecta");
                        }
                    } while (edad < 18 || edad > 35);
                    //------------------------------------------------------>>>
                    do {
                        System.out.println("Sexo: M / F");
                        sexo = sc.next();
                        if (sexo.equals("F")) {
                            System.out.println("Sexo incorrecto");
                        }
                    } while (sexo.equals("F"));
                    //------------------------------------------------>>>
                    do {
                        System.out.println("Ingrese estatura entre 1.80 y 2.10");
                        estatura = sc.nextDouble();
                        if (estatura < 1.80 || estatura > 2.10) {
                            System.out.println("Estatura incorrecta");
                        }
                    } while (estatura < 1.80 || estatura > 2.10);
                    //--------------------------------------------------
                    do {
                        System.out.println("Ingrese el peso menor o igual a 80 kg:");
                        peso = sc.nextFloat();
                        if (peso > 80) {
                            System.out.println("peso incorrecto");
                        }
                    } while (peso > 80);

                    System.out.println("Ingrese nombre persona");
                    nombre = sc.next();
                    System.out.println("Ingrese numero como referencia,se agregara persona despues de este numero:");
                    do{
                    opcion = sc.nextInt();
                    if (opcion>=contadorp || opcion<0) {
                        System.out.println("numero no existente,ingrese numero positivo o dentro del rango");
                    }else{
                    ls.insertarDespues(opcion, new Persona(nombre, sexo, edad, estatura, peso));
                    System.out.println("Persona agregada correctamente");
                    contadorp++;
                    }
                    }while(opcion>=contadorp || opcion<0);
                      if (contadorp==0) {
                        System.out.println("LISTA VACIA!!");
                    }else{
                        System.out.println("----------Lista:--------");
                    for (int i = 0; i < contadorp; i++) {
                        System.out.println("# " + (i) + " :" + ls.obtener(i));
                    }
                    }
                    break;
                case 5:
                    if (contadorp==0) {
                        System.out.println("Lista vacia,no se puede eliminar elemento");
                    }else{
                    System.out.println("Ingrese numero con referencia,se eliminara persona una posicion antes de este numero");
                    do{
                    opcion = sc.nextInt();
                     if (opcion>contadorp || opcion<=0) {
                        System.out.println("Referencia no existe en la lista,ingrese numero correcto");
                    }else{
                    ls.eliminarPersona(opcion-1);
                    System.out.println("Persona eliminada!");
                    contadorp--;
                     }
                    }while(opcion>contadorp || opcion<=0);
                      if (contadorp==0) {
                        System.out.println("LISTA VACIA!!");
                    }else{
                        System.out.println("----------Lista:--------");
                    for (int i = 0; i < contadorp; i++) {
                        System.out.println("# " + (i) + " :" + ls.obtener(i));
                    }
                    }
                    }
                    break;
                case 6:
                    if (contadorp==0) {
                        System.out.println("Lista vacia,no se puede eliminar elemento");
                    }else{
                    System.out.println("Ingrese numero con referencia,se eliminara persona una posicion despues de este numero");
                    do{
                    opcion = sc.nextInt();
                    if(opcion>=contadorp || opcion<0 || opcion+1>contadorp){
                        System.out.println("Referencia no existe en la lista,ingrese numero correcto");
                    }else if(contadorp==1){
                        System.out.println("No se puede eliminar,solo hay un elemento como referencia en la lista,ingrese mas elementos a la lista");
                        do {
                        System.out.println("Ingrese la edad entre 18 y 35");
                        edad = sc.nextInt();
                        if (edad < 18 || edad > 35) {
                            System.out.println("Edad Incorrecta");
                        }
                    } while (edad < 18 || edad > 35);
                    //------------------------------------------------------>>>
                    do {
                        System.out.println("Sexo: M / F");
                        sexo = sc.next();
                        if (sexo.equals("F")) {
                            System.out.println("Sexo incorrecto");
                        }
                    } while (sexo.equals("F"));
                    //------------------------------------------------>>>
                    do {
                        System.out.println("Ingrese estatura entre 1.80 y 2.10");
                        estatura = sc.nextDouble();
                        if (estatura < 1.80 || estatura > 2.10) {
                            System.out.println("Estatura incorrecta");
                        }
                    } while (estatura < 1.80 || estatura > 2.10);
                    //--------------------------------------------------
                    do {
                        System.out.println("Ingrese el peso menor o igual a 80 kg:");
                        peso = sc.nextFloat();
                        if (peso > 80) {
                            System.out.println("peso incorrecto");
                        }
                    } while (peso > 80);

                    System.out.println("Ingrese nombre persona");
                    nombre = sc.next();

                    ls.insertarPrincipio(new Persona(nombre, sexo, edad, estatura, peso)); // 
                    System.out.println("Persona agregada correctamente");
                    contadorp++;
                             
                    }else{
                    ls.eliminarPersona(opcion+1);
                    System.out.println("Persona eliminada!");
                    contadorp--;
                    }
                    }while(opcion>=contadorp || opcion<0 || opcion+1>contadorp);
                      if (contadorp==0) {
                        System.out.println("LISTA VACIA!!");
                    }else{
                        System.out.println("----------Lista:--------");
                    for (int i = 0; i < contadorp; i++) {
                        System.out.println("# " + (i) + " :" + ls.obtener(i));
                    }
                    }
                    }
                    break;
                    
                case 7:
                    if (contadorp==0) {
                        System.out.println("La lista esta vacia,no se puede eliminar elemento");
                    }else{
                    System.out.println("Ingrese numero de persona a eliminar");
                 do{
                    opcion=sc.nextInt();
                    if (opcion>contadorp) {
                        System.out.println("Numero de referencia inexistente,ingrese otro numero");
                        
                    }else{
                    ls.eliminarPersona(opcion);
                    System.out.println("Persona eliminada");
                    contadorp--;
                    }
                 }while(opcion>contadorp);
                  
                    if (contadorp==0) {
                        System.out.println("LISTA VACIA!!");
                    }else{
                        System.out.println("----------Lista:--------");
                    for (int i = 0; i < contadorp; i++) {
                        System.out.println("# " + (i) + " :" + ls.obtener(i));
                    }
                    }
                    }
                    break;
                case 8:
                    System.out.println("Programa Terminado");
                  System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;

            }
        } while (opcion != 8);
    }
}
