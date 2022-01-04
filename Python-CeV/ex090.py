result = dict()
result['nome'] = input('Digite o nome do Aluno.')
result['media'] = float(input(f'Digite a média de {result["nome"]}'))
print(f"""Aluno: {result['nome']}
Média: {result['media']}
situação:""", end='')
if result['media'] >= 7:
    print('Aprovado!')
else:
    print('Reprovado!')
