/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtask;
import java.util.Scanner;

/**
 *
 * @author luca
 */
public class TestTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Metodo de ingreso de datos por el usuario
        Scanner leer = new Scanner(System.in);
                        
        Task Tarea1 = new Task();
        Task Tarea2 = new Task();
        Task Tarea3 = new Task();
               
        System.out.println("*   *   *   *   *   BIENVENIDO   *   *   *   *   *");
        
        //DECLARACION DE VARIABLE
        String DESCRIP;
        boolean ESTADO;
        String fechaIngresada;
                   
        int menu=-1;
        while(menu!=0){
            System.out.println("MENU PRINCIPAL");
            System.out.println("OPCION 1 - AGREGAR UNA TAREA");
            System.out.println("OPCION 2 - VER LISTADO DE TAREAS");
            System.out.println("OPCION 3 - MOSTRAR UNA TAREA");
            System.out.println("OPCION 0 - FINALIZAR");
            
            System.out.print("INGRESE EL NUMERO DE OPCION: ");
            menu = leer.nextInt();
            
            if(menu!=0){
                
                switch(menu){
                    case 1:
                        System.out.println("\n *   *   *   *   *   AGREGAR TAREA   *   *   *   *   *");
                        int posicion=0;
                        //BUSCA POSICION LIBRE 
                        if(Tarea1.getDescripcion().equals("VACIO")){
                            posicion=1;
                        }else{
                            if(Tarea2.getDescripcion().equals("VACIO")){
                                posicion=2;
                            }else{
                                if(Tarea3.getDescripcion().equals("VACIO")){
                                    posicion=3;
                                }
                            }
                        }
                        
                        if(posicion!=0){
                            //PEDIMOS AL USUARIO Q INGRESE LOS DATOS DE LA TAREA
                            System.out.print("INGRESE LA DESCRIPCION DE LA TAREA: ");
                            DESCRIP = leer.next();
                            System.out.print("INGRESE EL ESTADO DE LA TAREA (TRUE/FALSE): ");
                            ESTADO = leer.nextBoolean();
                            System.out.print("FECHA LIMITE PARA COMPLETAR LA TAREA (FORMATO: AAAA-MM-DD): ");
                            fechaIngresada = leer.next();
                            
                            switch(posicion){
                                case 1:{
                                    //GUARDAMOS LOS DATOS INGRESADOS
                                    Tarea1.setDescripcion(DESCRIP);
                                    Tarea1.setCompletado(ESTADO);
                                    Tarea1.setFechaVencimiento(fechaIngresada);
                                    
                                    //CONFIRMACION DE DATOS GUARDADOS
                                    System.out.println("LA TAREA FUE REGISTRADA CON EXITO \n");
                                    break;
                                }
                                case 2:{
                                    //GUARDAMOS LOS DATOS INGRESADOS
                                    Tarea2.setDescripcion(DESCRIP);
                                    Tarea2.setCompletado(ESTADO);
                                    Tarea2.setFechaVencimiento(fechaIngresada);
                                    
                                    //CONFIRMACION DE DATOS GUARDADOS
                                    System.out.println("LA TAREA FUE REGISTRADA CON EXITO \n");
                                    break;
                                }
                                case 3:{
                                    //GUARDAMOS LOS DATOS INGRESADOS
                                    Tarea3.setDescripcion(DESCRIP);
                                    Tarea3.setCompletado(ESTADO);
                                    Tarea3.setFechaVencimiento(fechaIngresada);
                                    
                                    //CONFIRMACION DE DATOS GUARDADOS
                                    System.out.println("LA TAREA FUE REGISTRADA CON EXITO \n");
                                    break;
                                }
                            }
                        }else{
                            System.out.println("\n LAS 3 TAREAS ESTAN CARGADAS \n");
                        }
                        break;
                    case 2:
                        System.out.println("\n*   *   *   *   *   LISTADO DE TAREAS    *   *   *   *   *");
                        int contador=0;
                        //MOSTRAMOS LAS TAREAS QUE ESTEN REGISTRADAS
                        if(Tarea1.getDescripcion().equals("VACIO") != true){
                            contador++;
                            System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea1.isCompletado()+". DESCRIPCION: "+Tarea1.getDescripcion()+". FECHA LIMITE: "+Tarea1.getFechaVencimiento());
                        }
                        if(Tarea2.getDescripcion().equals("VACIO") != true){
                            contador++;
                            System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea2.isCompletado()+". DESCRIPCION: "+Tarea2.getDescripcion()+". FECHA LIMITE: "+Tarea2.getFechaVencimiento());
                        }
                        if(Tarea3.getDescripcion().equals("VACIO") != true){
                            contador++;
                            System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea3.isCompletado()+". DESCRIPCION: "+Tarea3.getDescripcion()+". FECHA LIMITE: "+Tarea3.getFechaVencimiento());
                        }
                         
                        if(contador==0){
                            System.out.println("\n NO SE ENCONTRARON TAREAS REGISTRADAS \n");
                        }                                               
                        
                        break;
                    
                    case 3:
                        System.out.println("\n*   *   *   *   *   BUSCAR TAREA   *   *   *   *   *");
                        contador=0;
                        //MOSTRAMOS LAS TAREAS QUE ESTEN REGISTRADAS
                        if(Tarea1.getDescripcion().equals("VACIO") != true){
                            contador++;
                            System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea1.isCompletado()+". DESCRIPCION: "+Tarea1.getDescripcion()+". FECHA LIMITE: "+Tarea1.getFechaVencimiento());
                        }
                        if(Tarea2.getDescripcion().equals("VACIO") != true){
                            contador++;
                            System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea2.isCompletado()+". DESCRIPCION: "+Tarea2.getDescripcion()+". FECHA LIMITE: "+Tarea2.getFechaVencimiento());
                        }
                        if(Tarea3.getDescripcion().equals("VACIO") != true){
                            contador++;
                            System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea3.isCompletado()+". DESCRIPCION: "+Tarea3.getDescripcion()+". FECHA LIMITE: "+Tarea3.getFechaVencimiento());
                        }
                         
                        if(contador==0){
                            System.out.println("\n NO SE ENCONTRARON TAREAS REGISTRADAS \n");
                        }else{
                            //ELEGIR TAREA A MODIFICAR O ELIMINAR
                            int opcion;
                            System.out.print("\nINGRESE EL NUMERO DE TAREA A MODIFICAR O ELIMINAR (0 PARA VOLVER AL MENU): ");
                            opcion = leer.nextInt();
                            
                            switch(opcion){
                                case 1:{
                                    if(Tarea1.getDescripcion().equals("VACIO") != true){
                                        //MOSTRAMOS LOS DATOS DE LA TAREA 1
                                        System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea1.isCompletado()+". DESCRIPCION: "+Tarea1.getDescripcion()+". FECHA LIMITE: "+Tarea1.getFechaVencimiento());
                                        
                                        int opcion1;
                                        System.out.println("OPCION 1 - MODIFICAR EL ESTADO DE LA TAREA");
                                        System.out.println("OPCION 2 - ELIMINAR TAREA");
                                        System.out.println("OPCION 0 - VOLVER AL MENU");
                                        System.out.print("SELECCIONE UNA OPCION: ");
                                        opcion1 = leer.nextInt();
                                        
                                        if(opcion1==1){
                                            //CAMBIAMOS EL ESTADO DE LA TAREA
                                            Tarea1.CambiarEstado();
                                            //MOSTRAMOS LOS DATOS COMO QUEDARON
                                            System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea1.isCompletado()+". DESCRIPCION: "+Tarea1.getDescripcion()+". FECHA LIMITE: "+Tarea1.getFechaVencimiento());
                                            System.out.println("LA MODIFICACION FUE REALIZADA CON EXITO.\n");
                                        }
                                        if(opcion1==2){
                                            //ELIMINAMOS LOS DATOS REGISTRADOS EN LA ACTIVIDAD
                                            Tarea1.Eliminar();
                                            System.out.println("\nLA TAREA FUE ELIMINADA CON EXITO.\n");
                                        }
                                    }else{
                                        System.out.println("\nLA OPCION INGRESA ES INVALIDA.");
                                    }
                                    break;
                                }
                                case 2:{
                                    if(Tarea2.getDescripcion().equals("VACIO") != true){
                                        //MOSTRAMOS LOS DATOS DE LA TAREA 2
                                        System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea2.isCompletado()+". DESCRIPCION: "+Tarea2.getDescripcion()+". FECHA LIMITE: "+Tarea2.getFechaVencimiento());
                        
                                        int opcion1;
                                        System.out.println("OPCION 1 - MODIFICAR EL ESTADO DE LA TAREA");
                                        System.out.println("OPCION 2 - ELIMINAR TAREA");
                                        System.out.println("OPCION 0 - VOLVER AL MENU");
                                        System.out.print("SELECCIONE UNA OPCION: ");
                                        opcion1 = leer.nextInt();
                                        
                                        if(opcion1==1){
                                            //CAMBIAMOS EL ESTADO DE LA TAREA
                                            Tarea2.CambiarEstado();
                                            //MOSTRAMOS LOS DATOS COMO QUEDARON
                                            System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea2.isCompletado()+". DESCRIPCION: "+Tarea2.getDescripcion()+". FECHA LIMITE: "+Tarea2.getFechaVencimiento());
                                            System.out.println("LA MODIFICACION FUE REALIZADA CON EXITO.\n");
                                        }
                                        if(opcion1==2){
                                            //ELIMINAMOS LOS DATOS REGISTRADOS EN LA ACTIVIDAD
                                            Tarea2.Eliminar();
                                            System.out.println("\nLA TAREA FUE ELIMINADA CON EXITO.\n");
                                        }
                                    }else{
                                        System.out.println("\nLA OPCION INGRESA ES INVALIDA.");
                                    }
                                    break;
                                }
                                case 3:{
                                    if(Tarea3.getDescripcion().equals("VACIO") != true){
                                         //MOSTRAMOS LOS DATOS DE LA TAREA 3
                                        System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea3.isCompletado()+". DESCRIPCION: "+Tarea3.getDescripcion()+". FECHA LIMITE: "+Tarea3.getFechaVencimiento());
                        
                                        int opcion1;
                                        System.out.println("OPCION 1 - MODIFICAR EL ESTADO DE LA TAREA");
                                        System.out.println("OPCION 2 - ELIMINAR TAREA");
                                        System.out.println("OPCION 0 - VOLVER AL MENU");
                                        System.out.print("SELECCIONE UNA OPCION: ");
                                        opcion1 = leer.nextInt();
                                        
                                        if(opcion1==1){
                                            //CAMBIAMOS EL ESTADO DE LA TAREA
                                            Tarea3.CambiarEstado();
                                            //MOSTRAMOS LOS DATOS COMO QUEDARON
                                            System.out.println("N° "+contador+" - TAREA COMPLETA? "+Tarea3.isCompletado()+". DESCRIPCION: "+Tarea3.getDescripcion()+". FECHA LIMITE: "+Tarea3.getFechaVencimiento());
                                            System.out.println("LA MODIFICACION FUE REALIZADA CON EXITO.\n");
                                        }
                                        if(opcion1==2){
                                            //ELIMINAMOS LOS DATOS REGISTRADOS EN LA ACTIVIDAD
                                            Tarea3.Eliminar();
                                            System.out.println("\nLA TAREA FUE ELIMINADA CON EXITO.\n");
                                        }
                                    }else{
                                        System.out.println("\nLA OPCION INGRESA ES INVALIDA.");
                                    }
                                    break;
                                }
                                default:{
                                    break;
                                }
                            }
                        }
                        
                        break;
                }
            }
            
        }
        
        
    }
    
}
