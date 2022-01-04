km = int(input('A quantos km/h o veículo cruzou o radar?'))
if km > 80:
    m = float(km-80)*7
    print('O veículo está acima do limite permitido, a multa é de :R${}'.format(m))
else:
    print('O veículo está dentro do limite permitido!')
