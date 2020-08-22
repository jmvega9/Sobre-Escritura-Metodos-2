/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescriturametodos2;
/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;
class Vehiculo{
    private String marca;
    private String tecnologia;
    private int modelo;
    private String nombrePropietario;
    private int numCedula;
    private String nacionalidad;
    public Vehiculo(){
        nombrePropietario="";
        numCedula=0;
        nacionalidad="";
        marca="";
        tecnologia="";
        modelo=0;
    }

    public Vehiculo(String nombrePropietario, int numCedula, String nacionalidad,
            String marca, String tecnologia, int modelo) {
        this.nombrePropietario = nombrePropietario;
        this.numCedula=numCedula;
        this.nacionalidad=nacionalidad;
        this.marca = marca;
        this.tecnologia = tecnologia;
        this.modelo = modelo;
    }

    public String getNombrePropietario(){
        return nombrePropietario;
    }

    public int getNumCedula(){
        return numCedula;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public int getModelo() {
        return modelo;
    }
}
class Automovil extends Vehiculo{
    private String matriculaAutomovil;

    public Automovil(){
        super();
        matriculaAutomovil="Desconocido";
    }
    public Automovil(String nombrePropietario, int numCedula, String nacionalidad,
            String marca,String tecnologia, int modelo){
        super(nombrePropietario, numCedula, nacionalidad, marca, tecnologia, modelo);
        matriculaAutomovil="Desconocido";
    }

    public String getMatriculaAutomovil() {
        return matriculaAutomovil;
    }

    public void setMatriculaAutomovil(String matriculaAutomovil) {
        this.matriculaAutomovil = matriculaAutomovil;
    }
    public void mostrarDatos(){
        System.out.println("        \tDatos del Automóvil\n\nMARCA DEL AUTOMÓVIL: "+
                getMarca()+"\n"+getTecnologia()+"\nMATRÍCULA DEL AUTOMÓVIL: "+
                getMatriculaAutomovil());
    }
    public void mostrarDatos1(){
       System.out.println("         \tDatos del Propietario\n\nNOMBRE DEL PROPETARIO: "
               +getNombrePropietario()+"\nNÚMERO DE CÉDULA: "+getNumCedula()+""
                       + "\nNACIONALIDAD: "+getNacionalidad());
    }
}
class AutomovilAutonomo extends Automovil{
    private Calendar fechaComienzoFabricacionAutonomia;

    public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia){
        super();
        fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }

    public AutomovilAutonomo(String nombrePropietario, int numCedula, String nacionalidad,
            String marca, String tecnologia, int modelo,
            Calendar fechaComienzoFabricacionAutonomia) {
        super(nombrePropietario, numCedula, nacionalidad, marca, tecnologia, modelo);
        this.fechaComienzoFabricacionAutonomia = fechaComienzoFabricacionAutonomia;
    }

    public Calendar getFechaComienzoFabricacionAutonomia() {
        return fechaComienzoFabricacionAutonomia;
    }
    public void mostrarDatos(){
        System.out.println("        \tDatos del Automóvil Autonómo\n\nMARCA DEL AUTOMÓVIL: "
                +getMarca()+"\n"+getTecnologia()+"\nMATRÍCULA DEL AUTOMÓVIL: "
                +getMatriculaAutomovil()+"\nFECHA DE FABRICACIÓN: "
                +fechaComienzoFabricacionAutonomia.getTime().toString());
    }
    public void mostrarDatos1(){
        System.out.println("        \tDatos del Propietario\nNOMBRE DEL PROPIETARIO: "
        +getNombrePropietario()+"\nNÚMERO DE CÉDULA: "+getNumCedula()+"\nNACIONALIDAD: "
        +getNacionalidad());
    }
}
class ListadoAutomoviles{
    private ArrayList<Automovil>listadoAutomoviles;

    //constructor
    public ListadoAutomoviles(){
        listadoAutomoviles= new ArrayList<Automovil>();
    }
    //Metodos
    public void addAutomovil(Automovil automovil){
        listadoAutomoviles.add(automovil);
    }
    public void Listar(){
        System.out.println("DATOS DE LOS AUTOMOVILES EXISTENTES EN EL LISTADO");
        for(Automovil ObjetoTmp: listadoAutomoviles){
            ObjetoTmp.mostrarDatos();  {
            }
        }
    }
}
class ListadoPropietarios{
    private ArrayList<Automovil>listadoPropietarios;

    //constructor
    public ListadoPropietarios(){
        listadoPropietarios= new ArrayList<Automovil>();
    }
    //Metodos
    public void addAutomovil(Automovil automovil){
        listadoPropietarios.add(automovil);
    }
    public void Listar(){
        System.out.println("DATOS DE LOS PROPIETARIOS EXISTENTES EN EL LISTADO");
        for(Automovil ObjetoTpm: listadoPropietarios){
            ObjetoTpm.mostrarDatos1();{

            }
        }
    }
}
public class SobreEscrituraMetodos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Caratula
       System.out.println("       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE \n");
       System.out.println("               Ingeniería  Automotriz ");
       System.out.println("            Andrés Mogollón & Jessica Vega");
       System.out.println("         Programación Orientada  a Objetos ");
       System.out.println("                        7450 ");
       System.out.println("              Ing. Luis Alberto Guerra \n");
       System.out.println("             'Sobre Escritura de métodos'\n");

    Scanner opcion=new Scanner(System.in);

        boolean salir=false;
        String op="";
        int seleccion=0;
        String op1="";
        int seleccion1=0;
        String op2="";
        int seleccion2=0;
        String op3="";
        int seleccion3=0;

    while(!salir){

        System.out.println("          \nMenú del listado de Vehículos\n");
        System.out.println("1. DATOS DEL AUTOMOVIL");
        System.out.println("2. DATOS DEL PROPIETARIO");
        System.out.println("3. Salir");
        System.out.println("Elegir la opcción que desea ejecutar:");
        System.out.println();
        seleccion=opcion.nextInt();

        switch(seleccion){

            case 1:
        System.out.println("EXISTEN DATOS DE UN VEHICULO FORD Y UN VEHICULO NISSAN");
        System.out.println("1. FORD");
        System.out.println("2. NISSAN");
        System.out.println("3. SALIR");
        System.out.println("Elija una opción: ");
        System.out.println();

        seleccion=opcion.nextInt();

        switch(seleccion){
            case 1:
        Automovil automovil1=new Automovil("",1,"","Ford","TECNOLOGÍA: Canadiense",2018);
        automovil1.setMatriculaAutomovil("Ontario ABZM-264-20");

        ListadoAutomoviles listado1=new ListadoAutomoviles();
        listado1.addAutomovil(automovil1);
        listado1.Listar();
            break;

            case 2:
        Calendar fecha1=Calendar.getInstance();
        fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representa noviembre

        AutomovilAutonomo autonomo1=new AutomovilAutonomo("",2,"","Nissan",
                "TECNOLOGÍA: EUROPEA",2020,fecha1);

        ListadoAutomoviles listado2=new ListadoAutomoviles();
        listado2.addAutomovil(autonomo1);
        listado2.Listar();
            break;

            case 3:
        System.out.println("GRACIAS");
            break;
            //default:
            }
            break;
            case 2:

        System.out.println("EXISTEN DATOS DE DOS PROPIETARIOS");
        System.out.println("1. Propietario 1");
        System.out.println("2. Propietario 2");
        System.out.println("3. SALIR");
        System.out.println("Elija una opción: ");
        System.out.println();
        seleccion=opcion.nextInt();

        switch(seleccion){

            case 1:

        Automovil automovil2=new Automovil("Jessica vega",1725798290,
                "Ecuatoriana","Ford","TECNOLOGÍA: Canadiense",2018);
        automovil2.setMatriculaAutomovil("Ontario ABZM-264-20");

        ListadoPropietarios propietario1=new ListadoPropietarios();
        propietario1.addAutomovil(automovil2);
        propietario1.Listar();
            break;

            case 2:

        Calendar fecha2=Calendar.getInstance();
        fecha2.set(2018,10,20); //Los meses van de 0 a 11, luego 10 representa noviembre

        AutomovilAutonomo autonomo2=new AutomovilAutonomo("Andrés Mogollón",
                1728394050,"Mexicano","Nissan","TECNOLOGÍA: EUROPEA",2020,fecha2);

        ListadoPropietarios propietario2=new ListadoPropietarios();
        propietario2.addAutomovil(autonomo2);
        propietario2.Listar();

            break;

            case 3:
                System.out.println("GRACIAS");
                break;
            //default:
            }
           // break;
            case 3:
              System.out.println("GRACIAS");
             // break;
              default:
            }
        //break;

        }
    }

}




/*
        do{
            System.out.println("");
            System.out.println("            Menú del listado de Vehículos\n");
            System.out.println("1. DATOS DEL AUTOMOVIL");
            System.out.println("2. DATOS DEL PROPIETARIO");
            System.out.println("Elegir la opcción que desea ejecutar:");
            System.out.println();
            seleccion=opcion.nextInt();
        }while(seleccion>2||seleccion<1);
        switch(seleccion){

            case 1:
                System.out.println("\t\tEXISTEN DATOS DE UN VEHICULO FORD Y UN VEHICULO NISSAN");
                System.out.println("1. FORD");
                System.out.println("2. NISSAN");
                System.out.println("Elija una opción: ");
                System.out.println();

                seleccion=opcion.nextInt();

                switch(seleccion){

                    case 1:

            Automovil automovil1=new Automovil("",1,"","Ford","TECNOLOGÍA: Canadiense",2018);
            automovil1.setMatriculaAutomovil("Ontario ABZM-264-20");

            ListadoAutomoviles listado1=new ListadoAutomoviles();
            listado1.addAutomovil(automovil1);
            listado1.Listar();

            break;

                    case 2:
            Calendar fecha1=Calendar.getInstance();
            fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representa noviembre

            AutomovilAutonomo autonomo1=new AutomovilAutonomo("",2,"","Nissan","TECNOLOGÍA: EUROPEA",2020,fecha1);

            ListadoAutomoviles listado2=new ListadoAutomoviles();
            listado2.addAutomovil(autonomo1);
            listado2.Listar();

            break;
                }
           //1 break;

        case 2:

            System.out.println("\t\tEXISTEN DATOS DE DOS PROPIETARIOS");
            System.out.println("1. Propietaio 1");
            System.out.println("2. Propietario 2");
            System.out.println("Elija una opción: ");
            System.out.println();
            seleccion=opcion.nextInt();

            switch(seleccion){

                case 1:

            Automovil automovil2=new Automovil("Jessica vega",1725798290,"Ecuatoriana","Ford","TECNOLOGÍA: Canadiense",2018);
            automovil2.setMatriculaAutomovil("Ontario ABZM-264-20");

            ListadoPropietarios propietario1=new ListadoPropietarios();
            propietario1.addAutomovil(automovil2);
            propietario1.Listar();

            break;

            case 2:
            Calendar fecha2=Calendar.getInstance();
            fecha2.set(2018,10,20); //Los meses van de 0 a 11, luego 10 representa noviembre

            AutomovilAutonomo autonomo2=new AutomovilAutonomo("Andrés Mogollón",1728394050,"Mexicano","Nissan","TECNOLOGÍA: EUROPEA",2020,fecha2);

            ListadoPropietarios propietario2=new ListadoPropietarios();
            propietario2.addAutomovil(autonomo2);
            propietario2.Listar();

            break;
            }
            //break;
        } */
