package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Celular;
    private String email;
    private int Edad;

}
