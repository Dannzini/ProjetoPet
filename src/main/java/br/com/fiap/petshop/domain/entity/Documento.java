package br.com.fiap.petshop.domain.entity;

import br.com.fiap.petshop.infra.security.entity.Pessoa;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "documento")
public class Documento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    protected Documento() {
    }

    public Documento(Long id, String numero, Pessoa pessoa) {
        this.id = id;
        this.numero = numero;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public Documento setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Documento setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Documento setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
