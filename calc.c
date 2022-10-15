#include <stdio.h>
int main()
{
        int a, b;
        int oper;
        printf("Enter two Numbers: ");
        scanf("%d%d", &a, &b);
        printf("Choose the operation \n");
        printf("1 : Addition \n");
        printf("2 : Substraction \n");
        printf("3 : Multiplication \n");
        printf("4 : Division \n Enter your choice: ");
        scanf("%d", &oper);
        switch (oper)
        {
        case 1:
                printf("%d+%d=%d", a, b, a + b);
                break;
        case 2:
                printf("%d-%d=%d", a, b, a - b);
                break;
        case 3:
                printf("%dx%d=%d", a, b, a * b);
                break;
        case 4:
                printf("%d/%d=%d", a, b, a / b);
                break;
        default:
                printf("Wrong Choice %c \n", oper);
        }
        printf("\n");
        return 0;
}