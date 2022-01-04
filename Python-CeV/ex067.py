while True:
    T = int(input('Digite um número para mostrar a tabuada:'))
    if T > 0:
        print(f"""{T} X 1 = {T*1}
{T} X 2 = {T*2}
{T} X 3 = {T*3}
{T} X 4 = {T*4}
{T} X 5 = {T*5}
{T} X 6 = {T*6}
{T} X 7 = {T*7}
{T} X 8 = {T*8}
{T} X 9 = {T*9}
{T} X 10 = {T*10}""")
    elif T < 0:
        break
print('Obrigado por usar a tabuada, volte sempre!')
