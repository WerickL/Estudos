from random import randint
from time import sleep


def sorteio(lista):
    print(f'sorteando 5 valores:', end=' ')
    for c in range(0, 5):
        lista.append(randint(1, 100))
        print(lista[c], end=' ')
        sleep(1)
    print()


def somapar(lista):
    soma = 0
    print(f'somando os valores pares de {lista}')
    print('pares: ')
    for n in lista:
        if n % 2 == 0:
            print(n, end=' ')
            soma += n
    print(f'={soma}')
    print()


numeros = list()
sorteio(numeros)
somapar(numeros)
