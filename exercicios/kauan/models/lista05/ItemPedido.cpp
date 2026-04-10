#include "ItemPedido.h"

ItemPedido::ItemPedido() {}

ItemPedido::ItemPedido(ValorString nome, int quantidade, double precoUnitario) {
    this->nome = nome;
    this->quantidade = quantidade;
    this->precoUnitario = precoUnitario;
}

ValorString ItemPedido::obterNome() {
    return nome;
}

int ItemPedido::obterQuantidade() {
    return quantidade;
}

double ItemPedido::obterPrecoUnitario() {
    return precoUnitario;
}

double ItemPedido::calcularSubtotal() {
    return quantidade * precoUnitario;
}