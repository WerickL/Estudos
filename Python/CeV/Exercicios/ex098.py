from time import sleep


def contador(d, a, p):
    if (d > a and p > 0) or (d < a and p < 0):
        p = -p
    elif p == 0:
        if d > a:
            p = -1
        else:
            p = 1
    if p < 0:
        print(f'Contagem de {d} até {a} de {p * -1} em {p * -1}')
        sleep(2.5)
        for c in range(d, a - 1, p):
            print(c, end=' ')
            sleep(0.3)
    else:
        print(f'Contagem de {d} até {a} de {p} em {p}')
        sleep(2.5)
        for c in range(d, a + 1, p):
            print(c, end=' ')
            sleep(0.3)
    print('Fim!')


contador(1, 10, 1)
contador(10, 0, 2)
print('Agora é sua vez de personalizar!')
i = int(input('Inicio: '))
f = int(input('Fim: '))
passo = int(input('Passo: '))
contador(i, f, passo)
