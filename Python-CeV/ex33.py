# Esse programa calcula o aumento no salário do usuário
S = float(input('Qual o valor atual do seu salário? R$:'))
if S <= 1250:
    RS15 = S + (S/100) * 15
    print('Seu sálário reajustado é:R${}'.format(RS15))
else:
    RS10 = S + (S/100) * 10
    print('Seu salário reajustado é igual a:R${}'.format(RS10))
