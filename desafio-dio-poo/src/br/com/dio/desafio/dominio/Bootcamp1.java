
package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp1 {
    
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev1> devsInscritos = new HashSet();
    private Set<Conteudo1> conteudos = new LinkedHashSet<>();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Set<Dev1> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev1> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo1> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo1> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.dataInicial);
        hash = 97 * hash + Objects.hashCode(this.dataFinal);
        hash = 97 * hash + Objects.hashCode(this.devsInscritos);
        hash = 97 * hash + Objects.hashCode(this.conteudos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bootcamp1 other = (Bootcamp1) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataInicial, other.dataInicial)) {
            return false;
        }
        if (!Objects.equals(this.dataFinal, other.dataFinal)) {
            return false;
        }
        if (!Objects.equals(this.devsInscritos, other.devsInscritos)) {
            return false;
        }
        return Objects.equals(this.conteudos, other.conteudos);
    } 
}
