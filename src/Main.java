import java.util.*;


public class Main {

    public static Scanner scanner;
    public static int clientCode = 0;
    public static int productId = 0;
    public static int invoiceId =0;
    public static List<Client> clientList = new ArrayList<>();
    public static List<Product>  productList = new ArrayList<>();
    public static List<Servicie> servicieList = new ArrayList<>();
    public static List<Society>  societyList = new ArrayList<>();
    public static List<Invoice>  invoiceList = new ArrayList<>();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de catalago de Electricidad Chispas:");
            System.out.println("1. Ver Autonomos");
            System.out.println("2. Ver Sociedades");
            System.out.println("3. Ver Servicios");
            System.out.println("4. Ver Productos");
            System.out.println("5. Ver Facturas");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Ver Autonomos");
                    do {
                        // Mostrar el menú
                        System.out.println("Menú de Autonomo:");
                        System.out.println("1. Añadir Autonomo");
                        System.out.println("2. Mostrar lista Autonomo");
                        System.out.println("0. Salir");
                        System.out.print("Ingrese la opción deseada: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcion){
                            case 1:

                                break;
                            case 2:
                                clientList.add(leerClient());
                                break;
                            case 0:
                                System.out.println("Saliendo del programa. ¡Hasta luego!");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }



                    } while (opcion != 0);

                    break;
                case 2:
                    System.out.println("2. Ver Sociedades");
                    do {
                        // Mostrar el menú
                        System.out.println("Menú de Sociedades:");
                        System.out.println("1. Añadir Sociedades");
                        System.out.println("2. Mostrar lista Sociedades");
                        System.out.println("0. Salir");
                        System.out.print("Ingrese la opción deseada: ");
                        opcion = scanner.nextInt();
                        switch (opcion){
                            case 1:
                                Society newSociety = leerSociety();
                                break;
                            case 2:
                                productList.add(leerProduct());
                                break;
                            case 0:
                                System.out.println("Saliendo del programa. ¡Hasta luego!");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }



                    } while (opcion != 0);


                    break;
                case 3:
                    System.out.println("3. Ver Servicios");
                    do {
                        // Mostrar el menú
                        System.out.println("Menú de Servicios:");
                        System.out.println("1. Añadir Servicios");
                        System.out.println("2. Mostrar lista Servicios");
                        System.out.println("0. Salir");
                        System.out.print("Ingrese la opción deseada: ");
                        opcion = scanner.nextInt();
                        switch (opcion){
                            case 1:
                                Servicie newServicie = leerServicie();
                                break;
                            case 2:
                                servicieList.add(leerServicie());
                                break;
                            case 0:
                                System.out.println("Saliendo del programa. ¡Hasta luego!");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }



                    } while (opcion != 0);

                    break;
                case 4:
                    System.out.println("4. Ver Productos");
                    do {
                        // Mostrar el menú
                        System.out.println("Menú de Productos:");
                        System.out.println("1. Añadir Productos");
                        System.out.println("2. Mostrar lista Productos");
                        System.out.println("0. Salir");
                        System.out.print("Ingrese la opción deseada: ");
                        opcion = scanner.nextInt();
                        switch (opcion){
                            case 1:
                                Product newProduct = leerProduct();
                                break;
                            case 2:
                                productList.add(leerProduct());
                                break;
                            case 0:
                                System.out.println("Saliendo del programa. ¡Hasta luego!");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }



                    } while (opcion != 0);


                    break;

                case 5:
                    System.out.println("5. Ver Facturas");
                    do {
                        // Mostrar el menú
                        System.out.println("Menú de Facturas:");
                        System.out.println("1. Añadir Facturas");
                        System.out.println("2. Mostrar lista Facturas");
                        System.out.println("0. Salir");
                        System.out.print("Ingrese la opción deseada: ");
                        opcion = scanner.nextInt();
                        switch (opcion){
                            case 1:

                                break;
                            case 2:
                                invoiceList.add(leerInvoice());
                                break;
                            case 0:
                                System.out.println("Saliendo del programa. ¡Hasta luego!");
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }



                    } while (opcion != 0);
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");

            }

        } while (opcion != 0);

    }


    public static Client leerClient() {

        Client clientNew = new Client();
        clientNew.setClientCode(String.valueOf(++clientCode));
        System.out.println("nombre:");
        clientNew.setName(scanner.nextLine());
        System.out.println("Apellidos:");
        clientNew.setSurname(scanner.nextLine());
        System.out.println("Dni:");
        clientNew.setDni(scanner.nextLine());
        System.out.println("Direccion postal:");
        clientNew.setPostalAddress(scanner.nextLine());
        System.out.println("Poablacion:");
        clientNew.setProvince(scanner.nextLine());
        System.out.println("Provincia:");
        clientNew.setProvincie(scanner.nextLine());
        System.out.println("Email:");
        clientNew.setEmail(scanner.nextLine());
        System.out.println("Telefono:");
        clientNew.setPhone(scanner.nextLine());

        return clientNew;
    }
    public static Society leerSociety() {

        Society societyNew = new Society();
        societyNew.setClientCode(String.valueOf(++clientCode));
        System.out.println("nombre de la empresa:");
        societyNew.setBusinessName(scanner.nextLine());
        System.out.println("Dni:");
        societyNew.setCif(scanner.nextLine());
        System.out.println("Direccion postal:");
        societyNew.setPostalAddress(scanner.nextLine());
        System.out.println("Poablacion:");
        societyNew.setProvince(scanner.nextLine());
        System.out.println("Provincia:");
        societyNew.setProvincie(scanner.nextLine());
        System.out.println("Email:");
        societyNew.setEmail(scanner.nextLine());
        System.out.println("Telefono:");
        societyNew.setPhone(scanner.nextLine());

        return societyNew;
    }
    public static Invoice leerInvoice() {

        Invoice invoiceNew = new Invoice();
        invoiceNew.setInvoiceId(String.valueOf(++invoiceId));
        System.out.println("Base del iva: ");
        invoiceNew.setBase(scanner.nextDouble());
        System.out.println("Fecha: ");
        invoiceNew.setDate(scanner.nextLine());
        System.out.println("Total: ");
        invoiceNew.setTotal(scanner.nextDouble());
        return invoiceNew;
    }

    public static Servicie leerServicie() {

        Servicie servicieNew = new Servicie();
        servicieNew.setProductId(String.valueOf(++productId));
        System.out.println("Nombre: ");
        servicieNew.setName(scanner.nextLine());
        System.out.println("Precio: ");
        servicieNew.setPrice(scanner.nextDouble());
        System.out.println("tipo IVA: ");
        servicieNew.setTypeIva(scanner.nextDouble());
        return servicieNew;
    }

    public static Product leerProduct() {

        Product productNew = new Product();
        productNew.setProductId(String.valueOf(++productId));
        System.out.println("Nombre: ");
        productNew.setName(scanner.nextLine());
        System.out.println("Marca: ");
        productNew.setTradeMark(scanner.nextLine());
        System.out.println("Modelo: ");
        productNew.setModel(scanner.nextLine());
        System.out.println("Precio: ");
        productNew.setPrice(scanner.nextDouble());
        System.out.println("tipo IVA: ");
        productNew.setTypeIva(scanner.nextDouble());
        return productNew;
    }







}








