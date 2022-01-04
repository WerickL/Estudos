def leiaint(msg):
    while True:
        try:
            n = int(input(msg))
        except (ValueError, TypeError):
            print('Erro: por favor, digite um número válido.')
        except KeyboardInterrupt:
            return'Usuário preferiu não digitar o valor'
        else:
            return n


def leiafloat(msg):
    while True:
        try:
            n = float(input(msg))
        except (ValueError, TypeError):
            print('Erro: por favor, digite um número válido.')
            continue
        except KeyboardInterrupt:
            return print('Usuário preferiu não digitar o valor')
        else:
            return n


n1 = leiaint('Digite um número inteiro')
n2 = leiafloat('Digite um número Real')
print(f'Os números digitados foram {n1} e {n2}!')
