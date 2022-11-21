
package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria1 extends Conteudo1 {
    private LocalDate data;

    public Mentoria1() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
}
}
