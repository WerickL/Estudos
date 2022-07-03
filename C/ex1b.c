// Exercício 1b - Faça uma função que receba dois vetores, em que o primeiro contém n números inteiros, 
// então você deve copiar o conteúdo do primeiro para o segundo em ordem reversa.

void ex1b(int vetor1[], int vetor2[], int n){
    int i;
    for(i=0; i < n; i++){
        int rev = n-1;
        vetor2[rev-i] = vetor1[i];
    }
}
