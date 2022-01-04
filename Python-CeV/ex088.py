from random import randint
from time import sleep
n = int(input('Quantos jogos você quer sortear? '))
aux = list()
jogos = list()
val = cont = 0
for c in range(0, n):
    while True:
        val = randint(0, 60)
        if val not in aux:
            cont += 1
            aux.append(val)
        if cont >= 6:
            break
    cont = 0
    aux.sort()
    jogos.append(aux[:])
    aux.clear()
print(f'Sorteando {n} Jogos...')
for c in range(0, n):
    print(f'Jogo {c + 1}: {jogos[c]}')
    sleep(1)
print(f'Boa sorte!')
