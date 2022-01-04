from random import randint
nu = int(0)
na = int(1)
c = int(0)
# Um número aleatório será gerado
print('Um número misterioso de 1 a 10 foi gerado, dê seu palpite, e veja se você acertou ou errou')
while nu != na:
    c += 1
    na = int(randint(1, 10))
    nu = int(input('Digite um número de 1 a 10:'))
    if nu == na:
        # Se o usuário acertar, a seguinte mensagem será exibida
        print('Parabéns, você acertou! O número correto era:{}'.format(na))
        print('No total foram {} tentativas!'.format(c))
    else:
        # Se o usuário errar aparecerá na tela o seguinte
        print('Não foi dessa vez, você digitou:{}, mas o número correto era:{}!'.format(nu, na))

        print('Tente novamente, e boa sorte!!!')
