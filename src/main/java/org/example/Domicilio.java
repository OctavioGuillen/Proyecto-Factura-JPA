package org.example;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Domicilio")
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NombreCalle")
    private String nombreCalle;

    @Column(name = "Número")
    private int numero;

    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;
}