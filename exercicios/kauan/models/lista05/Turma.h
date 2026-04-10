#ifndef TURMA_H
#define TURMA_H

#include <vector>

class Turma {
private:
    std::vector<double> notas;

public:
    Turma();
    void adicionarNota(double nota);

    double calcularMedia();
    int contarAbaixo6();
    int contarEntre6e79();
    int contarAcima8();
};

#endif