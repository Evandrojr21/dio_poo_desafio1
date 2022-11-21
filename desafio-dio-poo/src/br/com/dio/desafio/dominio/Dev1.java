
package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev1 {
    private String nome;
    private Set<Conteudo1> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo1> conteudosConcluidos = new LinkedHashSet<>();
    
    public void inscreverBootcamp(Bootcamp1 bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
        
    }
    public void progredir(){
        Optional<Conteudo1> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.out.println("Você não está matriculado em nenhum conteúdo!");
        }
    }
    public double calcularTotalXp(){
       return this.conteudosConcluidos.stream().mapToDouble(Conteudo1::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo1> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo1> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo1> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo1> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.conteudosInscritos);
        hash = 59 * hash + Objects.hashCode(this.conteudosConcluidos);
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
        final Dev1 other = (Dev1) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudosInscritos, other.conteudosInscritos)) {
            return false;
        }
        return Objects.equals(this.conteudosConcluidos, other.conteudosConcluidos);
    }
}
