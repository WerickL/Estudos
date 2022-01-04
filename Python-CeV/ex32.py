# Esse programa irá ler 3 números e exibir o menor e o maior deles
N1 = float(input('Digite o primeiro número:'))
N2 = float(input('Digite o segundo número:'))
N3 = float(input('Digite o terceiro número:'))
if N1 < N2:
    # Se o 1º número for menor que o 2° número, ele será mantido e testado com o 3° número
    if N1 < N3:
        print(f'{N1}, foi o menor número digitado!')
    else:
        print(f'{N3}, foi o menor número!')
else:
    # Se não, o 2º número é que será testado com o 3º
    if N2 < N3:
        print(f'{N2} foi o menor número digitado!')
    else:
        # Se nenhum dos testes forem verdades, o 3º será considerado o menor
        print(f'{N3}, foi o menor número digitado!')
# Agora a definição do maior número:
if N1 > N2:
    if N1 > N3:
        print(f'{N1}, foi o maior número digitado!')
    else:
        print(f'{N3}, foi o maior número!')
else:
    if N2 > N3:
        print(f'{N2} foi o maior número digitado!')
    else:
        print(f'{N3}, foi o maior número digitado!')
