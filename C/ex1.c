// Exercício 1 - Escreva uma função  que receba um vetor com x números inteiros, 
// calcule e retorne a quantidade de números iguais ou superiores ao valor n, dado como entrada.

int ex1(int x, int v[], int n){
    int maiorQueN = 0;
    int i;
    for(i=0; i < x; i++){
        if(v[i] >= n){
            ++maiorQueN;    
        }    
    }
    return maiorQueN;
}