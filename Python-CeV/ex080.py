lis = list()
for cont in range(0, 5):
    n = int(input('Digite um valor: '))
    if cont == 0 or n > lis[-1]:
        lis.append(n)
        print('Adicionado no final da lista.')
    else:
        c = 0
        while c < len(lis):
            if n <= lis[c]:
                if c == 0:
                    lis.insert(c, n)
                    print('Valor adicionado no inicio da lista!')
                    break
                else:
                    lis.insert(c, n)
                    print(f'Adicionado na posição {c} da lista.')
                    break
            c += 1
print(lis)
