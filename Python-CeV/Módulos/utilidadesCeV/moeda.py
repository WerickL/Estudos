def dobro(x, f=False):
    val = x * 2
    if f:
        return moeda(val)
    else:
        return val


def metade(x, f=False):
    val = x/2
    if f:
        return moeda(val)
    else:
        return val


def aumentar(x, p, f=False):
    val = x + (x / 100 * p)
    if f:
        return moeda(val)
    else:
        return val


def diminuir(x, p, f=False):
    val = x - (x / 100 * p)
    if f:
        return moeda(val)
    else:
        return val


def moeda(val):
    return f'R${val:.0f},00'


def resumo(val, r, a):
    return print(f"""
    ============================
          RESUMO DO VALOR
    ============================
    Preço analisado:   R${moeda(val)}
    Dobro do preço:    R${dobro(val, True)}
    Metade do preço:   R${metade(val, True)}
    redução {r}%:       R${diminuir(val, r, True)}
    aumento {a}%:       R${aumentar(val, a, True)}
    =============================""")



