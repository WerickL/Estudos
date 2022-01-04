ext = ('zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez',
       'onze', 'doze', 'treze', 'quatorze', 'quinze', 'dezesseis', 'dezessete', 'dezoito', 'dezenove', 'vinte')
val = int(input('Digite um valor:'))
while not 0 <= val <= 20:
    val = int(input('Digite um valor:'))
print(f'o valor digitado foi {ext[val]}')
