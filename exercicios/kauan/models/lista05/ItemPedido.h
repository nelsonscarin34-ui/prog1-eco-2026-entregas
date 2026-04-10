#ifndef ITEMPEDIDO_H
#define ITEMPEDIDO_H

#include "utils/ValorString.h"

class ItemPedido {
private:
    ValorString nome;
    int quantidade;
    double precoUnitario;

public:
    ItemPedido();
    ItemPedido(ValorString nome, int quantidade, double precoUnitario);

    ValorString obterNome();
    int obterQuantidade();
    double obterPrecoUnitario();

    double calcularSubtotal();
};

#endif