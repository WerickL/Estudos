// Exercício 1c - Faça uma função que receba um vetor com n números inteiros, 
// então você deve rotacionar os elementos do vetor em r vezes pra esquerda.
//#include<stdio.h>

void ex1c(int vetor[], int n, int r){
   int i;
   int vetor2[n];
  
   for(i = r; i<n; i++){
       vetor2[i-r] = vetor[i];
   }
   for(i=1; i<=r; i++){
       vetor2[n-i] = vetor[r-i];
   }
    for(i=0; i<n; i++){
         printf("%d-", vetor2[i]);
         vetor[i] = vetor2[i];
    }
}
