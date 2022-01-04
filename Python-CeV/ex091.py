from random import randint
from time import sleep
jogadas = dict()
for c in range(1, 5):
    jogadas[f'Jogador{c}'] = randint(1, 6)
    print(f'Jogador{c} recebeu o valor: {jogadas[f"Jogador{c}"]}')
    sleep(2)
