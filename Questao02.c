#include <stdio.h>
/*Leia 2 (dois) n�meros, calcule e escreva o mmc (m�nimo m�ltiplo comum) entre os n�meros lidos.
*/
int main(){
    int numero1, numero2, maior, i;
    printf("Digite Dois numeros para saber o MMC: ");
    scanf("%i %i", &numero1, &numero2);

    if(numero1 > numero2){
        maior = numero1;
    }
    else if(numero2 > numero1){
        maior = numero2;
    }
    for(i = 1; i > 0; i += 1){
        if(maior % numero1 == 0 && maior % numero2 == 0){
            printf("%i\n",maior);
            i = -1;
        }
        else{
            maior += 1;
        }
    }
    return 0;
}
