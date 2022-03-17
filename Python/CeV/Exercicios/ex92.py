from datetime import date
cadastro = dict()
print(f'{"=-"*20}')
cadastro['nome'] = str(input('Nome: '))
nasc = int(input('Ano de nascimento: '))
cadastro['idade'] = date.today().year - nasc
cadastro['ctps'] = int(input('Número da carteira de trabalho.(0 não tem) '))
if cadastro['ctps'] > 0:
    cadastro['contratação'] = int(input('Em que ano você foi contratado? '))
    cadastro['salario'] = float(input('Qual o salário '))
    cadastro['idade aposentadoria'] = cadastro['contratação'] - nasc + 35
print(f'{"=-"*20}')
for k, v in cadastro.items():
    print(f'{k} é {v}!')
