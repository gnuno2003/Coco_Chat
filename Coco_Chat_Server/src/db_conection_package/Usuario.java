package db_conection_package;

/**
 *
 * @author gnuno
 */

public class Usuario {
    public int id_usuario;
    public String nombre;
    public String username;
    public String password;
    public String correo;
    public String pregunta_respaldo;
    public int estado;
    
    public Usuario()
    {
        id_usuario = 0;
        nombre = "";
        username = "";
        password = "";
        correo = "";
        pregunta_respaldo = "";
        estado = 0;        
    }
    
    public Usuario(String nombre, String username, String password, String correo, String pregunta_respaldo, int estado)
    {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.pregunta_respaldo = pregunta_respaldo;
        this.estado = estado;
    }
}
