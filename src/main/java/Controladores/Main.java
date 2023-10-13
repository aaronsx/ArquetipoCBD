package Controladores;

import java.sql.Connection;

import Servicios.ImplementacionConexionPostgreSQL;
import Servicios.InterfazConexionBD;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazConexionBD conec=new ImplementacionConexionPostgreSQL();
		Connection conexion = null;
		conexion=conec.AbrirConexionConBBDD();
		conec.CerrarConexionConBBDD(conexion);
	}

}
