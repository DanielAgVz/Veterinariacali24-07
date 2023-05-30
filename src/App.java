import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean fin = false;

        // Arreglo con los datos de las veterinarias (5 en total)
        String[][] veterinaria = {
                {"28926090", "Av. Oe #6-159", "Veterinaria san bernardo", "1", "Cirugías, radiografías, Aplicación de servicios y 24/7"},
                {"3185698689", "calle 52 nte #4bn-57", "Hospital veterinaria santa monica", "2", "Cirugías, radiografías, Aplicación de servicios y 24/7"},
                {"3115225296", "Calle 5 #17-50", "Razas centro veterinaria", "3", "Ventas de alimentos, Aplicación de servicios y 24/7"},
                {"3155825444", "calle 56 #1d1b-30", "clinica veterinaria vet home", "4", "Exámenes de laboratorio, Aplicación de servicios y 24/7"},
                {"3169351851", "carrera 1a 14 #69-40", "Vértebra clínica veterinaria", "5", "Ventas de alimentos, Aplicación de servicios, guardería y 24/7"}
        };

        do {//Menu incial con las 3 opciones
            System.out.println("-----------VETERINARIA 24/7-----------");
            System.out.println("1. Buscar veterinaria más cercana por comuna");
            System.out.println("2. Buscar servicios");
            System.out.println("3. Salir");
            System.out.println("---------------------------------------");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea vacía después del número

            switch (menu) {
                case 1://Menu de busqueda por comunas
                    System.out.println("Ingrese el número de la comuna:");
                    String comunaUsuario = scanner.nextLine();
                    boolean encontrada = false;

                    for (String[] vetc : veterinaria) {//Declaracion de los arreglos en variables
                        String comuna = vetc[3];
                        String servicios = vetc[4];
                        String direccion = vetc[1];
                        String veterinariaCercana = vetc[2];
                        String cell = vetc[0];

                        if (servicios.contains("24/7") && comuna.equals(comunaUsuario)) {
                            encontrada = true;
                            System.out.println("La comuna " + comunaUsuario + " tiene la veterinaria " + veterinariaCercana);
                            System.out.println("Servicios: " + servicios);
                            System.out.println("Dirección: " + direccion);
                            System.out.println("Telefono: " + cell);
                            System.out.println("---------------------------------------");
                            break;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("No se encontró ninguna veterinaria de 24/7 en la comuna " + comunaUsuario);
                        System.out.println("---------------------------------------");
                    }

                    Thread.sleep(2000); // Pausa de 2 segundos antes de mostrar el menú nuevamente
                    break;

                case 2://Menu de busqueda por servicios
                    System.out.println("MENU POR SERVICIOS");
                    System.out.println("1. Venta de alimentos");
                    System.out.println("2. Aplicación de servicios");
                    System.out.println("3. Exámenes");
                    System.out.print("Escriba el número de opción que desea buscar: ");
                    int opcionServicio = scanner.nextInt();
                    scanner.nextLine(); // Consumir la línea vacía después del número
                    boolean encontrado = false;

                    switch (opcionServicio) {
                        case 1:
                            for (String[] vetc : veterinaria) {
                                String servicios = vetc[4];

                                if (servicios.contains("Ventas de alimentos")) {//Declaracion de los arreglos en variables
                                    encontrado = true;
                                    String veterinariaNombre = vetc[2];
                                    String direccion = vetc[1];
                                    String cell= vetc[0];
                                    String comuna=vetc[3];
                                    String serviciosf=vetc[4];
                                    //Imprecion de la busqueda "Venta de alimentos"
                                    System.out.println("Veterinaria: " + veterinariaNombre);
                                    System.out.println("Dirección: " + direccion);
                                    System.out.println("Telefono:" + cell);
                                    System.out.println("Rresto de servicios:" + serviciosf );
                                    System.out.println("---------------------------------------");
                                }
                            }
                            break;

                        case 2:
                            for (String[] vetc : veterinaria) {
                                String servicios = vetc[4];

                                if (servicios.contains("Aplicación de servicios")) {//Declaracion de los arreglos en variables
                                    encontrado = true;
                                    String veterinariaNombre = vetc[2];
                                    String direccion = vetc[1];
                                    String cell= vetc[0];
                                    String comuna=vetc[3];
                                    String serviciosf=vetc[4];
                                    //Imprecion de la busqueda "Aplicacion de servicios"
                                    System.out.println("Veterinaria: " + veterinariaNombre);
                                    System.out.println("Dirección: " + direccion);
                                    System.out.println("Telefono:" + cell);
                                    System.out.println("Rresto de servicios:" + serviciosf );
                                    System.out.println("---------------------------------------");
                                }
                            }
                            break;

                        case 3:
                            for (String[] vetc : veterinaria) {
                                String servicios = vetc[4];

                                if (servicios.contains("Exámenes")) {//Declaracion de los arreglos en variables
                                    encontrado = true;
                                    String veterinariaNombre = vetc[2];
                                    String direccion = vetc[1];
                                    String cell= vetc[0];
                                    String comuna=vetc[3];
                                    String serviciosf=vetc[4];
                                    //Imprecions de la busqueda "Examenes"
                                    System.out.println("Veterinaria: " + veterinariaNombre);
                                    System.out.println("Dirección: " + direccion);
                                    System.out.println("Telefono:" + cell);
                                    System.out.println("Rresto de servicios:" + serviciosf );
                                    System.out.println("---------------------------------------");
                                }
                            }
                            break;

                        default:
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                            break;
                    }

                    if (!encontrado) {
                        System.out.println("No se encontraron veterinarias que ofrezcan el servicio seleccionado.");
                        System.out.println("---------------------------------------");
                    }

                    Thread.sleep(2000); // Pausa de 2 segundos antes de mostrar el menú nuevamente
                    break;

                case 3:
                    fin = true;
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");// Ingresion incorrecta del usuario
                    Thread.sleep(2000); // Pausa de 2 segundos antes de mostrar el menú nuevamente
                    break;
            }
        } while (!fin);
    }
}
