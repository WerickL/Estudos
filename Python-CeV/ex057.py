S = str(input('Qual o seu sexo:F/M')).strip().upper()
while S not in 'MF':
    print(f'{S} não é um sexo válido. Certifique-se de responder apenas com F ou M')
    S = str(input('Qual o seu sexo:F/M')).strip().upper()
print('Sexo registrado!')
