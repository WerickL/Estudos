precoN = float(input('Qual o valor do produto?'))
Fdp = int(input('Qual a forma de pagamento? \n1 = Dinheiro/cheque:\n2 = Cartão:\n'))
precoF = 0
if Fdp == 1:
    precoF = precoN - precoN/100 * 10
    print(f'O pagamento será a vista, você terá 10% de desconto\n você pagará R${precoF}')
elif Fdp == 2:
    parce = int(input('Você escolheu cartão! Em quantas vezes você deseja dividir? digite "0" para pagar á vista:'))
    if parce == 0:
        precoF = precoN - precoN/100 * 5
        print(f'Você escolheu pagar a vista no cartão e tem direito a 5% de desconnto! você pagará R${precoF}')
    elif parce == 2:
        print(f'Você pagará {precoN}')
    elif parce >= 3:
        precoF = precoN + precoN/100 * 20
        print('você pagará {} em {} vezes no cartão'.format(precoF, parce))
else:
    print('\033[1;31mERRO, OPÇÃO INVÁLIDA!! TENTE OUTRA VEZ!')
