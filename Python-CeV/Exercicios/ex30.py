# esse programa identifica se um número é par ou ímpar
from math import floor
N = float(input('Digite um número inteiro:'))
# Apenas a parte inteira do número será considerada para evitar eventuais erros
N = floor(N)
if (N % 2) == 0:
    print('O número {} é par'.format(N))
else:
    print(f'O número {N} é ímpar')
