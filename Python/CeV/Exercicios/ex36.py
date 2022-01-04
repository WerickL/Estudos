print('\033[1;31;40mFaça aqui seu financiamento e realize o sonho da casa própria!!\033[m')
valorcasa = float(input('\033[33;40mQual o valor da casa a ser financiada?'))
tempo = int(input('Em quantos anos você deseja pagar essa casa?'))
salario = float(input('Qual o seu salário?'))
tempoM = tempo*12
parcelaCasa = valorcasa / tempoM
if parcelaCasa <= (salario / 100 * 30):
    print('Seu financiamento foi aprovado, você pagará {} parcelas, de R${:.2f} cada!!\033[m'.format(tempoM, parcelaCasa))
else:
    print('Sinto muito, mas seu financiamento não foi aprovado!\033[m')
print('\033[1;31;40mO banco Curso em video agradece sua preferência!\033[m')
