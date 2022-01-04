s = 0
for c in range(0, 6):
    n = int(input('Digite um valor inteiro:'))
    if n % 2 == 0:
        s = s + n
if s != 0:
    print(f'A soma dos valore pares é igual a: {s}')
else:
    print('nenhum valor par foi encontrado!')
