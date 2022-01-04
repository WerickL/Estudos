from time import sleep
aux = int(0)
while aux == 0:
    Val1 = float(input('Digite umm valor:'))
    Val2 = float(input('Digite um segundo valor:'))
    M = int(input("""escolha:
    1- Somar os valores
    2- Multiplicar os valores
    3- Exibir o maior número
    4- Novos números
    5- Sair do programa"""))
    if M == 1:
        print('A soma dos valores é:', Val1 + Val2)
    elif M == 2:
        print('A multiplicação dos valores é:', Val1 * Val2)
    elif M == 3:
        if (Val1 > Val2) and (Val1 != Val2):
            print('{} foi o Maior valor digitado.'.format(Val1))
        elif (Val1 < Val2) and (Val1 != Val2):
            print(f'{Val2} foi o maior valor digitado')
        else:
            print('Os valores são iguais!')
    elif M == 4:
        print('aguarde')
        sleep(2)
    elif M == 5:
        aux = 1
    aux2 = int(0)
    while aux2 == 0:
        confirm = str(input('Deseja encerrar o programa?S/N')).strip().upper()
        if confirm == 'S':
            aux = 1
            aux2 = 1
        elif confirm == 'N':
            aux = 0
            aux2 = 1
        else:
            print('Certifique-se de reponder apenas com S/N.')
