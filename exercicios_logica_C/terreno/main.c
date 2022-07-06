#include <stdio.h>
#include <stdlib.h>

int main()
{

    double largura, comprimento, valor, area, preco;

    printf("Digite a largura do terreno: \n");
    scanf("%lf", &largura);

    printf("Digite o comprimento do terreno: \n");
    scanf("%lf", &comprimento);

    printf("Digite o valor do metro quadrado: \n");
    scanf("%lf", &valor);

    area = largura * comprimento;
    preco = area* valor;

    printf("Arrea do terreno = %.2lf\n", area);

    printf("Preco do terreno = %.2lf\n",preco);
    return 0;
}
