from math import floor
n1 = float(input('Digite um número inteiro:'))
n2 = float(input('Digite outro número inteiro:'))
if floor(n1) > floor(n2):
    print('O primeiro número é maior que o segundo!')
elif floor(n1) < floor(n2):
    print('O segundo número é maior que o primeiro')
else:
    print('Os dois números são iguais!')
