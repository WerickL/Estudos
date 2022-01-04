exp = str(input('Digite uma expressão:'))
sinais = []
for c in range (0, len(exp)):
    if exp[c] == '(':
        sinais.append('(')
    elif exp[c] == ')':
        if len(sinais) != 0:
            sinais.pop()
        else:
            sinais.append(')')
            break
if len(sinais) == 0:
    print('Expressão válida!')
else:
    print('Expressão inválida')
