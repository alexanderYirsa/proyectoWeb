package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexion.Conexion;
import entidad.Cliente;

public class ModeloUsuario {
	
	public Cliente iniciarSesion(String nombre, String clave) {
		Cliente usuario = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Conexion con = new Conexion();
		
		try {
			cn = con.conectar();
			String sql = "SELECT U.id_cliente, U.nombre, U.clave FROM clientes U WHERE U.nombre = ? AND U.clave = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, nombre);
			pstm.setString(2, clave);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				usuario = new Cliente();
				usuario.setId_cliente(rs.getInt("id_cliente"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setClave(rs.getString("clave"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (pstm != null) {
					pstm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return usuario;
	}

}
