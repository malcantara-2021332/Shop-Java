
import java.io.*;

public class proyecto_final {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantidad;
		String categoria;
		 String comprador;
		String contrasena;
		String contrase�a;
		String direcion;
		String eliminar;
		String fecha;
		int gestion;
		int inventario;
		String nit;
		String nombre;
		double precio;
		String producto;
		int sector;
		double total;
		String unidades;
		String usuario;
		System.out.println("===================================================================================================");
		System.out.println("---Buenos Dias, Para acceder a las funciones del portal deveras entrar atravez de tu usuario.---");
		System.out.println("---Porfavor Ingresa tu usuario---");
		usuario = bufEntrada.readLine();
		System.out.println("Ingresa tu contrase�a");
		contrasena = bufEntrada.readLine();
		if (usuario.equals("Victor") && contrasena.equals("L123***")) {
			System.out.println("Tu usuario es correcto, Disfruta de tu estad�a en la pagina");
		} else {
			System.out.println("Los Datos Son incorrectos, no tienes acceso al Portal Administrativo.");
			System.out.println("Largo");
		}
		do {
			System.out.println(""); //No se porque al no considir la contrase�a te muestra el MENU.
			System.out.println("------------Bienvenido a Veronica Shopping---------");
			System.out.println("---------------------- Menu -------------------");
			System.out.println("1- Gestion de Productos ");
			System.out.println("2- Visualizacion del Inventario");
			System.out.println("3- Facturacion ");
			System.out.println("4- Exit");
			System.out.println("Ingrese la opcion que desea");
			sector = Integer.parseInt(bufEntrada.readLine());
		} while (!((sector>0 && sector<5)));
		switch (sector) {
		case 1:
			do {
				System.out.println(""); // Menu numero 2 al momento de ingresar y selecionar el 1.
				System.out.println("-------Bienvenido a la Gestion de Productos--------");
				System.out.println("------------------ Menu ----------------");
				System.out.println("1- Agregar Productos Nuevos ");
				System.out.println("2- Categorias de Productos y Precios");
				System.out.println("3- Eliminar Productos ");
				System.out.println("Porfavor Ingresa la opcion que deseas");
				gestion = Integer.parseInt(bufEntrada.readLine());
			} while (!((gestion>0 && gestion<3)));
			switch (gestion) {
			case 1:
				System.out.println("---Agregar Productos Nuevos---");
				System.out.println("Introduce la categoria del producto, Hombre, Mujer, Ni�o, Ni�a o Accesorios Varios ");
				categoria = bufEntrada.readLine();
				System.out.println("Ingresa Nombre del Producto");
				nombre = bufEntrada.readLine();
				System.out.println("Ingresa el Precio del Producto");
				precio = Double.parseDouble(bufEntrada.readLine());
				System.out.println("Ingresa Las unidades disponibles en la tienda");
				unidades = bufEntrada.readLine();
				System.out.println("El producto se esta ingresando a la base de datos");
				// Las lineas unicamente se ponen por metodo estetico.
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("///////////////////////////////////////////////////");
				System.out.println("NUEVO PRODUCTO");
				System.out.println("Categoria:"+categoria);
				System.out.println("Nombre del Producto:"+nombre);
				System.out.println("Precio:"+precio);
				System.out.println("Unidades Disponibles en Tienda son:"+unidades);
				break;
			case 2:
				do {
					System.out.println(""); // Consola o menu numero 3
					System.out.println("-------Bienvenido, a categorias y precios.-------");
					System.out.println("1- Mostrar Iventario de Hombre");
					System.out.println("2- Mostrar Iventario de Mujer");
					System.out.println("3- Mostrar Iventario de Ni�o");
					System.out.println("4- Mostrar Iventario de Ni�a");
					System.out.println("5- Mostrar Accesorios Varios");
					inventario = Integer.parseInt(bufEntrada.readLine());
				} while (!((inventario>0 && inventario<5)));
				switch (inventario) {
				case 1:
					System.out.println("-------Inventario de Hombre-------");
					System.out.println("Pantalon color negro.");
					System.out.println("Precio: Q.45.00");
					System.out.println("10 Unidades Disponibles.");
					System.out.println("#######################################");
					System.out.println("Pantalon color azul.");
					System.out.println("Precio: Q.45.00");
					System.out.println("11 Unidades Disponibles.");
					System.out.println("#######################################");
					System.out.println("Pantalon color Gris.");
					System.out.println("Precio: Q.45.00");
					System.out.println("7 Unidades Disponibles.");
					System.out.println("#######################################");
					System.out.println("Playera Color Blanco");
					System.out.println("Precio: Q.25.00");
					System.out.println("3 Unidades Disponibles.");
					System.out.println("#######################################");
					System.out.println("Playera Color Negro");
					System.out.println("Precio: Q.25.00");
					System.out.println("24 Unidades Disponibles.");
					System.out.println("#######################################");
					System.out.println("Shorts Color Verde");
					System.out.println("Precio: Q.30.00");
					System.out.println("9 Unidades Disponibles.");
					System.out.println("#######################################");
					System.out.println("Shorts Color Camuflaje");
					System.out.println("Precio: Q.37.50");
					System.out.println("2 Unidades Disponibles.");
					System.out.println("#######################################");
					System.out.println("Shorts Color Amarillo");
					System.out.println("Precio: Q.30.00");
					System.out.println("23 Unidades Disponibles.");
					System.out.println("#######################################");
					System.out.println("Shorts Color Negro");
					System.out.println("Precio: Q.30.00");
					System.out.println("5 Unidades Disponibles.");
					System.out.println("#######################################");
					break;
				case 2:
					System.out.println("------- Inventario de Mujer -------");
					System.out.println("Blusa color azul pavo");
					System.out.println("Precio: Q.78.00");
					System.out.println("50 Unidades Disponibles.");
					System.out.println("****************************************");
					System.out.println("Blusa color Anaranjado");
					System.out.println("Precio: Q.60.15");
					System.out.println("21 Unidades Disponibles.");
					System.out.println("****************************************");
					System.out.println("Blusa color Jocote");
					System.out.println("Precio: Q.63.00");
					System.out.println("145 Unidades Disponibles.");
					System.out.println("Recien Ingresado");
					System.out.println("****************************************");
					System.out.println("Blusa Rosado palido");
					System.out.println("Precio: Q.16.00, Liquidaci�n");
					System.out.println("11 Unidades Disponibles.");
					System.out.println("****************************************");
					System.out.println("///////////////////////////////////////////////////////////////////");
					System.out.println("Saco negro con manchas blancas");
					System.out.println("Precio: Q.230.00");
					System.out.println("10 Unidades Disponibles.");
					System.out.println("****************************************");
					System.out.println("Saco color azul pavo");
					System.out.println("Precio: Q.79.00");
					System.out.println("54 Unidades Disponibles.");
					System.out.println("****************************************");
					System.out.println("Saco de Franela");
					System.out.println("Precio: Q.100.50");
					System.out.println("25 Unidades Disponibles.");
					System.out.println("****************************************");
					System.out.println("///////////////////////////////////////////////////////////////////");
					System.out.println("Ropa Intima");
					System.out.println("Precio: Q.00.00");
					System.out.println("Sin Disponibilidad");
					System.out.println("****************************************");
					break;
				case 3:
					System.out.println("--------Inventario de Ni�o y Ni�a---------");
					System.out.println("---------------Ni�a--------------");
					System.out.println("Blusa color celeste con figura de princesas");
					System.out.println("Precio: Q.15.00");
					System.out.println("50 Unidades Disponibles.");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("Blusa color celeste con de Animales");
					System.out.println("Precio: Q.15.00");
					System.out.println("60 Unidades Disponibles.");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("Blusa color Amarillo con figura de princesas");
					System.out.println("Precio: Q.15.00");
					System.out.println("3 Unidades Disponibles.");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("Esperando pedido de producto, para ampliar el inventario de �i�a");
					System.out.println("----------------------Ni�o---------------------");
					System.out.println("No hay inventario disponible por el moemento");
					break;
				case 4:
					System.out.println("--------Inventario de Accesorios Varios---------");
					System.out.println("-------------------Carteras---------------------");
					System.out.println("Cartera Grande color Negro Con adornos dorados");
					System.out.println("Precio: Q:124.75");
					System.out.println("11 Unidades.");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					System.out.println("Cartera Grande color blanca Con adornos Negros");
					System.out.println("Precio: Q:275.50");
					System.out.println("7 Unidades.");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					System.out.println("Cartera Mediana color Rosaa Con adornos dorados");
					System.out.println("Precio: Q:100.00");
					System.out.println("11 Unidades En ofertaaaaaaa.");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					System.out.println("Cartera Mediana color Negro Con adornos dorados");
					System.out.println("Precio: Q:75");
					System.out.println("5 Unidades.");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					System.out.println("-----------------Accesorios Hombres----------------");
					System.out.println("Billetera Negro solido");
					System.out.println("Precio: Q:75");
					System.out.println("10 Unidades.");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					System.out.println("Billatera Negra con bordes cafes");
					System.out.println("Precio: Q:63.00");
					System.out.println("7 Unidades.");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					System.out.println("Billetera de piel de cocodrilo---Imitacion de piel.");
					System.out.println("Precio: Q:100");
					System.out.println("3 Unidades.");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					System.out.println("Rolex con chapas de oro, 24 kilates");
					System.out.println("Precio: Q:578.00");
					System.out.println("Con pedido se traera la unidad.");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					System.out.println("Reloj Casio Color Negro");
					System.out.println("Precio: Q:256.00");
					System.out.println("78 Unidades.");
					System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
					break;
				}
				break;
			case 3://menu 4 de eliminacion de producto
				System.out.println("----------------Eliminacion de Producto-----------------");
				System.out.println("Ingresa la categoria del producto que deseas Eliminar");
				eliminar = bufEntrada.readLine();
				System.out.println("Ingresa el nombre del producto");
				producto = bufEntrada.readLine();
				System.out.println("Se esta eliminando el producto......");
				System.out.println(".................");
				System.out.println("El producto se a eliminado exitosamente");
				break;
			}
			break;
		case 2:
			System.out.println("-----------Visualizacion del Inventario General--------------");
			System.out.println("-------Inventario de Hombre-------");
			System.out.println("Pantalon color negro.");
			System.out.println("Precio: Q.45.00");
			System.out.println("10 Unidades Disponibles.");
			System.out.println("#######################################");
			System.out.println("Pantalon color azul.");
			System.out.println("Precio: Q.45.00");
			System.out.println("11 Unidades Disponibles.");
			System.out.println("#######################################");
			System.out.println("Pantalon color Gris.");
			System.out.println("Precio: Q.45.00");
			System.out.println("7 Unidades Disponibles.");
			System.out.println("#######################################");
			System.out.println("Playera Color Blanco");
			System.out.println("Precio: Q.25.00");
			System.out.println("3 Unidades Disponibles.");
			System.out.println("#######################################");
			System.out.println("Playera Color Negro");
			System.out.println("Precio: Q.25.00");
			System.out.println("24 Unidades Disponibles.");
			System.out.println("#######################################");
			System.out.println("Shorts Color Verde");
			System.out.println("Precio: Q.30.00");
			System.out.println("9 Unidades Disponibles.");
			System.out.println("#######################################");
			System.out.println("---------------------------------- Inventario de Mujer ---------------------------------");
			System.out.println("Blusa color azul pavo");
			System.out.println("Precio: Q.78.00");
			System.out.println("50 Unidades Disponibles.");
			System.out.println("****************************************");
			System.out.println("Blusa color Anaranjado");
			System.out.println("Precio: Q.60.15");
			System.out.println("21 Unidades Disponibles.");
			System.out.println("****************************************");
			System.out.println("Blusa color Jocote");
			System.out.println("Precio: Q.63.00");
			System.out.println("145 Unidades Disponibles.");
			System.out.println("Recien Ingresado");
			System.out.println("****************************************");
			System.out.println("Blusa Rosado palido");
			System.out.println("Precio: Q.16.00, Liquidaci�n");
			System.out.println("11 Unidades Disponibles.");
			System.out.println("****************************************");
			System.out.println("--------Inventario de Ni�o y Ni�a---------");
			System.out.println("---------------Ni�a--------------");
			System.out.println("Blusa color celeste con figura de princesas");
			System.out.println("Precio: Q.15.00");
			System.out.println("50 Unidades Disponibles.");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("Blusa color celeste con de Animales");
			System.out.println("Precio: Q.15.00");
			System.out.println("60 Unidades Disponibles.");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("Blusa color Amarillo con figura de princesas");
			System.out.println("Precio: Q.15.00");
			System.out.println("3 Unidades Disponibles.");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("Esperando pedido de producto, para ampliar el inventario de �i�a");
			System.out.println("----------------------Ni�o---------------------");
			System.out.println("No hay inventario disponible por el moemento");
			System.out.println("--------Inventario de Accesorios Varios---------");
			System.out.println("-------------------Carteras---------------------");
			System.out.println("Cartera Grande color Negro Con adornos dorados");
			System.out.println("Precio: Q:124.75");
			System.out.println("11 Unidades.");
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println("Cartera Grande color blanca Con adornos Negros");
			System.out.println("Precio: Q:275.50");
			System.out.println("7 Unidades.");
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println("Cartera Mediana color Rosaa Con adornos dorados");
			System.out.println("Precio: Q:100.00");
			System.out.println("11 Unidades En ofertaaaaaaa.");
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println("-----------------Accesorios Hombres----------------");
			System.out.println("Billetera Negro solido");
			System.out.println("Precio: Q:75");
			System.out.println("10 Unidades.");
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println("Billatera Negra con bordes cafes");
			System.out.println("Precio: Q:63.00");
			System.out.println("7 Unidades.");
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println("Billetera de piel de cocodrilo---Imitacion de piel.");
			System.out.println("Precio: Q:100");
			System.out.println("3 Unidades.");
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			break;
		case 3:
			System.out.println("----------------Facturacion-----------------");
			System.out.println("Porfavor ingresar el nombre completo del Comprador");
			comprador = bufEntrada.readLine();
			System.out.println("NIT");
			nit = bufEntrada.readLine();
			System.out.println("Precio del producto sin punto.");
			precio = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Cauntas unidades compro");
			cantidad = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Ingresa el producto adquirido");
			producto = bufEntrada.readLine();
			System.out.println("Indica la categoria del producto");
			categoria = bufEntrada.readLine();
			System.out.println("Ingresa la fecha de conpra");
			fecha = bufEntrada.readLine();
			System.out.println("Ingresa la direcion.");
			direcion = bufEntrada.readLine();
			total = cantidad*precio;
			System.out.println("                                   FACTURA PEQUE�O CONTRIBUYENTE                 ");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("Nombre:"+comprador+"-----------------------------------------------"+"Fecha:"+fecha);
			System.out.println("Nit emisor:"+nit);
			System.out.println("Veronicas Shopping");
			System.out.println("Direcion:"+direcion);
			System.out.println("#######################################################################################################");
			System.out.println("Categoria del producto:"+categoria);
			System.out.println("Producto:"+producto);
			System.out.println("Unidades compradas:"+cantidad);
			System.out.println("                                                                          Total:"+total);
			break;
		case 4:
			System.out.println("Tu salida ha sido exitosa del sistema, hasta pronto.");
			break;
		}
	}


}

