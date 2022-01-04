from time import sleep
mais18 = 0
homens = 0
menor20 = 0
while True:
    Idade = int(input('Idade:'))
    S = str(input('Sexo: [M/F]')).upper().strip()
    while S not in 'M,F':
        S = str(input('Sexo: [M/F]')).upper().strip()
    Fim = str(input('Quer continuar? [S/N]')).strip().upper()
    if Idade > 18:
        mais18 += 1
    if S == 'M':
        homens += 1
    if S == 'F' and Idade < 20:
        menor20 += 1
    while Fim not in 'S,N':
        Fim = str(input('Quer continuar? [S/N]')).strip().upper()
    if Fim == 'N':
        break
    else:
        sleep(0)
print(f"""Foram Cadastrados:
{mais18} pessoas maiores que 18 anos.
{homens} Homens.
{menor20} Mulheres menores que 20 anos.""")
