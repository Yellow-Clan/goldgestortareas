package data;

import entities.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.ErrorLogger;
import java.util.logging.Level;

/**
 *
 * @author Asullom
 */
public class UsuarioData {

    static Connection cn = Conn.connectSQLite();
    static PreparedStatement ps;
    static ErrorLogger log = new ErrorLogger(UsuarioData.class.getName());

    public static int create(Usuario d) {
        int rsId = 0;
        String[] returns = {"id"};
        String sql = "INSERT INTO usuario(Nombre, DNI, InformacionAdicional) "
                + "VALUES(?,?,?)";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql, returns);
            ps.setString(++i, d.getNombre());
            ps.setString(++i, d.getDNI());
            ps.setString(++i, d.getInformaconAdicional());
            rsId = ps.executeUpdate();// 0 no o 1 si commit
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    rsId = rs.getInt(1); // select tk, max(id)  from usuario
                    //System.out.println("rs.getInt(rsId): " + rsId);
                }
                rs.close();
            }
        } catch (SQLException ex) {
            //System.err.println("create:" + ex.toString());
            log.log(Level.SEVERE, "create", ex);
        }
        return rsId;
    }

    public static int update(Usuario d) {
        System.out.println("actualizar d.getId(): " + d.getID());
        int comit = 0;
        String sql = "UPDATE usuario SET "
                + "Nombre=?, "
                + "DNI=?, "
                + "InformacionAdicional=? "
                + "WHERE ID=?";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(++i, d.getNombre());
            ps.setString(++i, d.getDNI());
            ps.setString(++i, d.getInformaconAdicional());
            ps.setInt(++i, d.getID());
            comit = ps.executeUpdate();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "update", ex);
        }
        return comit;
    }

    public static int delete(int id) throws Exception {
        int comit = 0;
        String sql = "DELETE FROM usuario WHERE ID = ?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            comit = ps.executeUpdate();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "delete", ex);
            // System.err.println("NO del " + ex.toString());
            throw new Exception("Detalle:" + ex.getMessage());
        }
        return comit;
    }

    public static List<Usuario> list(String filter) {
        String filtert = null;
        if (filter == null) {
            filtert = "";
        } else {
            filtert = filter;
        }
        System.out.println("list.filtert:" + filtert);

        List<Usuario> ls = new ArrayList();
        String sql = "";
        if (filtert.equals("")) {
            sql = "SELECT * FROM usuario ORDER BY ID";
        } else {
            sql = "SELECT * FROM usuario WHERE (ID LIKE'" + filter + "%' OR "
                    + "Nombre LIKE'" + filter + "%' OR DNI LIKE'"+ filter + "%' OR InformacionAdicional LIKE'" + filter + "%' OR "
                    + "ID LIKE'" + filter + "%') "
                    + "ORDER BY Nombre";
        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Usuario d = new Usuario();
                d.setID(rs.getInt("ID"));
                d.setNombre(rs.getString("Nombre"));
                d.setDNI(rs.getString("DNI"));
                d.setInformaconAdicional(rs.getString("InformacionADicional"));
                ls.add(d);
            }
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "list", ex);
        }
        return ls;
    }

    public static Usuario getByPId(int id) {
        Usuario d = new Usuario();

        String sql = "SELECT * FROM usuario WHERE ID = ? ";
        int i = 0;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(++i, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                d.setID(rs.getInt("ID"));
                d.setNombre(rs.getString("Nombre"));
                d.setDNI(rs.getString("DNI"));
                d.setInformaconAdicional(rs.getString("InformacionAdicional"));
            }
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "getByPId", ex);
        }
        return d;
    }
    /*
    public static void iniciarTransaccion() {
        try {
            cn.setAutoCommit(false);
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "iniciarTransaccion", ex);
        }
    }

    public static void finalizarTransaccion() {
        try {
            cn.commit();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "finalizarTransaccion", ex);
        }
    }

    public static void cancelarTransaccion() {
        try {
            cn.rollback();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "cancelarTransaccion", ex);
        }
    }
     */
}
