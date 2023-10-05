package br.com.fiap.petshop.domain.entity.servico;

import br.com.fiap.petshop.domain.entity.animal.Animal;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "servico")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    private LocalDateTime abertura;

    private LocalDateTime autorizacao;

    private LocalDateTime conclusao;

    private String descricao;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    public Servico() {
    }

    public Servico(Long id, BigDecimal valor, LocalDateTime abertura, LocalDateTime autorizacao, LocalDateTime conclusao, String descricao, String observacao, Animal animal) {
        this.id = id;
        this.valor = valor;
        this.abertura = abertura;
        this.autorizacao = autorizacao;
        this.conclusao = conclusao;
        this.descricao = descricao;
        this.observacao = observacao;
        this.animal = animal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getAbertura() {
        return abertura;
    }

    public void setAbertura(LocalDateTime abertura) {
        this.abertura = abertura;
    }

    public LocalDateTime getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(LocalDateTime autorizacao) {
        this.autorizacao = autorizacao;
    }

    public LocalDateTime getConclusao() {
        return conclusao;
    }

    public void setConclusao(LocalDateTime conclusao) {
        this.conclusao = conclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", valor=" + valor +
                ", abertura=" + abertura +
                ", autorizacao=" + autorizacao +
                ", conclusao=" + conclusao +
                ", descricao='" + descricao + '\'' +
                ", observacao='" + observacao + '\'' +
                ", animal=" + animal +
                '}';
    }
}
