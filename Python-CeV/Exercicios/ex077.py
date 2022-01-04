lista = ('Placa Mae', 'Placa de video', 'Processador', 'Memoria RAM', 'Fonte', 'SSD', 'Gabinete', 'Teclado',
         'Mouse', 'Monitor')
for i in range(0, len(lista)):
    print(f'\nNa palavra {lista[i]} temos: ', end='')
    if ('a' not in lista[i][::]) and ('e' not in lista[i][::]) and ('i' not in lista[i][::]) and ('o' not in lista[i][::]) and ('u' not in lista[i][::]):
        print('Não há vogais nessa frase.', end='')
    for j in range(0, len(lista[i])):
        if lista[i][j] in 'aeiouAEIOU':
            print(f'{lista[i][j]}', end=' ')

