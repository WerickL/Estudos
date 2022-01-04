Val = (int(input('Digite um valor inteiro:')),
       int(input('Digite um valor inteiro:')),
       int(input('Digite um valor inteiro:')),
       int(input('Digite um valor inteiro:')))
par = 0
print(Val)
if 9 in Val:
    print(f'O número 9 apareceu {Val.count(9)} vezes')
else:
    print('O número 9 não foi digitado')
if 3 in Val:
    print(f'O número 3 se encontra na posição {Val.index(3) + 1}')
else:
    print('O número 3 não foi digitado')
for c in range(0, len(Val)):
    if Val[c] % 2 == 0:
        print(Val[c], end=' ')
        par += 1
if par == 1:
    print(':É par.')
elif par == 0:
    print('Não houve nenhum número par.')
else:
    print(':São pares.')
