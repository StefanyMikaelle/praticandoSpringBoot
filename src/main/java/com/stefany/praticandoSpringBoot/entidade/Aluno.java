package com.stefany.praticandoSpringBoot.entidade;

import jakarta.persistence.*;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private int idade;
    @Column(nullable = false)
    private double notaDoPrimeiroSemestre;
    @Column(nullable = false)
    private double notaDoSegundoSemestre;
    @Column(nullable = false)
    private  String nomeDoProfessor;
    @Column(nullable = false)
    private int numeroDaSala;

    public Aluno(Long id, String nome, int idade,
                 double notaDoPrimeiroSemestre, double notaDoSegundoSemestre,
                 String nomeDoProfessor, int numeroDaSala)
    {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.notaDoPrimeiroSemestre = notaDoPrimeiroSemestre;
        this.notaDoSegundoSemestre = notaDoSegundoSemestre;
        this.nomeDoProfessor = nomeDoProfessor;
        this.numeroDaSala = numeroDaSala;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaDoPrimeiroSemestre() {
        return notaDoPrimeiroSemestre;
    }

    public void setNotaDoPrimeiroSemestre(double notaDoPrimeiroSemestre) {
        this.notaDoPrimeiroSemestre = notaDoPrimeiroSemestre;
    }

    public double getNotaDoSegundoSemestre() {
        return notaDoSegundoSemestre;
    }

    public void setNotaDoSegundoSemestre(double notaDoSegundoSemestre) {
        this.notaDoSegundoSemestre = notaDoSegundoSemestre;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }
}
