n = int(input('Digite um número inteiro:'))
print(f'A tabuada de {n} é:')
for c in range(1, 11):
      print('{} X {} = {}'.format(n, c, (n*c)))
