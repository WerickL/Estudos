from random import randint
VC = 0
while True:
    PI = str(input('você escolhe Par ou Ímpar?')).capitalize().strip()
    if PI in 'Par':
        C = int(randint(0, 10))
        J = int(input('Digite um valor para jogar:'))
        R = C + J
        if R % 2 == 0:
            print(f'{J}+{C}={R} Você Ganhou! Parabéns')
            VC = VC + 1
        else:
            break
    elif PI in 'Ímpar,Impar,Ìmpar':
        C = int(randint(0, 100))
        J = int(input('Digite um valor para jogar:'))
        R = C + J
        if R%2 != 0:
            print(f'{J}+{C}={R} Você Ganhou! Parabéns')
            VC = VC + 1
        else:
            break
    else:
        print('Não dá pra brincar assim, tente denovo')
print(f'{J}+{C}={R} Eu venci! Mas você Ganhou por {VC} vezes seguidas!')
