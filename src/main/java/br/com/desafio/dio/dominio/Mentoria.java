package br.com.desafio.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate hora;

    public Mentoria() {}

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", hora=" + hora +
                '}';
    }
}
