#include "Turma.h"

Turma::Turma() {}

void Turma::adicionarNota(double nota) {
    notas.push_back(nota);
}

double Turma::calcularMedia() {
    double soma = 0.0;

    for (double n : notas) {
        soma += n;
    }

    return notas.empty() ? 0.0 : soma / notas.size();
}

int Turma::contarAbaixo6() {
    int count = 0;

    for (double n : notas) {
        if (n < 6) count++;
    }

    return count;
}

int Turma::contarEntre6e79() {
    int count = 0;

    for (double n : notas) {
        if (n >= 6 && n < 8) count++;
    }

    return count;
}

int Turma::contarAcima8() {
    int count = 0;

    for (double n : notas) {
        if (n >= 8) count++;
    }

    return count;
}