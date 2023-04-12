package test;

import domain.Lavado;
import domain.Servicios;
import domain.Turno;
import domain.Service;
import java.util.Scanner;
import domain.Agenda;
import domain.AliBal;

public class ServiceAutomotorTest {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			String eleccion_lavado[] = new String[3];
			String eleccion_service[] = new String[2];
			Agenda agenda = new Agenda();

			int op = 0, sumita = 0, sumatotal = 0, count = 0;
			double descuento = 0, totalcondescuento = 0;

			System.out.println("Bienvenido a Certant Motors, ¿Desea realizar algun servicio?");
			String opcionBienvenida = in.nextLine();

			if (opcionBienvenida.compareToIgnoreCase("si") != 0 && opcionBienvenida.compareToIgnoreCase("no") != 0) {
				System.out.println("No es una opcion valida, intente nuevamente");
				main(args);
			}

			if (opcionBienvenida.compareToIgnoreCase("no") == 0) {
				System.out.println("Ok, que tenga buen dia!");
				System.exit(0);
			}

			do {

				System.out.println("Primero elegi los servicios que vayas a adquirir y por ultimo agendá tu turno");
				System.out.println("1- Servicios de lavado");
				System.out.println("2- Servicios de aceite y filtros ");
				System.out.println("3- Servicios de alineacion y balanceo");
				System.out.println("4- Agendar turno");
				System.out.println("5- Mostrar turnos");
				System.out.println("6- Salir");
				op = in.nextInt();

				if (op == 1 || op == 2 || op == 3) {
					sumita++;
				}
				if (sumita < 1) {
					System.out.println("Porfavor, primero selecciona un servicio, si no, no puedo brindarte un turno!");

				}

				switch (op) {
				case 1:
					for (int i = 0; i < 1; i++) {

						do {
							System.out.println(
									"Elegí el tipo de lavado que querés, brindamos basico, completo y premium");
							eleccion_lavado[i] = in.next();

							switch (eleccion_lavado[i]) {
							case "basico":
								Servicios servicioBasico = new Servicios(new Lavado("basico", 1200));
								sumatotal += 1200;
								count++;
								servicioBasico.mostrarServicio();
								break;

							case "completo":
								Servicios servicioCompleto = new Servicios(new Lavado("completo", 1700));
								sumatotal += 1700;
								count++;
								servicioCompleto.mostrarServicio();
								break;

							case "premium":
								Servicios servicioPremium = new Servicios(new Lavado("premium", 2200));
								sumatotal += 2200;
								count++;
								servicioPremium.mostrarServicio();
								break;
							default:
								System.out.println("Opcion no valida");
								break;
							}

						} while (!eleccion_lavado[i].equals("basico") && !eleccion_lavado[i].equals("completo")
								&& !eleccion_lavado[i].equals("premium"));
					}
					break;

				case 2:
					for (int e = 0; e < 1; e++) {
						do {
							System.out.println(
									"Elegí el tipo de service querés, disponemos basico (sin cambio de filtro de combustible) o premium (incluye cambio de filtro de combustible");
							eleccion_service[e] = in.next();

							switch (eleccion_service[e]) {
							case "basico":
								Servicios servicioBasico = new Servicios(new Service("basico", 10000));
								sumatotal += 10000;
								count++;
								servicioBasico.mostrarServicio();
								break;
							case "premium":
								Servicios servicioAltoRendimiento = new Servicios(new Service("premium", 15000));
								sumatotal += 15000;
								count++;
								servicioAltoRendimiento.mostrarServicio();
								break;

							default:
								System.out.println("Opcion no valida");
								break;
							}

						} while (!eleccion_service[e].equals("basico") && !eleccion_service[e].equals("premium"));
					}
					break;

				case 3:
					System.out.println("¿Cambiaste tus cubiertas?");
					String opcionCubiertas = in.next();
					Servicios servicioAliBal = new Servicios(new AliBal(5500));

					if (opcionCubiertas.compareToIgnoreCase("si") == 0) {
						System.out.println(
								"Bien, independientemente del cambio de cubiertas, el precio por alinear y balancear es el mismo");
						sumatotal += 5500;
						count++;

						servicioAliBal.mostrarServicio();
					} else {
						sumatotal += 5500;
						count++;
						servicioAliBal.mostrarServicio();
					}
					break;

				case 4:
					System.out.println("Elegiste: " + count + " servicios, " + "y la suma total es $:  " + sumatotal);
					if (count >= 5) {
						descuento = sumatotal * 0.10;
						totalcondescuento = sumatotal - descuento;
						System.out.println(
								"Por ser cliente premium, ya que contrataste mas de 5 servicios, tenes un 10% de descuento, te queda en: "
										+ totalcondescuento);
					}
					Turno turno = new Turno();
					agenda.addTurno(turno);
					agenda.mostrar();
					System.out.println("Los turnos ocupados son" + agenda.getTurnos());
					break;

				default:
					System.out.println("Opción inválida, intente nuevamente.");
					break;

				}

			} while (op != 4);

		}

	}
}
