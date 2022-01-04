from datetime import date
anoA = date.today().year
gen = str(input('Qual o seu gênero? F/M:')).upper()
if gen == 'M':
    nasc = int(input('em que ano você nasceu?'))
    if (anoA - nasc) < 18:
        print('Ainda faltam {} anos para você se alistar!!'.format(18 - (anoA - nasc)))
    elif (anoA - nasc) > 18:
        jaAlist = str(input('Você já se alistou no exército? S/N:')).upper()
        if jaAlist == 'N':
               print('Você está atrasado, você deveria ter se alistado a {} anos!!'. format((anoA - nasc) - 18))
        else:
            print('Tudo Bem, você não precisa se preocupar com alistamento!!')
    else:
        print('Está na hora de você se alistar!!!')
else:
    print('Você não precisa se alistar no exército!')
