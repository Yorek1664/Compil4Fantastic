#include <stdio.h>

int toto()
{
	return 1;	
}

int main()
{
	int toto = 2;
	printf("%d\n", (toto()+toto));
}