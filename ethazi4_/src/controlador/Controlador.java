package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Alojamiento;
import modelo.Cliente;
import modelo.Metodos;
import modelo.Modelo;
import vista.Vista;

public class Controlador {
	private static Vista vista;
	private Modelo modelo;
	private ArrayList<modelo.Alojamiento> alojamientos;
	public double Adevolver = 0;
	public double Introducido = 0;
	public double preciototal = 0;
	public String preciotabla = "";
	public String nombrehotel = "";
	public String nombreubicacion = "";

	public Controlador(Vista vista, Modelo modelo) {
		Controlador.vista = vista;
		this.modelo = modelo;

		// Cargamos la pantalla principal
		vista.mostrarPantalla(vista.getInicio());

		// Cargamos el comboBox con las ciudades

		initalizeEvents();

	}

	public Controlador() {
		// TODO Auto-generated constructor stub
	}

	private void initalizeEvents() {

		vista.getInicio().getBtnseleccionar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				if (vista.getInicio().getRdbtnHotel().isSelected()) {
					rellenarComboCiudades();
				} else {
					if (vista.getInicio().getRdbtnApartamento().isSelected()) {
						rellenarComboCiudadesapartamentos();
					} else {
						rellenarComboCiudadescasas();
					}
				}

			}
		});

		vista.getInicio().getBtn_buscar_inicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int mes = (vista.getInicio().getCalendar_entrada().getCalendar().get(Calendar.MONTH) + 1);
				if (mes >= 5 && mes <= 8) {
					vista.getInicio2().getTextField().setText("Temporada Alta");
				} else {
					if (mes >= 9 && mes <= 12) {
						vista.getInicio2().getTextField().setText("Temporada Media");
					} else {
						vista.getInicio2().getTextField().setText("Temporada Baja");
					}
				}

				vista.mostrarPantalla(vista.getInicio2());

			}
		});
		vista.getInicio2().getBtnSiguiente().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				// nombreubicacion =
				// (vista.getInicio().getCombo_ubicacion().getSelectedItem().toString());
				// rellenarComboAlojamientos();
				if (vista.getInicio().getRdbtnHotel().isSelected()) {
					vista.mostrarPantalla(vista.getListahoteles());

					// Usamos el metodo que cargara los hoteles de la ubicacion seleccionada
					DefaultTableModel modelos = modelo.getMetodos()
							.cargarTablahoteles((String) vista.getInicio().getCombo_ubicacion().getSelectedItem());

					vista.getListahoteles().getTable().setModel(modelos);
				} else {
					if (vista.getInicio().getRdbtnApartamento().isSelected()) {
						vista.mostrarPantalla(vista.getListahoteles());

						// Usamos el metodo que cargara los hoteles de la ubicacion seleccionada
						DefaultTableModel modelos = modelo.getMetodos().cargarTablaapartamentos(
								(String) vista.getInicio().getCombo_ubicacion().getSelectedItem());

						vista.getListahoteles().getTable().setModel(modelos);
					} else {
						vista.mostrarPantalla(vista.getListahoteles());

						// Usamos el metodo que cargara los hoteles de la ubicacion seleccionada
						DefaultTableModel modelos = modelo.getMetodos().cargarTablacasasrurales(
								(String) vista.getInicio().getCombo_ubicacion().getSelectedItem());

						vista.getListahoteles().getTable().setModel(modelos);
					}
				}

			}
		});

		vista.getListahoteles().getBtnCancelar_mostrar_lista().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getInicio());

			}
		});
		vista.getListahoteles().getBtnaceptar_mostrar_lista().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				/*
				 * String datotabla =
				 * String.valueOf(vista.getListahoteles().getTable().getValueAt(vista.
				 * getListahoteles().getTable().getSelectedRow(), 0));
				 * vista.mostrarPantalla(vista.getHotel_seleccionado());
				 * vista.getHotel_seleccionado().gettF_nombre_Hotel().setText(datotabla);
				 */
				vista.mostrarPantalla(vista.getInicio_sesion());
			}
		});
		vista.getPagar().getbtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getInicio());

			}
		});

		vista.getDatos_personas().getBtnContinuar_dtpersonas().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				// vista.mostrarPantalla(vista.getInicio_sesion());

				modelo.getMetodos().insertarUsuario();

				vista.mostrarPantalla(vista.getPagar());
			}
		});

		vista.getInicio_sesion().getBtnAceptar_Inicio_Sesion().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				try {
					// chekar si el usuario escrbio el nombre de usuario y pw
					if (vista.getInicio_sesion().getTf_Usuario_Inicio_Sesion().getText().length() > 0
							&& vista.getInicio_sesion().getPf_Contra_Inicio_Sesion().getText().length() > 0) {
						String contrasena = modelo.getMetodos()
								.encriptarPass(vista.getInicio_sesion().getPf_Contra_Inicio_Sesion().getText());
						// Si el usuario si fue validado correctamente
						System.out.println(contrasena);
						if (modelo.getMetodos().comprobarLogin(
								vista.getInicio_sesion().getTf_Usuario_Inicio_Sesion().getText(),
								vista.getInicio_sesion().getPf_Contra_Inicio_Sesion().getText())) // enviar datos a
																									// validar
						{
							// Codigo para mostrar la ventana principal
							preciotabla = String.valueOf(vista.getListahoteles().getTable()
									.getValueAt(vista.getListahoteles().getTable().getSelectedRow(), 1));
							preciototal = Double.parseDouble(preciotabla);
							if (vista.getInicio2().getRdbtnPensinCompleta().isSelected()) {
								preciototal = preciototal + 100;
							}
							if (vista.getInicio2().getTextField().getText().equals("Temporada Alta") ) {
								preciototal = preciototal + 100;
							} else {
								if (vista.getInicio2().getTextField().getText().equals("Temporada Media") ) {
									preciototal = preciototal + 50;
								}
							}

							vista.mostrarPantalla(vista.getBase_legal());
							vista.getPagar().gettextField().setText(Double.toString(preciototal));

						} else {
							JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contrasenia no son validos.");
							JOptionPane.showMessageDialog(null,
									vista.getInicio_sesion().getTf_Usuario_Inicio_Sesion().getText() + " "
											+ vista.getInicio_sesion().getPf_Contra_Inicio_Sesion().getText());
							vista.getInicio_sesion().getTf_Usuario_Inicio_Sesion().setText(""); // limpiar campos
							vista.getInicio_sesion().getPf_Contra_Inicio_Sesion().setText("");

							vista.getInicio_sesion().getTf_Usuario_Inicio_Sesion().requestFocusInWindow();
						}

					} else {
						JOptionPane.showMessageDialog(null, "Debe escribir nombre de usuario y contrasenia.\n"
								+ "NO puede dejar ningun campo vacio");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

		vista.getBase_legal().getBtnSiguiente().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// chekar si el usuario escrbio el nombre de usuario y pw
					if (vista.getBase_legal().getRdbtnAceptarLasBases().isSelected()) {
						vista.mostrarPantalla(vista.getDatos_personas());

					}

					else {
						JOptionPane.showMessageDialog(null,
								"Debe aceptar las creenciales.\n" + "NO puede continuar si no las acepta.");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

		vista.getInicio_sesion().getBtnCancelar_Inicio_Sesion().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getInicio());

			}
		});

		vista.getPagar().getbtnDevolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				// vista.mostrarPantalla(vista.getInicio_sesion());
				vista.mostrarPantalla(vista.getReserva());
				modelo.getMetodos().reyenarreserva();

				
			}
		});
		
		vista.getReserva().getBtnPagar_reserva().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				// vista.mostrarPantalla(vista.getInicio_sesion());
				modelo.getMetodos().modificarfichero();

				
			}
		});
		

		vista.getPagar().getbtn50euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 50 eurazos
				SumarIntroducido(50);
			}
		});
		vista.getPagar().getbtn20euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 20 eurazos
				SumarIntroducido(20);
			}
		});
		vista.getPagar().getbtn10euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 10 eurazos
				SumarIntroducido(10);
			}
		});
		vista.getPagar().getbtn5euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 5 eurazos
				SumarIntroducido(5);
			}
		});
		vista.getPagar().getbtn2euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 2 eurazos
				SumarIntroducido(2);
			}
		});
		vista.getPagar().getbtn1euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 1 eurazo
				SumarIntroducido(1);
			}
		});
		vista.getPagar().getbtn50cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 50 centimazos
				SumarIntroducido(0.50);
			}
		});
		vista.getPagar().getbtn20cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 20 centimazos
				SumarIntroducido(0.20);
			}
		});
		vista.getPagar().getbtn10cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 51 centimazos
				SumarIntroducido(0.10);
			}
		});
		vista.getPagar().getbtn5cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 5 centimazos
				SumarIntroducido(0.05);
			}
		});
		vista.getPagar().getbtn2cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 2 centimazos
				SumarIntroducido(0.02);
			}
		});
		vista.getPagar().getbtn1cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SumarIntroducido(0.01);
			}
		});
	}

	// Metodo para rellenar el combobox con los datos consultados a la BBDD

	private void rellenarComboCiudades() {
		// Sacar las lineas de la BBDD y rellenar el combobox
		// 1.Sacar datos de la BBDD

		ArrayList<String> ciudad = modelo.getMetodos().cargarciudades();

		// 2.Rellenar combo de lineas

		for (int i = 0; i < ciudad.size(); i++) {
			vista.getInicio().getCombo_ubicacion().addItem(ciudad.get(i));
		}

	}

	private void rellenarComboCiudadesapartamentos() {
		// Sacar las lineas de la BBDD y rellenar el combobox
		// 1.Sacar datos de la BBDD

		ArrayList<String> ciudad = modelo.getMetodos().cargarciudadesapartamentos();

		// 2.Rellenar combo de lineas

		for (int i = 0; i < ciudad.size(); i++) {
			vista.getInicio().getCombo_ubicacion().addItem(ciudad.get(i));
		}

	}

	private void rellenarComboCiudadescasas() {
		// Sacar las lineas de la BBDD y rellenar el combobox
		// 1.Sacar datos de la BBDD

		ArrayList<String> ciudad = modelo.getMetodos().cargarciudadesCasas();

		// 2.Rellenar combo de lineas

		for (int i = 0; i < ciudad.size(); i++) {
			vista.getInicio().getCombo_ubicacion().addItem(ciudad.get(i));
		}

	}

	private void confirmarlogin() {
		String user = vista.getInicio_sesion().getTf_Usuario_Inicio_Sesion().getText();
		String password = String.valueOf(vista.getInicio_sesion().getPf_Contra_Inicio_Sesion().getPassword());

		boolean validarLogin = modelo.getMetodos().comprobarLogin(user, password);
		if (validarLogin == true) {

			vista.mostrarPantalla(vista.getPagar());

		} else {
			// mostramos el error pero borramos los campos para hacer un intendo de nuevo
			System.out.println("esta mal");
			vista.mostrarPantalla(vista.getInicio_sesion());
		}
	}

	private void rellenarresumendatos() {

	}

	public void SumarIntroducido(double cantidad) {
		Introducido = Introducido + cantidad;
		vista.getPagar().gettextField_1().setText(Double.toString(Introducido));
		// Datos.sacarResto=Datos.Total-Datos.TotalIntroducido;
		if (preciototal > Introducido) {
			vista.getPagar().gettextField_2().setText(Double.toString(0));

		} else {
			Adevolver = Introducido - preciototal;
			;
			vista.getPagar().gettextField_2().setText(Double.toString(Adevolver));

		}
	}

}
