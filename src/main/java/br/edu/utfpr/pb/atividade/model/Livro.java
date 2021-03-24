package br.edu.utfpr.pb.atividade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String titulo;

    @OneToOne
    @JoinColumn(name = "editora_id", referencedColumnName = "id")
    private Editora editora;

    @ManyToOne
    @JoinColumn(name = "genero_id", referencedColumnName = "id")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    private Autor autor;

    @Column(length = 4, nullable = false)
    private int ano;

    @Column(nullable = false)
    private int isbn;

    @ManyToOne
    @JoinColumn(name = "cidade_id", referencedColumnName = "id")
    private Cidade cidade;

    @Column(nullable = false)
    private Double valor;

}
