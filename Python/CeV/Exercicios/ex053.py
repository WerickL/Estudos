txt = str(input('Digite uma frase/palavra')).upper().split()
lista = (''.join(txt))
if lista == lista[::-1]:
    print(lista, end='')
    print(': Essa palavra é palíndromo!')
else:
    print('{}'.format(lista[::-1]))
    print('Essa palavra não é palíndromo!')
