def maior(*valores):
    if len(valores) >= 1:
        maiorv = valores[0]
        print(f'Analisando os valores...')
        for c in valores:
            print(c, end=' ')
            if c > maiorv:
                maiorv = c
        print()
        print(f'Foram informados {len(valores)} valores ao todo.')
        print(f'O maior valor é {maiorv}!')
        print('-'*50)
    else:
        print('Nenhum elemento foi identificado')


maior(2, 9, 4, 5, 7, 1)
maior(4, 7, 0)
maior(1, 2)
maior(6)
maior()
